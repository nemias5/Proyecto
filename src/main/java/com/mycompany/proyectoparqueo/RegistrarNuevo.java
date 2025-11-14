package com.mycompany.proyectoparqueo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class RegistrarNuevo extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(RegistrarNuevo.class.getName());

    String placa;
    public RegistrarNuevo(String placa) {
        initComponents();
        this.placa = placa;
        System.out.println("Placa recibida en RegistrarNuevo: " + placa);
        setLocationRelativeTo(null);
        LblPlaca2.setText(placa);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblPlaca = new javax.swing.JLabel();
        LblNombre = new javax.swing.JLabel();
        LblApellido = new javax.swing.JLabel();
        LblCorreo = new javax.swing.JLabel();
        LblTelefono = new javax.swing.JLabel();
        LblCarne = new javax.swing.JLabel();
        LblSaldo = new javax.swing.JLabel();
        LblVehiculo = new javax.swing.JLabel();
        LblArea = new javax.swing.JLabel();
        LblPlaca2 = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        TxtApellido = new javax.swing.JTextField();
        TxtCorreo = new javax.swing.JTextField();
        TxtTelefono = new javax.swing.JTextField();
        TxtCarne = new javax.swing.JTextField();
        ComboVehiculo = new javax.swing.JComboBox<>();
        ComboArea = new javax.swing.JComboBox<>();
        TxtSaldo = new javax.swing.JTextField();
        BtmRegistrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BtmCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LblPlaca.setText("Placa:");

        LblNombre.setText("Nombre:");

        LblApellido.setText("Apellido:");

        LblCorreo.setText("Correo Electrónico:");

        LblTelefono.setText("No. de Telefono:");

        LblCarne.setText("Carne:");

        LblSaldo.setText("Saldo en Cuenta:");

        LblVehiculo.setText("Tipo de Vehiculo:");

        LblArea.setText("Estudiante/Catedratico:");

        TxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombreActionPerformed(evt);
            }
        });

        TxtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtApellidoActionPerformed(evt);
            }
        });

        TxtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCorreoActionPerformed(evt);
            }
        });

        TxtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTelefonoActionPerformed(evt);
            }
        });

        TxtCarne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCarneActionPerformed(evt);
            }
        });

        ComboVehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Moto", "Auto" }));

        ComboArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estudiante ", "Catedratico" }));

        BtmRegistrar.setText("Registrar");
        BtmRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmRegistrarActionPerformed(evt);
            }
        });

        jLabel1.setText("Este vehículo no está registrado, favor de registrarlo:");

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
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtmRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(BtmCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LblArea, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(LblVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LblSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LblCarne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LblTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LblCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LblApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LblPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LblPlaca2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TxtNombre)
                            .addComponent(TxtApellido)
                            .addComponent(TxtCorreo)
                            .addComponent(TxtTelefono)
                            .addComponent(TxtCarne)
                            .addComponent(ComboVehiculo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ComboArea, 0, 193, Short.MAX_VALUE)
                            .addComponent(TxtSaldo))))
                .addContainerGap(228, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblPlaca2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TxtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(LblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TxtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(LblApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TxtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(LblCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblCarne, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtCarne, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LblSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TxtSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ComboVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(LblVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ComboArea, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(LblArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtmRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(BtmCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombreActionPerformed
        // TODO add your handling code here:
        TxtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
                    TxtApellido.requestFocus();
                }
            }
        });

    }//GEN-LAST:event_TxtNombreActionPerformed

    private void TxtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtApellidoActionPerformed
        // TODO add your handling code here:
        TxtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
                    TxtCorreo.requestFocus();
            }
            }
        });

    }//GEN-LAST:event_TxtApellidoActionPerformed

    private void TxtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCorreoActionPerformed
        // TODO add your handling code here:
        TxtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
                    TxtTelefono.requestFocus();
                }
            }
        });

    }//GEN-LAST:event_TxtCorreoActionPerformed

    private void TxtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTelefonoActionPerformed
        // TODO add your handling code here:
        TxtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
                    TxtCarne.requestFocus();
                }
            }
        });

    }//GEN-LAST:event_TxtTelefonoActionPerformed

    private void TxtCarneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCarneActionPerformed
        // TODO add your handling code here:
        TxtCarne.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
                    TxtSaldo.requestFocus();
                }
            }
        });

    }//GEN-LAST:event_TxtCarneActionPerformed

    private void BtmRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmRegistrarActionPerformed
        // TODO add your handling code here:
        Usuario nuevo = new Usuario();
        Vehiculo vehiculo = new Vehiculo();
        nuevo.setNombre(TxtNombre.getText().trim());
        nuevo.setApellido(TxtApellido.getText().trim());
        nuevo.setCorreo(TxtCorreo.getText().trim());
        nuevo.setTelefono(Integer.parseInt(TxtTelefono.getText().trim()));
        nuevo.setCarnet(Integer.parseInt(TxtCarne.getText().trim()));
        nuevo.setSaldo(Double.parseDouble(TxtSaldo.getText().trim()));
        nuevo.setPlaca(placa);
        vehiculo.setPlaca(placa);
        vehiculo.setTipoVehiculo(ComboVehiculo.getSelectedItem().toString().trim());
        vehiculo.setTipoArea(ComboArea.getSelectedItem().toString().trim());
    
    if (nuevo.getNombre().isEmpty() || nuevo.getApellido().isEmpty() ||
        nuevo.getCorreo().isEmpty() || vehiculo.getPlaca().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Debe completar todos los campos.");
        return;
    }
    if (nuevo.existeCarne(String.valueOf(nuevo.getCarnet()))) {
        JOptionPane.showMessageDialog(this, "El carné ya existe.");
        return;
    }
    if (nuevo.registrarAlumno(nuevo) && vehiculo.registrarVehiculo(vehiculo)) {
        JOptionPane.showMessageDialog(this, "Registro exitoso.");
        new RegistrarEntrada(vehiculo.getPlaca()).setVisible(true);
        this.dispose();
    } else {
        JOptionPane.showMessageDialog(this, "No se pudo registrar.");
    }
        
    }//GEN-LAST:event_BtmRegistrarActionPerformed

    private void BtmCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmCancelarActionPerformed
        // TODO add your handling code here:
        Interfaz cancelar = new Interfaz();
        cancelar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtmCancelarActionPerformed

                                             

    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtmCancelar;
    private javax.swing.JButton BtmRegistrar;
    private javax.swing.JComboBox<String> ComboArea;
    private javax.swing.JComboBox<String> ComboVehiculo;
    private javax.swing.JLabel LblApellido;
    private javax.swing.JLabel LblArea;
    private javax.swing.JLabel LblCarne;
    private javax.swing.JLabel LblCorreo;
    private javax.swing.JLabel LblNombre;
    private javax.swing.JLabel LblPlaca;
    private javax.swing.JLabel LblPlaca2;
    private javax.swing.JLabel LblSaldo;
    private javax.swing.JLabel LblTelefono;
    private javax.swing.JLabel LblVehiculo;
    private javax.swing.JTextField TxtApellido;
    private javax.swing.JTextField TxtCarne;
    private javax.swing.JTextField TxtCorreo;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtSaldo;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
