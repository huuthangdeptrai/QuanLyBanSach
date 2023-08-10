/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlybansach;

import dao.Userdao;

/**
 *
 * @author Lenovo
 */
public class ChangePassword extends javax.swing.JFrame {
    
    public String userEmail;
    /**
     * Creates new form ChangePasswrod
     */
    public ChangePassword() {
        initComponents();
    }
     public ChangePassword(String email) {
        initComponents();
        userEmail = email;
        btnUpdate.setEnabled (false);
    }
      public void validateField(){
        String oldPassword  = txtOldPass.getText();
        String newPassword = txtNewpass.getText();
        String confirmPassword = txtConfirmpass.getText();
        if(!oldPassword.equals("") && !newPassword.equals("") && !confirmPassword.equals("") && newPassword.equals(confirmPassword)) {
            btnUpdate.setEnabled(true);
        }
        else
            btnUpdate.setEnabled(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtOldPass = new javax.swing.JTextField();
        txtNewpass = new javax.swing.JTextField();
        txtConfirmpass = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 134));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/change Password.png"))); // NOI18N
        jLabel1.setText("Change Password");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 22, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(848, 38, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Old Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 146, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("New Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Confirm Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 295, -1, -1));

        txtOldPass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtOldPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtOldPassKeyReleased(evt);
            }
        });
        getContentPane().add(txtOldPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 143, 308, -1));

        txtNewpass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtNewpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNewpassKeyReleased(evt);
            }
        });
        getContentPane().add(txtNewpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 217, 308, -1));

        txtConfirmpass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtConfirmpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConfirmpassKeyReleased(evt);
            }
        });
        getContentPane().add(txtConfirmpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 292, 308, -1));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/save.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 391, -1, -1));

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/clear.png"))); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 391, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/full-page-background.PNG"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtOldPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOldPassKeyReleased
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_txtOldPassKeyReleased

    private void txtNewpassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNewpassKeyReleased
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_txtNewpassKeyReleased

    private void txtConfirmpassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmpassKeyReleased
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_txtConfirmpassKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new ChangePassword(userEmail).setVisible(true);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String oldPassword =txtOldPass.getText();
        String newPassword = txtNewpass.getText();
        Userdao.changePassword(userEmail,oldPassword,newPassword);
        setVisible(false);
        new ChangePassword(userEmail).setVisible(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtConfirmpass;
    private javax.swing.JTextField txtNewpass;
    private javax.swing.JTextField txtOldPass;
    // End of variables declaration//GEN-END:variables
}