
package Vista;

import Controlador.C_ModificarProducto;
import Modelo.M_ModificarProducto;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class frm_ModificarProducto extends JFrame {
 

    public frm_ModificarProducto() {
         initComponents();
    }

    // Métodos de acceso para los componentes
    public String getCodigoProducto() {
        return txtCodigoProducto.getText();
    }

    public String getNombreProducto() {
        return txtNombreProducto.getText();
    }

    public int getCantidadProducto() {
        try {
            return Integer.parseInt(txtCantidadProducto.getText());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public double getPrecioProducto() {
        try {
            return Double.parseDouble(txtPrecioProducto.getText());
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }

    public String getProveedorNombre() {
        return (String) cbxProveedor.getSelectedItem();
    }

    public JButton getBtnBuscar() {
        return btnBuscar;
    }

    public JButton getBtnGuardarCambios() {
        return btnGuardarCambios;
    }

    public JTable getJTableProducto() {
        return jTableProducto;
    }

    public void setCodigoProducto(String codigo) {
        txtCodigoProducto.setText(codigo);
    }

    public void setNombreProducto(String nombre) {
        txtNombreProducto.setText(nombre);
    }

    public void setCantidadProducto(int cantidad) {
        txtCantidadProducto.setText(String.valueOf(cantidad));
    }

    public void setPrecioProducto(double precio) {
        txtPrecioProducto.setText(String.valueOf(precio));
    }

    public void setProveedorNombre(String nombreProveedor) {
        cbxProveedor.setSelectedItem(nombreProveedor);
    }

    public void addProveedor(String proveedor) {
        cbxProveedor.addItem(proveedor);
    }

    public void limpiarCampos() {
        txtCodigoProducto.setText("");
        txtNombreProducto.setText("");
        txtCantidadProducto.setText("");
        txtPrecioProducto.setText("");
        cbxProveedor.setSelectedIndex(0);
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        txtCantidadProducto = new javax.swing.JTextField();
        txtPrecioProducto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProducto = new javax.swing.JTable();
        btnGuardarCambios = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        cbxProveedor = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtCodigoProducto = new javax.swing.JTextField();
        btnGuardar1 = new javax.swing.JButton();

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

        jButton1.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar_producto.png"))); // NOI18N
        jButton1.setText("ELIMINAR PRODUCTO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 230, 50));

        jButton2.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/registrar_producto.png"))); // NOI18N
        jButton2.setText("REGISTRAR PRODUCTO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 220, 60));

        jButton3.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/editar_producto.png"))); // NOI18N
        jButton3.setText("EDITAR PRODUCTO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 210, 50));

        jButton4.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/listar_producto.png"))); // NOI18N
        jButton4.setText("LISTAR PRODUCTO");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 210, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 260, 660));

        jLabel41.setFont(new java.awt.Font("MV Boli", 1, 48)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 102));
        jLabel41.setText("ES UN PLACER !!");
        getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(714, 80, 490, 60));

        jLabel43.setFont(new java.awt.Font("MV Boli", 1, 48)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 102));
        jLabel43.setText("\"DONDE COMPRAR");
        getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 20, 530, 50));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/carrito-de-compras (1).png"))); // NOI18N
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 70, 80, 70));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cheque (1).png"))); // NOI18N
        getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(784, 10, 60, 60));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/TITT II (2).jpg"))); // NOI18N
        jLabel38.setText("jLabel38");
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 0, 1020, 150));

        jPanel10.setBackground(new java.awt.Color(255, 255, 204));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("DESCRIPCION");
        jPanel10.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        jLabel5.setText("CANTIDAD");
        jPanel10.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, -1, -1));

        jLabel6.setText("PRECIO");
        jPanel10.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, -1, -1));

        jLabel7.setText("PROVEEDOR");
        jPanel10.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, -1, -1));
        jPanel10.add(txtNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 180, 40));
        jPanel10.add(txtCantidadProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 170, 40));
        jPanel10.add(txtPrecioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 170, 40));

        jTableProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DESCRIPCION", "CANTIDAD", "PRECIO", "PROVEEDOR"
            }
        ));
        jScrollPane1.setViewportView(jTableProducto);

        jPanel10.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 930, 250));

        btnGuardarCambios.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        btnGuardarCambios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/guardar_cliente.png"))); // NOI18N
        btnGuardarCambios.setText("GUARDAR");
        btnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosActionPerformed(evt);
            }
        });
        jPanel10.add(btnGuardarCambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 130, 50));

        jButton8.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/regresar_p.png"))); // NOI18N
        jButton8.setText("REGRESAR");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 440, 150, 50));

        jPanel10.add(cbxProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 110, 200, 40));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel3.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 120, 40));

        jLabel3.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        jLabel3.setText("BUSCAR ID PRODUCTO :");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        txtCodigoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProductoActionPerformed(evt);
            }
        });
        jPanel3.add(txtCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 310, 40));

        jPanel10.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 730, 60));

        btnGuardar1.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        btnGuardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/limpiar_p.png"))); // NOI18N
        btnGuardar1.setText("LIMPIAR");
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });
        jPanel10.add(btnGuardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, 140, 50));

        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 150, 1020, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        frm_Sistema stm = new frm_Sistema();
        stm.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed
  

    }//GEN-LAST:event_btnGuardarCambiosActionPerformed

    private void txtCodigoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoProductoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
     
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
 DefaultTableModel model = (DefaultTableModel) jTableProducto.getModel();
    model.setRowCount(0); // Elimina todas las filas de la tabla      
    }//GEN-LAST:event_btnGuardar1ActionPerformed

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
            java.util.logging.Logger.getLogger(frm_ModificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_ModificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_ModificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_ModificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_ModificarProducto().setVisible(true);
                M_ModificarProducto modelo = new M_ModificarProducto();
                frm_ModificarProducto vista = new frm_ModificarProducto();
                C_ModificarProducto controlador  = new C_ModificarProducto(modelo,vista);
                vista.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelVendedor;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JButton btnGuardarCambios;
    private javax.swing.JComboBox<String> cbxProveedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton8;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProducto;
    private javax.swing.JTextField txtCantidadProducto;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPrecioProducto;
    // End of variables declaration//GEN-END:variables
}
