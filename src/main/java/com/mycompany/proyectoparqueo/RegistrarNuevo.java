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
        LblPlaca2.setText(placa.toUpperCase());
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
        LblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblPlaca.setBackground(new java.awt.Color(0, 0, 0));
        LblPlaca.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        LblPlaca.setForeground(new java.awt.Color(0, 0, 0));
        LblPlaca.setText("Placa:");
        getContentPane().add(LblPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 82, 182, 37));

        LblNombre.setBackground(new java.awt.Color(0, 0, 0));
        LblNombre.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        LblNombre.setForeground(new java.awt.Color(0, 0, 0));
        LblNombre.setText("Nombre:");
        getContentPane().add(LblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 125, 182, 35));

        LblApellido.setBackground(new java.awt.Color(0, 0, 0));
        LblApellido.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        LblApellido.setForeground(new java.awt.Color(0, 0, 0));
        LblApellido.setText("Apellido:");
        getContentPane().add(LblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 166, 182, 34));

        LblCorreo.setBackground(new java.awt.Color(0, 0, 0));
        LblCorreo.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        LblCorreo.setForeground(new java.awt.Color(0, 0, 0));
        LblCorreo.setText("Correo Electrónico:");
        getContentPane().add(LblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 206, -1, 36));

        LblTelefono.setBackground(new java.awt.Color(0, 0, 0));
        LblTelefono.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        LblTelefono.setForeground(new java.awt.Color(0, 0, 0));
        LblTelefono.setText("No. de Telefono:");
        getContentPane().add(LblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 248, 182, 32));

        LblCarne.setBackground(new java.awt.Color(0, 0, 0));
        LblCarne.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        LblCarne.setForeground(new java.awt.Color(0, 0, 0));
        LblCarne.setText("Carne:");
        getContentPane().add(LblCarne, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 287, 182, 31));

        LblSaldo.setBackground(new java.awt.Color(0, 0, 0));
        LblSaldo.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        LblSaldo.setForeground(new java.awt.Color(0, 0, 0));
        LblSaldo.setText("Saldo en Cuenta:");
        getContentPane().add(LblSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 324, 182, 33));

        LblVehiculo.setBackground(new java.awt.Color(0, 0, 0));
        LblVehiculo.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        LblVehiculo.setForeground(new java.awt.Color(0, 0, 0));
        LblVehiculo.setText("Tipo de Vehiculo:");
        getContentPane().add(LblVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 363, 182, 33));

        LblArea.setBackground(new java.awt.Color(0, 0, 0));
        LblArea.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        LblArea.setForeground(new java.awt.Color(0, 0, 0));
        LblArea.setText("Tipo de Área:");
        getContentPane().add(LblArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 402, 182, 34));

        LblPlaca2.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        LblPlaca2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(LblPlaca2, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 82, 193, 37));

        TxtNombre.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        TxtNombre.setForeground(new java.awt.Color(51, 0, 0));
        TxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(TxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 125, 193, 35));

        TxtApellido.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        TxtApellido.setForeground(new java.awt.Color(51, 0, 0));
        TxtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtApellidoActionPerformed(evt);
            }
        });
        getContentPane().add(TxtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 166, 193, 34));

        TxtCorreo.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        TxtCorreo.setForeground(new java.awt.Color(51, 0, 0));
        TxtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCorreoActionPerformed(evt);
            }
        });
        getContentPane().add(TxtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 206, 193, 36));

        TxtTelefono.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        TxtTelefono.setForeground(new java.awt.Color(51, 0, 0));
        TxtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(TxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 248, 193, -1));

        TxtCarne.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        TxtCarne.setForeground(new java.awt.Color(51, 0, 0));
        TxtCarne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCarneActionPerformed(evt);
            }
        });
        getContentPane().add(TxtCarne, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 286, 193, 31));

        ComboVehiculo.setBackground(new java.awt.Color(51, 0, 0));
        ComboVehiculo.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        ComboVehiculo.setForeground(new java.awt.Color(255, 255, 255));
        ComboVehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Moto", "Auto" }));
        getContentPane().add(ComboVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 363, 193, 33));

        ComboArea.setBackground(new java.awt.Color(51, 0, 0));
        ComboArea.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        ComboArea.setForeground(new java.awt.Color(255, 255, 255));
        ComboArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estudiante ", "Catedratico" }));
        getContentPane().add(ComboArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 402, 193, 34));

        TxtSaldo.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        TxtSaldo.setForeground(new java.awt.Color(51, 0, 0));
        getContentPane().add(TxtSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 324, 193, 33));

        BtmRegistrar.setBackground(new java.awt.Color(51, 0, 0));
        BtmRegistrar.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        BtmRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        BtmRegistrar.setText("Registrar");
        BtmRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(BtmRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 480, 201, 58));

        jLabel1.setFont(new java.awt.Font("Edwardian Script ITC", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Este Vehículo no está Registrado:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 417, 58));

        BtmCancelar.setBackground(new java.awt.Color(51, 0, 0));
        BtmCancelar.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        BtmCancelar.setForeground(new java.awt.Color(255, 255, 255));
        BtmCancelar.setText("Cancelar");
        BtmCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(BtmCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 480, 191, 58));

        LblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo2.png"))); // NOI18N
        getContentPane().add(LblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 500, 570));

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
        nuevo.setPlaca(placa); vehiculo.setPlaca(placa); 
        vehiculo.setTipoVehiculo(ComboVehiculo.getSelectedItem().toString().trim()); 
        vehiculo.setTipoArea(ComboArea.getSelectedItem().toString().trim()); 
        
        if (nuevo.getNombre().isEmpty() || nuevo.getApellido().isEmpty() || 
                nuevo.getCorreo().isEmpty() || nuevo.getTelefono() == 0 ){ 
            JOptionPane.showMessageDialog(this, "Debe completar todos los campos."); 
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
    private javax.swing.JLabel LblFondo;
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
