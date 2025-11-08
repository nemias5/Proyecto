
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

        lblEstMoto.setText("kjh");

        lblEstAuto.setText("lkjh");

        lblCatAuto.setText("kjh");

        lblCatMoto.setText("kjh");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LblEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblEstMoto, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(71, 71, 71))
                        .addComponent(BttmEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblEstAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCatAuto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCatMoto, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
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
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCatAuto, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(lblEstMoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCatMoto, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(lblEstAuto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(132, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public boolean haySpotsDisponibles() {
        boolean disponible = false;
        try (Connection con = Conexion.conectar()) {
            String sql = "SELECT COUNT(*) AS libres FROM spot WHERE ESTADO = 'LIBRE'";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next() && rs.getInt("libres") > 0) {
                disponible = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return disponible;
    }

private void actualizarSemaforo() {
    try (Connection con = Conexion.conectar()) {
        String sql = "SELECT a.NOMBRE, a.TIPO_VEHICULO, a.CAPACIDAD, COUNT(s.ID) AS libres " +
                     "FROM areas a " +
                     "LEFT JOIN spot s ON s.AREA = a.ID AND s.ESTADO = 'LIBRE' " +
                     "GROUP BY a.ID, a.NOMBRE, a.TIPO_VEHICULO, a.CAPACIDAD";

        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            String nombre = rs.getString("NOMBRE").trim();
            String tipo = rs.getString("TIPO_VEHICULO").trim();
            int capacidad = rs.getInt("CAPACIDAD");
            int libres = rs.getInt("libres");

            JLabel lbl = null;

            if (nombre.equalsIgnoreCase("Estudiantes") && tipo.equalsIgnoreCase("Auto")) lbl = lblEstAuto;
            else if (nombre.equalsIgnoreCase("Estudiantes") && tipo.equalsIgnoreCase("Moto")) lbl = lblEstMoto;
            else if (nombre.equalsIgnoreCase("Catedraticos") && tipo.equalsIgnoreCase("Auto")) lbl = lblCatAuto;
            else if (nombre.equalsIgnoreCase("Catedraticos") && tipo.equalsIgnoreCase("Moto")) lbl = lblCatMoto;

            if (lbl != null) {
                int porcentaje = (int) ((libres * 100.0) / capacidad); 
                lbl.setText(nombre + " " + tipo + ": " + porcentaje + "% libre");

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
            try {
                if (vehiculo.verificarPlacaEnBD(placa)) {
                    new RegistrarEntrada(placa).setVisible(true);
                    this.dispose();
                } else {
                    new RegistrarNuevo(placa).setVisible(true);
                    this.dispose();
                }   } catch (SQLException ex) {
    logger.log(java.util.logging.Level.SEVERE, "Error SQL", ex);
}

    } else {
        JOptionPane.showMessageDialog(this, "Debe ingresar una placa válida.");
    }
    }//GEN-LAST:event_BttmEntradaActionPerformed

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
    private javax.swing.JLabel lblCatAuto;
    private javax.swing.JLabel lblCatMoto;
    private javax.swing.JLabel lblEstAuto;
    private javax.swing.JLabel lblEstMoto;
    // End of variables declaration//GEN-END:variables
}
