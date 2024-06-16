
package Vista;
import Controlador.C_EliminarCliente;
import Modelo.Conexion;
import Modelo.M_EliminarCliente;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
public class frm_EliminarCliente extends javax.swing.JFrame {

    public frm_EliminarCliente() {
        initComponents();
    }

    public JTextField getTxtIdCliente() {
        return txtIdCliente;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }
    
    public void limpiarCampos(){
        txtIdCliente.setText("");
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
        jLabel1 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtRazonProveedor = new javax.swing.JTextField();
        btnProductos = new javax.swing.JButton();
        btnGenerarVenta1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnNuevaVenta1 = new javax.swing.JButton();
        btnClientes3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        LabelVendedor1 = new javax.swing.JLabel();
        btnClientes4 = new javax.swing.JButton();
        btnClientes5 = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtRazonProveedor1 = new javax.swing.JTextField();
        btnProductos1 = new javax.swing.JButton();
        btnGenerarVenta2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnNuevaVenta2 = new javax.swing.JButton();
        btnClientes6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        LabelVendedor2 = new javax.swing.JLabel();
        btnClientes7 = new javax.swing.JButton();
        btnClientes8 = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txtRazonProveedor2 = new javax.swing.JTextField();
        btnProductos2 = new javax.swing.JButton();
        btnGenerarVenta3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btnNuevaVenta3 = new javax.swing.JButton();
        btnClientes9 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        LabelVendedor3 = new javax.swing.JLabel();
        btnClientes10 = new javax.swing.JButton();
        btnClientes11 = new javax.swing.JButton();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        txtIdCliente = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(184, 231, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevaVenta.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnNuevaVenta.setForeground(new java.awt.Color(0, 0, 102));
        btnNuevaVenta.setText("REGISTRAR PROOV");
        btnNuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaVentaActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 210, 60));

        btnClientes.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(0, 0, 102));
        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/borrar (1).png"))); // NOI18N
        btnClientes.setText("ELIMINAR");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        jPanel1.add(btnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 180, 60));

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
        btnClientes1.setText("MODIFICAR ");
        btnClientes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientes1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnClientes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 190, 60));

        btnClientes2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnClientes2.setForeground(new java.awt.Color(0, 0, 102));
        btnClientes2.setText("VER PROVEEDOR");
        btnClientes2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientes2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnClientes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 200, 60));

        jLabel41.setFont(new java.awt.Font("MV Boli", 1, 48)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 102));
        jLabel41.setText("ES UN PLACER !!");

        jLabel43.setFont(new java.awt.Font("MV Boli", 1, 48)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 102));
        jLabel43.setText("\"DONDE COMPRAR");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/audifonos-inalambricos (1).png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/carrito-de-compras (1).png"))); // NOI18N

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cheque (1).png"))); // NOI18N

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/bolsa-para-la-escuela (1).png"))); // NOI18N

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/lampara-de-mesa (1).png"))); // NOI18N

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/TITT II (2).jpg"))); // NOI18N
        jLabel38.setText("jLabel38");

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtRazonProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRazonProveedorActionPerformed(evt);
            }
        });
        jPanel2.add(txtRazonProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 340, 60));

        btnProductos.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        btnProductos.setForeground(new java.awt.Color(0, 0, 102));
        btnProductos.setText("CANCELAR");
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        jPanel2.add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 150, 60));

        btnGenerarVenta1.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        btnGenerarVenta1.setForeground(new java.awt.Color(0, 51, 102));
        btnGenerarVenta1.setText("ACEPTAR");
        btnGenerarVenta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarVenta1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnGenerarVenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 140, 60));

        jLabel3.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        jLabel3.setText("BUSCAR ID DEL PROVEEDOR A ELIMINAR:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 320, 20));

        jPanel3.setBackground(new java.awt.Color(184, 231, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevaVenta1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnNuevaVenta1.setForeground(new java.awt.Color(0, 0, 102));
        btnNuevaVenta1.setText("REGISTRAR PROOV");
        btnNuevaVenta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaVenta1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnNuevaVenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 210, 60));

        btnClientes3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnClientes3.setForeground(new java.awt.Color(0, 0, 102));
        btnClientes3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/borrar (1).png"))); // NOI18N
        btnClientes3.setText("ELIMINAR");
        btnClientes3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientes3ActionPerformed(evt);
            }
        });
        jPanel3.add(btnClientes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 180, 60));

        jLabel4.setBackground(new java.awt.Color(0, 204, 204));
        jLabel4.setForeground(new java.awt.Color(0, 204, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/LOGO OFC (1).png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 220, 170));

        jLabel13.setFont(new java.awt.Font("SimSun-ExtB", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 153));
        jLabel13.setText("KAROL B'S SHOP");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, 20));

        LabelVendedor1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        LabelVendedor1.setText("By Karol Fernandez");
        jPanel3.add(LabelVendedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        btnClientes4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnClientes4.setForeground(new java.awt.Color(0, 0, 102));
        btnClientes4.setText("MODIFICAR ");
        btnClientes4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientes4ActionPerformed(evt);
            }
        });
        jPanel3.add(btnClientes4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 190, 60));

        btnClientes5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnClientes5.setForeground(new java.awt.Color(0, 0, 102));
        btnClientes5.setText("VER PROVEEDOR");
        btnClientes5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientes5ActionPerformed(evt);
            }
        });
        jPanel3.add(btnClientes5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 200, 60));

        jLabel46.setFont(new java.awt.Font("MV Boli", 1, 48)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 0, 102));
        jLabel46.setText("ES UN PLACER !!");

        jLabel47.setFont(new java.awt.Font("MV Boli", 1, 48)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 0, 102));
        jLabel47.setText("\"DONDE COMPRAR");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/audifonos-inalambricos (1).png"))); // NOI18N
        jLabel5.setText("jLabel1");

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/carrito-de-compras (1).png"))); // NOI18N

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cheque (1).png"))); // NOI18N

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/bolsa-para-la-escuela (1).png"))); // NOI18N

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/lampara-de-mesa (1).png"))); // NOI18N

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/TITT II (2).jpg"))); // NOI18N
        jLabel51.setText("jLabel38");

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtRazonProveedor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRazonProveedor1ActionPerformed(evt);
            }
        });
        jPanel4.add(txtRazonProveedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 340, 60));

        btnProductos1.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        btnProductos1.setForeground(new java.awt.Color(0, 0, 102));
        btnProductos1.setText("CANCELAR");
        btnProductos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductos1ActionPerformed(evt);
            }
        });
        jPanel4.add(btnProductos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 150, 60));

        btnGenerarVenta2.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        btnGenerarVenta2.setForeground(new java.awt.Color(0, 51, 102));
        btnGenerarVenta2.setText("ACEPTAR");
        btnGenerarVenta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarVenta2ActionPerformed(evt);
            }
        });
        jPanel4.add(btnGenerarVenta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 140, 60));

        jLabel6.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        jLabel6.setText("BUSCAR ID DEL PROVEEDOR A ELIMINAR:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 320, 20));

        jPanel5.setBackground(new java.awt.Color(184, 231, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevaVenta2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnNuevaVenta2.setForeground(new java.awt.Color(0, 0, 102));
        btnNuevaVenta2.setText("REGISTRAR PROOV");
        btnNuevaVenta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaVenta2ActionPerformed(evt);
            }
        });
        jPanel5.add(btnNuevaVenta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 210, 60));

        btnClientes6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnClientes6.setForeground(new java.awt.Color(0, 0, 102));
        btnClientes6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/borrar (1).png"))); // NOI18N
        btnClientes6.setText("ELIMINAR");
        btnClientes6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientes6ActionPerformed(evt);
            }
        });
        jPanel5.add(btnClientes6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 180, 60));

        jLabel7.setBackground(new java.awt.Color(0, 204, 204));
        jLabel7.setForeground(new java.awt.Color(0, 204, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/LOGO OFC (1).png"))); // NOI18N
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 220, 170));

        jLabel14.setFont(new java.awt.Font("SimSun-ExtB", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 153));
        jLabel14.setText("KAROL B'S SHOP");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, 20));

        LabelVendedor2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        LabelVendedor2.setText("By Karol Fernandez");
        jPanel5.add(LabelVendedor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        btnClientes7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnClientes7.setForeground(new java.awt.Color(0, 0, 102));
        btnClientes7.setText("MODIFICAR ");
        btnClientes7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientes7ActionPerformed(evt);
            }
        });
        jPanel5.add(btnClientes7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 190, 60));

        btnClientes8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnClientes8.setForeground(new java.awt.Color(0, 0, 102));
        btnClientes8.setText("VER PROVEEDOR");
        btnClientes8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientes8ActionPerformed(evt);
            }
        });
        jPanel5.add(btnClientes8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 200, 60));

        jLabel52.setFont(new java.awt.Font("MV Boli", 1, 48)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(0, 0, 102));
        jLabel52.setText("ES UN PLACER !!");

        jLabel53.setFont(new java.awt.Font("MV Boli", 1, 48)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(0, 0, 102));
        jLabel53.setText("\"DONDE COMPRAR");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/audifonos-inalambricos (1).png"))); // NOI18N
        jLabel8.setText("jLabel1");

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/carrito-de-compras (1).png"))); // NOI18N

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cheque (1).png"))); // NOI18N

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/bolsa-para-la-escuela (1).png"))); // NOI18N

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/lampara-de-mesa (1).png"))); // NOI18N

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/TITT II (2).jpg"))); // NOI18N
        jLabel58.setText("jLabel38");

        jPanel6.setBackground(new java.awt.Color(255, 255, 204));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtRazonProveedor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRazonProveedor2ActionPerformed(evt);
            }
        });
        jPanel6.add(txtRazonProveedor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 340, 60));

        btnProductos2.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        btnProductos2.setForeground(new java.awt.Color(0, 0, 102));
        btnProductos2.setText("CANCELAR");
        btnProductos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductos2ActionPerformed(evt);
            }
        });
        jPanel6.add(btnProductos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 150, 60));

        btnGenerarVenta3.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        btnGenerarVenta3.setForeground(new java.awt.Color(0, 51, 102));
        btnGenerarVenta3.setText("ACEPTAR");
        btnGenerarVenta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarVenta3ActionPerformed(evt);
            }
        });
        jPanel6.add(btnGenerarVenta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 140, 60));

        jLabel9.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        jLabel9.setText("BUSCAR ID DEL PROVEEDOR A ELIMINAR:");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 320, 20));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(184, 231, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevaVenta3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnNuevaVenta3.setForeground(new java.awt.Color(0, 0, 102));
        btnNuevaVenta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/registrar.png"))); // NOI18N
        btnNuevaVenta3.setText("REGISTRAR CLIENTE");
        btnNuevaVenta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaVenta3ActionPerformed(evt);
            }
        });
        jPanel7.add(btnNuevaVenta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 210, 60));

        btnClientes9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnClientes9.setForeground(new java.awt.Color(0, 0, 102));
        btnClientes9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/borrar (1).png"))); // NOI18N
        btnClientes9.setText("ELIMINAR");
        btnClientes9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientes9ActionPerformed(evt);
            }
        });
        jPanel7.add(btnClientes9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 180, 60));

        jLabel10.setBackground(new java.awt.Color(0, 204, 204));
        jLabel10.setForeground(new java.awt.Color(0, 204, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/LOGO OFC (1).png"))); // NOI18N
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 220, 170));

        jLabel15.setFont(new java.awt.Font("SimSun-ExtB", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 153));
        jLabel15.setText("KAROL B'S SHOP");
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, 20));

        LabelVendedor3.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        LabelVendedor3.setText("By Karol Fernandez");
        jPanel7.add(LabelVendedor3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        btnClientes10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnClientes10.setForeground(new java.awt.Color(0, 0, 102));
        btnClientes10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/modificar_2.png"))); // NOI18N
        btnClientes10.setText("MODIFICAR ");
        btnClientes10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientes10ActionPerformed(evt);
            }
        });
        jPanel7.add(btnClientes10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 190, 60));

        btnClientes11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnClientes11.setForeground(new java.awt.Color(0, 0, 102));
        btnClientes11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ver_cliente.png"))); // NOI18N
        btnClientes11.setText("VER CLIENTE");
        btnClientes11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientes11ActionPerformed(evt);
            }
        });
        jPanel7.add(btnClientes11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 190, 60));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 240, 660));

        jLabel59.setFont(new java.awt.Font("MV Boli", 1, 48)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(0, 0, 102));
        jLabel59.setText("ES UN PLACER !!");
        getContentPane().add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, 490, 60));

        jLabel60.setFont(new java.awt.Font("MV Boli", 1, 48)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(0, 0, 102));
        jLabel60.setText("\"DONDE COMPRAR");
        getContentPane().add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 530, 50));

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/carrito-de-compras (1).png"))); // NOI18N
        getContentPane().add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 80, 70));

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cheque (1).png"))); // NOI18N
        getContentPane().add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 60, 60));

        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/TITT II (2).jpg"))); // NOI18N
        jLabel65.setText("jLabel38");
        getContentPane().add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 1040, 150));

        jPanel8.setBackground(new java.awt.Color(255, 255, 204));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdClienteActionPerformed(evt);
            }
        });
        jPanel8.add(txtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 580, 60));

        jLabel16.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        jLabel16.setText("BUSCAR ID DEL CLIENTE A ELIMINAR:");
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 470, 20));

        jButton6.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/regresar_p.png"))); // NOI18N
        jButton6.setText("REGRESAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 160, 60));

        btnEliminar.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 51, 102));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar (1).png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel8.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 160, 60));

        btnLimpiar.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/limpiar_p.png"))); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel8.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 140, 60));

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 150, 1040, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaVentaActionPerformed

    }//GEN-LAST:event_btnNuevaVentaActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed

    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnClientes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientes1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClientes1ActionPerformed

    private void btnClientes2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientes2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClientes2ActionPerformed

    private void txtRazonProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRazonProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRazonProveedorActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed

    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnGenerarVenta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarVenta1ActionPerformed

    }//GEN-LAST:event_btnGenerarVenta1ActionPerformed

    private void btnNuevaVenta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaVenta1ActionPerformed

    }//GEN-LAST:event_btnNuevaVenta1ActionPerformed

    private void btnClientes3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientes3ActionPerformed

    }//GEN-LAST:event_btnClientes3ActionPerformed

    private void btnClientes4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientes4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClientes4ActionPerformed

    private void btnClientes5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientes5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClientes5ActionPerformed

    private void txtRazonProveedor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRazonProveedor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRazonProveedor1ActionPerformed

    private void btnProductos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductos1ActionPerformed

    }//GEN-LAST:event_btnProductos1ActionPerformed

    private void btnGenerarVenta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarVenta2ActionPerformed

    }//GEN-LAST:event_btnGenerarVenta2ActionPerformed

    private void btnNuevaVenta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaVenta2ActionPerformed

    }//GEN-LAST:event_btnNuevaVenta2ActionPerformed

    private void btnClientes6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientes6ActionPerformed

    }//GEN-LAST:event_btnClientes6ActionPerformed

    private void btnClientes7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientes7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClientes7ActionPerformed

    private void btnClientes8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientes8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClientes8ActionPerformed

    private void txtRazonProveedor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRazonProveedor2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRazonProveedor2ActionPerformed

    private void btnProductos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductos2ActionPerformed

    }//GEN-LAST:event_btnProductos2ActionPerformed

    private void btnGenerarVenta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarVenta3ActionPerformed

    }//GEN-LAST:event_btnGenerarVenta3ActionPerformed

    private void btnNuevaVenta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaVenta3ActionPerformed
       frm_ModificarCliente MCL = new frm_ModificarCliente();
        MCL.setVisible(true);
    }//GEN-LAST:event_btnNuevaVenta3ActionPerformed

    private void btnClientes9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientes9ActionPerformed
        frm_EliminarCliente Epv = new frm_EliminarCliente();
        Epv.setVisible(true);
    }//GEN-LAST:event_btnClientes9ActionPerformed

    private void btnClientes10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientes10ActionPerformed
         frm_ModificarProveedor Mpv = new frm_ModificarProveedor();
        Mpv.setVisible(true);
    }//GEN-LAST:event_btnClientes10ActionPerformed

    private void btnClientes11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientes11ActionPerformed
        frm_VerCliente VCL = new frm_VerCliente();
        VCL.setVisible(true);
    }//GEN-LAST:event_btnClientes11ActionPerformed

    private void txtIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdClienteActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        frm_Sistema stm = new frm_Sistema();
        stm.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(frm_EliminarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_EliminarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_EliminarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_EliminarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_EliminarCliente().setVisible(true);
            M_EliminarCliente modelo = new M_EliminarCliente();
            frm_EliminarCliente vista = new frm_EliminarCliente();
            new C_EliminarCliente(modelo, vista);
            vista.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelVendedor;
    private javax.swing.JLabel LabelVendedor1;
    private javax.swing.JLabel LabelVendedor2;
    private javax.swing.JLabel LabelVendedor3;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnClientes1;
    private javax.swing.JButton btnClientes10;
    private javax.swing.JButton btnClientes11;
    private javax.swing.JButton btnClientes2;
    private javax.swing.JButton btnClientes3;
    private javax.swing.JButton btnClientes4;
    private javax.swing.JButton btnClientes5;
    private javax.swing.JButton btnClientes6;
    private javax.swing.JButton btnClientes7;
    private javax.swing.JButton btnClientes8;
    private javax.swing.JButton btnClientes9;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGenerarVenta1;
    private javax.swing.JButton btnGenerarVenta2;
    private javax.swing.JButton btnGenerarVenta3;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnNuevaVenta;
    private javax.swing.JButton btnNuevaVenta1;
    private javax.swing.JButton btnNuevaVenta2;
    private javax.swing.JButton btnNuevaVenta3;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProductos1;
    private javax.swing.JButton btnProductos2;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtRazonProveedor;
    private javax.swing.JTextField txtRazonProveedor1;
    private javax.swing.JTextField txtRazonProveedor2;
    // End of variables declaration//GEN-END:variables
}
