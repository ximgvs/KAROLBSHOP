
package Vista;
import Controlador.C_DetalleVenta;
import java.util.List;

public class frm_Sistema extends javax.swing.JFrame {
    private List<Object[]> listaDetalles;
    private C_DetalleVenta cDetalleVenta;
       public frm_Sistema() {
        initComponents();
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
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        LabelVendedor3 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btnProducto = new javax.swing.JButton();
        btnVenta = new javax.swing.JButton();
        btnProveedor = new javax.swing.JButton();
        btnCliente = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

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

        jLabel10.setBackground(new java.awt.Color(0, 204, 204));
        jLabel10.setForeground(new java.awt.Color(0, 204, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/LOGO OFC (1).png"))); // NOI18N
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 220, 170));

        jLabel15.setFont(new java.awt.Font("SimSun-ExtB", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 153));
        jLabel15.setText("KAROL B'S SHOP");
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, 20));

        LabelVendedor3.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        LabelVendedor3.setText("By Karol Fernandez");
        jPanel7.add(LabelVendedor3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 660));

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
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("MENU PRINCIPAL : KAROLBSHOP"));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnProducto.setBackground(new java.awt.Color(255, 204, 153));
        btnProducto.setFont(new java.awt.Font("SimSun-ExtB", 1, 24)); // NOI18N
        btnProducto.setText("PRODUCTO");
        btnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoActionPerformed(evt);
            }
        });
        jPanel8.add(btnProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 110, 160, 60));

        btnVenta.setBackground(new java.awt.Color(255, 204, 204));
        btnVenta.setFont(new java.awt.Font("SimSun-ExtB", 1, 24)); // NOI18N
        btnVenta.setForeground(new java.awt.Color(0, 51, 102));
        btnVenta.setText("NUEVA VENTA");
        btnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaActionPerformed(evt);
            }
        });
        jPanel8.add(btnVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 170, 60));

        btnProveedor.setBackground(new java.awt.Color(204, 204, 255));
        btnProveedor.setFont(new java.awt.Font("SimSun-ExtB", 1, 24)); // NOI18N
        btnProveedor.setText("PROVEEDOR");
        btnProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedorActionPerformed(evt);
            }
        });
        jPanel8.add(btnProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 160, 60));

        btnCliente.setBackground(new java.awt.Color(204, 255, 204));
        btnCliente.setFont(new java.awt.Font("SimSun-ExtB", 1, 24)); // NOI18N
        btnCliente.setText("CLIENTE");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });
        jPanel8.add(btnCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 160, 60));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/grifo (1) (1).png"))); // NOI18N
        jPanel8.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 190, -1, -1));

        jPanel9.setBackground(new java.awt.Color(204, 255, 102));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));

        jLabel16.setBackground(new java.awt.Color(204, 255, 153));
        jLabel16.setFont(new java.awt.Font("Stencil", 1, 48)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 51, 51));
        jLabel16.setText("BIENVENIDA !");
        jPanel9.add(jLabel16);

        jLabel24.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setText("SELECCIONE SU EVENTO A REALIZAR, A CONTINUACION :");
        jPanel9.add(jLabel24);

        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 680, 110));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregar-producto (1).png"))); // NOI18N
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 50, -1, -1));
        jPanel8.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/comprar-casa (1).png"))); // NOI18N
        jPanel8.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/proveedor (1).png"))); // NOI18N
        jPanel8.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/satisfaccion-del-consumidor (1).png"))); // NOI18N
        jPanel8.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, -1, -1));

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 1031, 510));

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

    private void btnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoActionPerformed
        frm_RegistrarProducto Rproo = new frm_RegistrarProducto();
        Rproo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnProductoActionPerformed

    private void btnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaActionPerformed
  
    }//GEN-LAST:event_btnVentaActionPerformed

    private void btnProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedorActionPerformed
        frm_RegistrarProveedor RProo = new frm_RegistrarProveedor();
                RProo.setVisible(true);
                 this.setVisible(false);
    }//GEN-LAST:event_btnProveedorActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        frm_RegistrarCliente RCl = new frm_RegistrarCliente();
        RCl.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_btnClienteActionPerformed

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
            java.util.logging.Logger.getLogger(frm_Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new frm_Sistema().setVisible(true);
          
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelVendedor;
    private javax.swing.JLabel LabelVendedor1;
    private javax.swing.JLabel LabelVendedor2;
    private javax.swing.JLabel LabelVendedor3;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnClientes1;
    private javax.swing.JButton btnClientes2;
    private javax.swing.JButton btnClientes3;
    private javax.swing.JButton btnClientes4;
    private javax.swing.JButton btnClientes5;
    private javax.swing.JButton btnClientes6;
    private javax.swing.JButton btnClientes7;
    private javax.swing.JButton btnClientes8;
    private javax.swing.JButton btnGenerarVenta1;
    private javax.swing.JButton btnGenerarVenta2;
    private javax.swing.JButton btnGenerarVenta3;
    private javax.swing.JButton btnNuevaVenta;
    private javax.swing.JButton btnNuevaVenta1;
    private javax.swing.JButton btnNuevaVenta2;
    private javax.swing.JButton btnProducto;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProductos1;
    private javax.swing.JButton btnProductos2;
    private javax.swing.JButton btnProveedor;
    private javax.swing.JButton btnVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
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
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField txtRazonProveedor;
    private javax.swing.JTextField txtRazonProveedor1;
    private javax.swing.JTextField txtRazonProveedor2;
    // End of variables declaration//GEN-END:variables
}
