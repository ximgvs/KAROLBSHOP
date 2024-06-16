
package Vista;

import Controlador.C_DetalleVenta;
import Controlador.C_RegistrarProveedor;
import Modelo.Conexion;
import Modelo.M_RegistrarProveedor;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class frm_RegistrarProveedor extends javax.swing.JFrame {
     private List<Object[]> listaDetalles;
    private C_DetalleVenta cDetalleVenta;
    
     public frm_RegistrarProveedor() {
        initComponents();
     
    }

     public String getRucProveedor() {
        return txtRucProveedor.getText().trim();
    }

    public String getNombreProveedor() {
        return txtNombreProveedor.getText().trim();
    }

    public String getTelefonoProveedor() {
        return txtTelefonoProveedor.getText().trim();
    }

    public String getDireccionProveedor() {
        return txtDireccionProveedor.getText().trim();
    }

    public String getRazonProveedor() {
        return txtRazonProveedor.getText().trim();
    }

    public JButton getBtnRegistrar() {
        return btnRegistrar;
    }

    public JTable getJTableProveedor() {
        return jTableProveedor;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRegistrarPro = new javax.swing.JButton();
        btnEliminarP = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        LabelVendedor = new javax.swing.JLabel();
        btnModificarP = new javax.swing.JButton();
        btnVerProo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        txtRucProveedor = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        txtNombreProveedor = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtTelefonoProveedor = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txtDireccionProveedor = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txtRazonProveedor = new javax.swing.JTextField();
        btnProductos = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnNuevaVenta1 = new javax.swing.JButton();
        btnProveedor = new javax.swing.JButton();
        btnCliente = new javax.swing.JButton();
        btnProducto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProveedor = new javax.swing.JTable();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(184, 231, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistrarPro.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnRegistrarPro.setForeground(new java.awt.Color(0, 0, 102));
        btnRegistrarPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/registrar.png"))); // NOI18N
        btnRegistrarPro.setText("REGISTRAR PROOV");
        btnRegistrarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarProActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 210, 60));

        btnEliminarP.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnEliminarP.setForeground(new java.awt.Color(0, 0, 102));
        btnEliminarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/borrar (1).png"))); // NOI18N
        btnEliminarP.setText("ELIMINAR");
        btnEliminarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 160, 60));

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

        btnModificarP.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnModificarP.setForeground(new java.awt.Color(0, 0, 102));
        btnModificarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/modificar_2.png"))); // NOI18N
        btnModificarP.setText("MODIFICAR ");
        btnModificarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarPActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 180, 60));

        btnVerProo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnVerProo.setForeground(new java.awt.Color(0, 0, 102));
        btnVerProo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ver_cliente.png"))); // NOI18N
        btnVerProo.setText("VER PROVEEDOR");
        btnVerProo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerProoActionPerformed(evt);
            }
        });
        jPanel1.add(btnVerProo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 200, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 660));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/audifonos-inalambricos (1).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 93, 60, 60));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/carrito-de-compras (1).png"))); // NOI18N
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 80, 80, 70));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cheque (1).png"))); // NOI18N
        getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(859, 10, 60, 60));

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/bolsa-para-la-escuela (1).png"))); // NOI18N
        getContentPane().add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 93, 70, 60));

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/lampara-de-mesa (1).png"))); // NOI18N
        getContentPane().add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 93, 70, 60));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel32.setText("RUC :");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 150, 30));
        jPanel2.add(txtRucProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 230, 30));

        jLabel33.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel33.setText("NOMBRE :");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 160, 30));
        jPanel2.add(txtNombreProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 230, 30));

        jLabel34.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel34.setText("TELEFONO :");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 130, 30));
        jPanel2.add(txtTelefonoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 210, 30));

        jLabel37.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel37.setText("DIRECCION :");
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 130, 20));
        jPanel2.add(txtDireccionProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 210, 30));

        jLabel35.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel35.setText("RAZON SOCIAL :");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 150, 130, 20));
        jPanel2.add(txtRazonProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 140, 170, 40));

        btnProductos.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        btnProductos.setForeground(new java.awt.Color(0, 0, 102));
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cancelar.png"))); // NOI18N
        btnProductos.setText("CANCELAR");
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        jPanel2.add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 150, 50));

        btnRegistrar.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(0, 51, 102));
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/guardar_nueva_venta.png"))); // NOI18N
        btnRegistrar.setText("GUARDAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, 150, 50));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevaVenta1.setBackground(new java.awt.Color(204, 255, 153));
        btnNuevaVenta1.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        btnNuevaVenta1.setText("NUEVA VENTA");
        btnNuevaVenta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaVenta1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnNuevaVenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 14, 190, 70));

        btnProveedor.setBackground(new java.awt.Color(255, 204, 153));
        btnProveedor.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        btnProveedor.setText("PROVEEDOR");
        btnProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedorActionPerformed(evt);
            }
        });
        jPanel3.add(btnProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 14, 170, 70));

        btnCliente.setBackground(new java.awt.Color(204, 204, 255));
        btnCliente.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        btnCliente.setText("CLIENTE");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });
        jPanel3.add(btnCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 14, 170, 70));

        btnProducto.setBackground(new java.awt.Color(255, 204, 204));
        btnProducto.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        btnProducto.setText("PRODUCTO");
        btnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoActionPerformed(evt);
            }
        });
        jPanel3.add(btnProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(767, 14, 190, 70));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 100));

        jTableProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RUC", "NOMBRE", "TELEFONO", "DIRECCION", "RAZON"
            }
        ));
        jScrollPane1.setViewportView(jTableProveedor);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 910, 200));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 1030, 510));

        jLabel46.setFont(new java.awt.Font("MV Boli", 1, 48)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 0, 102));
        jLabel46.setText("ES UN PLACER !!");
        getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 80, 490, 60));

        jLabel47.setFont(new java.awt.Font("MV Boli", 1, 48)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 0, 102));
        jLabel47.setText("\"DONDE COMPRAR");
        getContentPane().add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 305, 530, 50));

        jLabel48.setFont(new java.awt.Font("MV Boli", 1, 48)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(0, 0, 102));
        jLabel48.setText("\"DONDE COMPRAR");
        getContentPane().add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 315, 530, 50));

        jLabel49.setFont(new java.awt.Font("MV Boli", 1, 48)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 0, 102));
        jLabel49.setText("\"DONDE COMPRAR");
        getContentPane().add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 17, 530, 50));

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/lampara-de-mesa (1).png"))); // NOI18N
        getContentPane().add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/bolsa-para-la-escuela (1).png"))); // NOI18N
        getContentPane().add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/audifonos-inalambricos (1).png"))); // NOI18N
        jLabel3.setText("jLabel1");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/lampara-de-mesa (1).png"))); // NOI18N
        getContentPane().add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/bolsa-para-la-escuela (1).png"))); // NOI18N
        getContentPane().add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/audifonos-inalambricos (1).png"))); // NOI18N
        jLabel4.setText("jLabel1");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/lampara-de-mesa (1).png"))); // NOI18N
        getContentPane().add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/bolsa-para-la-escuela (1).png"))); // NOI18N
        getContentPane().add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/TITT II (2).jpg"))); // NOI18N
        jLabel38.setText("jLabel38");
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 1030, 150));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/audifonos-inalambricos (1).png"))); // NOI18N
        jLabel6.setText("jLabel1");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarProActionPerformed
        frm_RegistrarProveedor Rnpv = new frm_RegistrarProveedor();
        Rnpv.setVisible(true);
    }//GEN-LAST:event_btnRegistrarProActionPerformed

    private void btnEliminarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPActionPerformed
         frm_EliminarProveedor Epv = new frm_EliminarProveedor();
        Epv.setVisible(true);
    }//GEN-LAST:event_btnEliminarPActionPerformed

    private void btnModificarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarPActionPerformed
        frm_ModificarProveedor Mpv = new frm_ModificarProveedor();
        Mpv.setVisible(true);
    }//GEN-LAST:event_btnModificarPActionPerformed

    private void btnVerProoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerProoActionPerformed
        frm_VerProveedor Vpv = new frm_VerProveedor();
        Vpv.setVisible(true);
    }//GEN-LAST:event_btnVerProoActionPerformed

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
            java.util.logging.Logger.getLogger(frm_RegistrarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_RegistrarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_RegistrarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_RegistrarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_RegistrarProveedor().setVisible(true);
                  M_RegistrarProveedor modelo = new M_RegistrarProveedor();
                  frm_RegistrarProveedor vista = new frm_RegistrarProveedor();
                  C_RegistrarProveedor controlador = new C_RegistrarProveedor(modelo, vista);
        
        // Hacer visible la vista
        vista.setVisible(true);
                 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelVendedor;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnEliminarP;
    private javax.swing.JButton btnModificarP;
    private javax.swing.JButton btnNuevaVenta1;
    private javax.swing.JButton btnProducto;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProveedor;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegistrarPro;
    private javax.swing.JButton btnVerProo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProveedor;
    private javax.swing.JTextField txtDireccionProveedor;
    private javax.swing.JTextField txtNombreProveedor;
    private javax.swing.JTextField txtRazonProveedor;
    private javax.swing.JTextField txtRucProveedor;
    private javax.swing.JTextField txtTelefonoProveedor;
    // End of variables declaration//GEN-END:variables
}
