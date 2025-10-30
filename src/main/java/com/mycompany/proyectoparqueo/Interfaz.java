
package com.mycompany.proyectoparqueo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Interfaz extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Interfaz.class.getName());

    public Interfaz() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblEncabezado = new javax.swing.JLabel();
        BttmEntrada = new javax.swing.JButton();
        BttmSalida = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LblEncabezado.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        LblEncabezado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblEncabezado.setText("BIENVENIDO A \"PARK PLUS\"");

        BttmEntrada.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BttmEntrada.setText("Registrar Entrada");
        BttmEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttmEntradaActionPerformed(evt);
            }
        });

        BttmSalida.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BttmSalida.setText("Registrar Salida");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LblEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(BttmEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                .addComponent(BttmSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(LblEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BttmEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BttmSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(276, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BttmEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttmEntradaActionPerformed
        // TODO add your handling code here:
        String placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo:");
        if (placa != null && !placa.trim().isEmpty()) {
            try {
                if (verificarPlacaEnBD(placa)) {
                    // Si la placa existe, abrir la interfaz de entrada
                    new RegistrarEntrada(placa).setVisible(true);
                    this.dispose();
                } else {
                    // Si la placa no existe, abrir la interfaz para registrar nuevo
                    new RegistrarNuevo(placa).setVisible(true);
                    this.dispose();
                }   } catch (SQLException ex) {
    logger.log(java.util.logging.Level.SEVERE, "Error SQL", ex);
}

    } else {
        JOptionPane.showMessageDialog(this, "Debe ingresar una placa válida.");
    }
    }//GEN-LAST:event_BttmEntradaActionPerformed

    private boolean verificarPlacaEnBD(String placa) throws SQLException {
        boolean existe = false;
        Connection con = Conexion.conectar();
        String sql = "SELECT * FROM vehiculos WHERE placa = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, placa);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                existe = true; // La placa ya está registrada
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al verificar placa: " + e.getMessage());
        }
        return existe;
    }
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
    private javax.swing.JButton BttmEntrada;
    private javax.swing.JButton BttmSalida;
    private javax.swing.JLabel LblEncabezado;
    // End of variables declaration//GEN-END:variables
}
