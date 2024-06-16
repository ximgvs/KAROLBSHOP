
package Vista;

import Controlador.C_Venta;
import Controlador.C_DetalleVenta;
import Modelo.Conexion;
import Modelo.M_DetalleVenta;
import Modelo.M_Venta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.sql.SQLException;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class frm_DetalleVentas extends javax.swing.JFrame {
    private C_DetalleVenta cDetalleVenta;
    private List<Object[]> listaDetalles;
       private C_Venta cVenta;
        private M_Venta mVenta;
    private static final String NOMBRE_ADMINISTRADORA = "Karol Fernandez";

    public frm_DetalleVentas(C_DetalleVenta cDetalleVenta, List<Object[]> listaDetalles) {
        this.cDetalleVenta = cDetalleVenta;
        this.listaDetalles = listaDetalles;
        initComponents();
        initListeners();
    }

    private void initListeners() {
        txtDniCliente.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    buscarNombreCliente();
                }
            }
        });

      txtIdVenta.addKeyListener(new KeyAdapter() {
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                buscarInformacionVenta();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Ingrese un número válido para el ID de venta", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
});


 btnGuardarDetalle.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                guardarDetalleVenta();
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al guardar el detalle de la venta: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    });
}

     private void buscarNombreCliente() {
        String dniCliente = txtDniCliente.getText();
        try {
            String nombreCliente = cDetalleVenta.buscarNombreClientePorDNI(dniCliente);
            txtNombreCliente.setText(nombreCliente);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al obtener el nombre del cliente: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

private void buscarInformacionVenta() {
    try {
        // Obtener el idVenta desde el campo txtIdVenta
        int idVenta = Integer.parseInt(txtIdVenta.getText());
        
        // Llamar al método para obtener la información de la venta
        Object[] infoVenta = cDetalleVenta.obtenerInformacionVentaPorID(idVenta);

        // Verificar si la información de la venta es válida
        if (infoVenta != null && infoVenta.length >= 2) {
            int cantidad = (int) infoVenta[0];
            double precio = (double) infoVenta[1];
            double total = cantidad * precio;
            
            // Obtener el DNI y Nombre del Cliente de los campos de texto
            String dniCliente = txtDniCliente.getText();
            String nombreCliente = txtNombreCliente.getText();
            
            // Obtener la fecha actual
            Date fecha = new Date(System.currentTimeMillis());

            // Limpiar la tabla antes de agregar nuevos datos
            DefaultTableModel model = (DefaultTableModel) jTableDetalles.getModel();
            model.setRowCount(0);

            // Agregar fila con los datos obtenidos a la tabla
            model.addRow(new Object[]{idVenta, dniCliente, nombreCliente, total, fecha, NOMBRE_ADMINISTRADORA});
        } else {
            // Mostrar mensaje de error si no se encontró la información de la venta
            JOptionPane.showMessageDialog(this, "No se encontró la información completa de la venta", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (NumberFormatException ex) {
        // Manejar el error si el usuario ingresa un valor no válido para el idVenta
        JOptionPane.showMessageDialog(null, "Ingrese un número válido para el ID de venta", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException ex) {
        // Manejar el error si ocurre una excepción SQL al buscar la información de la venta
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al buscar la información de la venta: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } catch (Exception ex) {
        // Manejar cualquier otra excepción no prevista
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

 

private void guardarDetalleVenta() throws SQLException {
    int idVenta = Integer.parseInt(txtIdVenta.getText());
    String dniCliente = txtDniCliente.getText();
    String nombreCliente = txtNombreCliente.getText();
    Date fecha = new Date(System.currentTimeMillis());

    double totalVenta = 0;
    DefaultTableModel model = (DefaultTableModel) jTableDetalles.getModel();

    // Recorrer la tabla para calcular el total de la venta
    for (int i = 0; i < model.getRowCount(); i++) {
        double total = (double) model.getValueAt(i, 3);
        totalVenta += total;
    }

    // Insertar detalle de venta en la base de datos
    cDetalleVenta.insertarDetalleVenta(idVenta, dniCliente, nombreCliente, new java.sql.Date(fecha.getTime()), totalVenta, NOMBRE_ADMINISTRADORA);

    // Mostrar mensaje de éxito y limpiar campos
    JOptionPane.showMessageDialog(this, "Detalle de venta guardado exitosamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    limpiarCampos();
}


    private void limpiarCampos() {
        txtDniCliente.setText("");
        txtNombreCliente.setText("");
        txtIdVenta.setText("");
        DefaultTableModel model = (DefaultTableModel) jTableDetalles.getModel();
        model.setRowCount(0); // Limpiar la tabla
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
        btnMostrarDetalles = new javax.swing.JButton();
        txtIdVenta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDetalles = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDniCliente = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnNuevaVenta1 = new javax.swing.JButton();
        btnProveedor = new javax.swing.JButton();
        btnCliente = new javax.swing.JButton();
        btnProducto = new javax.swing.JButton();
        btnProducto1 = new javax.swing.JButton();
        btnGuardarDetalle = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(184, 231, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevaVenta.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnNuevaVenta.setForeground(new java.awt.Color(0, 0, 102));
        btnNuevaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/registrar_venta.png"))); // NOI18N
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

        btnMostrarDetalles.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        btnMostrarDetalles.setForeground(new java.awt.Color(0, 0, 102));
        btnMostrarDetalles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/buscar_producto.png"))); // NOI18N
        btnMostrarDetalles.setText("BUSCAR VENTA");
        btnMostrarDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarDetallesActionPerformed(evt);
            }
        });
        jPanel2.add(btnMostrarDetalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 190, 60));
        jPanel2.add(txtIdVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, 210, 50));

        jTableDetalles.setBackground(new java.awt.Color(242, 242, 242));
        jTableDetalles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID VENTA", "DNI_CLIENTE", "NOMBRE_CLIENTE", "TOTAL A PAGAR", "FECHA", "ADMI_NOMBRE"
            }
        ));
        jScrollPane1.setViewportView(jTableDetalles);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 960, 190));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel9.setText("NOMBRE");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 90, 40));

        txtNombreCliente.setEditable(false);
        jPanel2.add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 230, 50));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel8.setText("DNI /  RUC");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 110, 40));

        txtDniCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniClienteActionPerformed(evt);
            }
        });
        txtDniCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDniClienteKeyPressed(evt);
            }
        });
        jPanel2.add(txtDniCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 190, 50));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevaVenta1.setBackground(new java.awt.Color(204, 255, 153));
        btnNuevaVenta1.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        btnNuevaVenta1.setText("NUEVA VENTA");
        btnNuevaVenta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaVenta1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnNuevaVenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 18, 162, 50));

        btnProveedor.setBackground(new java.awt.Color(255, 204, 153));
        btnProveedor.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        btnProveedor.setText("PROVEEDOR");
        btnProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedorActionPerformed(evt);
            }
        });
        jPanel3.add(btnProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 14, 129, 58));

        btnCliente.setBackground(new java.awt.Color(204, 204, 255));
        btnCliente.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        btnCliente.setText("CLIENTE");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });
        jPanel3.add(btnCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 15, 160, 57));

        btnProducto.setBackground(new java.awt.Color(255, 204, 204));
        btnProducto.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        btnProducto.setText("PRODUCTO");
        btnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoActionPerformed(evt);
            }
        });
        jPanel3.add(btnProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 14, 160, 58));

        btnProducto1.setBackground(new java.awt.Color(204, 255, 255));
        btnProducto1.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        btnProducto1.setText("PAGOS");
        btnProducto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProducto1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(803, 14, 156, 58));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 90));

        btnGuardarDetalle.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        btnGuardarDetalle.setForeground(new java.awt.Color(0, 51, 102));
        btnGuardarDetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ahorrar (1).png"))); // NOI18N
        btnGuardarDetalle.setText("GUARDAR");
        btnGuardarDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarDetalleActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardarDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 170, 60));

        jLabel10.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 204));
        jLabel10.setText("ID VENTA");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, 140, 40));

        jButton1.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/escoba (1).png"))); // NOI18N
        jButton1.setText("LIMPIAR CAMPOS");
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, 200, 60));

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

    private void btnMostrarDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarDetallesActionPerformed

    }//GEN-LAST:event_btnMostrarDetallesActionPerformed

    private void txtDniClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniClienteActionPerformed
   
    }//GEN-LAST:event_txtDniClienteActionPerformed

    private void txtDniClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniClienteKeyPressed
  
 
    }//GEN-LAST:event_txtDniClienteKeyPressed

    private void btnNuevaVenta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaVenta1ActionPerformed
   frm_Ventas frmVentas = new frm_Ventas(cVenta, listaDetalles, mVenta);
     frmVentas.setVisible(true);     
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

    private void btnProducto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProducto1ActionPerformed
        frm_Pin Pin = new frm_Pin();
        Pin.setVisible(true);
    }//GEN-LAST:event_btnProducto1ActionPerformed

    private void btnGuardarDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarDetalleActionPerformed
   

    }//GEN-LAST:event_btnGuardarDetalleActionPerformed

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    // Crear instancia de modelo y controlador
                    M_DetalleVenta mDetalleVenta = new M_DetalleVenta();
                    C_DetalleVenta cDetalleVenta = new C_DetalleVenta(mDetalleVenta);

                    // Crear lista para detalles de ventas
                    List<Object[]> listaDetalles = new ArrayList<>();

                    // Crear y mostrar la interfaz gráfica
                    frm_DetalleVentas frame = new frm_DetalleVentas(cDetalleVenta, listaDetalles);
                    frame.setVisible(true);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error al inicializar la aplicación: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

                 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelVendedor;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnEliminarVenta;
    private javax.swing.JButton btnGuardarDetalle;
    private javax.swing.JButton btnMostrarDetalles;
    private javax.swing.JButton btnNuevaVenta;
    private javax.swing.JButton btnNuevaVenta1;
    private javax.swing.JButton btnProducto;
    private javax.swing.JButton btnProducto1;
    private javax.swing.JButton btnProveedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDetalles;
    private javax.swing.JTextField txtDniCliente;
    private javax.swing.JTextField txtIdVenta;
    private javax.swing.JTextField txtNombreCliente;
    // End of variables declaration//GEN-END:variables
}
