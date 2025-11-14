
package com.mycompany.proyectoparqueo;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class Interfaz extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Interfaz.class.getName());

    public Interfaz() {
        initComponents();
        indicadorEstMoto();
        indicadorEstAuto();
        indicadorCatMoto();
        indicadorCatAuto();
        setLocationRelativeTo(null);//centra la interfaz
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblEncabezado = new javax.swing.JLabel();
        BttmEntrada = new javax.swing.JButton();
        BttmSalida = new javax.swing.JButton();
        lblEstMoto = new javax.swing.JLabel();
        lblEstAuto = new javax.swing.JLabel();
        lblCatAuto = new javax.swing.JLabel();
        lblCatMoto = new javax.swing.JLabel();
        BtmCargarArchivo = new javax.swing.JButton();
        LblEstudiante = new javax.swing.JLabel();
        LblCatedraticos = new javax.swing.JLabel();
        BtmMapa = new javax.swing.JButton();
        BtmReingreso = new javax.swing.JButton();
        BtmSalir = new javax.swing.JButton();
        LblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MenuPrincipal");
        setBackground(java.awt.SystemColor.activeCaptionText);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(51, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblEncabezado.setFont(new java.awt.Font("Edwardian Script ITC", 1, 60)); // NOI18N
        LblEncabezado.setForeground(new java.awt.Color(255, 255, 255));
        LblEncabezado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblEncabezado.setText("Bienvenido a Park Plus");
        getContentPane().add(LblEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 17, 851, 107));

        BttmEntrada.setBackground(new java.awt.Color(51, 0, 0));
        BttmEntrada.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        BttmEntrada.setForeground(new java.awt.Color(255, 255, 255));
        BttmEntrada.setText("ENTRADA");
        BttmEntrada.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red));
        BttmEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttmEntradaActionPerformed(evt);
            }
        });
        getContentPane().add(BttmEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 145, 242, 65));

        BttmSalida.setBackground(new java.awt.Color(51, 0, 0));
        BttmSalida.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        BttmSalida.setForeground(new java.awt.Color(255, 255, 255));
        BttmSalida.setText("SALIDA");
        BttmSalida.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red));
        BttmSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttmSalidaActionPerformed(evt);
            }
        });
        getContentPane().add(BttmSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 306, 242, 65));

        lblEstMoto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(lblEstMoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 171, 39));

        lblEstAuto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(lblEstAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 205, 171, 40));

        lblCatAuto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblCatAuto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblCatAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 173, 40));

        lblCatMoto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(lblCatMoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 173, 40));

        BtmCargarArchivo.setBackground(new java.awt.Color(255, 255, 255));
        BtmCargarArchivo.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        BtmCargarArchivo.setForeground(new java.awt.Color(51, 0, 0));
        BtmCargarArchivo.setText("Cargar Archivos");
        BtmCargarArchivo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 0, 0), new java.awt.Color(51, 0, 0), new java.awt.Color(51, 0, 0), new java.awt.Color(51, 0, 0)));
        BtmCargarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmCargarArchivoActionPerformed(evt);
            }
        });
        getContentPane().add(BtmCargarArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 240, 50));

        LblEstudiante.setBackground(new java.awt.Color(51, 0, 0));
        LblEstudiante.setFont(new java.awt.Font("Cooper Black", 0, 20)); // NOI18N
        LblEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        LblEstudiante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblEstudiante.setText("Parqueo Para Alumnos:");
        LblEstudiante.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(LblEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 310, 42));

        LblCatedraticos.setBackground(new java.awt.Color(51, 0, 0));
        LblCatedraticos.setFont(new java.awt.Font("Cooper Black", 0, 20)); // NOI18N
        LblCatedraticos.setForeground(new java.awt.Color(255, 255, 255));
        LblCatedraticos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblCatedraticos.setText("Parqueo Para Catedraticos:");
        LblCatedraticos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(LblCatedraticos, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 310, 42));

        BtmMapa.setBackground(new java.awt.Color(255, 255, 255));
        BtmMapa.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        BtmMapa.setForeground(new java.awt.Color(51, 0, 0));
        BtmMapa.setText("Mapa");
        BtmMapa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 0, 0), new java.awt.Color(51, 0, 0), new java.awt.Color(51, 0, 0), new java.awt.Color(51, 0, 0)));
        BtmMapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmMapaActionPerformed(evt);
            }
        });
        getContentPane().add(BtmMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 240, 50));

        BtmReingreso.setBackground(new java.awt.Color(51, 0, 0));
        BtmReingreso.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        BtmReingreso.setForeground(new java.awt.Color(255, 255, 255));
        BtmReingreso.setText("REINGRESO");
        BtmReingreso.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red));
        BtmReingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmReingresoActionPerformed(evt);
            }
        });
        getContentPane().add(BtmReingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 222, 242, 65));

        BtmSalir.setBackground(new java.awt.Color(255, 255, 255));
        BtmSalir.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        BtmSalir.setForeground(new java.awt.Color(51, 0, 0));
        BtmSalir.setText("Salir del Programa");
        BtmSalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 0, 0), new java.awt.Color(51, 0, 0), new java.awt.Color(51, 0, 0), new java.awt.Color(51, 0, 0)));
        BtmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmSalirActionPerformed(evt);
            }
        });
        getContentPane().add(BtmSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, 210, 50));

        LblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        getContentPane().add(LblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, 930, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents
public boolean haySpotsDisponibles() {
        boolean disponible = false;
        try (Connection con = Conexion.conectar()) {
            String sql = "SELECT COUNT(*) AS libre FROM spot WHERE ESTADO = 'libre'";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next() && rs.getInt("libre") > 0) {
                disponible = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return disponible;
    }

public void indicadorEstMoto() {
    String sql = "SELECT a.NOMBRE, a.TIPO_VEHICULO, a.CAPACIDAD, " +
                     "COUNT(s.ID) AS libres " +
                     "FROM areas a " +
                     "LEFT JOIN spot s ON s.AREA = a.ID AND s.ESTADO = 'LIBRE' " +
                     "WHERE a.ID = 'a01' " +
                     "GROUP BY a.ID, a.Nombre, a.TIPO_VEHICULO, a.CAPACIDAD";
    try (Connection con = Conexion.conectar()) {
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            int capacidad = rs.getInt("CAPACIDAD");
            int libres = rs.getInt("libres");

            int porcentaje = (int) ((libres * 100.0) / capacidad);

            // Mostrar solo un label (elige cuál usas)
            lblEstMoto.setText("Para Motos: " + porcentaje + "% libre");

            // Colores del semáforo
            if (porcentaje > 50) lblEstMoto.setBackground(Color.GREEN);
            else if (porcentaje > 0) lblEstMoto.setBackground(Color.ORANGE);
            else lblEstMoto.setBackground(Color.RED);

            lblEstMoto.setOpaque(true);
            lblEstMoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al consultar disponibilidad del área");
    }
}
public void indicadorEstAuto(){
    String sql = "SELECT a.Nombre, a.TIPO_VEHICULO, a.CAPACIDAD, "+
                    "COUNT(s.ID) AS libres " +
                    "FROM areas a "+
                    "LEFT JOIN spot s on s.AREA = a.ID AND s.ESTADO = 'LIBRE' "+
                    "WHERE a.ID = 'a02' "+
                    "GROUP BY a.ID, a.Nombre, a.TIPO_VEHICULO, a.CAPACIDAD";
    try(Connection con = Conexion.conectar();){      
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        if(rs.next()){
            int capacidad = rs.getInt("CAPACIDAD");
            int libre = rs.getInt("libres");
            
            int porcentaje = (int) ((libre * 100) / capacidad);
            lblEstAuto.setText("Para Autos: " + porcentaje + "% libre");

            // Colores del semáforo
            if (porcentaje > 50) lblEstAuto.setBackground(Color.GREEN);
            else if (porcentaje > 0) lblEstAuto.setBackground(Color.ORANGE);
            else lblEstAuto.setBackground(Color.RED);

            lblEstAuto.setOpaque(true);
            lblEstAuto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        }
    } catch (SQLException e){
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al consultar disponibilidad del área");
    }
}

public void indicadorCatMoto(){
    String sql = "SELECT a.Nombre, a.tipo_vehiculo, a.capacidad, "+
            "COUNT(s.ID) AS libres "+
            "FROM areas a "+
            "LEFT JOIN spot s on s.AREA = a.ID AND s.ESTADO = 'LIBRE' "+
            "WHERE a.ID = 'a03' "+
            "GROUP BY a.ID, a.Nombre, a.tipo_vehiculo, a.capacidad";
    try(Connection con = Conexion.conectar()){
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        if(rs.next()){
            int capacidad = rs.getInt("capacidad");
            int libre = rs.getInt("libres");
            
            int porcentaje = (int) ((libre * 100) / capacidad);
            lblCatMoto.setText("Para Autos: " + porcentaje + "% libre ");
            
            if (porcentaje>50) lblCatMoto.setBackground(Color.GREEN);
            else if (porcentaje>10) lblCatMoto.setBackground(Color.YELLOW);
            else lblCatMoto.setBackground(Color.red);
            
            lblCatMoto.setOpaque(true);
            lblCatMoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        }
        
    } catch(SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al consultar disponibilidad del área");
    }
}

public void indicadorCatAuto(){
    String sql = "SELECT a.nombre, a.tipo_vehiculo, a.capacidad, " +
             "COUNT(s.id) AS libres " +
             "FROM areas a " +
             "LEFT JOIN spot s ON s.area = a.id AND s.estado = 'LIBRE' " +
             "WHERE a.id = 'a04' " +
             "GROUP BY a.id, a.nombre, a.tipo_vehiculo, a.capacidad";
    
    try (Connection con = Conexion.conectar()){
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()){
            int capacidad = rs.getInt("capacidad");
            int libres = rs.getInt("libres");
            
            int porcentaje = (int) ((libres * 100)/ capacidad);
            lblCatAuto.setText("Para Autos: "+ porcentaje + "% libre");
            
            if (porcentaje>50) lblCatAuto.setBackground(Color.GREEN);
            else if (porcentaje>10) lblCatAuto.setBackground(Color.orange);
            else lblCatAuto.setBackground(Color.red);
            
            lblCatAuto.setOpaque(true);
            lblCatAuto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
           
        }
    } catch (SQLException e){
        
    }
}
              
    private void BttmEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttmEntradaActionPerformed
        // TODO add your handling code here:
        Vehiculo vehiculo = new Vehiculo();
String placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo:");

if (placa == null || placa.trim().isEmpty()) {
    JOptionPane.showMessageDialog(this, "Debe ingresar una placa válida.");
    return;
}

try (Connection con = Conexion.conectar()) {
    String sql = "SELECT estado FROM historico WHERE placa = ?";
    try (PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setString(1, placa);

        try (ResultSet rs = ps.executeQuery()) {

            if (rs.next()) {

                String estadoActual = rs.getString("estado");

                if (estadoActual != null &&
                   (estadoActual.equalsIgnoreCase("activo") ||
                    estadoActual.equalsIgnoreCase("pendiente"))) {

                    JOptionPane.showMessageDialog(null, 
                            "Este vehiculo ya está registrado dentro del parqueo");
                    return;
                }
            }

            if (vehiculo.verificarPlacaEnBD(placa)) {
                new RegistrarEntrada(placa).setVisible(true);
                this.dispose();
            } else {
                new RegistrarNuevo(placa).setVisible(true);
                this.dispose();
            }
        }
    }
} catch (SQLException e) {
    JOptionPane.showMessageDialog(this, "Error " + e.getMessage());
    e.printStackTrace();
}

        
    }//GEN-LAST:event_BttmEntradaActionPerformed

    private void BtmCargarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmCargarArchivoActionPerformed
        // TODO add your handling code here:
        CargarArchivos carga = new CargarArchivos();
        carga.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtmCargarArchivoActionPerformed

    private void BtmMapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmMapaActionPerformed
        // TODO add your handling code here:
        MapaParqueo mapa = new MapaParqueo();
        mapa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtmMapaActionPerformed

    private void BttmSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttmSalidaActionPerformed
        // TODO add your handling code here:

        String ticket = JOptionPane.showInputDialog("Ingrese el ticket");
        
    try (Connection con = Conexion.conectar()) {
        String sql = "SELECT modo, estado FROM historico WHERE ticket = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, ticket);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    String modoPago = rs.getString("modo");
                    String estadoActual= rs.getString("estado");

                    if (modoPago.equalsIgnoreCase("flat")) {
                        // 🔹 Si fue modo flat, llama al método salidaFlat
                        Salida salida = new Salida();
                        salida.salidaFlat(ticket); 
                        // Puedes cambiar el nombre del método según el que ya tengas implementado

                    } else if (modoPago.equalsIgnoreCase("variable")) {
                        // 🔹 Si fue modo variable, abrir la interfaz para elegir método de pago
                        if(estadoActual.equalsIgnoreCase("activo")){
                            RegistrarSalida ventanaMetodo = new RegistrarSalida(ticket);
                            ventanaMetodo.setVisible(true);
                            this.dispose(); // opcional, si querés cerrar la ventana actual     
                        } else {
                            JOptionPane.showMessageDialog(null, "Este Ticket ya está pagado.");
                            return;
                        }
                        

                    } else {
                        JOptionPane.showMessageDialog(this, "Modo de pago no reconocido en la base de datos.");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "No se encontró el ticket ingresado.");
                }
            }
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al verificar el ticket: " + e.getMessage());
        e.printStackTrace();
    }
    }//GEN-LAST:event_BttmSalidaActionPerformed

    private void BtmReingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmReingresoActionPerformed
        // TODO add your handling code here:
        
        String ticket = JOptionPane.showInputDialog("Ingrese el número de ticket:");
        Salida reingreso = new Salida();
        if (ticket != null && !ticket.trim().isEmpty()) {
            reingreso.reingresoFlat(ticket);
        }

    }//GEN-LAST:event_BtmReingresoActionPerformed

    private void BtmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_BtmSalirActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Interfaz().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtmCargarArchivo;
    private javax.swing.JButton BtmMapa;
    private javax.swing.JButton BtmReingreso;
    private javax.swing.JButton BtmSalir;
    private javax.swing.JButton BttmEntrada;
    private javax.swing.JButton BttmSalida;
    private javax.swing.JLabel LblCatedraticos;
    private javax.swing.JLabel LblEncabezado;
    private javax.swing.JLabel LblEstudiante;
    private javax.swing.JLabel LblFondo;
    private javax.swing.JLabel lblCatAuto;
    private javax.swing.JLabel lblCatMoto;
    private javax.swing.JLabel lblEstAuto;
    private javax.swing.JLabel lblEstMoto;
    // End of variables declaration//GEN-END:variables
}
