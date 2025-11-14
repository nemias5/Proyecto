
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
    setSize(1500, 500);
    setLocationRelativeTo(null); // Centra la ventana

    JPanel panelMapa = new JPanel(new GridLayout(10, 10, 10, 10));

    try (Connection con = Conexion.conectar()) {
        String sql = "SELECT id, estado FROM spot ORDER BY id ASC";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            String id = rs.getString("id");
            String estado = rs.getString("estado");

            JButton btn = new JButton((id).toUpperCase());
            btn.setFont(new Font("Arial", Font.BOLD, 14));

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
            try (Connection con2 = Conexion.conectar()){
                String sql2 = "SELECT fecha_salida, ticket FROM historico WHERE spot = ? ORDER BY fecha_salida DESC LIMIT 1"; 
                PreparedStatement ps2 = con2.prepareStatement(sql2); 
                ps2.setString(1, id);
                ResultSet rs2 = ps2.executeQuery(); 
                String mensaje = "Espacio: " + id.toUpperCase() + "\nEstado: " + estado.toUpperCase();

        if (estado.equalsIgnoreCase("PENDIENTE") && rs2.next()) {
            Timestamp fechaSalida = rs2.getTimestamp("fecha_salida");
            if (fechaSalida != null) {
                LocalDateTime salida = fechaSalida.toLocalDateTime();
                long minutosPasados = ChronoUnit.MINUTES.between(salida, LocalDateTime.now());
                long minutosRestantes = 120 - minutosPasados; // 2 horas = 120 min

                if (minutosPasados >= 120) {
                    // 🔹 Ya pasaron 2 horas, liberar automáticamente
                    String liberarSQL = "UPDATE spot SET estado = 'LIBRE' WHERE id = ?";
                    PreparedStatement psLiberar = con2.prepareStatement(liberarSQL);
                    psLiberar.setString(1, id);
                    psLiberar.executeUpdate();

                    mensaje += "\n\n⏰ El tiempo expiró (más de 2 horas). El spot se liberó automáticamente.";
                    btn.setBackground(Color.GREEN);
                } else {
                    mensaje += "\n\n⏱️ Tiempo restante: " + minutosRestantes + " minutos.";
                }
            }
        }

        JOptionPane.showMessageDialog(this, mensaje, "Detalles del espacio", JOptionPane.INFORMATION_MESSAGE);

    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al consultar detalles del espacio");
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
    panelContenedor.add(panelMapa, BorderLayout.CENTER);
    panelContenedor.revalidate();
    panelContenedor.repaint();
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtmRegresar = new javax.swing.JButton();
        panelContenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtmRegresar.setText("Regresar");
        BtmRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelContenedorLayout = new javax.swing.GroupLayout(panelContenedor);
        panelContenedor.setLayout(panelContenedorLayout);
        panelContenedorLayout.setHorizontalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 823, Short.MAX_VALUE)
        );
        panelContenedorLayout.setVerticalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 485, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtmRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(BtmRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(panelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    private javax.swing.JButton BtmRegresar;
    private javax.swing.JPanel panelContenedor;
    // End of variables declaration//GEN-END:variables
}
