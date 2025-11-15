package com.mycompany.proyectoparqueo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;

public class Reportes {
    public void cierrePorFecha(LocalDate fecha) {

    String sql = 
        "SELECT ticket, placa, area, spot, fecha_ingreso, fecha_salida, modo, monto " +
        "FROM historico " +
        "WHERE DATE(fecha_salida) = ? " +
        "ORDER BY fecha_salida ASC";

    try (Connection con = Conexion.conectar();
         PreparedStatement ps = con.prepareStatement(sql)) {

        ps.setDate(1, java.sql.Date.valueOf(fecha));
        ResultSet rs = ps.executeQuery();
        
        String rutaEscritorio = FileSystemView.getFileSystemView()
                .getHomeDirectory()
                .getAbsolutePath();

        String rutaArchivo = rutaEscritorio + File.separator +
                "Cierre " + fecha.toString() + ".txt";

        System.out.println("Ruta detectada: " + rutaEscritorio);
        System.out.println("Archivo final: " + rutaArchivo);

        BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo));

        double totalFlat = 0.0;
        double totalVariable = 0.0;

        writer.write("===== CIERRE DEL DÍA (" + fecha + ") =====\n\n");
        writer.write(String.format("%-10s %-8s %-6s %-8s %-10s %-19s %-19s %-8s\n",
                "TICKET", "PLACA", "AREA", "SPOT", "MODO",
                "INGRESO", "SALIDA", "MONTO"));
        writer.write("-------------------------------------------------------------------------------\n");

        while (rs.next()) {

            String ticket = rs.getString("ticket");
            String placa = rs.getString("placa");
            String area = rs.getString("area");
            String spot = rs.getString("spot");
            String modo = rs.getString("modo");
            String ingreso = rs.getString("fecha_ingreso");
            String salida  = rs.getString("fecha_salida");
            double monto   = rs.getDouble("monto");

            writer.write(String.format("%-10s %-8s %-6s %-8s %-10s %-19s %-19s %.2f\n",
                    ticket, placa, area, spot, modo, ingreso, salida, monto));

            if (modo.equalsIgnoreCase("flat")) {
                totalFlat += monto;
            } else if (modo.equalsIgnoreCase("variable")) {
                totalVariable += monto;
            }
        }

        double totalGeneral = totalFlat + totalVariable;

        writer.write("\n----- RESUMEN DEL DÍA -----\n");
        writer.write("Total Flat: " + totalFlat + "\n");
        writer.write("Total Variable: " + totalVariable + "\n");
        writer.write("TOTAL GENERAL: " + totalGeneral + "\n");

        writer.flush();
        AccessLog.registrar("admin", "ReporteCreado");
        JOptionPane.showMessageDialog(null,
                "Archivo generado correctamente:\n" + rutaArchivo,
                "Cierre del Día",
                JOptionPane.INFORMATION_MESSAGE);

    } catch (SQLException | IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null,
                "Error al generar el archivo: " + e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE);
    }
}

}
