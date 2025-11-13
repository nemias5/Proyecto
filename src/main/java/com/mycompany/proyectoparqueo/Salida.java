
package com.mycompany.proyectoparqueo;
import javax.swing.JOptionPane;
import java.sql.*;
import java.time.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.time.temporal.ChronoUnit;

public class Salida {
    public boolean verificarTicket(String ticket){
        boolean existe = false;
        String sql = "SELECT * FROM historico WHERE ticket = ?";

        try (Connection con = Conexion.conectar();
            PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, ticket);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                existe = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al verificar ticket: " + e.getMessage());
        }
        return existe;
    }
    
    public void actualizarSpot(String idSpot, String nuevoEstado){
        String sql = "UPDATE spot SET estado = ? WHERE id = ?";
        try (Connection con = Conexion.conectar();
            PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nuevoEstado);
            ps.setString(2, idSpot);
            ps.executeUpdate();
        } catch (SQLException e){
            System.out.println("Error al actualizar el spot"+ e.getMessage());
        }
    }
    public boolean salidaVariable(String ticket, String metodoPago) {
    try (Connection con = Conexion.conectar()) {

        String sql = "SELECT placa, fecha_ingreso, spot FROM historico WHERE ticket = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ticket = ticket.trim();
            ps.setString(1, ticket);

            try (ResultSet rs = ps.executeQuery()) {
                if (!rs.next()) {
                    JOptionPane.showMessageDialog(null, "No existe el ticket ingresado");
                    return false;
                }

                String placa = rs.getString("placa");
                Timestamp fechaEntrada = rs.getTimestamp("fecha_ingreso");
                String idSpot = rs.getString("spot");

                // 🔹 Calcular tiempo total
                LocalDateTime entrada = fechaEntrada.toLocalDateTime();
                LocalDateTime salida = LocalDateTime.now();

                long minutosTotales = ChronoUnit.MINUTES.between(entrada, salida);
                double horas = minutosTotales / 60.0;
                double monto = 0;

                // 🔹 Calcular monto según tiempo
                int horasCompletas = (int) horas;
                boolean tieneFraccion = (horas - horasCompletas) > 0;

                monto = horasCompletas * 5.0;
                if (tieneFraccion) monto += 2.0;

                // 🔹 Acciones según método de pago
                if (metodoPago.equalsIgnoreCase("efectivo") || metodoPago.equalsIgnoreCase("tarjeta")) {
                    JOptionPane.showMessageDialog(null, "Total a pagar: Q" + monto);

                } else if (metodoPago.equalsIgnoreCase("cuenta")) {
                    // Verificar saldo del estudiante
                    String sqlCuenta = "SELECT cuenta FROM estudiante WHERE placa = ?";
                    try (PreparedStatement psCuenta = con.prepareStatement(sqlCuenta)) {
                        psCuenta.setString(1, placa);
                        try (ResultSet rsCuenta = psCuenta.executeQuery()) {
                            if (rsCuenta.next()) {
                                double saldo = rsCuenta.getDouble("cuenta");
                                if (saldo < monto) {
                                    JOptionPane.showMessageDialog(null, "Saldo insuficiente en cuenta");
                                    return false;
                                } else {
                                    // Descontar el monto
                                    String sqlUpdateCuenta = "UPDATE estudiante SET cuenta = cuenta - ? WHERE placa = ?";
                                    try (PreparedStatement psUpdateCuenta = con.prepareStatement(sqlUpdateCuenta)) {
                                        psUpdateCuenta.setDouble(1, monto);
                                        psUpdateCuenta.setString(2, placa);
                                        
                                        psUpdateCuenta.executeUpdate();
                                    }
                                    JOptionPane.showMessageDialog(null, "Pago realizado desde cuenta. Monto descontado: Q" + monto);
                                }
                            }
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Método de pago no válido");
                    return false;
                }

                // 🔹 Liberar el espacio
                actualizarSpot(idSpot, "libre");

                // 🔹 Actualizar datos en el histórico
                String sqlUpdate = "UPDATE historico SET fecha_salida = ?, monto = ?, metodo = ? WHERE ticket = ?";
                try (PreparedStatement psUpdate = con.prepareStatement(sqlUpdate)) {
                    psUpdate.setTimestamp(1, Timestamp.valueOf(salida));
                    psUpdate.setDouble(2, monto);
                    psUpdate.setString(3, metodoPago);
                    psUpdate.setString(4, ticket);
                    psUpdate.executeUpdate();
                }

                return true;
            }
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al registrar salida: " + e.getMessage());
        e.printStackTrace();
        return false;
    }
}

    
    public boolean salidaFlat(String ticket){
        return false;
    }
    
}
