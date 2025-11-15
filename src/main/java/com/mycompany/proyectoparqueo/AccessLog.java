package com.mycompany.proyectoparqueo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
public class AccessLog {
    public static void registrar(String usuario, String accion) {
        try (Connection con = Conexion.conectar()) {
            String sql = "INSERT INTO access_log (usuario, accion, fecha) VALUES (?, ?, ?)";
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setString(1, usuario);
                ps.setString(2, accion);
                ps.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
                ps.executeUpdate();
            }
        } catch (SQLException e) {
            System.out.println("Error registrando log: " + e.getMessage());
        }
    }
}
