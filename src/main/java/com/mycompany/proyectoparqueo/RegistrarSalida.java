package com.mycompany.proyectoparqueo;

public class RegistrarSalida extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(RegistrarSalida.class.getName());

    private String ticket;
    public RegistrarSalida(String ticket) {
        initComponents();
        setLocationRelativeTo(null);
        this.ticket = ticket;
        System.out.println("Ticket recibido en RegistrarSalida: " + ticket);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ComboMetodoDePago = new javax.swing.JComboBox<>();
        LblMetodoPago = new javax.swing.JLabel();
        BtmRegistrar = new javax.swing.JButton();
        LblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ComboMetodoDePago.setBackground(new java.awt.Color(51, 0, 0));
        ComboMetodoDePago.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        ComboMetodoDePago.setForeground(new java.awt.Color(255, 255, 255));
        ComboMetodoDePago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Tarjeta", "Cuenta" }));
        ComboMetodoDePago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboMetodoDePagoActionPerformed(evt);
            }
        });
        getContentPane().add(ComboMetodoDePago, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 208, 61));

        LblMetodoPago.setFont(new java.awt.Font("Edwardian Script ITC", 1, 40)); // NOI18N
        LblMetodoPago.setForeground(new java.awt.Color(255, 255, 255));
        LblMetodoPago.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblMetodoPago.setText("Elegir el metodo de pago:");
        getContentPane().add(LblMetodoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 463, 56));

        BtmRegistrar.setBackground(new java.awt.Color(51, 0, 0));
        BtmRegistrar.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        BtmRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        BtmRegistrar.setText("Registrar");
        BtmRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(BtmRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 212, 208, 60));

        LblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondocarga.png"))); // NOI18N
        getContentPane().add(LblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, -8, 480, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtmRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmRegistrarActionPerformed
        // TODO add your handling code here:
        String metodoPago = ComboMetodoDePago.getSelectedItem().toString();
        Salida registro = new Salida();
        registro.salidaVariable(ticket, metodoPago);
        this.dispose();
        Interfaz regresar = new Interfaz();
        regresar.setVisible(true);
    }//GEN-LAST:event_BtmRegistrarActionPerformed

    private void ComboMetodoDePagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboMetodoDePagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboMetodoDePagoActionPerformed

    public static void main(String args[]) {
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtmRegistrar;
    private javax.swing.JComboBox<String> ComboMetodoDePago;
    private javax.swing.JLabel LblFondo;
    private javax.swing.JLabel LblMetodoPago;
    // End of variables declaration//GEN-END:variables
}
