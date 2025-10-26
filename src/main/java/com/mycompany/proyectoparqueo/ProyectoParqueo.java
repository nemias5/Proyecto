package com.mycompany.proyectoparqueo;
import javax.swing.JOptionPane;
public class ProyectoParqueo {
    public static void main(String[] args) {
        String contraseña;
        do {
            contraseña = JOptionPane.showInputDialog("Ingrese su contraseña de usuario: ");
            if ("123".equals(contraseña)) {
                Interfaz ejemplo = new Interfaz();
                ejemplo.setVisible(true);
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta. Intente de nuevo.");
            }
        } while (true);
    }
}