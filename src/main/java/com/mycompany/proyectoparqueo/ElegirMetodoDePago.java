package com.mycompany.proyectoparqueo;

public class ElegirMetodoDePago extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ElegirMetodoDePago.class.getName());

    private String modoPago;
    private String placa;
    public ElegirMetodoDePago(String placa, String modoPago) {
        this.modoPago = modoPago;
        this.placa = placa;
        initComponents();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ComboMetodoDePago = new javax.swing.JComboBox<>();
        BtmRegistrar = new javax.swing.JButton();
        BtmRegresar = new javax.swing.JButton();
        LblEncabezado = new javax.swing.JLabel();
        LblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ComboMetodoDePago.setBackground(new java.awt.Color(255, 255, 255));
        ComboMetodoDePago.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        ComboMetodoDePago.setForeground(new java.awt.Color(51, 0, 0));
        ComboMetodoDePago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Tarjeta", "Cuenta" }));
        ComboMetodoDePago.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red));
        ComboMetodoDePago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboMetodoDePagoActionPerformed(evt);
            }
        });
        getContentPane().add(ComboMetodoDePago, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 220, 60));

        BtmRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        BtmRegistrar.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        BtmRegistrar.setForeground(new java.awt.Color(51, 0, 0));
        BtmRegistrar.setText("Registrar");
        BtmRegistrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red));
        BtmRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(BtmRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 182, 55));

        BtmRegresar.setBackground(new java.awt.Color(255, 255, 255));
        BtmRegresar.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        BtmRegresar.setForeground(new java.awt.Color(51, 0, 0));
        BtmRegresar.setText("Regresar");
        BtmRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(BtmRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 205, 178, 55));

        LblEncabezado.setFont(new java.awt.Font("Edwardian Script ITC", 1, 40)); // NOI18N
        LblEncabezado.setForeground(new java.awt.Color(255, 255, 255));
        LblEncabezado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblEncabezado.setText("Elija el Método de Pago:");
        getContentPane().add(LblEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 480, 50));

        LblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo3.png"))); // NOI18N
        getContentPane().add(LblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtmRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmRegistrarActionPerformed
        // TODO add your handling code here:
        String metodoPago = ComboMetodoDePago.getSelectedItem().toString();
        Entrada registro = new Entrada();
        registro.entrada(placa, modoPago, metodoPago);
        this.dispose();
    }//GEN-LAST:event_BtmRegistrarActionPerformed

    private void BtmRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmRegresarActionPerformed
        // TODO add your handling code here:
        RegistrarEntrada regresar = new RegistrarEntrada(placa);
        regresar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtmRegresarActionPerformed

    private void ComboMetodoDePagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboMetodoDePagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboMetodoDePagoActionPerformed

    public static void main(String args[]) {
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtmRegistrar;
    private javax.swing.JButton BtmRegresar;
    private javax.swing.JComboBox<String> ComboMetodoDePago;
    private javax.swing.JLabel LblEncabezado;
    private javax.swing.JLabel LblFondo;
    // End of variables declaration//GEN-END:variables
}