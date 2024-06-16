package Vista;

import javax.swing.JOptionPane;


public class frm_Tarjeta extends javax.swing.JFrame {

    public frm_Tarjeta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtxtCVV = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtNum_Tarjeta = new javax.swing.JFormattedTextField();
        jtxtApellido = new javax.swing.JFormattedTextField();
        jtxtNumTarjeta = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtMM = new javax.swing.JFormattedTextField();
        jtxtCorreo = new javax.swing.JFormattedTextField();
        jtxtNombre = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(160, 207, 212));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CVV");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));
        jPanel1.add(jtxtCVV, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 140, 30));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellido");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MM/AA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));
        jPanel1.add(jtxtNum_Tarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 280, 30));
        jPanel1.add(jtxtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 130, 30));

        jtxtNumTarjeta.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jtxtNumTarjeta.setForeground(new java.awt.Color(255, 255, 255));
        jtxtNumTarjeta.setText("Numero de tarjeta");
        jPanel1.add(jtxtNumTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, 20));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Correo electronico");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));
        jPanel1.add(jtxtMM, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 140, 30));
        jPanel1.add(jtxtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 300, 30));
        jPanel1.add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 140, 30));

        jButton1.setBackground(new java.awt.Color(204, 255, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/tarjeta-de-debito (1).png"))); // NOI18N
        jButton1.setText("PAGAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 140, 60));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
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

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/usuario (1).png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/tarjeta-de-credito (1)_1.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       // BOTÓN PAGAR (Suponiendo que está dentro de un ActionListener asociado al botón de pago)

// Obtener el texto de todos los campos
String numTarjeta = jtxtNum_Tarjeta.getText();
String mesExpiracion = jtxtMM.getText();
String cvv = jtxtCVV.getText();
String nombre = jtxtNombre.getText();
String apellido = jtxtApellido.getText();
String correo = jtxtCorreo.getText();

// Verificar si algún campo está vacío
if (numTarjeta.isEmpty() || mesExpiracion.isEmpty() || cvv.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty()) {
    // Si algún campo está vacío, mostrar un mensaje indicando que todos los campos deben ser llenados
    JOptionPane.showMessageDialog(null, "Por favor, rellene todos los campos antes de proceder con el pago.");
} else {
    // Si todos los campos están llenos, asumir que el pago fue realizado exitosamente
    JOptionPane.showMessageDialog(null, "El pago fue realizado exitosamente.");
    // Aquí podrías agregar código adicional para procesar el pago, como enviar la información a un servidor, etc.
}

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       frm_Pagos frmPago = new frm_Pagos();
       frmPago.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(frm_Tarjeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Tarjeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Tarjeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Tarjeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Tarjeta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JFormattedTextField jtxtApellido;
    private javax.swing.JFormattedTextField jtxtCVV;
    private javax.swing.JFormattedTextField jtxtCorreo;
    private javax.swing.JFormattedTextField jtxtMM;
    private javax.swing.JFormattedTextField jtxtNombre;
    private javax.swing.JLabel jtxtNumTarjeta;
    private javax.swing.JFormattedTextField jtxtNum_Tarjeta;
    // End of variables declaration//GEN-END:variables
}
