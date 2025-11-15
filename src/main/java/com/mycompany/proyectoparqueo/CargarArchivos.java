package com.mycompany.proyectoparqueo;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaEstudiantes = new javax.swing.JTable();
        TablaSpot = new javax.swing.JScrollPane();
        TablaSpots = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaAreas = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaVehiculos = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaHistorica = new javax.swing.JTable();
        LblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblArchivoEstudiante.setBackground(new java.awt.Color(51, 0, 0));
        LblArchivoEstudiante.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        LblArchivoEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        LblArchivoEstudiante.setText("Cargar Archivos de Estudiantes:");
        getContentPane().add(LblArchivoEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 250, 41));

        LblArchivoVehiculo.setBackground(new java.awt.Color(51, 0, 0));
        LblArchivoVehiculo.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        LblArchivoVehiculo.setForeground(new java.awt.Color(255, 255, 255));
        LblArchivoVehiculo.setText("Cargar Archivos de Vehículos:");
        getContentPane().add(LblArchivoVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 240, 41));

        LblArchivoSpot.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        LblArchivoSpot.setForeground(new java.awt.Color(255, 255, 255));
        LblArchivoSpot.setText("Cargar Archivos de Spots:");
        getContentPane().add(LblArchivoSpot, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 210, 41));

        LblArchivoAreas.setBackground(new java.awt.Color(51, 0, 0));
        LblArchivoAreas.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        LblArchivoAreas.setForeground(new java.awt.Color(255, 255, 255));
        LblArchivoAreas.setText("Cargar Archivos de Areas: ");
        getContentPane().add(LblArchivoAreas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 210, 41));

        TxtArchivoEstudiantes.setBackground(new java.awt.Color(255, 255, 255));
        TxtArchivoEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtArchivoEstudiantesActionPerformed(evt);
            }
        });
        getContentPane().add(TxtArchivoEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 252, 41));

        TxtArchivoVehiculos.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(TxtArchivoVehiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 252, 41));

        TxtArchivoAreas.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(TxtArchivoAreas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 252, 41));

        TxtArchivoSpots.setBackground(new java.awt.Color(153, 153, 153));
        TxtArchivoSpots.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtArchivoSpotsActionPerformed(evt);
            }
        });
        getContentPane().add(TxtArchivoSpots, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 252, 41));

        BtmCargarEstudiante.setBackground(new java.awt.Color(51, 0, 0));
        BtmCargarEstudiante.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        BtmCargarEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        BtmCargarEstudiante.setText("Cargar");
        BtmCargarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmCargarEstudianteActionPerformed(evt);
            }
        });
        getContentPane().add(BtmCargarEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 124, 41));

        BtmCargarVehiculo.setBackground(new java.awt.Color(51, 0, 0));
        BtmCargarVehiculo.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        BtmCargarVehiculo.setForeground(new java.awt.Color(255, 255, 255));
        BtmCargarVehiculo.setText("Cargar");
        BtmCargarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmCargarVehiculoActionPerformed(evt);
            }
        });
        getContentPane().add(BtmCargarVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 124, 41));

        BtmCargarArea.setBackground(new java.awt.Color(51, 0, 0));
        BtmCargarArea.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        BtmCargarArea.setForeground(new java.awt.Color(255, 255, 255));
        BtmCargarArea.setText("Cargar");
        BtmCargarArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmCargarAreaActionPerformed(evt);
            }
        });
        getContentPane().add(BtmCargarArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 124, 41));

        BtmCargarSpots.setBackground(new java.awt.Color(51, 0, 0));
        BtmCargarSpots.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        BtmCargarSpots.setForeground(new java.awt.Color(255, 255, 255));
        BtmCargarSpots.setText("Cargar");
        BtmCargarSpots.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmCargarSpotsActionPerformed(evt);
            }
        });
        getContentPane().add(BtmCargarSpots, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 124, 41));

        BtmRegresar.setBackground(java.awt.Color.red);
        BtmRegresar.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        BtmRegresar.setForeground(new java.awt.Color(0, 0, 0));
        BtmRegresar.setText("Regresar");
        BtmRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(BtmRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 117, 37));

        LblArchivoHistorico.setBackground(new java.awt.Color(51, 0, 0));
        LblArchivoHistorico.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        LblArchivoHistorico.setForeground(new java.awt.Color(255, 255, 255));
        LblArchivoHistorico.setText("Cargar Archivos Históricos:");
        getContentPane().add(LblArchivoHistorico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 220, 43));

        TxtArchivoHistórico.setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().add(TxtArchivoHistórico, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 252, 43));

        BtmCargarHistoricos.setBackground(new java.awt.Color(51, 0, 0));
        BtmCargarHistoricos.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        BtmCargarHistoricos.setForeground(new java.awt.Color(255, 255, 255));
        BtmCargarHistoricos.setText("Cargar");
        BtmCargarHistoricos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmCargarHistoricosActionPerformed(evt);
            }
        });
        getContentPane().add(BtmCargarHistoricos, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 124, 43));

        jScrollPane2.setBackground(new java.awt.Color(51, 0, 0));
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N

        TablaEstudiantes.setBackground(new java.awt.Color(255, 255, 255));
        TablaEstudiantes.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        TablaEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Carnet", "Nombre", "Apellido", "Telefono", "Correo", "Placa", "Cuenta "
            }
        ));
        jScrollPane2.setViewportView(TablaEstudiantes);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 770, 60));

        TablaSpots.setBackground(new java.awt.Color(255, 255, 255));
        TablaSpots.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        TablaSpots.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Area", "TipoVehículo", "Estado "
            }
        ));
        TablaSpot.setViewportView(TablaSpots);

        getContentPane().add(TablaSpot, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 270, 70));

        TablaAreas.setBackground(new java.awt.Color(255, 255, 255));
        TablaAreas.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        TablaAreas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Capacidad", "TipoVehículo "
            }
        ));
        jScrollPane1.setViewportView(TablaAreas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 240, 70));

        TablaVehiculos.setBackground(new java.awt.Color(255, 255, 255));
        TablaVehiculos.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        TablaVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Placa", "TipoVehiculo", "TipoArea "
            }
        ));
        jScrollPane3.setViewportView(TablaVehiculos);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 291, 250, 70));

        TablaHistorica.setBackground(new java.awt.Color(255, 255, 255));
        TablaHistorica.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        TablaHistorica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Ticket", "Placa", "Area", "Spot", "Ingreso", "Salida", "Modo", "Metodo", "Cuenta", "Estado"
            }
        ));
        jScrollPane4.setViewportView(TablaHistorica);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 371, 780, 60));

        LblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondocarga - copia.png"))); // NOI18N
        getContentPane().add(LblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtmCargarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmCargarEstudianteActionPerformed
        // TODO add your handling code here:
        String rutaArchivo = TxtArchivoEstudiantes.getText();
        Conexion leer = new Conexion();
        leer.leerArchivoEstudiante(rutaArchivo);
        tablaEstudiante(rutaArchivo);      
    }//GEN-LAST:event_BtmCargarEstudianteActionPerformed

    private void BtmCargarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmCargarVehiculoActionPerformed
        // TODO add your handling code here:
        String rutaArchivo = TxtArchivoVehiculos.getText();
        Conexion leer = new Conexion();
        leer.leerArchivoVehiculo(rutaArchivo);
        tablaVehiculos(rutaArchivo);
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
        tablaSpots(rutaArchivo);
    }//GEN-LAST:event_BtmCargarSpotsActionPerformed

    private void BtmCargarAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmCargarAreaActionPerformed
        // TODO add your handling code here:
        String rutaArchivo = TxtArchivoAreas.getText();
        Conexion leer = new Conexion();
        leer.leerArchivoAreas(rutaArchivo);
        tablaAreas(rutaArchivo);
    }//GEN-LAST:event_BtmCargarAreaActionPerformed

    private void BtmCargarHistoricosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmCargarHistoricosActionPerformed
        // TODO add your handling code here:
        String rutaArchivo = TxtArchivoHistórico.getText();
        Conexion leer = new Conexion();
        leer.leerArchivoHistorico(rutaArchivo);
        tablaHistorica(rutaArchivo);
    }//GEN-LAST:event_BtmCargarHistoricosActionPerformed

    private void TxtArchivoEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtArchivoEstudiantesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtArchivoEstudiantesActionPerformed

    public void tablaEstudiante(String rutaArchivo) {
        DefaultTableModel modelo = (DefaultTableModel) TablaEstudiantes.getModel();
        modelo.setRowCount(0);
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            br.readLine();
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length >= 7) {
                    modelo.addRow(new Object[]{
                        datos[0], datos[1], datos[2],
                        datos[3], datos[4], datos[5], datos[6]
                    });
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar la tabla: " + e.getMessage());
        }
    }
    public void tablaSpots(String rutaArchivo) {
        DefaultTableModel modelo = (DefaultTableModel) TablaSpots.getModel();
        modelo.setRowCount(0);
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            br.readLine();
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length >= 4) {
                    modelo.addRow(new Object[]{
                        datos[0], datos[1], datos[2],
                        datos[3]
                    });
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar la tabla: " + e.getMessage());
        }
    }
    public void tablaAreas(String rutaArchivo) {
        DefaultTableModel modelo = (DefaultTableModel) TablaAreas.getModel();
        modelo.setRowCount(0);
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            br.readLine();
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length >= 4) {
                    modelo.addRow(new Object[]{
                        datos[0], datos[1], datos[2],
                        datos[3]
                    });
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar la tabla: " + e.getMessage());
        }
    }
    public void tablaVehiculos(String rutaArchivo) {
        DefaultTableModel modelo = (DefaultTableModel) TablaVehiculos.getModel();
        modelo.setRowCount(0);
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            br.readLine();
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length >= 3) {
                    modelo.addRow(new Object[]{
                        datos[0], datos[1], datos[2],
                    });
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar la tabla: " + e.getMessage());
        }
    }
    
    public void tablaHistorica(String rutaArchivo){
        DefaultTableModel modelo = (DefaultTableModel) TablaHistorica.getModel();
        modelo.setRowCount(0);
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))){
            br.readLine();
            String linea;
            while((linea = br.readLine()) !=null){
                String[] datos = linea.split(",");
                if (datos.length>=10){
                    modelo.addRow(new Object[]{
                        datos[0], datos[1], datos[2], datos[3], datos[4], datos[5],
                        datos[6], datos[7], datos[8], datos[9],
                    });
                }
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al cargar la tabla: "+e.getMessage());
        }
    }
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
    private javax.swing.JLabel LblFondo;
    private javax.swing.JTable TablaAreas;
    private javax.swing.JTable TablaEstudiantes;
    private javax.swing.JTable TablaHistorica;
    private javax.swing.JScrollPane TablaSpot;
    private javax.swing.JTable TablaSpots;
    private javax.swing.JTable TablaVehiculos;
    private javax.swing.JTextField TxtArchivoAreas;
    private javax.swing.JTextField TxtArchivoEstudiantes;
    private javax.swing.JTextField TxtArchivoHistórico;
    private javax.swing.JTextField TxtArchivoSpots;
    private javax.swing.JTextField TxtArchivoVehiculos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
