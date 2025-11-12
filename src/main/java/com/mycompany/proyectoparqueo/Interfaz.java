
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.SystemColor.activeCaptionText);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(51, 0, 0));

        LblEncabezado.setFont(new java.awt.Font("Edwardian Script ITC", 1, 60)); // NOI18N
        LblEncabezado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblEncabezado.setText("Bienvenido a Park Plus");

        BttmEntrada.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BttmEntrada.setText("ENTRADA");
        BttmEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttmEntradaActionPerformed(evt);
            }
        });

        BttmSalida.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BttmSalida.setText("SALIDA");
        BttmSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttmSalidaActionPerformed(evt);
            }
        });

        lblEstMoto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblEstAuto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblCatAuto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblCatMoto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

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

        LblEstudiante.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LblEstudiante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblEstudiante.setText("Parqueo Para Estudiantes:");
        LblEstudiante.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        LblCatedraticos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LblCatedraticos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblCatedraticos.setText("Parqueo Para Catedraticos:");
        LblCatedraticos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        BtmMapa.setText("Mapa");
        BtmMapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmMapaActionPerformed(evt);
            }
        });

        BtmReingreso.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BtmReingreso.setText("REINGRESO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 851, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(BttmEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                                .addComponent(BtmReingreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(BttmSalida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtmCargarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(167, 167, 167)
                                    .addComponent(LblCatedraticos, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(94, 94, 94)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblCatAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(37, 37, 37)
                                            .addComponent(lblCatMoto, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblEstMoto, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(30, 30, 30)
                                            .addComponent(lblEstAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(213, 213, 213)
                                .addComponent(BtmMapa, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LblEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(LblEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BttmEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtmReingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LblCatedraticos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEstMoto, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEstAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LblEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCatAuto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCatMoto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtmMapa, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtmCargarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(BttmSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

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
        if (placa != null && !placa.trim().isEmpty()) {
                if (vehiculo.verificarPlacaEnBD(placa)) {
                    new RegistrarEntrada(placa).setVisible(true);
                    this.dispose();
                } else {
                    new RegistrarNuevo(placa).setVisible(true);
                    this.dispose();
                }

    } else {
        JOptionPane.showMessageDialog(this, "Debe ingresar una placa válida.");
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
        Salida salida = new Salida();
        String ticket = JOptionPane.showInputDialog("Ingrese el ticket");
        
        boolean exito = salida.salida(ticket);

        if (exito) {
            JOptionPane.showMessageDialog(this, "Salida registrada exitosamente.");
        } else {
            JOptionPane.showMessageDialog(this, "Error al registrar salida o ticket no válido.");
        }      
    }//GEN-LAST:event_BttmSalidaActionPerformed

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
    private javax.swing.JButton BttmEntrada;
    private javax.swing.JButton BttmSalida;
    private javax.swing.JLabel LblCatedraticos;
    private javax.swing.JLabel LblEncabezado;
    private javax.swing.JLabel LblEstudiante;
    private javax.swing.JLabel lblCatAuto;
    private javax.swing.JLabel lblCatMoto;
    private javax.swing.JLabel lblEstAuto;
    private javax.swing.JLabel lblEstMoto;
    // End of variables declaration//GEN-END:variables
}
