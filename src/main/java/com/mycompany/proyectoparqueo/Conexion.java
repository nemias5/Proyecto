package com.mycompany.proyectoparqueo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/proyectoparqueo?useSSL=false&serverTimezone=UTC",
            "root",
            "Nehemias:2005"
        );
    }
}
