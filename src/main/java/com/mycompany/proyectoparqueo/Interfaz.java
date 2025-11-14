
package com.mycompany.proyectoparqueo;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class Interfaz extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Interfaz.class.getName());

    public Interfaz() {
        initComponents();
        actualizarSemaforo();
        setLocationRelativeTo(null);//centra la interfaz
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblEncabezado = new javax.swing.JLabel();
        BttmEntrada = new javax.swing.JButton();
        BttmSalida = new javax.swing.JButton();
        lblEstMoto = new javax.swing.JLabel();
        lblEstAuto = new javax.swing.JLabel();
        lblCatAuto = new javax.swing.JLabel();
        lblCatMoto = new javax.swing.JLabel();
        BtmCargarArchivo = new javax.swing.JButton();
        LblEstudiante = new javax.swing.JLabel();
        LblCatedraticos = new javax.swing.JLabel();
        BtmMapa = new javax.swing.JButton();
        BtmReingreso = new javax.swing.JButton();
        BtmSalir = new javax.swing.JButton();
        LblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MenuPrincipal");
        setBackground(java.awt.SystemColor.activeCaptionText);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(51, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblEncabezado.setFont(new java.awt.Font("Edwardian Script ITC", 1, 60)); // NOI18N
        LblEncabezado.setForeground(new java.awt.Color(255, 255, 255));
        LblEncabezado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblEncabezado.setText("Bienvenido a Park Plus");
        getContentPane().add(LblEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 17, 851, 107));

        BttmEntrada.setBackground(new java.awt.Color(51, 0, 0));
        BttmEntrada.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        BttmEntrada.setForeground(new java.awt.Color(255, 255, 255));
        BttmEntrada.setText("ENTRADA");
        BttmEntrada.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red));
        BttmEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttmEntradaActionPerformed(evt);
            }
        });
        getContentPane().add(BttmEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 145, 242, 65));

        BttmSalida.setBackground(new java.awt.Color(0, 51, 51));
        BttmSalida.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BttmSalida.setText("SALIDA");
        BttmSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttmSalidaActionPerformed(evt);
            }
        });
        getContentPane().add(BttmSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 306, 242, 65));

        lblEstMoto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(lblEstMoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 171, 39));

        lblEstAuto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(lblEstAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 205, 171, 40));

        lblCatAuto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(lblCatAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 318, 173, 40));

        lblCatMoto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(lblCatMoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 318, 173, 40));

        BtmCargarArchivo.setBackground(new java.awt.Color(51, 0, 0));
        BtmCargarArchivo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BtmCargarArchivo.setForeground(new java.awt.Color(255, 255, 255));
        BtmCargarArchivo.setText("Cargar Archivos");
        BtmCargarArchivo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtmCargarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmCargarArchivoActionPerformed(evt);
            }
        });
        getContentPane().add(BtmCargarArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 187, 37));

        LblEstudiante.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LblEstudiante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblEstudiante.setText("Parqueo Para Estudiantes:");
        LblEstudiante.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(LblEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 257, 242, 42));

        LblCatedraticos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LblCatedraticos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblCatedraticos.setText("Parqueo Para Catedraticos:");
        LblCatedraticos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(LblCatedraticos, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 145, 242, 42));

        BtmMapa.setText("Mapa");
        BtmMapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmMapaActionPerformed(evt);
            }
        });
        getContentPane().add(BtmMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 127, 43));

        BtmReingreso.setBackground(new java.awt.Color(51, 0, 0));
        BtmReingreso.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        BtmReingreso.setForeground(new java.awt.Color(255, 255, 255));
        BtmReingreso.setText("REINGRESO");
        BtmReingreso.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        BtmReingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmReingresoActionPerformed(evt);
            }
        });
        getContentPane().add(BtmReingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 222, 242, 65));

        BtmSalir.setText("Cerar");
        BtmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmSalirActionPerformed(evt);
            }
        });
        getContentPane().add(BtmSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, 140, 50));

        LblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        getContentPane().add(LblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, 930, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents
public boolean haySpotsDisponibles() {
        boolean disponible = false;
        try (Connection con = Conexion.conectar()) {
            String sql = "SELECT COUNT(*) AS libre FROM spot WHERE ESTADO = 'libre'";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next() && rs.getInt("libre") > 0) {
                disponible = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return disponible;
    }

public void actualizarSemaforo() {
    try (Connection con = Conexion.conectar()) {
        String sql = "SELECT a.NOMBRE, a.TIPO_VEHICULO, a.CAPACIDAD, COUNT(s.ID) AS libre " +
                     "FROM areas a " +
                     "LEFT JOIN spot s ON s.AREA = a.ID AND s.ESTADO = 'LIBRE' " +
                     "GROUP BY a.ID, a.NOMBRE, a.TIPO_VEHICULO, a.CAPACIDAD";

        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            String nombre = rs.getString("NOMBRE").trim();
            String tipo = rs.getString("TIPO_VEHICULO").trim();
            int capacidad = rs.getInt("CAPACIDAD");
            int libres = rs.getInt("libre");

            JLabel lbl = null;

            if (nombre.equalsIgnoreCase("Estudiante") && tipo.equalsIgnoreCase("Auto")) lbl = lblEstAuto;
            else if (nombre.equalsIgnoreCase("Estudiante") && tipo.equalsIgnoreCase("Moto")) lbl = lblEstMoto;
            else if (nombre.equalsIgnoreCase("Catedratico") && tipo.equalsIgnoreCase("Auto")) lbl = lblCatAuto;
            else if (nombre.equalsIgnoreCase("Catedratico") && tipo.equalsIgnoreCase("Moto")) lbl = lblCatMoto;

            if (lbl != null) {
                int porcentaje = (int) ((libres * 100.0) / capacidad); 
                lbl.setText(tipo + " "+ porcentaje + "% libre");
                if (porcentaje > 50) lbl.setBackground(Color.GREEN);
                else if (porcentaje > 0) lbl.setBackground(Color.YELLOW);
                else lbl.setBackground(Color.RED);
                lbl.setOpaque(true);
                lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al consultar disponibilidad por áreas");
    }
}
              
    private void BttmEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttmEntradaActionPerformed
        // TODO add your handling code here:
        Vehiculo vehiculo = new Vehiculo();
String placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo:");

if (placa == null || placa.trim().isEmpty()) {
    JOptionPane.showMessageDialog(this, "Debe ingresar una placa válida.");
    return;
}

try (Connection con = Conexion.conectar()) {
    String sql = "SELECT estado FROM historico WHERE placa = ?";
    try (PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setString(1, placa);

        try (ResultSet rs = ps.executeQuery()) {

            if (rs.next()) {

                String estadoActual = rs.getString("estado");

                if (estadoActual != null &&
                   (estadoActual.equalsIgnoreCase("activo") ||
                    estadoActual.equalsIgnoreCase("pendiente"))) {

                    JOptionPane.showMessageDialog(null, 
                            "Este vehiculo ya está registrado dentro del parqueo");
                    return;
                }
            }

            if (vehiculo.verificarPlacaEnBD(placa)) {
                new RegistrarEntrada(placa).setVisible(true);
                this.dispose();
            } else {
                new RegistrarNuevo(placa).setVisible(true);
                this.dispose();
            }
        }
    }
} catch (SQLException e) {
    JOptionPane.showMessageDialog(this, "Error " + e.getMessage());
    e.printStackTrace();
}

        
    }//GEN-LAST:event_BttmEntradaActionPerformed

    private void BtmCargarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmCargarArchivoActionPerformed
        // TODO add your handling code here:
        CargarArchivos carga = new CargarArchivos();
        carga.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtmCargarArchivoActionPerformed

    private void BtmMapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmMapaActionPerformed
        // TODO add your handling code here:
        MapaParqueo mapa = new MapaParqueo();
        mapa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtmMapaActionPerformed

    private void BttmSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttmSalidaActionPerformed
        // TODO add your handling code here:

        String ticket = JOptionPane.showInputDialog("Ingrese el ticket");
        
    try (Connection con = Conexion.conectar()) {
        String sql = "SELECT modo, estado FROM historico WHERE ticket = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, ticket);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    String modoPago = rs.getString("modo");
                    String estadoActual= rs.getString("estado");

                    if (modoPago.equalsIgnoreCase("flat")) {
                        // 🔹 Si fue modo flat, llama al método salidaFlat
                        Salida salida = new Salida();
                        salida.salidaFlat(ticket); 
                        // Puedes cambiar el nombre del método según el que ya tengas implementado

                    } else if (modoPago.equalsIgnoreCase("variable")) {
                        // 🔹 Si fue modo variable, abrir la interfaz para elegir método de pago
                        if(estadoActual.equalsIgnoreCase("activo")){
                            RegistrarSalida ventanaMetodo = new RegistrarSalida(ticket);
                            ventanaMetodo.setVisible(true);
                            this.dispose(); // opcional, si querés cerrar la ventana actual     
                        } else {
                            JOptionPane.showMessageDialog(null, "Este Ticket ya está pagado.");
                            return;
                        }
                        

                    } else {
                        JOptionPane.showMessageDialog(this, "Modo de pago no reconocido en la base de datos.");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "No se encontró el ticket ingresado.");
                }
            }
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al verificar el ticket: " + e.getMessage());
        e.printStackTrace();
    }
    }//GEN-LAST:event_BttmSalidaActionPerformed

    private void BtmReingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmReingresoActionPerformed
        // TODO add your handling code here:
        
        String ticket = JOptionPane.showInputDialog("Ingrese el número de ticket:");
        Salida reingreso = new Salida();
        if (ticket != null && !ticket.trim().isEmpty()) {
            reingreso.reingresoFlat(ticket);
        }

    }//GEN-LAST:event_BtmReingresoActionPerformed

    private void BtmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_BtmSalirActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Interfaz().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtmCargarArchivo;
    private javax.swing.JButton BtmMapa;
    private javax.swing.JButton BtmReingreso;
    private javax.swing.JButton BtmSalir;
    private javax.swing.JButton BttmEntrada;
    private javax.swing.JButton BttmSalida;
    private javax.swing.JLabel LblCatedraticos;
    private javax.swing.JLabel LblEncabezado;
    private javax.swing.JLabel LblEstudiante;
    private javax.swing.JLabel LblFondo;
    private javax.swing.JLabel lblCatAuto;
    private javax.swing.JLabel lblCatMoto;
    private javax.swing.JLabel lblEstAuto;
    private javax.swing.JLabel lblEstMoto;
    // End of variables declaration//GEN-END:variables
}
