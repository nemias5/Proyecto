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
        ComboModoDePago = new javax.swing.JComboBox<>();
        LblFecha = new javax.swing.JLabel();
        LblHora = new javax.swing.JLabel();
        LblModoDePago = new javax.swing.JLabel();
        LblTitulo = new javax.swing.JLabel();
        BtmSiguiente = new javax.swing.JButton();
        BtmCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ComboModoDePago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Flat", "Variable" }));

        LblFecha.setText("Fecha de Entrada:");

        LblHora.setText("Hora de Entrada:");

        LblModoDePago.setText("Modo de Pago: ");

        LblTitulo.setText("Por favor, ingrese los siguientes datos:");

        BtmSiguiente.setText("Siguiente");
        BtmSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmSiguienteActionPerformed(evt);
            }
        });

        BtmCancelar.setText("Cancelar");
        BtmCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtmSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtmCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LblModoDePago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 19, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ComboModoDePago, 0, 274, Short.MAX_VALUE)
                                    .addComponent(SpinHora)
                                    .addComponent(Date, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE))))
                        .addGap(217, 217, 217))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LblFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Date, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LblHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SpinHora, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LblModoDePago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ComboModoDePago, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtmSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(BtmCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtmCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmCancelarActionPerformed
        // TODO add your handling code here:
        Interfaz cancelar = new Interfaz();
        cancelar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtmCancelarActionPerformed

    private void BtmSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmSiguienteActionPerformed
        // TODO add your handling code here:
        String modoPago = ComboModoDePago.getSelectedItem().toString();
        if(modoPago.equalsIgnoreCase("variable")){
            String metodoPago = "";
            Entrada registro = new Entrada();
            registro.entrada(placa, modoPago, metodoPago);
            this.dispose();
        } else if (modoPago.equalsIgnoreCase("flat")) {
            ElegirMetodoDePago elegir = new ElegirMetodoDePago(placa, modoPago);
            elegir.setVisible(true);
            this.dispose();
        }
        
    }//GEN-LAST:event_BtmSiguienteActionPerformed
    
    public static void main(String args[]) {

       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtmCancelar;
    private javax.swing.JButton BtmSiguiente;
    private javax.swing.JComboBox<String> ComboModoDePago;
    private com.toedter.calendar.JDateChooser Date;
    private javax.swing.JLabel LblFecha;
    private javax.swing.JLabel LblHora;
    private javax.swing.JLabel LblModoDePago;
    private javax.swing.JLabel LblTitulo;
    private javax.swing.JSpinner SpinHora;
    // End of variables declaration//GEN-END:variables
}
