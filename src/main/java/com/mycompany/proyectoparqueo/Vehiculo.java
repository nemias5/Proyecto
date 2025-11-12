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

public class Vehiculo{
    public String placa;
    public String tipoVehiculo;
    public String tipoArea;

    public Vehiculo() {
    }

    public String getPlaca() {
        return placa;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public String getTipoArea() {
        return tipoArea;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public void setTipoArea(String tipoArea) {
        this.tipoArea = tipoArea;
    }
    
    public boolean verificarPlacaEnBD(String placa){
        boolean existe = false;
        String sql = "SELECT * FROM vehiculos WHERE placa = ?";

        try (Connection con = Conexion.conectar();
            PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, placa);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                existe = true;
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al verificar placa: " + e.getMessage());
        }
        return existe;
    }
    
    public boolean registrarVehiculo(Vehiculo vehiculo){
        try (Connection con = Conexion.conectar()) {
            String sqlVehiculo = "INSERT INTO vehiculos (placa, tipo_vehiculo, tipo_area) VALUES (?, ?, ?)";
            try (PreparedStatement psV = con.prepareStatement(sqlVehiculo)) {
                psV.setString(1, vehiculo.getPlaca());
                psV.setString(2, vehiculo.getTipoVehiculo());
                psV.setString(3, vehiculo.getTipoArea());
                psV.executeUpdate();
            }

            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar: " + e.getMessage());
            return false;
        }
    }

}
