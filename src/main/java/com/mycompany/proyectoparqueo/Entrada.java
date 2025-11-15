package com.mycompany.proyectoparqueo;
import java.io.File;
import java.sql.*;
import javax.swing.JOptionPane;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class Entrada {
    public boolean entrada(String placa, String modoPago, String metodoPago){
        try (Connection con = Conexion.conectar()){
            String ticket = "t-00001";
            PreparedStatement ps = con.prepareStatement("SELECT ticket FROM historico ORDER BY CAST(SUBSTRING(ticket, 3) AS UNSIGNED) DESC LIMIT 1");
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                int num = Integer.parseInt(rs.getString(1).substring(2));
                ticket = String.format("t-%05d", num +1);
            }
            
            ps = con.prepareStatement("SELECT tipo_vehiculo, tipo_area FROM vehiculos WHERE placa = ?");
            ps.setString(1, placa);
            rs = ps.executeQuery();
            if(!rs.next()){
                JOptionPane.showMessageDialog(null, "Vehículo no encontrado");
                return false;          
            }

            String tipoVehiculo = rs.getString("tipo_vehiculo");
            String tipoArea = rs.getString("tipo_area");

            ps = con.prepareStatement("SELECT id, area FROM spot WHERE tipo_vehiculo=? AND area IN"
                    + "(SELECT id FROM areas WHERE nombre=? AND tipo_vehiculo=?)AND estado = 'LIBRE' LIMIT 1");
            ps.setString(1, tipoVehiculo);
            ps.setString(2, tipoArea);
            ps.setString(3, tipoVehiculo);
            rs = ps.executeQuery();
            if(!rs.next()){
                JOptionPane.showMessageDialog(null, "No hay espacios disponibles");
                return false;
            }
            String spot = rs.getString("id");
            String area = rs.getString("area");
            
            double monto = modoPago.equalsIgnoreCase("flat") ? 10.0 : 0.0;

            if (metodoPago.trim().equalsIgnoreCase("cuenta") && modoPago.trim().equalsIgnoreCase("flat")) {
                ps = con.prepareStatement("SELECT cuenta FROM estudiante WHERE placa = ?");
                ps.setString(1, placa.trim().toUpperCase());
                rs = ps.executeQuery();

                if (rs.next()) {
                double saldo = rs.getDouble("cuenta");
                if (saldo < monto) {
                        JOptionPane.showMessageDialog(null, "Saldo insuficiente en cuenta");
                        return false;
                    } else {
                        rs.close();
                    ps.close();

                    ps = con.prepareStatement("UPDATE estudiante SET cuenta = cuenta - ? WHERE placa = ?");
                    ps.setDouble(1, monto);
                    ps.setString(2, placa.trim().toUpperCase());
                    ps.executeUpdate();
                    }
                }
            }

            ps = con.prepareStatement("INSERT INTO historico VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, ticket);
            ps.setString(2, placa);
            ps.setString(3, area);
            ps.setString(4, spot);
            ps.setTimestamp(5, new java.sql.Timestamp(System.currentTimeMillis()));
            ps.setTimestamp(6, null);
            ps.setString(7, modoPago);
            if (modoPago.equalsIgnoreCase("variable")){
                ps.setString(8, null);
            } else {
                ps.setString(8, metodoPago);
            }
            ps.setDouble(9, monto);
            ps.setString(10, "Activo");
            ps.executeUpdate();

            ps = con.prepareStatement("UPDATE spot SET estado = 'OCUPADO' WHERE id = ?");
            ps.setString(1, spot);
            ps.executeUpdate();
            
            AccessLog.registrar("admin", "Entrada");
            
            JOptionPane.showMessageDialog(null, "Entrada registrada correctamente.\nTicket: " + ticket);
            
            if (modoPago.equalsIgnoreCase("flat")) {
                String ticketInfo = 
                    "===== TICKET DE ENTRADA =====\n" +
                    "Ticket: " + ticket.toUpperCase() + "\n" +
                    "Placa: " + placa.toUpperCase() + "\n" +
                    "Área: " + area.toUpperCase() + "\n" +
                    "Spot: " + spot.toUpperCase() + "\n" +
                    "Modo de Pago: Flat \n" +
                    "Monto: Q 10.00\n" +
                    "Fecha/Hora ingreso: " + new java.util.Date() + "\n" +
                    "Estado: ACTIVO\n" +
                    "==============================";

                JOptionPane.showMessageDialog(null, ticketInfo, "Ticket", JOptionPane.INFORMATION_MESSAGE);
            } else {
                String ticketInfo = 
                    "===== TICKET DE ENTRADA =====\n" +
                    "Ticket: " + ticket.toUpperCase() + "\n" +
                    "Placa: " + placa.toUpperCase() + "\n" +
                    "Área: " + area.toUpperCase() + "\n" +
                    "Spot: " + spot.toUpperCase() + "\n" +
                    "Modo de Pago: Variable \n" +
                    "Fecha/Hora ingreso: " + new java.util.Date() + "\n" +
                    "Estado: ACTIVO\n" +
                    "==============================";

                JOptionPane.showMessageDialog(null, ticketInfo, "Ticket", JOptionPane.INFORMATION_MESSAGE);
            } 
            Interfaz regresar = new Interfaz();
            regresar.setVisible(true);
            return true;
        } catch (SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al registrar entrada");
            return false;
        }
        
    }
    
    public void reingresoFlat(String ticket) {
    try (Connection con = Conexion.conectar()) {

        String sql = "SELECT modo, spot, fecha_salida, estado FROM historico WHERE ticket = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, ticket);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            String modo = rs.getString("modo");
            String idSpot = rs.getString("spot");
            Timestamp fechaSalida = rs.getTimestamp("fecha_salida");
            String estadoActual = rs.getString("estado");
            if (!modo.equalsIgnoreCase("FLAT")) {
                JOptionPane.showMessageDialog(null, 
                    "Este ticket pertenece a un usuario con tarifa VARIABLE. No puede reingresar.",
                    "Reingreso no permitido", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (estadoActual.equalsIgnoreCase("activo")){
                
            }

            if (fechaSalida != null) {
                LocalDateTime salida = fechaSalida.toLocalDateTime();
                long horas = ChronoUnit.HOURS.between(salida, LocalDateTime.now());

                if (horas >= 2) {
                    Salida actualizar = new Salida();
                    actualizar.actualizarSpot(idSpot, "LIBRE");
                    JOptionPane.showMessageDialog(null, 
                        "Han pasado más de 2 horas desde la salida.\nEl spot se liberó automáticamente.",
                        "Spot liberado", JOptionPane.INFORMATION_MESSAGE);
                    String sqlUpdate = "UPDATE historico SET estado = ? WHERE ticket = ?";
                        try (PreparedStatement psUpdate = con.prepareStatement(sqlUpdate)) {
                            psUpdate.setString(1, "CANCELADO");
                            psUpdate.setString(2, ticket);
                            psUpdate.executeUpdate();
                            AccessLog.registrar("admin", "ReingresoFallido");

                        }
                    return;
                } else {
                    Salida actualizar = new Salida();
                    actualizar.actualizarSpot(idSpot, "OCUPADO");
                    JOptionPane.showMessageDialog(null, 
                        "El vehículo puede reingresar. El spot fue marcado como Ocupado.",
                        "Reingreso permitido", JOptionPane.INFORMATION_MESSAGE);
                    
                    String sqlUpdate = "UPDATE historico SET estado = ? WHERE ticket = ?";
                    try(PreparedStatement psUpdate = con.prepareStatement(sqlUpdate)){
                        psUpdate.setString(1, "ACTIVO");
                        psUpdate.setString(2, ticket);
                        psUpdate.executeUpdate();
                        AccessLog.registrar("admin", "ReingresoExitoso");
                    }
                
                }
            } else {
                JOptionPane.showMessageDialog(null, 
                    "El ticket no tiene una fecha de salida registrada.",
                    "Error de datos", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, 
                "No se encontró ningún registro con el ticket ingresado.",
                "Ticket no encontrado", JOptionPane.ERROR_MESSAGE);
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, 
            "Error al procesar el reingreso: " + e.getMessage(),
            "Error SQL", JOptionPane.ERROR_MESSAGE);
    }
}
}
