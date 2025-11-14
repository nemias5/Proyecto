package com.mycompany.proyectoparqueo;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.JOptionPane;


public class ProyectoParqueo {
    public static void main(String[] args) {
        String contraseña;
        ImageIcon original = new ImageIcon(
            ProyectoParqueo.class.getResource("/imagenes/icon.png")
        );

        Image img = original.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon iconoEscalado = new ImageIcon(img);
    
        do{
            contraseña = (String) JOptionPane.showInputDialog(
                null,
                "Ingrese su contraseña de usuario:",
                "Login del sistema",
                JOptionPane.QUESTION_MESSAGE,
                iconoEscalado,
        null,
        ""
        );
            if (contraseña == null) {
                System.exit(0);
            }
            if ("123".equals(contraseña)) {
                Interfaz ejemplo = new Interfaz();
                ejemplo.setVisible(true);
                break;
            } else {
                JOptionPane.showMessageDialog(
                        null, 
                        "Contraseña incorrecta. Intente de nuevo.", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE
                        );
            }
            
        }while(true);
    }
}