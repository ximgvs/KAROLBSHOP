package Vista;

import Controlador.C_DetalleVenta;
import Controlador.C_RegistrarCliente;
import Modelo.Conexion;
import Modelo.M_RegistrarCliente;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class frm_RegistrarCliente extends JFrame {
     private List<Object[]> listaDetalles;
    private C_DetalleVenta cDetalleVenta;

    
    public frm_RegistrarCliente() {
        initComponents(); // Llama al método para inicializar los componentes de la GUI
         btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí debería llamar al controlador para manejar el evento de registro
            }
        });
    }
  
        public JButton getBtnRegistrar() {
        return btnRegistrar;
    }

    public JTextField getTxtDniCliente() {
        return txtDniCliente;
    }

    public JTextField getTxtNombreCliente() {
        return txtNombreCliente;
    }

    public JTextField getTxtTelefonoCliente() {
        return txtTelefonoCliente;
    }

    public JTextField getTxtDireccionCliente() {
        return txtDireccionCliente;
    }
    
    public JTable getJTableCliente() {
        return jTableCliente;
    }



 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnClientes = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        LabelVendedor = new javax.swing.JLabel();
        btnClientes1 = new javax.swing.JButton();
        btnClientes2 = new javax.swing.JButton();
        btnEliminarCliente1 = new javax.swing.JButton();
        btnClientes3 = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnProductos = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtDniCliente = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtTelefonoCliente = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtDireccionCliente = new javax.swing.JTextField();
        btnNuevaVenta = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnNuevaVenta1 = new javax.swing.JButton();
        btnProveedor = new javax.swing.JButton();
        btnCliente = new javax.swing.JButton();
        btnProducto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();
        jLabel46 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(184, 231, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnClientes.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(0, 0, 102));
        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/borrar (1).png"))); // NOI18N
        btnClientes.setText("ELIMINAR CLIENTE");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        jPanel1.add(btnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 220, 60));

        jLabel2.setBackground(new java.awt.Color(0, 204, 204));
        jLabel2.setForeground(new java.awt.Color(0, 204, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/LOGO OFC (1).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 220, 170));

        jLabel12.setFont(new java.awt.Font("SimSun-ExtB", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 153));
        jLabel12.setText("KAROL B'S SHOP");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, 20));

        LabelVendedor.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        LabelVendedor.setText("By Karol Fernandez");
        jPanel1.add(LabelVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        btnClientes1.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        btnClientes1.setForeground(new java.awt.Color(0, 0, 102));
        btnClientes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/servicio-al-cliente (1) (1) (1).png"))); // NOI18N
        btnClientes1.setText("REGISTRAR CLIENTE");
        btnClientes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientes1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnClientes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 230, 60));

        btnClientes2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnClientes2.setForeground(new java.awt.Color(0, 0, 102));
        btnClientes2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ver_cliente.png"))); // NOI18N
        btnClientes2.setText("VER CLIENTE");
        btnClientes2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientes2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnClientes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 200, 60));

        btnEliminarCliente1.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        btnEliminarCliente1.setForeground(new java.awt.Color(0, 51, 102));
        btnEliminarCliente1.setText("Buscar");
        btnEliminarCliente1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCliente1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 120, 40));

        btnClientes3.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        btnClientes3.setForeground(new java.awt.Color(0, 0, 102));
        btnClientes3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/modificar_2.png"))); // NOI18N
        btnClientes3.setText("MODIFICAR CLIENTE");
        btnClientes3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientes3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnClientes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 230, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 0, 270, 660));

        jLabel41.setFont(new java.awt.Font("MV Boli", 1, 48)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 102));
        jLabel41.setText("ES UN PLACER !!");
        getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(729, 80, 490, 60));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/carrito-de-compras (1).png"))); // NOI18N
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(639, 70, 80, 70));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cheque (1).png"))); // NOI18N
        getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(799, 10, 60, 60));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnProductos.setFont(new java.awt.Font("SimSun-ExtB", 1, 15)); // NOI18N
        btnProductos.setForeground(new java.awt.Color(0, 0, 102));
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cancelar.png"))); // NOI18N
        btnProductos.setText("CANCELAR");
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        jPanel2.add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, 150, 50));

        btnRegistrar.setFont(new java.awt.Font("SimSun-ExtB", 1, 15)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(0, 51, 102));
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/aceptar01.png"))); // NOI18N
        btnRegistrar.setText("ACEPTAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 150, 50));

        jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel13.setText("DNI :");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 90, 60));
        jPanel2.add(txtDniCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 200, 40));

        jLabel14.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel14.setText("NOMBRE :");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 100, 28));
        jPanel2.add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 200, 40));

        jLabel15.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel15.setText("TELÉFONO :");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 100, 40));
        jPanel2.add(txtTelefonoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, 190, 40));

        jLabel18.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel18.setText("DIRECCIÓN :");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 110, 28));
        jPanel2.add(txtDireccionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, 190, 40));

        btnNuevaVenta.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnNuevaVenta.setForeground(new java.awt.Color(0, 0, 102));
        btnNuevaVenta.setText("REGISTRAR CLIENTE");
        btnNuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaVentaActionPerformed(evt);
            }
        });
        jPanel2.add(btnNuevaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(-240, 180, 220, 60));

        btnNuevaVenta1.setBackground(new java.awt.Color(204, 255, 153));
        btnNuevaVenta1.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        btnNuevaVenta1.setText("NUEVA VENTA");
        btnNuevaVenta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaVenta1ActionPerformed(evt);
            }
        });

        btnProveedor.setBackground(new java.awt.Color(255, 204, 153));
        btnProveedor.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        btnProveedor.setText("PROVEEDOR");
        btnProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedorActionPerformed(evt);
            }
        });

        btnCliente.setBackground(new java.awt.Color(204, 204, 255));
        btnCliente.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        btnCliente.setText("CLIENTE");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        btnProducto.setBackground(new java.awt.Color(255, 204, 204));
        btnProducto.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        btnProducto.setText("PRODUCTO");
        btnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(btnNuevaVenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevaVenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 1050, 100));

        jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "NOMBRE_CLIENTE", "TELEFONO", "DIRECCION"
            }
        ));
        jScrollPane1.setViewportView(jTableCliente);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 900, 210));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, 510));

        jLabel46.setFont(new java.awt.Font("MV Boli", 1, 48)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 0, 102));
        jLabel46.setText("\"DONDE COMPRAR");
        getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 23, 530, 50));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/TITT II (2).jpg"))); // NOI18N
        jLabel38.setText("jLabel38");
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 0, 1020, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaVentaActionPerformed
     frm_RegistrarCliente rc = new frm_RegistrarCliente();
     rc.setVisible(true);
    }//GEN-LAST:event_btnNuevaVentaActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
     frm_EliminarCliente Ecl = new frm_EliminarCliente();
     Ecl.setVisible(true);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnClientes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientes1ActionPerformed
     frm_ModificarCliente Mcl = new frm_ModificarCliente();
     Mcl.setVisible(true);
    }//GEN-LAST:event_btnClientes1ActionPerformed

    private void btnClientes2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientes2ActionPerformed
       frm_VerCliente Mvr = new frm_VerCliente();
     Mvr.setVisible(true);
    }//GEN-LAST:event_btnClientes2ActionPerformed

    private void btnEliminarCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCliente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarCliente1ActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed

    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnNuevaVenta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaVenta1ActionPerformed
         
    }//GEN-LAST:event_btnNuevaVenta1ActionPerformed

    private void btnProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedorActionPerformed
        frm_RegistrarProveedor Rnpv = new frm_RegistrarProveedor();
        Rnpv.setVisible(true);
    }//GEN-LAST:event_btnProveedorActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        frm_RegistrarCliente rc = new frm_RegistrarCliente();
        rc.setVisible(true);
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoActionPerformed
        frm_RegistrarProducto pdr = new frm_RegistrarProducto();
        pdr.setVisible(true);
    }//GEN-LAST:event_btnProductoActionPerformed

    private void btnClientes3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientes3ActionPerformed
        frm_ModificarCliente MCL = new frm_ModificarCliente();
        MCL.setVisible(true);
    }//GEN-LAST:event_btnClientes3ActionPerformed

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frm_RegistrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_RegistrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_RegistrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_RegistrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_RegistrarCliente().setVisible(true);
                   M_RegistrarCliente modelo = new M_RegistrarCliente();
            frm_RegistrarCliente vista = new frm_RegistrarCliente();
            new C_RegistrarCliente(modelo, vista);
            vista.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelVendedor;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnClientes1;
    private javax.swing.JButton btnClientes2;
    private javax.swing.JButton btnClientes3;
    private javax.swing.JButton btnEliminarCliente1;
    private javax.swing.JButton btnNuevaVenta;
    private javax.swing.JButton btnNuevaVenta1;
    private javax.swing.JButton btnProducto;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProveedor;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCliente;
    private javax.swing.JTextField txtDireccionCliente;
    private javax.swing.JTextField txtDniCliente;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtTelefonoCliente;
    // End of variables declaration//GEN-END:variables
 }
