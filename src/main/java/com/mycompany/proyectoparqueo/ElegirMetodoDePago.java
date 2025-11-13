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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ComboMetodoDePago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Tarjeta", "Cuenta" }));

        BtmRegistrar.setText("Registrar");
        BtmRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmRegistrarActionPerformed(evt);
            }
        });

        BtmRegresar.setText("Regresar");
        BtmRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(BtmRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(BtmRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ComboMetodoDePago, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(ComboMetodoDePago, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtmRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(BtmRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );

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

    public static void main(String args[]) {
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtmRegistrar;
    private javax.swing.JButton BtmRegresar;
    private javax.swing.JComboBox<String> ComboMetodoDePago;
    // End of variables declaration//GEN-END:variables
}