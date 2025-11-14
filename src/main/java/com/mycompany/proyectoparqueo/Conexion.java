package com.mycompany.proyectoparqueo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Conexion {

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/proyectoparqueo?useSSL=false&serverTimezone=America/Guatemala",
            "root",
            "Nehemias:2005"
        );
    }
    
    public void leerArchivoEstudiante(String rutaArchivo) {
        String linea;
        try (Connection conn = Conexion.conectar();
             BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            br.readLine();
            String sql = "INSERT INTO estudiante (carne, nombre, apellido, telefono, correo, placa, cuenta) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");

                if (datos.length >= 7) {
                    ps.setInt(1, Integer.parseInt(datos[0]));
                    ps.setString(2, datos[1]);
                    ps.setString(3, datos[2]);
                    ps.setInt(4, Integer.parseInt(datos[3]));
                    ps.setString(5, datos[4]);
                    ps.setString(6, datos[5]);
                    ps.setDouble(7, Double.parseDouble(datos[6]));
                    ps.executeUpdate();
                }
            }

            JOptionPane.showMessageDialog(null, "Datos insertados correctamente.");

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo: " + e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la base de datos: " + e.getMessage());
        }
    }
    
    public void leerArchivoVehiculo(String rutaArchivo) {
        String linea;
        try (Connection conn = Conexion.conectar();
            BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            br.readLine();
            String sql = "INSERT INTO vehiculos (placa, tipo_vehiculo, tipo_area) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");

                if (datos.length >= 3) {
                    ps.setString(1, datos[0]);
                    ps.setString(2, datos[1]);
                    ps.setString(3, datos[2]);
                    ps.executeUpdate();
                }
            }

            JOptionPane.showMessageDialog(null, "Datos insertados correctamente.");

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo: " + e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la base de datos: " + e.getMessage());
        }
    }
    
    public void leerArchivoSpots(String rutaArchivo){
        String linea;
        try (Connection conn = Conexion.conectar();
            BufferedReader br = new BufferedReader (new FileReader(rutaArchivo))){
            br.readLine();
            String sql = "INSERT INTO spot (id, area, tipo_vehiculo, estado) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            while ((linea = br.readLine())!=null){
                String [] datos = linea.split("\\|");
                
                if (datos.length >=4){
                    ps.setString(1, datos[0]);
                    ps.setString(2, datos[1]);
                    ps.setString(3, datos[2]);
                    ps.setString(4, datos[3]);
                    ps.executeUpdate();
                }
            }
            JOptionPane.showMessageDialog(null, "Datos insertados correctamente.");

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo: " + e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la base de datos: " + e.getMessage());
        }
    }
    
    public void leerArchivoAreas(String rutaArchivo){
        String linea;
        try(Connection conn = Conexion.conectar();
            BufferedReader br = new BufferedReader (new FileReader(rutaArchivo))){
            br.readLine();
            String sql = "INSERT INTO areas (id, nombre, capacidad, tipo_vehiculo) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            while ((linea = br.readLine())!=null){
                    String [] datos =linea.split(",");
                    
                    if(datos.length>=4){
                        ps.setString(1, datos[0]);
                        ps.setString(2, datos[1]);
                        ps.setInt(3, Integer.parseInt(datos[2]));
                        ps.setString(4, datos[3]);
                        ps.executeUpdate();
                    }
            }
            JOptionPane.showMessageDialog(null, "Datos insertados correctamente. ");
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error al leer el archivo: " + e.getMessage());
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en la base de datos: "+ e.getMessage());
        }
    }
    
    public void leerArchivoHistorico(String rutaArchivo){
        String linea;
        try (Connection con = Conexion.conectar();
            BufferedReader br = new BufferedReader (new FileReader(rutaArchivo))){
            br.readLine();
            String sql = "INSERT INTO historico (ticket, placa, area, spot, fecha_ingreso, fecha_salida, modo, metodo, monto) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            
            while ((linea = br.readLine())!=null){
                String [] datos = linea.split(",");
                if (datos.length>=9){
                    ps.setString(1, datos[0]);
                    ps.setString(2, datos[1]);
                    ps.setString(3, datos[2]);
                    ps.setString(4, datos[3]);
                    ps.setTimestamp(5, Timestamp.valueOf(datos[4]));
                    ps.setTimestamp(6, Timestamp.valueOf(datos[5]));
                    ps.setString(7, datos[6]);
                    ps.setString(8, datos[7]);
                    ps.setDouble(9, Double.parseDouble(datos[8]));
                    ps.executeUpdate();
                }
            }
            JOptionPane.showMessageDialog(null, "Datos insertados correctamente. ");
        } catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error al leer el archivo: "+ e.getMessage());
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en la base de datos: "+ e.getMessage());
        }
    }

}
