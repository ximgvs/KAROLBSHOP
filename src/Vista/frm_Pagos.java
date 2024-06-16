package Vista;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.properties.TextAlignment;
import static com.itextpdf.svg.SvgConstants.Tags.IMAGE;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;

public class frm_Pagos extends JFrame {

    public frm_Pagos() 
    {
       initComponents();
     jbtnPagar.addActionListener(new ActionListener() {
    @Override
      public void actionPerformed(ActionEvent e) {
                if (jrbTarjeta.isSelected()) {
                    // Si se seleccionó la opción de tarjetas, abre el formulario de tarjetas
                    frm_Tarjeta tarjetaForm = new frm_Tarjeta();
                    tarjetaForm.setVisible(true);
                } else if (jrbBilleteras.isSelected()) {
                    // Si se seleccionó la opción de billeteras, abre el formulario de billetera virtual
                    frm_BilleteraVirtual billeteraForm = new frm_BilleteraVirtual();
                    billeteraForm.setVisible(true);
                } else {
                    // Si no se seleccionó ninguna opción, muestra un mensaje para ingresar efectivo
                    try {
                        String input = JOptionPane.showInputDialog(null, "Ingrese el monto de efectivo recibido:");
                        if (input != null && !input.isEmpty()) {
                            double efectivoRecibido = Double.parseDouble(input);
                            double totalAPagar = Double.parseDouble(txtTotal.getText());
                            double vuelto = efectivoRecibido - totalAPagar;

                            if (vuelto < 0) {
                                JOptionPane.showMessageDialog(null, "El monto recibido es insuficiente para cubrir el pago.");
                            } else {
                                JOptionPane.showMessageDialog(null, "El vuelto es: " + vuelto);
                                JOptionPane.showMessageDialog(null, "Pago completado.");
                                
                                // Generar el comprobante en PDF
                                generatePdf(totalAPagar, efectivoRecibido, vuelto);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Por favor, ingrese un monto válido.");
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Por favor, ingrese un monto válido.");
                    }
                }
            }
        });
     }
     
      private void generatePdf(double totalAPagar, double efectivoRecibido, double vuelto) {
        String pdfPath = "comprobante_pago.pdf";
        try {
            PdfWriter writer = new PdfWriter(pdfPath);
            com.itextpdf.kernel.pdf.PdfDocument pdf = new com.itextpdf.kernel.pdf.PdfDocument(writer);
            Document document = new Document(pdf);

            document.add(new Paragraph("Comprobante de Pago"));
            document.add(new Paragraph("Total a Pagar: " + totalAPagar));
            document.add(new Paragraph("Efectivo Recibido: " + efectivoRecibido));
            document.add(new Paragraph("Vuelto: " + vuelto));
            document.add(new Paragraph("Pago completado con éxito."));

            document.close();
            
            JOptionPane.showMessageDialog(null, "Comprobante de pago generado: " + new File(pdfPath).getAbsolutePath());
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error al generar el comprobante: " + e.getMessage());
        }
    }
      
       public void createPdf(String dest) throws IOException {
        PdfDocument pdf = new PdfDocument(new PdfWriter(dest));
        Document document = new Document(pdf);
        
        // Agregar imagen del logo
        ImageData imageData = ImageDataFactory.create(IMAGE);
        Image image = new Image(imageData);
        document.add(image);

        // Agregar fecha y hora
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String formattedDate = dateFormat.format(date);
        
        Paragraph paragraph = new Paragraph("Fecha y hora: " + formattedDate)
                .setFont(PdfFontFactory.createFont())
                .setTextAlignment(TextAlignment.RIGHT)
                .setMarginTop(10);
        document.add(paragraph);

        // Agregar contenido adicional aquí

        document.close();
    }

      
    
                
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jbtnPagar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jrbTarjeta = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jrbBilleteras = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();

        jFormattedTextField1.setText("jFormattedTextField1");

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SimSun-ExtB", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("VERIFIQUE EL PAGO A REALIZAR! ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 610, 30));

        jLabel2.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        jLabel2.setText("Total a pagar:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 130, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 204, 0));
        jLabel3.setText("SELECCIONE EL MEDIO DE PAGO :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        jPanel2.setBackground(new java.awt.Color(231, 231, 167));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 20));

        jbtnPagar.setBackground(new java.awt.Color(204, 255, 153));
        jbtnPagar.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jbtnPagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/pago (2).png"))); // NOI18N
        jbtnPagar.setText("PAGAR");
        jPanel1.add(jbtnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 180, 60));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Tarjetas - Billeteras Virtuales"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/mastercard (1).png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 90, 60));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/visa.png"))); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 90, 60));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/mastercard (1).png"))); // NOI18N
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        buttonGroup1.add(jrbTarjeta);
        jrbTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbTarjetaActionPerformed(evt);
            }
        });
        jPanel3.add(jrbTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/tunki.png"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 70, -1));

        buttonGroup1.add(jrbBilleteras);
        jrbBilleteras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbBilleterasActionPerformed(evt);
            }
        });
        jPanel3.add(jrbBilleteras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/plin.png"))); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/yape.png"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 80, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 320, 160));

        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 290, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 570, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbTarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbTarjetaActionPerformed

    private void jrbBilleterasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbBilleterasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbBilleterasActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
     
    }//GEN-LAST:event_txtTotalActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new frm_Pagos().setVisible(true);
        });
    
    }
    // No es necesario declarar este método si ya está generado por NetBeans u otra herramienta similar
    

        


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbtnPagar;
    private javax.swing.JRadioButton jrbBilleteras;
    private javax.swing.JRadioButton jrbTarjeta;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
        
          }
        
        
        
