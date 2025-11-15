package com.mycompany.proyectoparqueo;
public class RegistrarEntrada extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(RegistrarEntrada.class.getName());

    private String placa;

    public RegistrarEntrada(String placa) {
        initComponents();
        this.placa = placa;
        System.out.println("Placa recibida en RegistrarNuevo: " + placa);
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ComboModoDePago = new javax.swing.JComboBox<>();
        LblTitulo = new javax.swing.JLabel();
        BtmSiguiente = new javax.swing.JButton();
        BtmCancelar = new javax.swing.JButton();
        LblEncabezado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ComboModoDePago.setBackground(new java.awt.Color(255, 255, 255));
        ComboModoDePago.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        ComboModoDePago.setForeground(new java.awt.Color(51, 0, 0));
        ComboModoDePago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Flat", "Variable" }));
        ComboModoDePago.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red));
        getContentPane().add(ComboModoDePago, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 220, 60));

        LblTitulo.setFont(new java.awt.Font("Edwardian Script ITC", 1, 40)); // NOI18N
        LblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        LblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTitulo.setText("Elija el Modo de Pago");
        getContentPane().add(LblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 440, 73));

        BtmSiguiente.setBackground(new java.awt.Color(255, 255, 255));
        BtmSiguiente.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        BtmSiguiente.setForeground(new java.awt.Color(51, 0, 0));
        BtmSiguiente.setText("Siguiente");
        BtmSiguiente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red));
        BtmSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(BtmSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 190, 52));

        BtmCancelar.setBackground(new java.awt.Color(255, 255, 255));
        BtmCancelar.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        BtmCancelar.setForeground(new java.awt.Color(51, 0, 0));
        BtmCancelar.setText("Cancelar");
        BtmCancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red));
        BtmCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(BtmCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 206, 52));

        LblEncabezado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo4.png"))); // NOI18N
        getContentPane().add(LblEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(-44, 0, 630, 350));

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
    private javax.swing.JLabel LblEncabezado;
    private javax.swing.JLabel LblTitulo;
    // End of variables declaration//GEN-END:variables
}
