package com.mycompany.proyectoparqueo;

public class CargarArchivos extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CargarArchivos.class.getName());

    public CargarArchivos() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblArchivoEstudiante = new javax.swing.JLabel();
        LblArchivoVehiculo = new javax.swing.JLabel();
        LblArchivoSpot = new javax.swing.JLabel();
        LblArchivoAreas = new javax.swing.JLabel();
        TxtArchivoEstudiantes = new javax.swing.JTextField();
        TxtArchivoVehiculos = new javax.swing.JTextField();
        TxtArchivoAreas = new javax.swing.JTextField();
        TxtArchivoSpots = new javax.swing.JTextField();
        BtmCargarEstudiante = new javax.swing.JButton();
        BtmCargarVehiculo = new javax.swing.JButton();
        BtmCargarArea = new javax.swing.JButton();
        BtmCargarSpots = new javax.swing.JButton();
        BtmRegresar = new javax.swing.JButton();
        LblArchivoHistorico = new javax.swing.JLabel();
        TxtArchivoHistórico = new javax.swing.JTextField();
        BtmCargarHistoricos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LblArchivoEstudiante.setText("Cargar Archivos de Estudiantes");

        LblArchivoVehiculo.setText("Cargar Archivos de Vehículos");

        LblArchivoSpot.setText("Cargar Archivos de Spots");

        LblArchivoAreas.setText("Cargar Archivos de Areas: ");

        TxtArchivoSpots.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtArchivoSpotsActionPerformed(evt);
            }
        });

        BtmCargarEstudiante.setText("Cargar");
        BtmCargarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmCargarEstudianteActionPerformed(evt);
            }
        });

        BtmCargarVehiculo.setText("Cargar");
        BtmCargarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmCargarVehiculoActionPerformed(evt);
            }
        });

        BtmCargarArea.setText("Cargar");
        BtmCargarArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmCargarAreaActionPerformed(evt);
            }
        });

        BtmCargarSpots.setText("Cargar");
        BtmCargarSpots.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmCargarSpotsActionPerformed(evt);
            }
        });

        BtmRegresar.setText("Regresar");
        BtmRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmRegresarActionPerformed(evt);
            }
        });

        LblArchivoHistorico.setText("Cargar Archivos Históricos");

        BtmCargarHistoricos.setText("Cargar");
        BtmCargarHistoricos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmCargarHistoricosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LblArchivoHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TxtArchivoHistórico))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LblArchivoSpot, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TxtArchivoSpots))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LblArchivoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TxtArchivoEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblArchivoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblArchivoAreas, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtArchivoVehiculos)
                            .addComponent(TxtArchivoAreas))))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtmCargarEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtmCargarVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtmCargarArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtmCargarSpots, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                    .addComponent(BtmCargarHistoricos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtmRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtmCargarEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(TxtArchivoEstudiantes)
                    .addComponent(LblArchivoEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtmCargarVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(TxtArchivoVehiculos)
                    .addComponent(LblArchivoVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtmCargarArea, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                        .addComponent(BtmRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TxtArchivoAreas)
                    .addComponent(LblArchivoAreas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LblArchivoSpot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TxtArchivoSpots)
                    .addComponent(BtmCargarSpots, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LblArchivoHistorico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TxtArchivoHistórico)
                    .addComponent(BtmCargarHistoricos, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtmCargarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmCargarEstudianteActionPerformed
        // TODO add your handling code here:
        String rutaArchivo = TxtArchivoEstudiantes.getText();
        Conexion leer = new Conexion();
        leer.leerArchivoEstudiante(rutaArchivo);
        
    }//GEN-LAST:event_BtmCargarEstudianteActionPerformed

    private void BtmCargarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmCargarVehiculoActionPerformed
        // TODO add your handling code here:
        String rutaArchivo = TxtArchivoVehiculos.getText();
        Conexion leer = new Conexion();
        leer.leerArchivoVehiculo(rutaArchivo);
    }//GEN-LAST:event_BtmCargarVehiculoActionPerformed

    private void BtmRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmRegresarActionPerformed
        // TODO add your handling code here:
        Interfaz regresar = new Interfaz();
        regresar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtmRegresarActionPerformed

    private void TxtArchivoSpotsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtArchivoSpotsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtArchivoSpotsActionPerformed

    private void BtmCargarSpotsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmCargarSpotsActionPerformed
        // TODO add your handling code here:
        String rutaArchivo = TxtArchivoSpots.getText();
        Conexion leer = new Conexion();
        leer.leerArchivoSpots(rutaArchivo);
    }//GEN-LAST:event_BtmCargarSpotsActionPerformed

    private void BtmCargarAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmCargarAreaActionPerformed
        // TODO add your handling code here:
        String rutaArchivo = TxtArchivoAreas.getText();
        Conexion leer = new Conexion();
        leer.leerArchivoAreas(rutaArchivo);
    }//GEN-LAST:event_BtmCargarAreaActionPerformed

    private void BtmCargarHistoricosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmCargarHistoricosActionPerformed
        // TODO add your handling code here:
        String rutaArchivo = TxtArchivoHistórico.getText();
        Conexion leer = new Conexion();
        leer.leerArchivoHistorico(rutaArchivo);
    }//GEN-LAST:event_BtmCargarHistoricosActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new CargarArchivos().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtmCargarArea;
    private javax.swing.JButton BtmCargarEstudiante;
    private javax.swing.JButton BtmCargarHistoricos;
    private javax.swing.JButton BtmCargarSpots;
    private javax.swing.JButton BtmCargarVehiculo;
    private javax.swing.JButton BtmRegresar;
    private javax.swing.JLabel LblArchivoAreas;
    private javax.swing.JLabel LblArchivoEstudiante;
    private javax.swing.JLabel LblArchivoHistorico;
    private javax.swing.JLabel LblArchivoSpot;
    private javax.swing.JLabel LblArchivoVehiculo;
    private javax.swing.JTextField TxtArchivoAreas;
    private javax.swing.JTextField TxtArchivoEstudiantes;
    private javax.swing.JTextField TxtArchivoHistórico;
    private javax.swing.JTextField TxtArchivoSpots;
    private javax.swing.JTextField TxtArchivoVehiculos;
    // End of variables declaration//GEN-END:variables
}
