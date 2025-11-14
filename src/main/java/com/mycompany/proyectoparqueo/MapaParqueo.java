
package com.mycompany.proyectoparqueo;
import java.awt.*;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import javax.swing.*;
public class MapaParqueo extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MapaParqueo.class.getName());

public MapaParqueo() {
    initComponents();

    setTitle("Mapa del Parqueo");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(1500, 800);
    setLocationRelativeTo(null); // Centra la ventana

    JPanel panelMapa = new JPanel(new GridLayout(15, 20, 10, 10));

    try (Connection con = Conexion.conectar()) {
        String sql = "SELECT id, tipo_vehiculo, estado FROM spot ORDER BY id ASC";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            String vehiculo = rs.getString("tipo_vehiculo");
            String id = rs.getString("id");
            String estado = rs.getString("estado");

            JButton btn = new JButton((id).toUpperCase());
            btn.setFont(new Font("Cooper Black", Font.TYPE1_FONT, 14));

            if (estado.equalsIgnoreCase("LIBRE")) {
                btn.setBackground(Color.GREEN);
            } else if(estado.equalsIgnoreCase("OCUPADO")){
                btn.setBackground(Color.RED);
            } else {
                btn.setBackground(Color.YELLOW);
            }

            btn.setOpaque(true);
            btn.setBorderPainted(false);
            btn.setForeground(Color.BLACK);

            btn.addActionListener(e -> {

    try (Connection con2 = Conexion.conectar()) {
        //1️⃣ Obtener datos actuales del spot desde historico
        String sql2 = "SELECT placa, ticket, fecha_ingreso, fecha_salida " +
                       "FROM historico WHERE spot = ? " +
                       "ORDER BY fecha_ingreso DESC LIMIT 1";

        PreparedStatement ps2 = con2.prepareStatement(sql2);
        ps2.setString(1, id);

        ResultSet rs2 = ps2.executeQuery();

        // Mensaje básico
        String mensaje = "Espacio: " + id.toUpperCase() +
                         "\nEstado: " + estado.toUpperCase();
                         

        // 2️⃣ Si está libre → no hay datos
        if (estado.equalsIgnoreCase("LIBRE")) {
            mensaje += "\n\n--- SIN VEHÍCULO ---";

            JOptionPane.showMessageDialog(null, mensaje);
            return;
        }

        // 3️⃣ Si hay registro
        if (!rs2.next()) {
            mensaje += "\n\n(No hay datos actuales del vehículo)";
            JOptionPane.showMessageDialog(null, mensaje);
            return;
        }

        String placa = rs2.getString("placa");
        String ticket = rs2.getString("ticket");
        Timestamp fechaEntradaTS = rs2.getTimestamp("fecha_ingreso");
        LocalDateTime fechaEntrada = fechaEntradaTS.toLocalDateTime();

        // 4️⃣ Obtener datos del estudiante
        String sqlEst = "SELECT carne, nombre, apellido, telefono " +
                        "FROM estudiante WHERE placa = ?";

        PreparedStatement psEst = con2.prepareStatement(sqlEst);
        psEst.setString(1, placa);
        ResultSet rsEst = psEst.executeQuery();

        String carne = "";
        String nombre = "";
        String apellido = "";
        String telefono = "";

        if (rsEst.next()) {
            carne = rsEst.getString("carne");
            nombre = rsEst.getString("nombre");
            apellido = rsEst.getString("apellido");
            telefono = rsEst.getString("telefono");
        }

        // 5️⃣ Datos de tabla vehiculo → tipo de usuario
        String sqlVeh = "SELECT tipo_area FROM vehiculos WHERE placa = ?";
        PreparedStatement psVeh = con2.prepareStatement(sqlVeh);
        psVeh.setString(1, placa);
        ResultSet rsVeh = psVeh.executeQuery();

        String tipoUsuario = "";

        if (rsVeh.next()) {
            tipoUsuario = rsVeh.getString("tipo_area"); // estudiante o catedratico
        }

        // 6️⃣ Calcular tiempo restante si está en PENDIENTE
        String tiempo = "";
        if (estado.equalsIgnoreCase("PENDIENTE")) {

            Timestamp fechaSalidaTS = rs2.getTimestamp("fecha_salida");

            if (fechaSalidaTS != null) {
                LocalDateTime salida = fechaSalidaTS.toLocalDateTime();
                long minutosPasados = ChronoUnit.MINUTES.between(salida, LocalDateTime.now());
                long minutosRestantes = 120 - minutosPasados;

                if (minutosPasados >= 120) {
                    // Auto-liberar
                    String liberarSQL = "UPDATE spot SET estado = 'LIBRE' WHERE id = ?";
                    PreparedStatement psLiberar = con2.prepareStatement(liberarSQL);
                    psLiberar.setString(1, id);
                    psLiberar.executeUpdate();

                    btn.setBackground(Color.GREEN);
                    tiempo = "Tiempo expirado (spot liberado automáticamente)";
                } else {
                    tiempo = minutosRestantes + " minutos restantes";
                }
            }
        }

        mensaje += "\n\nTicket: " + ticket.toUpperCase() +
                   "\nCarnet: " + carne.toUpperCase() +
                   "\nNombre: " + nombre +
                   "\nApellido: " + apellido +
                   "\nTeléfono: " + telefono +
                   "\nPlaca: " + placa.toUpperCase() +
                   "\nTipo usuario: " + tipoUsuario +
                   "\nEntrada: " + fechaEntrada +
                   "\nTiempo restante: " + tiempo;

        JOptionPane.showMessageDialog(null, mensaje);

    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al consultar detalles del espacio");
    }

});

            panelMapa.add(btn);
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al cargar el mapa del parqueo");
    }
    // 🔹 Aquí insertas el mapa en el panel del diseño
    panelContenedor.removeAll();
panelContenedor.setLayout(new BorderLayout());

JScrollPane scroll = new JScrollPane(panelMapa);
scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

panelContenedor.add(scroll, BorderLayout.CENTER);

panelContenedor.revalidate();
panelContenedor.repaint();

}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtmRegresar = new javax.swing.JButton();
        panelContenedor = new javax.swing.JPanel();
        BtmRojo = new javax.swing.JButton();
        BtmNaranja = new javax.swing.JButton();
        BtmVerde = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtmRegresar.setBackground(new java.awt.Color(255, 255, 255));
        BtmRegresar.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        BtmRegresar.setForeground(new java.awt.Color(51, 0, 0));
        BtmRegresar.setText("Regresar");
        BtmRegresar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 0, 0), new java.awt.Color(51, 0, 0), new java.awt.Color(51, 0, 0), new java.awt.Color(51, 0, 0)));
        BtmRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmRegresarActionPerformed(evt);
            }
        });

        panelContenedor.setBackground(new java.awt.Color(51, 0, 0));
        panelContenedor.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelContenedorLayout = new javax.swing.GroupLayout(panelContenedor);
        panelContenedor.setLayout(panelContenedorLayout);
        panelContenedorLayout.setHorizontalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 858, Short.MAX_VALUE)
        );
        panelContenedorLayout.setVerticalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 476, Short.MAX_VALUE)
        );

        BtmRojo.setBackground(java.awt.Color.red);
        BtmRojo.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        BtmRojo.setForeground(new java.awt.Color(255, 255, 255));
        BtmRojo.setText("Rojo = Ocupado");

        BtmNaranja.setBackground(java.awt.Color.orange);
        BtmNaranja.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        BtmNaranja.setForeground(new java.awt.Color(255, 255, 255));
        BtmNaranja.setText("Naranja = Pendiente");

        BtmVerde.setBackground(java.awt.Color.green);
        BtmVerde.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        BtmVerde.setForeground(new java.awt.Color(0, 0, 0));
        BtmVerde.setText("Verde = Libre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtmRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(BtmRojo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtmNaranja)
                        .addGap(15, 15, 15)
                        .addComponent(BtmVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BtmNaranja, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtmRojo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtmRegresar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(BtmVerde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(panelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtmRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmRegresarActionPerformed
        // TODO add your handling code here:
        Interfaz regresar = new Interfaz();
        regresar.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_BtmRegresarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new MapaParqueo().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtmNaranja;
    private javax.swing.JButton BtmRegresar;
    private javax.swing.JButton BtmRojo;
    private javax.swing.JButton BtmVerde;
    private javax.swing.JPanel panelContenedor;
    // End of variables declaration//GEN-END:variables
}
