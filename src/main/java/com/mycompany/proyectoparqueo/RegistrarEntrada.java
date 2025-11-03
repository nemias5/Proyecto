/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectoparqueo;
public class RegistrarEntrada extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(RegistrarEntrada.class.getName());

    private String placa;

    public RegistrarEntrada(String placa) {
        initComponents();
        this.placa = placa;
        System.out.println("Placa recibida en RegistrarNuevo: " + placa);
        setLocationRelativeTo(null);
        
        javax.swing.SpinnerDateModel modeloHora = new javax.swing.SpinnerDateModel();
        SpinHora.setModel(modeloHora);
        javax.swing.JSpinner.DateEditor editorHora = new javax.swing.JSpinner.DateEditor(SpinHora, "HH:mm");
        SpinHora.setEditor(editorHora);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Date = new com.toedter.calendar.JDateChooser();
        SpinHora = new javax.swing.JSpinner();
        ComboMetodoDePago = new javax.swing.JComboBox<>();
        ComboModoDePago = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ComboMetodoDePago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Tarjeta", "Saldo" }));
        ComboMetodoDePago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboMetodoDePagoActionPerformed(evt);
            }
        });

        ComboModoDePago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Flat", "Variable" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(336, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ComboModoDePago, 0, 274, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(SpinHora)
                        .addComponent(Date, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                        .addComponent(ComboMetodoDePago, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(217, 217, 217))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SpinHora, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(ComboModoDePago, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ComboMetodoDePago, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboMetodoDePagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboMetodoDePagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboMetodoDePagoActionPerformed

    public static void main(String args[]) {

       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboMetodoDePago;
    private javax.swing.JComboBox<String> ComboModoDePago;
    private com.toedter.calendar.JDateChooser Date;
    private javax.swing.JSpinner SpinHora;
    // End of variables declaration//GEN-END:variables
}
