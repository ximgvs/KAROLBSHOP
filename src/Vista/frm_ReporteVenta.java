
package Vista;

import Controlador.C_DetalleVenta;
import Controlador.C_ReporteVenta;
import Controlador.C_Venta;
import Modelo.M_Venta;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class frm_ReporteVenta extends javax.swing.JFrame {
    
      private C_ReporteVenta controlador;
      private C_DetalleVenta cDetalleVenta;
       private List<Object[]> listaDetalles;
       private C_Venta cVenta;
        private M_Venta mVenta;
        
    public frm_ReporteVenta() {
        initComponents();
        setLocationRelativeTo(null); // Centrar ventana en la pantalla
        controlador = new C_ReporteVenta(this); // Inicialización del controlador
    }
    
   
   
    public void mostrarReporteVentas(List<Object[]> listaReporte) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID Venta");
        model.addColumn("Código Producto");
        model.addColumn("Nombre Producto");
        model.addColumn("Cantidad");
        model.addColumn("Precio");
        model.addColumn("DNI Cliente");
        model.addColumn("Nombre Cliente");
        model.addColumn("Fecha");
        model.addColumn("Total");
        model.addColumn("Nombre Administrador");

        for (Object[] reporte : listaReporte) {
            model.addRow(reporte);
        }

        tablaReporte.setModel(model);
    }
    
   
        
       private void limpiarCampos() {
        txtFechaInicio.setText("");
        txtFechaFin.setText("");
        DefaultTableModel model = (DefaultTableModel) tablaReporte.getModel();
        model.setRowCount(0); // Limpiar todas las filas de la tabla
    }
 
       
       private void exportToExcel() {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Reporte de Ventas");

        DefaultTableModel model = (DefaultTableModel) tablaReporte.getModel();
        Row headerRow = sheet.createRow(0);

        for (int i = 0; i < model.getColumnCount(); i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(model.getColumnName(i));
        }

        int rowCount = 1;

        for (int i = 0; i < model.getRowCount(); i++) {
            Row row = sheet.createRow(rowCount++);
            for (int j = 0; j < model.getColumnCount(); j++) {
                Cell cell = row.createCell(j);
                Object value = model.getValueAt(i, j);
                if (value instanceof String) {
                    cell.setCellValue((String) value);
                } else if (value instanceof Integer) {
                    cell.setCellValue((Integer) value);
                } else if (value instanceof Double) {
                    cell.setCellValue((Double) value);
                }
            }
        }

        try (FileOutputStream outputStream = new FileOutputStream("Reporte_Ventas.xlsx")) {
            workbook.write(outputStream);
            JOptionPane.showMessageDialog(this, "Reporte exportado exitosamente!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al exportar el reporte: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        LabelVendedor = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaReporte = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnNuevaVenta1 = new javax.swing.JButton();
        btnProveedor = new javax.swing.JButton();
        btnCliente = new javax.swing.JButton();
        btnProducto = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtFechaInicio = new javax.swing.JTextField();
        txtFechaFin = new javax.swing.JTextField();
        btnBuscar1 = new javax.swing.JButton();
        btnExportar = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(184, 231, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 204, 204));
        jLabel2.setForeground(new java.awt.Color(0, 204, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/LOGO OFC (1).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 220, 170));

        jLabel12.setFont(new java.awt.Font("SimSun-ExtB", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 153));
        jLabel12.setText("KAROL B'S SHOP");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, 20));

        LabelVendedor.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        LabelVendedor.setText("By Karol Fernandez");
        jPanel1.add(LabelVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));

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

        jPanel2.setBackground(new java.awt.Color(247, 209, 170));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel4.setText("FECHA INICIAL");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel5.setText("FECHA FIN");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, -1));

        tablaReporte.setBackground(new java.awt.Color(242, 242, 242));
        tablaReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DESCRIPCIÓN", "CANTIDAD", "PRECIO", "TOTAL"
            }
        ));
        jScrollPane1.setViewportView(tablaReporte);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 940, 210));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevaVenta1.setBackground(new java.awt.Color(204, 255, 153));
        btnNuevaVenta1.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        btnNuevaVenta1.setText("NUEVA VENTA");
        btnNuevaVenta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaVenta1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnNuevaVenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 14, 162, 58));

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
        jPanel3.add(btnCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 15, 144, 57));

        btnProducto.setBackground(new java.awt.Color(255, 204, 204));
        btnProducto.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        btnProducto.setText("PRODUCTO");
        btnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoActionPerformed(evt);
            }
        });
        jPanel3.add(btnProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 14, 156, 58));

        btnVentas.setBackground(new java.awt.Color(204, 255, 255));
        btnVentas.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        btnVentas.setText("DETALLE_VENTAS");
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });
        jPanel3.add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(803, 14, 180, 58));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 90));

        btnLimpiar.setFont(new java.awt.Font("SimSun-ExtB", 1, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(0, 51, 102));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/escoba (1).png"))); // NOI18N
        btnLimpiar.setText("LIMPIAR CAMPOS");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 180, 60));
        jPanel2.add(txtFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 142, 180, 50));
        jPanel2.add(txtFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 190, 50));

        btnBuscar1.setFont(new java.awt.Font("SimSun-ExtB", 1, 12)); // NOI18N
        btnBuscar1.setForeground(new java.awt.Color(0, 51, 102));
        btnBuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/verificar (1).png"))); // NOI18N
        btnBuscar1.setText("BUSCAR VENTAS");
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 190, 60));

        btnExportar.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        btnExportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/sobresalir (1).png"))); // NOI18N
        btnExportar.setText("EXCEL");
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });
        jPanel2.add(btnExportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, 160, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 150, -1, 510));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/TITT II (2).jpg"))); // NOI18N
        jLabel38.setText("jLabel38");
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 0, 1020, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevaVenta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaVenta1ActionPerformed
      frm_Ventas frmVentas = new frm_Ventas(cVenta, listaDetalles, mVenta);
     frmVentas.setVisible(true);
    }//GEN-LAST:event_btnNuevaVenta1ActionPerformed

    private void btnProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedorActionPerformed
       frm_RegistrarProveedor RProo = new frm_RegistrarProveedor();
                RProo.setVisible(true);
                 this.setVisible(false);       
    }//GEN-LAST:event_btnProveedorActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
       
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoActionPerformed
       
    }//GEN-LAST:event_btnProductoActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
       frm_DetalleVentas DV = new frm_DetalleVentas(cDetalleVenta, listaDetalles);
       DV.setVisible(true);
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
     
     limpiarCampos();
    
    
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
         try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            java.sql.Date fechaInicio = new java.sql.Date(sdf.parse(txtFechaInicio.getText()).getTime());
            java.sql.Date fechaFin = new java.sql.Date(sdf.parse(txtFechaFin.getText()).getTime());

            controlador.buscarVentasPorFechas(fechaInicio, fechaFin);
        } catch (ParseException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al buscar ventas: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscar1ActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
  ExportAExcel obj;
        try {
            obj = new ExportAExcel();
            obj.exportAExcel(tablaReporte);
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }

    }//GEN-LAST:event_btnExportarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
           java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_ReporteVenta().setVisible(true);
            }
           });
        
        }
                
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelVendedor;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnNuevaVenta1;
    private javax.swing.JButton btnProducto;
    private javax.swing.JButton btnProveedor;
    private javax.swing.JButton btnVentas;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaReporte;
    private javax.swing.JTextField txtFechaFin;
    private javax.swing.JTextField txtFechaInicio;
    // End of variables declaration//GEN-END:variables
}
