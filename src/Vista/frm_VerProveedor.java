
package Vista;
import Controlador.C_VerProveedor;
import Modelo.Conexion;
import Modelo.M_VerProveedor;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class frm_VerProveedor extends javax.swing.JFrame {

    public frm_VerProveedor() {
        initComponents();
       
    }
    public JTextField getTxtBuscarProveedor() {
        return txtBuscarProveedor;
    }

    public JButton getBtnBuscar() {
        return btnBuscar;
    }

    public JTable getJTableProveedor() {
        return jTableProveedor;
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
        jLabel41 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtBuscarProveedor = new javax.swing.JTextField();
        btnProductos = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProveedor = new javax.swing.JTable();
        jLabel38 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(184, 231, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevaVenta.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnNuevaVenta.setForeground(new java.awt.Color(0, 0, 102));
        btnNuevaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/registrar.png"))); // NOI18N
        btnNuevaVenta.setText("REGISTRAR PROOV");
        btnNuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaVentaActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 220, 60));

        btnClientes.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(0, 0, 102));
        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/borrar (1).png"))); // NOI18N
        btnClientes.setText("ELIMINAR");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        jPanel1.add(btnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 180, 60));

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

        btnClientes1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnClientes1.setForeground(new java.awt.Color(0, 0, 102));
        btnClientes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/modificar_2.png"))); // NOI18N
        btnClientes1.setText("MODIFICAR ");
        btnClientes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientes1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnClientes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 190, 60));

        btnClientes2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnClientes2.setForeground(new java.awt.Color(0, 0, 102));
        btnClientes2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ver_cliente.png"))); // NOI18N
        btnClientes2.setText("VER PROVEEDOR");
        btnClientes2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientes2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnClientes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 190, 60));

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

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarProveedorActionPerformed(evt);
            }
        });
        jPanel2.add(txtBuscarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 340, 70));

        btnProductos.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        btnProductos.setForeground(new java.awt.Color(0, 0, 102));
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/limpiar_p.png"))); // NOI18N
        btnProductos.setText("LIMPIAR");
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        jPanel2.add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 140, -1));

        btnBuscar.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 51, 102));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/buscar_producto_02.png"))); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, 140, 40));

        jLabel3.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        jLabel3.setText("BUSCAR ID DEL PROVEEDOR :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 460, 30));

        jButton6.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/regresar_p.png"))); // NOI18N
        jButton6.setText("REGRESAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, 160, -1));

        jTableProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "RUC", "NOMBRE", "TELEFONO", "DIRECCION", "RAZON"
            }
        ));
        jScrollPane1.setViewportView(jTableProveedor);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 880, 250));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 150, 1020, 510));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/TITT II (2).jpg"))); // NOI18N
        jLabel38.setText("jLabel38");
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 0, 1020, 150));

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/lampara-de-mesa (1).png"))); // NOI18N
        getContentPane().add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 80, 70, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaVentaActionPerformed
     frm_RegistrarProveedor Rnpv = new frm_RegistrarProveedor();
        Rnpv.setVisible(true);
    }//GEN-LAST:event_btnNuevaVentaActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
      frm_EliminarProveedor Epv = new frm_EliminarProveedor();
        Epv.setVisible(true);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnClientes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientes1ActionPerformed
        frm_ModificarProveedor Mpv = new frm_ModificarProveedor();
        Mpv.setVisible(true);
    }//GEN-LAST:event_btnClientes1ActionPerformed

    private void btnClientes2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientes2ActionPerformed
       frm_VerProveedor Vpv = new frm_VerProveedor();
        Vpv.setVisible(true);
    }//GEN-LAST:event_btnClientes2ActionPerformed

    private void txtBuscarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarProveedorActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed

    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        frm_Sistema stm = new frm_Sistema();
        stm.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(frm_VerProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_VerProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_VerProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_VerProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_VerProveedor().setVisible(true);
                M_VerProveedor modelo = new M_VerProveedor();
        frm_VerProveedor vista = new frm_VerProveedor();
        C_VerProveedor controlador = new C_VerProveedor(modelo, vista);
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
    private javax.swing.JButton btnNuevaVenta;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProveedor;
    private javax.swing.JTextField txtBuscarProveedor;
    // End of variables declaration//GEN-END:variables
}
