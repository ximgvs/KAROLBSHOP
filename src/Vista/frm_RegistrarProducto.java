
package Vista;
import Controlador.C_DetalleVenta;
import Controlador.C_RegistrarProducto;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
import Modelo.Conexion;
import Modelo.M_RegistrarProducto;
import java.util.ArrayList;
import java.math.BigDecimal;
import java.util.List;


public class frm_RegistrarProducto extends javax.swing.JFrame {
     private List<Object[]> listaDetalles;
    private C_DetalleVenta cDetalleVenta;
    public frm_RegistrarProducto() {
         initComponents();
     
    }
  public void setProveedores(List<String> proveedores) {
        cbxProveedor.removeAllItems();
        for (String proveedor : proveedores) {
            cbxProveedor.addItem(proveedor);
        }
    }
//UN METODO QUE PERMITA OBTENER LOS DATOS DE LOS TEXTFIELD TODO TRASLADARSE A LA TABLA
  //QUE SE VERA EN NUESTRA INTERFAZ LLAMADA "JTABLEPRODUCTO" DONDE SE EVIDENCIRA TODO LO REGISTRADO
    public void addProductoATabla(String codigoProducto, String nombreProducto,
            int cantidadProducto, double precioProducto, String proveedorNombre) {
        DefaultTableModel tableModel = (DefaultTableModel) jTableProducto.getModel();
        tableModel.addRow(new Object[]{codigoProducto, nombreProducto, cantidadProducto, 
            precioProducto, proveedorNombre});
    }
    
    //GENERAR LOS GETTER PARA PERMITIR QUE EN LOS OTROS MAQUETES DEL MVC SEAN UTILIZADOS MEDIANTE SU LLAMADO
    //RETORNANDO LOS VALORES QUE SE TENGAN DE LO ESCRITO POR EL USUARIO EN LA INTERFAZ DE VISTA
    public JComboBox<String> getCbxProveedor() {
        return cbxProveedor;
    }

    public JTable getJTableProducto() {
        return jTableProducto;
    }

    public JButton getBtnRegistrar() {
        return btnRegistrar;
    }

    public String getCodigoProducto() {
        return txtCodigoProducto.getText();
    }

    public String getNombreProducto() {
        return txtNombreProducto.getText();
    }
//METODOS QUE PERMITAN QUE PARA TANTO CANTIDAD Y PRECIO SE COLOQUEN DATOS ENTEROS, VALIDOS QUE PERMITAN REGISTRASE 
    //CON EXITO SIN PROBLEMA
    public int getCantidadProducto() {
        try {
            return Integer.parseInt(txtCantidadProducto.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Cantidad inválida. Por favor ingresa un número entero.", "Error", 
                    JOptionPane.ERROR_MESSAGE);
            return 0;  // O manejar de manera adecuada
        }
    }

    public double getPrecioProducto() {
        try {
            return Double.parseDouble(txtPrecioProducto.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Precio inválido. Por favor ingresa un número válido.", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return 0.0;  // O manejar de manera adecuada
        }
    }
//METODO QUE ESPECIFIQUE QUE CBX AL LLAMARLO PARTICIPE EN LOS OTROS METODOS DEL MVC
    //QUE PERMITA ATRAER INFORMACION DE LA BD A ESTE CBX DE VISTA ANTES 
    public String getProveedorNombre() {
        return (String) cbxProveedor.getSelectedItem();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        LabelVendedor = new javax.swing.JLabel();
        btnEliminarProducto = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnVerProducto = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCodigoProducto = new javax.swing.JTextField();
        txtNombreProducto = new javax.swing.JTextField();
        txtCantidadProducto = new javax.swing.JTextField();
        txtPrecioProducto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProducto = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        cbxProveedor = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnNuevaVenta = new javax.swing.JButton();
        btnProveedor = new javax.swing.JButton();
        btnCliente = new javax.swing.JButton();
        btnProducto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 204, 204));
        jLabel2.setForeground(new java.awt.Color(0, 204, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/LOGO OFC (1).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 220, 170));

        jLabel12.setFont(new java.awt.Font("SimSun-ExtB", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 153));
        jLabel12.setText("KAROL B'S SHOP");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, 20));

        LabelVendedor.setText("Karol Fernandez");
        jPanel1.add(LabelVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        btnEliminarProducto.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        btnEliminarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar_producto.png"))); // NOI18N
        btnEliminarProducto.setText("ELIMINAR PRODUCTO");
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, 50));

        jButton2.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/registrar_producto.png"))); // NOI18N
        jButton2.setText("REGISTRAR PROD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 200, 60));

        jButton3.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/editar_producto.png"))); // NOI18N
        jButton3.setText("EDITAR PRODUCTO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 220, 50));

        btnVerProducto.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        btnVerProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/buscar_producto.png"))); // NOI18N
        btnVerProducto.setText("VER PRODUCTO");
        btnVerProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerProductoActionPerformed(evt);
            }
        });
        jPanel1.add(btnVerProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 190, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 700));

        jLabel41.setFont(new java.awt.Font("MV Boli", 1, 48)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 102));
        jLabel41.setText("ES UN PLACER !!");
        getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 80, 490, 60));

        jLabel43.setFont(new java.awt.Font("MV Boli", 1, 48)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 102));
        jLabel43.setText("\"DONDE COMPRAR");
        getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 530, 50));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/carrito-de-compras (1).png"))); // NOI18N
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 80, 70));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cheque (1).png"))); // NOI18N
        getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 60, 60));

        jPanel10.setBackground(new java.awt.Color(255, 255, 204));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("CODIGO");
        jPanel10.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 90, 30));

        jLabel4.setText("DESCRIPCION");
        jPanel10.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 120, 30));

        jLabel5.setText("CANTIDAD");
        jPanel10.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));

        jLabel6.setText("PRECIO");
        jPanel10.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 50, 20));

        jLabel7.setText("PROVEEDOR");
        jPanel10.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, 80, 20));
        jPanel10.add(txtCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 140, 40));
        jPanel10.add(txtNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 190, 40));
        jPanel10.add(txtCantidadProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 160, 40));
        jPanel10.add(txtPrecioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 160, 40));

        jTableProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DESCRIPCION", "CANTIDAD", "PRECIO", "PROVEEDOR"
            }
        ));
        jScrollPane1.setViewportView(jTableProducto);

        jPanel10.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 900, 230));

        jButton5.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cancelar.png"))); // NOI18N
        jButton5.setText("CANCELAR");
        jPanel10.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 160, 60));

        btnRegistrar.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/aceptar01.png"))); // NOI18N
        btnRegistrar.setText("ACEPTAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel10.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 160, 60));

        cbxProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxProveedorActionPerformed(evt);
            }
        });
        jPanel10.add(cbxProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 50, 190, 40));

        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 234, 1000, 518));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/TITT II (2).jpg"))); // NOI18N
        jLabel38.setText("jLabel38");
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 1020, 150));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevaVenta.setBackground(new java.awt.Color(204, 255, 153));
        btnNuevaVenta.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        btnNuevaVenta.setText("NUEVA VENTA");
        btnNuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaVentaActionPerformed(evt);
            }
        });
        jPanel2.add(btnNuevaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 6, 190, 70));

        btnProveedor.setBackground(new java.awt.Color(255, 204, 153));
        btnProveedor.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        btnProveedor.setText("PROVEEDOR");
        btnProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedorActionPerformed(evt);
            }
        });
        jPanel2.add(btnProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 6, 170, 70));

        btnCliente.setBackground(new java.awt.Color(204, 204, 255));
        btnCliente.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        btnCliente.setText("CLIENTE");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });
        jPanel2.add(btnCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 6, 170, 70));

        btnProducto.setBackground(new java.awt.Color(255, 204, 204));
        btnProducto.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        btnProducto.setText("PRODUCTO");
        btnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoActionPerformed(evt);
            }
        });
        jPanel2.add(btnProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(737, 6, 190, 70));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
                                           
     
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnVerProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerProductoActionPerformed
       frm_VerProducto bpdr = new frm_VerProducto();
       bpdr.setVisible(true);
    }//GEN-LAST:event_btnVerProductoActionPerformed

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
   frm_EliminarProducto Epdr = new frm_EliminarProducto();
   Epdr.setVisible(true);
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      frm_ModificarProducto Epdr = new frm_ModificarProducto();
      Epdr.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        frm_RegistrarProducto RnP = new frm_RegistrarProducto();
        RnP.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnNuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaVentaActionPerformed
    
    }//GEN-LAST:event_btnNuevaVentaActionPerformed

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

    private void cbxProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxProveedorActionPerformed

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
            java.util.logging.Logger.getLogger(frm_RegistrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_RegistrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_RegistrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_RegistrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_RegistrarProducto().setVisible(true);
                   frm_RegistrarProducto vista = new frm_RegistrarProducto();  // Creación de la instancia de la vista
        M_RegistrarProducto modelo = new M_RegistrarProducto();
        C_RegistrarProducto controlador = new C_RegistrarProducto(vista, modelo);
        vista.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelVendedor;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnNuevaVenta;
    private javax.swing.JButton btnProducto;
    private javax.swing.JButton btnProveedor;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVerProducto;
    private javax.swing.JComboBox<String> cbxProveedor;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProducto;
    private javax.swing.JTextField txtCantidadProducto;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPrecioProducto;
    // End of variables declaration//GEN-END:variables
}
