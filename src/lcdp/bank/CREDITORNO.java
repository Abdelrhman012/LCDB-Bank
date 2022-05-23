/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lcdp.bank;

import java.awt.event.WindowEvent;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import static lcdp.bank.Bank.b;
import static lcdp.bank.WITHDRAWPAGE.WDAMOUNT;

/**
 *
 * @author as
 */
public class CREDITORNO extends javax.swing.JFrame {

    /**
     * Creates new form CREDITORNO
     */
    public CREDITORNO() {
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
        NO = new javax.swing.JButton();
        YOURCREDIT = new javax.swing.JTextField();
        WITHDRAWFROMCREDIT = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        NO.setBackground(new java.awt.Color(85, 5, 14));
        NO.setFont(new java.awt.Font("Compacta BT", 0, 24)); // NOI18N
        NO.setForeground(new java.awt.Color(255, 255, 255));
        NO.setText("NO THANKS");
        NO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOActionPerformed(evt);
            }
        });
        jPanel1.add(NO);
        NO.setBounds(450, 310, 250, 40);

        YOURCREDIT.setEditable(false);
        YOURCREDIT.setFont(new java.awt.Font("Compacta BT", 0, 18)); // NOI18N
        YOURCREDIT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        YOURCREDIT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(85, 5, 14), 4));
        YOURCREDIT.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        YOURCREDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YOURCREDITActionPerformed(evt);
            }
        });
        jPanel1.add(YOURCREDIT);
        YOURCREDIT.setBounds(160, 290, 190, 40);

        WITHDRAWFROMCREDIT.setBackground(new java.awt.Color(85, 5, 14));
        WITHDRAWFROMCREDIT.setFont(new java.awt.Font("Compacta BT", 0, 24)); // NOI18N
        WITHDRAWFROMCREDIT.setForeground(new java.awt.Color(255, 255, 255));
        WITHDRAWFROMCREDIT.setText("WITHDRAW FROM CREDIT");
        WITHDRAWFROMCREDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WITHDRAWFROMCREDITActionPerformed(evt);
            }
        });
        jPanel1.add(WITHDRAWFROMCREDIT);
        WITHDRAWFROMCREDIT.setBounds(450, 260, 250, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lcdp/bank/CREDITORNO.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 770, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOActionPerformed
        try {
            new WITHDRAWPAGE().setVisible(true);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(CREDITORNO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        b[Bank.i].setDailylimit(-Bank.gooo);
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
       
    }//GEN-LAST:event_NOActionPerformed

    private void YOURCREDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YOURCREDITActionPerformed

    }//GEN-LAST:event_YOURCREDITActionPerformed

    private void WITHDRAWFROMCREDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WITHDRAWFROMCREDITActionPerformed
        int def = (Bank.gooo-b[Bank.i].checkBalance());
        if (b[Bank.i].getCreditamount() < def ){
            b[Bank.i].setDailylimit(-Bank.gooo);
            LIMIT lim = new LIMIT();
            lim.setVisible(true);
              this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
              
              
        }
        else {
        b[Bank.i].draw((Bank.gooo-def));
        b[Bank.i].drawCredit(def);
        b[Bank.i].setDailylimit(-def);
         Bank.gooo = 0;
         REPAY REP = new REPAY();
         REP.TIMEREPAY.setText(b[Bank.i].getPeriod());
         REP.setVisible(true);
         this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
      
        }
       
    }//GEN-LAST:event_WITHDRAWFROMCREDITActionPerformed

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
            java.util.logging.Logger.getLogger(CREDITORNO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CREDITORNO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CREDITORNO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CREDITORNO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CREDITORNO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NO;
    private javax.swing.JButton WITHDRAWFROMCREDIT;
    public static javax.swing.JTextField YOURCREDIT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
