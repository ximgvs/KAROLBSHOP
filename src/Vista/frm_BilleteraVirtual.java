package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.JOptionPane;

public class frm_BilleteraVirtual extends javax.swing.JFrame {

    public frm_BilleteraVirtual() {
        initComponents();
    }

        
public String generarCodigoAprob() {
    Random random = new Random();
    StringBuilder codigo = new StringBuilder();
    for (int i = 0; i < 7; i++) {
        codigo.append(random.nextInt(10)); // Agrega un dígito aleatorio al código
    }
    return codigo.toString();
}

        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jtxtCod = new javax.swing.JLabel();
        jtxtCodigoAprob = new javax.swing.JTextField();
        jtxtNumTelef = new javax.swing.JTextField();
        jtxtTelefono = new javax.swing.JLabel();
        btnPagar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(201, 232, 169));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtCod.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jtxtCod.setForeground(new java.awt.Color(255, 255, 255));
        jtxtCod.setText("Codigo de aprobacion :");
        jPanel1.add(jtxtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));
        jPanel1.add(jtxtCodigoAprob, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 250, 50));

        jtxtNumTelef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNumTelefActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtNumTelef, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 250, 50));

        jtxtTelefono.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jtxtTelefono.setForeground(new java.awt.Color(255, 255, 255));
        jtxtTelefono.setText("Numero de telefono :");
        jPanel1.add(jtxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        btnPagar.setBackground(new java.awt.Color(204, 255, 51));
        btnPagar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnPagar.setForeground(new java.awt.Color(0, 51, 51));
        btnPagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/pago-movil (1).png"))); // NOI18N
        btnPagar.setText("PAGAR");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });
        jPanel1.add(btnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 150, 60));

        jPanel2.setBackground(new java.awt.Color(153, 255, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(204, 0, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("REGRESAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 100, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/telefono-movil (1).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/llamada-telefonica (1).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
  
        // Mostrar un mensaje de éxito de pago
        JOptionPane.showMessageDialog(null, "El pago fue realizado exitosamente.");
        // Aquí podrías agregar código adicional para procesar el pago, como enviar la información a un servidor, etc.
    

    }//GEN-LAST:event_btnPagarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        frm_Pagos frmPago = new frm_Pagos();
        frmPago.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jtxtNumTelefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNumTelefActionPerformed
         
jtxtNumTelef.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        // Obtener el texto del campo de texto del número de teléfono
        String numTelef = jtxtNumTelef.getText();
        
        // Verificar si el campo de texto del número de teléfono no está vacío
        if (!numTelef.isEmpty()) {
            // Generar un código aleatorio de 7 dígitos
            String codigoAprobAuto = generarCodigoAprob();
            
            // Establecer el código generado en el campo de texto del código de aprobación
            jtxtCodigoAprob.setText(codigoAprobAuto);
        }
    }
});

    }//GEN-LAST:event_jtxtNumTelefActionPerformed

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
            java.util.logging.Logger.getLogger(frm_BilleteraVirtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_BilleteraVirtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_BilleteraVirtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_BilleteraVirtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_BilleteraVirtual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jtxtCod;
    private javax.swing.JTextField jtxtCodigoAprob;
    private javax.swing.JTextField jtxtNumTelef;
    private javax.swing.JLabel jtxtTelefono;
    // End of variables declaration//GEN-END:variables
}
