/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mobile;

import Gaming.consoles1;
import Computers.*;
import Mobile.Samasung.*;
import aran_e.h_shop.main1;
import aran_e.h_shop.aboutus;
import java.sql.*;
import aran_e.h_shop.Checkout;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
/**
 *
 * @author Abhishek
 */
public class mobile1 extends javax.swing.JFrame {

    /**
     * Creates new form mobile1
     */
    public mobile1() {
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
        jPanel2 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabelAboutus = new javax.swing.JLabel();
        jLabelSignin = new javax.swing.JLabel();
        jLabelSignup = new javax.swing.JLabel();
        jLabelHome = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelAsus = new javax.swing.JLabel();
        jLabelNexus = new javax.swing.JLabel();
        jLabelIphone = new javax.swing.JLabel();
        jLabelMicrosoft = new javax.swing.JLabel();
        jLabelSamsung = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1054, 663));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        jComboBox1.setBackground(new java.awt.Color(0, 51, 51));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Categories", "Mobiles", "Computers", "Gaming Consoles" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabelAboutus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelAboutus.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAboutus.setText("About Us");
        jLabelAboutus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAboutusMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelAboutusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelAboutusMouseExited(evt);
            }
        });

        jLabelSignin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelSignin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSignin.setText("Sign In");
        jLabelSignin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSigninMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSigninMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSigninMouseExited(evt);
            }
        });

        jLabelSignup.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelSignup.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSignup.setText("Sign Up");
        jLabelSignup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSignupMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSignupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSignupMouseExited(evt);
            }
        });

        jLabelHome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelHome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHome.setText("Back to Home");
        jLabelHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHomeMouseClicked(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aran_e/h_shop/Newpic-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(jLabelSignin, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelAboutus, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabelHome)
                .addGap(31, 31, 31))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelHome)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSignin)
                    .addComponent(jLabelAboutus)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSignup))
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1060, 186);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Smart Phones");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(457, 192, 147, 29);

        jLabelAsus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/Asus_logo_small.png"))); // NOI18N
        jLabelAsus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAsusMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelAsus);
        jLabelAsus.setBounds(386, 277, 210, 129);

        jLabelNexus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/Nexus.jpe"))); // NOI18N
        jLabelNexus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelNexusMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelNexus);
        jLabelNexus.setBounds(682, 262, 240, 155);

        jLabelIphone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/Apple_iPhone_Logo_final.png"))); // NOI18N
        jLabelIphone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelIphoneMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelIphone);
        jLabelIphone.setBounds(226, 448, 240, 140);

        jLabelMicrosoft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/microsoft.png"))); // NOI18N
        jLabelMicrosoft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMicrosoftMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelMicrosoft);
        jLabelMicrosoft.setBounds(553, 471, 200, 100);

        jLabelSamsung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/Samsung-Logo1.jpg"))); // NOI18N
        jLabelSamsung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSamsungMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelSamsung);
        jLabelSamsung.setBounds(129, 277, 221, 129);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/pokas.png"))); // NOI18N
        jPanel1.add(jLabel16);
        jLabel16.setBounds(-150, 50, 1290, 660);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1054, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        switch(jComboBox1.getSelectedIndex()){
            case 1:
            new mobile1().setVisible(true);
            this.setVisible(false);break;
            case 2:
            new computer1().setVisible(true);
            this.setVisible(false);break;
            case 3:
            new consoles1().setVisible(true);
            this.setVisible(false);break;
            default:
        }// TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jLabelAboutusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAboutusMouseClicked
        new aboutus().setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelAboutusMouseClicked

    private void jLabelAboutusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAboutusMouseEntered
        jLabelAboutus.setText("_About_Us_");        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelAboutusMouseEntered

    private void jLabelAboutusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAboutusMouseExited
        jLabelAboutus.setText("About Us");        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelAboutusMouseExited

    private void jLabelSigninMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSigninMouseClicked
        new Sign_in().setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelSigninMouseClicked

    private void jLabelSigninMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSigninMouseEntered
        jLabelSignin.setText("_Sign_In_");        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelSigninMouseEntered

    private void jLabelSigninMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSigninMouseExited
        jLabelSignin.setText("Sign In");        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelSigninMouseExited

    private void jLabelSignupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSignupMouseClicked
        new Sign_up().setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelSignupMouseClicked

    private void jLabelSignupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSignupMouseEntered
        jLabelSignup.setText("_Sign_Up_");        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelSignupMouseEntered

    private void jLabelSignupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSignupMouseExited
        jLabelSignup.setText("Sign Up");        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelSignupMouseExited

    private void jLabelHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeMouseClicked
        new main1().setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabelHomeMouseClicked

    private void jLabelSamsungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSamsungMouseClicked
new SamsungM1().setVisible(true);
this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabelSamsungMouseClicked

    private void jLabelIphoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIphoneMouseClicked
new Iphone1().setVisible(true);
this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabelIphoneMouseClicked

    private void jLabelMicrosoftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMicrosoftMouseClicked
new Microsoft1().setVisible(true);
this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabelMicrosoftMouseClicked

    private void jLabelNexusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNexusMouseClicked
new Nexus1().setVisible(true);
this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabelNexusMouseClicked

    private void jLabelAsusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAsusMouseClicked
new Asus1().setVisible(true);
this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabelAsusMouseClicked

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
            java.util.logging.Logger.getLogger(mobile1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mobile1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mobile1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mobile1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mobile1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelAboutus;
    private javax.swing.JLabel jLabelAsus;
    private javax.swing.JLabel jLabelHome;
    private javax.swing.JLabel jLabelIphone;
    private javax.swing.JLabel jLabelMicrosoft;
    private javax.swing.JLabel jLabelNexus;
    private javax.swing.JLabel jLabelSamsung;
    private javax.swing.JLabel jLabelSignin;
    private javax.swing.JLabel jLabelSignup;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}