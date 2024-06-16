
package Vista;

import Controlador.C_DetalleVenta;
import Controlador.C_Venta;
import Modelo.Conexion;
import Modelo.M_Venta;
import Modelo.M_DetalleVenta;
import Modelo.M_Venta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;

public class frm_Ventas extends javax.swing.JFrame {
     private C_Venta cVenta;
    private List<Object[]> listaDetalles;
      private C_DetalleVenta cDetalleVenta;
     private M_Venta mVenta;
     
 public frm_Ventas(C_Venta cVenta, List<Object[]> listaDetalles, M_Venta mVenta) {
    this.cVenta = cVenta;
    this.listaDetalles = listaDetalles;
    this.mVenta = mVenta; // Crear una instancia de M_Venta
    initComponents();
    initListeners();

    // Configurar el modelo de la tabla si no está configurado en initComponents()
    DefaultTableModel model = new DefaultTableModel();
    model.setColumnIdentifiers(new Object[]{"Código Producto", "Nombre Producto", "Cantidad", "Precio"});
    jTableVentas.setModel(model);

    // Establecer el foco en txtCantidad
    txtCantidad.requestFocusInWindow();
}

private void initListeners() {
    btnBuscarProducto.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                buscarProducto();
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(frm_Ventas.this, "Error al buscar el producto: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    });

    // Configurar ActionListener para detectar Enter en txtCantidad
    txtCantidad.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            agregarDetalle();
        }
    });

    btnGuardarVenta.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                guardarVenta();
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(frm_Ventas.this, "Error al guardar la venta: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    });
}

private void buscarProducto() throws SQLException {
    String codigoProducto = txtCodigoProducto.getText();
    Object[] producto = cVenta.buscarProductoPorCodigo(codigoProducto);
    if (producto != null) {
        txtNombreProducto.setText((String) producto[1]);
        txtCantidadVent.setText(String.valueOf(producto[2]));
        txtPrecio.setText(String.valueOf(producto[3]));
    } else {
        JOptionPane.showMessageDialog(this, "No se encontró el producto", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

private void agregarDetalle() {
    String codigoProducto = txtCodigoProducto.getText();
    String nombreProducto = txtNombreProducto.getText();
    int cantidad = Integer.parseInt(txtCantidad.getText());
    double precio = Double.parseDouble(txtPrecio.getText());

    Object[] detalle = {codigoProducto, nombreProducto, cantidad, precio};
    listaDetalles.add(detalle);

    DefaultTableModel model = (DefaultTableModel) jTableVentas.getModel();
    model.addRow(detalle);

    // Limpiar los campos después de agregar el detalle
    txtCodigoProducto.setText("");
    txtNombreProducto.setText("");
    txtCantidad.setText("");
    txtPrecio.setText("");
}

  private void guardarVenta() throws SQLException {
        for (Object[] detalle : listaDetalles) {
            String codigoProducto = (String) detalle[0];
            String nombreProducto = (String) detalle[1];
            int cantidad = (int) detalle[2];
            double precio = (double) detalle[3];

            cVenta.insertarVenta(codigoProducto, nombreProducto, cantidad, precio);
        }
        JOptionPane.showMessageDialog(this, "Venta guardada exitosamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        listaDetalles.clear();
        ((DefaultTableModel) jTableVentas.getModel()).setRowCount(0);
    }

  
 
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnNuevaVenta = new javax.swing.JButton();
        btnEliminarVenta = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        LabelVendedor = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnBuscarProducto = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtCodigoProducto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCantidadVent = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVentas = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnReportes = new javax.swing.JButton();
        btnProveedor = new javax.swing.JButton();
        btnCliente = new javax.swing.JButton();
        btnProducto = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnGuardarVenta = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(184, 231, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevaVenta.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnNuevaVenta.setForeground(new java.awt.Color(0, 0, 102));
        btnNuevaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cajero-automatico (1).png"))); // NOI18N
        btnNuevaVenta.setText("REGISTRAR VENTA");
        btnNuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaVentaActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 220, 60));

        btnEliminarVenta.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnEliminarVenta.setForeground(new java.awt.Color(0, 0, 102));
        btnEliminarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar (1).png"))); // NOI18N
        btnEliminarVenta.setText("ELIMINAR VENTA");
        btnEliminarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVentaActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 220, 60));

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 0, 260, 660));

        jLabel41.setFont(new java.awt.Font("MV Boli", 1, 48)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 102));
        jLabel41.setText("ES UN PLACER !!");
        getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(723, 80, 490, 60));

        jLabel43.setFont(new java.awt.Font("MV Boli", 1, 48)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 102));
        jLabel43.setText("\"DONDE COMPRAR");
        getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 20, 530, 50));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/carrito-de-compras (1).png"))); // NOI18N
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 70, 80, 70));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cheque (1).png"))); // NOI18N
        getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(793, 10, 60, 60));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscarProducto.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        btnBuscarProducto.setForeground(new java.awt.Color(0, 0, 102));
        btnBuscarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/buscar (1).png"))); // NOI18N
        btnBuscarProducto.setText("BUSCAR");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 150, 60));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel3.setText("Código");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        txtCodigoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProductoActionPerformed(evt);
            }
        });
        txtCodigoProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoProductoKeyPressed(evt);
            }
        });
        jPanel2.add(txtCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 130, 40));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel4.setText("Descripción");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));
        jPanel2.add(txtNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 180, 40));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel5.setText("Cantidad");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, -1, -1));

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadKeyPressed(evt);
            }
        });
        jPanel2.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 150, 40));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel6.setText("Precio");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, -1, -1));

        txtPrecio.setEditable(false);
        jPanel2.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 160, 40));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("Stock Dispo");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 110, 140, 20));
        jPanel2.add(txtCantidadVent, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 140, 160, 40));

        jTableVentas.setBackground(new java.awt.Color(242, 242, 242));
        jTableVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DESCRIPCIÓN", "CANTIDAD", "PRECIO", "TOTAL"
            }
        ));
        jScrollPane1.setViewportView(jTableVentas);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 940, 200));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnReportes.setBackground(new java.awt.Color(204, 255, 153));
        btnReportes.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        btnReportes.setText("REPORTES");
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });
        jPanel3.add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 22, 150, 50));

        btnProveedor.setBackground(new java.awt.Color(255, 204, 153));
        btnProveedor.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        btnProveedor.setText("PROVEEDOR");
        btnProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedorActionPerformed(evt);
            }
        });
        jPanel3.add(btnProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 129, 50));

        btnCliente.setBackground(new java.awt.Color(204, 204, 255));
        btnCliente.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        btnCliente.setText("CLIENTE");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });
        jPanel3.add(btnCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 22, 144, 50));

        btnProducto.setBackground(new java.awt.Color(255, 204, 204));
        btnProducto.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        btnProducto.setText("PRODUCTO");
        btnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoActionPerformed(evt);
            }
        });
        jPanel3.add(btnProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 20, 160, 50));

        btnVentas.setBackground(new java.awt.Color(204, 255, 255));
        btnVentas.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        btnVentas.setText("DETALLE_VENTAS");
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });
        jPanel3.add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(793, 22, 180, 50));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 90));

        btnGuardarVenta.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        btnGuardarVenta.setForeground(new java.awt.Color(0, 51, 102));
        btnGuardarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ahorrar (1).png"))); // NOI18N
        btnGuardarVenta.setText("GUARDAR");
        btnGuardarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarVentaActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 170, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 150, -1, 510));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/TITT II (2).jpg"))); // NOI18N
        jLabel38.setText("jLabel38");
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 0, 1020, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaVentaActionPerformed
   
    }//GEN-LAST:event_btnNuevaVentaActionPerformed

    private void btnEliminarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVentaActionPerformed
      frm_EliminarVenta ev = new frm_EliminarVenta();
      ev.setVisible(true);
    }//GEN-LAST:event_btnEliminarVentaActionPerformed

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed

    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void txtCodigoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProductoActionPerformed
    
    }//GEN-LAST:event_txtCodigoProductoActionPerformed

    private void txtCodigoProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoProductoKeyPressed

    }//GEN-LAST:event_txtCodigoProductoKeyPressed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
  
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyPressed

    }//GEN-LAST:event_txtCantidadKeyPressed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
         frm_ReporteVenta RVTS = new  frm_ReporteVenta();
         RVTS.setVisible(true);
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedorActionPerformed
          frm_RegistrarProveedor RProo = new frm_RegistrarProveedor();
                RProo.setVisible(true);
                 this.setVisible(false);
    }//GEN-LAST:event_btnProveedorActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        frm_RegistrarCliente rc = new frm_RegistrarCliente();
        rc.setVisible(true);
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoActionPerformed
        frm_RegistrarProducto pdr = new frm_RegistrarProducto();
        pdr.setVisible(true);
    }//GEN-LAST:event_btnProductoActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
       frm_DetalleVentas DV = new frm_DetalleVentas(cDetalleVenta, listaDetalles);
       DV.setVisible(true);
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnGuardarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarVentaActionPerformed
 

    }//GEN-LAST:event_btnGuardarVentaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
  
            public void run() {
                try {
                    M_Venta mVenta = new M_Venta();
                    
                    // Crear una instancia de C_Venta y pasarle la instancia de M_Venta
                    C_Venta cVenta = new C_Venta(mVenta);
                    
                    // Crear una lista de detalles vacía
                    List<Object[]> listaDetalles = new ArrayList<>();
                    
                    // Crear una instancia de frm_Ventas y pasarle la instancia de C_Venta y la lista de detalles
                    frm_Ventas frmVentas = new frm_Ventas(cVenta, listaDetalles, mVenta);
                    
                    // Hacer visible la ventana
                    frmVentas.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(frm_Ventas.class.getName()).log(Level.SEVERE, null, ex);
                }
}
});
                }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelVendedor;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnEliminarVenta;
    private javax.swing.JButton btnGuardarVenta;
    private javax.swing.JButton btnNuevaVenta;
    private javax.swing.JButton btnProducto;
    private javax.swing.JButton btnProveedor;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnVentas;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableVentas;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCantidadVent;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
