
package com.mycompany.proyectoparqueo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Usuario {
    public int carnet;
    public String nombre;
    public String apellido;
    public int telefono;
    public String correo;
    public String placa;
    public double saldo;

    public Usuario() {
    }

    public int getCarnet() {
        return carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getPlaca() {
        return placa;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setPlaca(String vehiculo) {
        this.placa = vehiculo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public boolean existeCarne(String carne) {
        boolean existe = false;
        String sql = "SELECT * FROM estudiante WHERE carne = ?";
        try (Connection con = Conexion.conectar();
            PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, carne);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) existe = true;

        } catch (SQLException e) {
            System.out.println("Error al verificar carné: " + e.getMessage());
        }
        return existe;
    }
    
    public boolean registrarAlumno(Usuario alumno){
        try (Connection con = Conexion.conectar()) {
            String sql = "INSERT INTO estudiante (carne, nombre, apellido, telefono, correo, placa, cuenta) VALUES (?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement psU = con.prepareStatement(sql)) {
                psU.setInt(1, alumno.getCarnet());
                psU.setString(2, alumno.getNombre());
                psU.setString(3, alumno.getApellido());
                psU.setInt(4, alumno.getTelefono());
                psU.setString(5, alumno.getCorreo());
                psU.setString(6, alumno.getPlaca());
                psU.setDouble(7, alumno.getSaldo());
                psU.executeUpdate();
            }
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar: " + e.getMessage());
            return false;
        }
    }
    
    public void recargarSaldo(int carnet){
        int saldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad que desea recargar: "));
        String sql = "UPDATE estudiante SET cuenta = cuenta + ? WHERE carne = ?";
        try (Connection con = Conexion.conectar();
            PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, saldo);
            ps.setInt(2, carnet);
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Su saldo fue actualizado correctamente.");
            
        } catch (SQLException e){
            System.out.println("Error al actualizar el saldo"+ e.getMessage());
        }
    }
    
    public void mostrarDatos(int carnet){
        String sql = "SELECT nombre, apellido, telefono, correo, cuenta, placa FROM estudiante WHERE carne = ?";
        try(Connection con = Conexion.conectar()){
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, carnet);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                int telefono = rs.getInt("telefono");
                String correo = rs.getString("correo");
                double cuenta = rs.getDouble("cuenta");
                String placa = rs.getString("placa");
                
                JOptionPane.showMessageDialog(null,
                        "Nombre: "+nombre+"\n"+
                        "Apellido: "+apellido+"\n"+
                        "Telefono: "+telefono+"\n"+
                        "Correo: "+correo+"\n"+
                        "Cuenta: "+cuenta+"\n"+
                        "Placa de Vehículo: "+placa
                        );
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
}
