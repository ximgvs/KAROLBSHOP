
package Vista;
import Controlador.C_ModificarCliente;
import Modelo.Conexion;
import Modelo.M_ModificarCliente;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
public class frm_ModificarCliente extends javax.swing.JFrame {

  
    public frm_ModificarCliente() {
        initComponents();
        
    }
   public JTextField getTxtBuscarCliente() {
        return txtBuscarCliente;
    }

    public JTextField getTxtIdCliente() {
        return txtIdCliente;
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

    public JButton getBtnBuscar() {
        return btnBuscar;
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public JTable getJTableCliente() {
        return jTableCliente;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnNuevaVenta = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        LabelVendedor = new javax.swing.JLabel();
        btnClientes1 = new javax.swing.JButton();
        btnClientes2 = new javax.swing.JButton();
        btnEliminarCliente1 = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();
        txtDireccionCliente = new javax.swing.JTextField();
        txtDniCliente = new javax.swing.JTextField();
        txtNombreCliente = new javax.swing.JTextField();
        txtTelefonoCliente = new javax.swing.JTextField();
        txtIdCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtBuscarCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(184, 231, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevaVenta.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnNuevaVenta.setForeground(new java.awt.Color(0, 0, 102));
        btnNuevaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/registrar.png"))); // NOI18N
        btnNuevaVenta.setText("REGISTRAR CLIENTE");
        btnNuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaVentaActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 220, 60));

        btnClientes.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(0, 0, 102));
        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar_cliente.png"))); // NOI18N
        btnClientes.setText("ELIMINAR CLIENTE");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        jPanel1.add(btnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 210, 60));

        jLabel2.setBackground(new java.awt.Color(0, 204, 204));
        jLabel2.setForeground(new java.awt.Color(0, 204, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/LOGO OFC (1).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 220, 170));

        jLabel12.setFont(new java.awt.Font("SimSun-ExtB", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 153));
        jLabel12.setText("KAROL B'S SHOP");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, 20));

        LabelVendedor.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        LabelVendedor.setText("By Karol Fernandez");
        jPanel1.add(LabelVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        btnClientes1.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        btnClientes1.setForeground(new java.awt.Color(0, 0, 102));
        btnClientes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/modificar_2.png"))); // NOI18N
        btnClientes1.setText("MODIFICAR CLIENTE");
        btnClientes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientes1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnClientes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 220, 60));

        btnClientes2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnClientes2.setForeground(new java.awt.Color(0, 0, 102));
        btnClientes2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ver_cliente.png"))); // NOI18N
        btnClientes2.setText("VER CLIENTE");
        btnClientes2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientes2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnClientes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 200, 60));

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 270, 660));

        jLabel41.setFont(new java.awt.Font("MV Boli", 1, 48)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 102));
        jLabel41.setText("ES UN PLACER !!");
        getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(728, 80, 490, 60));

        jLabel43.setFont(new java.awt.Font("MV Boli", 1, 48)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 102));
        jLabel43.setText("\"DONDE COMPRAR");
        getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 20, 530, 50));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/carrito-de-compras (1).png"))); // NOI18N
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(638, 70, 80, 70));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cheque (1).png"))); // NOI18N
        getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(798, 10, 60, 60));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/TITT II (2).jpg"))); // NOI18N
        jLabel38.setText("jLabel38");
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 0, 1020, 150));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLimpiar.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(0, 51, 102));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/limpiar_p.png"))); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 440, 140, 50));

        jButton6.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/regresar_p.png"))); // NOI18N
        jButton6.setText("REGRESAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 160, 50));

        jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID CLIENTE", "DNI", "NOMBRE", "TELEFONO", "DIRECCION"
            }
        ));
        jScrollPane2.setViewportView(jTableCliente);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 940, 220));
        jPanel2.add(txtDireccionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 140, 200, 40));
        jPanel2.add(txtDniCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 200, 40));
        jPanel2.add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 200, 40));
        jPanel2.add(txtTelefonoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 200, 40));
        jPanel2.add(txtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 40, 40));

        jLabel4.setText("DNI CLIENTE :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        jLabel5.setText("NOMBRE :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, -1));

        jLabel6.setText("TELEFONO :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, -1, -1));

        jLabel7.setText("DIRECCION :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, -1, -1));

        jLabel8.setText("ID CLIENTE :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarClienteActionPerformed(evt);
            }
        });
        jPanel3.add(txtBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 260, 30));

        jLabel3.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        jLabel3.setText("BUSCAR CLIENTE POR ID :");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 210, 30));

        btnBuscar.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 51, 102));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/buscar_producto_02.png"))); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel3.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 120, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 660, 50));

        btnGuardar.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 51, 102));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/guardar_cliente.png"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 140, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 1020, 510));

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

    private void txtBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarClienteActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
    
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        frm_Sistema stm = new frm_Sistema();
        stm.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
    }//GEN-LAST:event_btnGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(frm_ModificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_ModificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_ModificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_ModificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_ModificarCliente().setVisible(true);
          M_ModificarCliente modelo = new M_ModificarCliente();
            frm_ModificarCliente vista = new frm_ModificarCliente();
            new C_ModificarCliente(modelo, vista);
            vista.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelVendedor;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnClientes1;
    private javax.swing.JButton btnClientes2;
    private javax.swing.JButton btnEliminarCliente1;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnNuevaVenta;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCliente;
    private javax.swing.JTextField txtBuscarCliente;
    private javax.swing.JTextField txtDireccionCliente;
    private javax.swing.JTextField txtDniCliente;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtTelefonoCliente;
    // End of variables declaration//GEN-END:variables
}
