
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
    public boolean salida(String ticket){
        try (Connection con = Conexion.conectar()) {

            // 🔹 Obtener datos del ticket (ya sabemos que existe)
            String sql = "SELECT placa, fecha_ingreso, modo, spot FROM historico WHERE ticket = ?";
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setString(1, ticket);

                try (ResultSet rs = ps.executeQuery()) {
                    if (!rs.next()) {
                        JOptionPane.showMessageDialog(null, "No existe el ticket ingresado");
                        return false;
                    }

                    String placa = rs.getString("placa");
                    Timestamp fechaEntrada = rs.getTimestamp("fecha_ingreso");
                    String modoPago = rs.getString("modo");
                    String idSpot = rs.getString("spot");

                    // 🔹 Calcular tiempo total
                    LocalDateTime entrada = fechaEntrada.toLocalDateTime();
                    LocalDateTime salida = LocalDateTime.now();

                    long minutosTotales = ChronoUnit.MINUTES.between(entrada, salida);
                    double horas = minutosTotales / 60.0;
                    double monto = 0;

                    // 🔹 Calcular monto
                    if (modoPago.equalsIgnoreCase("variable")) {
                        int horasCompletas = (int) horas;
                        boolean tieneFraccion = (horas - horasCompletas) > 0;

                        monto = horasCompletas * 5.0;
                        if (tieneFraccion) monto += 2.0;

                        actualizarSpot(idSpot, "libre");

                        JOptionPane.showMessageDialog(null, "Total a pagar: Q" + monto);

                    } else if (modoPago.equalsIgnoreCase("flat")) {
                        monto = 10.0;
                        actualizarSpot(idSpot, "pendiente");

                        JOptionPane.showMessageDialog(null,
                                "Pago fijo Q10. Tienes 2 horas para regresar. El espacio quedará libre después.");

                        // 🔸 Hilo para liberar automáticamente después de 2 horas
                        new Thread(() -> {
                            try {
                                Thread.sleep(2 * 60 * 60 * 1000); // 2 horas
                                try (Connection con2 = Conexion.conectar()) {
                                    actualizarSpot(idSpot, "libre");
                                }
                                System.out.println("Spot " + idSpot + " cambiado automáticamente a LIBRE.");
                            } catch (Exception e) {
                                System.out.println("Error al liberar spot automáticamente: " + e.getMessage());
                            }
                        }).start();
                    }

                    // 🔹 Registrar salida y monto
                    String sqlUpdate = "UPDATE historico SET fecha_salida = ?, monto = ? WHERE ticket = ?";
                    try (PreparedStatement psUpdate = con.prepareStatement(sqlUpdate)) {
                        psUpdate.setTimestamp(1, Timestamp.valueOf(salida));
                        psUpdate.setDouble(2, monto);
                        psUpdate.setString(3, ticket);
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
}
