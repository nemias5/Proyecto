/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoparqueo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ngonz
 */
public class Alumno {
    public int carnet;
    public String nombre;
    public String apellido;
    public int telefono;
    public String correo;
    public String placa;
    public double saldo;

    public Alumno() {
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
    
    public boolean registrarAlumno(Alumno alumno){
        try (Connection con = Conexion.conectar()) {
            String sqlVehiculo = "INSERT INTO estudiante (carne, nombre, apellido, telefono, correo, placa, cuenta) VALUES (?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement psA = con.prepareStatement(sqlVehiculo)) {
                psA.setInt(1, alumno.getCarnet());
                psA.setString(2, alumno.getNombre());
                psA.setString(3, alumno.getApellido());
                psA.setInt(4, alumno.getTelefono());
                psA.setString(5, alumno.getCorreo());
                psA.setString(6, alumno.getPlaca());
                psA.setDouble(7, alumno.getSaldo());
                psA.executeUpdate();
            }

            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar: " + e.getMessage());
            return false;
        }
    }
}
