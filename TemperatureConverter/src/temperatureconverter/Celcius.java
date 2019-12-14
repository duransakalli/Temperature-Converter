/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatureconverter;

/**
 *
 * @author Duran
 */
public class Celcius extends javax.swing.JFrame {

    /**
     * Creates new form Celcius
     */
    public Celcius() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonCel = new javax.swing.JButton();
        jLabelHead = new javax.swing.JLabel();
        jLabelCelciusHead = new javax.swing.JLabel();
        jLabelFahHead = new javax.swing.JLabel();
        jButtonFah = new javax.swing.JButton();
        jTextCelcius = new javax.swing.JTextField();
        jTextFah = new javax.swing.JTextField();
        jLabelCel1 = new javax.swing.JLabel();
        jLabelCel2 = new javax.swing.JLabel();
        jLabelFah1 = new javax.swing.JLabel();
        jLabelFah2 = new javax.swing.JLabel();
        jLabelKel1 = new javax.swing.JLabel();
        jLabelKel2 = new javax.swing.JLabel();
        jLabelRea1 = new javax.swing.JLabel();
        jLabelRea2 = new javax.swing.JLabel();
        jButtonReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setForeground(new java.awt.Color(0, 204, 204));

        jButtonCel.setBackground(new java.awt.Color(204, 204, 255));
        jButtonCel.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jButtonCel.setText("Convert");
        jButtonCel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCelActionPerformed(evt);
            }
        });

        jLabelHead.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabelHead.setText("Temperature Converter");

        jLabelCelciusHead.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabelCelciusHead.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCelciusHead.setText("Celcius");

        jLabelFahHead.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabelFahHead.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFahHead.setText("Fahrenheit");

        jButtonFah.setBackground(new java.awt.Color(204, 204, 255));
        jButtonFah.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jButtonFah.setText("Convert");
        jButtonFah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFahActionPerformed(evt);
            }
        });

        jTextCelcius.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jTextCelcius.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextCelcius.setText("0");
        jTextCelcius.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextCelcius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCelciusActionPerformed(evt);
            }
        });

        jTextFah.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jTextFah.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFah.setText("0");
        jTextFah.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextFah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFahActionPerformed(evt);
            }
        });

        jLabelCel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabelCel1.setText("Celcius");

        jLabelCel2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabelCel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCel2.setText("0");
        jLabelCel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabelCel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelFah1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabelFah1.setText("Fahrenheit");

        jLabelFah2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabelFah2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFah2.setText("0");
        jLabelFah2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabelFah2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelKel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabelKel1.setText("Kelvin");

        jLabelKel2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabelKel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelKel2.setText("0");
        jLabelKel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabelKel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelRea1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabelRea1.setText("Reaumur");

        jLabelRea2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabelRea2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRea2.setText("0");
        jLabelRea2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabelRea2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButtonReset.setBackground(new java.awt.Color(204, 204, 255));
        jButtonReset.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jButtonReset.setText("RESET");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jLabelCelciusHead)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonCel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextCelcius, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(250, 250, 250)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelFahHead)
                    .addComponent(jTextFah, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(jButtonFah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(338, 338, 338))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(258, 258, 258)
                                .addComponent(jLabelFah2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(135, 135, 135)
                                .addComponent(jLabelKel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(111, 111, 111)
                        .addComponent(jLabelRea2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelCel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelFah1)
                        .addGap(113, 113, 113)
                        .addComponent(jLabelKel1)
                        .addGap(106, 106, 106)
                        .addComponent(jLabelRea1)
                        .addGap(172, 172, 172))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(jLabelHead))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(458, 458, 458)
                        .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelHead, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCelciusHead)
                    .addComponent(jLabelFahHead))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextCelcius, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFah, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFah, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(138, 138, 138)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCel1)
                    .addComponent(jLabelFah1)
                    .addComponent(jLabelKel1)
                    .addComponent(jLabelRea1))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFah2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelKel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRea2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jButtonReset)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCelActionPerformed
        double iCelcius = Double.parseDouble(jTextCelcius.getText());
        
        double REScel = iCelcius;
        double RESfah = (iCelcius * 1.8)+ 32;
        double RESkel = iCelcius + 273.15;
        double RESrea = iCelcius * 0.8;
                
        jLabelCel2.setText(String.format("%.2f", REScel));
        jLabelFah2.setText(String.format("%.2f", RESfah));
        jLabelKel2.setText(String.format("%.2f", RESkel));
        jLabelRea2.setText(String.format("%.2f", RESrea));
        
        jTextFah.setText(null);
    }//GEN-LAST:event_jButtonCelActionPerformed

    private void jTextCelciusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCelciusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCelciusActionPerformed

    private void jButtonFahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFahActionPerformed
       double iFahren = Double.parseDouble(jTextFah.getText());
       
        double REScel = (iFahren - 32) / 1.8;
        double RESfah = iFahren;
        double RESkel = (iFahren + 459.67) / 1.8;
        double RESrea = (iFahren - 32) / 2.25;
        
        jLabelCel2.setText(String.format("%.2f", REScel));
        jLabelFah2.setText(String.format("%.2f", RESfah));
        jLabelKel2.setText(String.format("%.2f", RESkel));
        jLabelRea2.setText(String.format("%.2f", RESrea));
        
        jTextCelcius.setText(null);
    }//GEN-LAST:event_jButtonFahActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        jLabelCel2.setText(null);
        jLabelCel2.setOpaque(true);
        jLabelCel2.setBackground(null);
        
        jLabelFah2.setText(null);
        jLabelFah2.setOpaque(true);
        jLabelFah2.setBackground(null);
        
        jLabelKel2.setText(null);
        jLabelKel2.setOpaque(true);
        jLabelKel2.setBackground(null);
        
        jLabelRea2.setText(null);
        jLabelRea2.setOpaque(true);
        jLabelRea2.setBackground(null);
        
        jTextCelcius.setText(null);
        jTextFah.setText(null);
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jTextFahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFahActionPerformed

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
            java.util.logging.Logger.getLogger(Celcius.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Celcius.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Celcius.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Celcius.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Celcius().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCel;
    private javax.swing.JButton jButtonFah;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JLabel jLabelCel1;
    private javax.swing.JLabel jLabelCel2;
    private javax.swing.JLabel jLabelCelciusHead;
    private javax.swing.JLabel jLabelFah1;
    private javax.swing.JLabel jLabelFah2;
    private javax.swing.JLabel jLabelFahHead;
    private javax.swing.JLabel jLabelHead;
    private javax.swing.JLabel jLabelKel1;
    private javax.swing.JLabel jLabelKel2;
    private javax.swing.JLabel jLabelRea1;
    private javax.swing.JLabel jLabelRea2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextCelcius;
    private javax.swing.JTextField jTextFah;
    // End of variables declaration//GEN-END:variables
}
