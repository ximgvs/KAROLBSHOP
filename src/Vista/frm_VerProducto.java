
package Vista;
import Controlador.C_VerProducto;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import Modelo.Conexion;
import Modelo.M_VerProducto;

public class frm_VerProducto extends javax.swing.JFrame {

  
    public frm_VerProducto() {
        initComponents();
    }  
    
 public String getCodigoProducto() {
        return txtCodigoProducto.getText();
    }

    public JButton getBtnBuscar() {
        return btnBuscar;
    }

    public JTable getJTableProducto() {
        return jTableProducto;
    }




    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        LabelVendedor = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        txtCodigoProducto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProducto = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 204, 204));
        jLabel2.setForeground(new java.awt.Color(0, 204, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/LOGO OFC (1).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 220, 170));

        jLabel12.setFont(new java.awt.Font("SimSun-ExtB", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 153));
        jLabel12.setText("KAROL B'S SHOP");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, 20));

        LabelVendedor.setText("Karol Fernandez");
        jPanel1.add(LabelVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jButton1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar_producto.png"))); // NOI18N
        jButton1.setText("ELIMINAR PRODUCTO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 230, 50));

        jButton2.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/registrar_producto.png"))); // NOI18N
        jButton2.setText("REGISTRAR PROD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 200, 60));

        jButton3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/editar_producto.png"))); // NOI18N
        jButton3.setText("EDITAR PRODUCTO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 220, 50));

        jButton4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/buscar_producto.png"))); // NOI18N
        jButton4.setText("BUSCAR PRODUCTO");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 220, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, -1, 660));

        jLabel41.setFont(new java.awt.Font("MV Boli", 1, 48)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 102));
        jLabel41.setText("ES UN PLACER !!");
        getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 80, 490, 60));

        jLabel43.setFont(new java.awt.Font("MV Boli", 1, 48)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 102));
        jLabel43.setText("\"DONDE COMPRAR");
        getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 20, 530, 50));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/carrito-de-compras (1).png"))); // NOI18N
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 70, 80, 70));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cheque (1).png"))); // NOI18N
        getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(775, 10, 60, 60));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/TITT II (2).jpg"))); // NOI18N
        jLabel38.setText("jLabel38");
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 0, 1020, 150));

        jPanel10.setBackground(new java.awt.Color(255, 255, 204));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCodigoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProductoActionPerformed(evt);
            }
        });
        jPanel10.add(txtCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 370, 60));

        jTableProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DESCRIPCION", "CANTIDAD", "PRECIO", "PROVEEDOR"
            }
        ));
        jScrollPane1.setViewportView(jTableProducto);

        jPanel10.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 940, 280));

        jButton6.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/limpiar_p.png"))); // NOI18N
        jButton6.setText("LIMPIAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, 160, 50));

        btnBuscar.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/buscar_producto_02.png"))); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel10.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 40, 150, 40));

        jButton7.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/regresar_p.png"))); // NOI18N
        jButton7.setText("REGRESAR");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 160, 50));

        jLabel4.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        jLabel4.setText("BUSCAR PRODUCTO POR COD :");
        jPanel10.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 320, 20));

        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 150, 1020, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoProductoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      frm_EliminarProducto Epdr1 = new frm_EliminarProducto();
      Epdr1.setVisible(true);;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       frm_RegistrarProducto RnP = new frm_RegistrarProducto();
        RnP.setVisible(true);       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      frm_ModificarProducto Epdr = new frm_ModificarProducto();
      Epdr.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       frm_VerProducto bpdr = new frm_VerProducto();
       bpdr.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
     
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        frm_Sistema stm = new frm_Sistema();
        stm.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      
    DefaultTableModel model = (DefaultTableModel) jTableProducto.getModel();
    model.setRowCount(0); // Elimina todas las filas de la tabla

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
            java.util.logging.Logger.getLogger(frm_VerProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_VerProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_VerProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_VerProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_VerProducto().setVisible(true);
                 M_VerProducto modelo = new M_VerProducto();
                 frm_VerProducto vista = new frm_VerProducto();
                 C_VerProducto controlador = new C_VerProducto(modelo, vista);
                 vista.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelVendedor;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProducto;
    private javax.swing.JTextField txtCodigoProducto;
    // End of variables declaration//GEN-END:variables
}
