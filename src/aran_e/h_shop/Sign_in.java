/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aran_e.h_shop;

import java.awt.Color;
import java.sql.*;

import javax.swing.JOptionPane;

/**
 *
 * @author Abhishek
 */
public class Sign_in extends javax.swing.JFrame {

    /**
     * Creates new form Sign_in
     */
    public Sign_in() {
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
        jLabel17 = new javax.swing.JLabel();
        jLabelHome = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSignin = new javax.swing.JButton();
        jHint = new javax.swing.JButton();
        jLabelSignup = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel16 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aran_e/h_shop/Newpic-removebg-preview.png"))); // NOI18N

        jLabelHome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelHome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHome.setText("Back To Home");
        jLabelHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHomeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(323, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jLabelHome)
                .addGap(146, 146, 146))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabelHome)
                .addContainerGap(150, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 970, 178);

        jPanel3.setBackground(new java.awt.Color(102, 255, 102));

        jLabel2.setText("Username");

        jLabel3.setText("Password");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Sign In");

        jSignin.setText("Sign In");
        jSignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSigninActionPerformed(evt);
            }
        });

        jHint.setText("Hint");
        jHint.setToolTipText("Hint given only if username is correct");
        jHint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHintActionPerformed(evt);
            }
        });

        jLabelSignup.setText("Not signed up? Sign up here.");
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jSignin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jHint)
                                .addGap(0, 100, Short.MAX_VALUE))
                            .addComponent(jPasswordField1)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(jLabel4))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelSignup)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSignin)
                    .addComponent(jHint))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelSignup)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(240, 230, 340, 260);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/pokas.png"))); // NOI18N
        jPanel1.add(jLabel16);
        jLabel16.setBounds(0, 170, 1290, 660);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 839, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeMouseClicked
new main1().setVisible(true);
this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabelHomeMouseClicked

    private void jLabelSignupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSignupMouseEntered
jLabelSignup.setForeground(Color.BLUE);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelSignupMouseEntered

    private void jLabelSignupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSignupMouseExited
jLabelSignup.setForeground(Color.BLACK);          // TODO add your handling code here:
    }//GEN-LAST:event_jLabelSignupMouseExited

    private void jLabelSignupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSignupMouseClicked
this.setVisible(false);
new Sign_up().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jLabelSignupMouseClicked

    private void jSigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSigninActionPerformed
String passw= new String(jPasswordField1.getPassword());
        try{
            if(passw.equals("admin")&&jTextField1.getText().equals("admin")){
                this.setVisible(false);
                new admin_1().setVisible(true);
            }
          Class.forName("java.sql.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhielectronics","root","abhishek28");
          Statement stmt=con.createStatement();
          String query="Select count(*) from users where name='"+jTextField1.getText()+"';";
          ResultSet rs=stmt.executeQuery(query);
          rs.next();              
          int num=rs.getInt(1);
              if(num==1){
                  Statement stmt1=con.createStatement();
          String query1="Select * from users where name='"+jTextField1.getText()+"';";
          ResultSet rs1=stmt1.executeQuery(query1);
          rs1.next();
              String Name=rs1.getString(1);
              String pass=rs1.getString(2);
              if(Name.equals("admin")&&pass.equals("admin")){
                  
              }
             else if(Name.equals(jTextField1.getText())&&pass.equals(passw)){
                  JOptionPane.showMessageDialog(this,"Sign in Succesful");
                  Statement stmt2=con.createStatement();
          String query2="Update active set user='"+jTextField1.getText()+"';";
          stmt2.executeUpdate(query2);
          this.setVisible(false);
          new main1().setVisible(true);
                        }
              else
                  JOptionPane.showMessageDialog(this, "Wrong User name or Password");}
              else
                  JOptionPane.showMessageDialog(this, "Non existing user name. Please sign up");
          
}catch(Exception e){
                    JOptionPane.showMessageDialog(this, e);
}// TODO add your handling code here:
    }//GEN-LAST:event_jSigninActionPerformed

    private void jHintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHintActionPerformed
 try{
          Class.forName("java.sql.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhielectronics","root","abhishek28");
          Statement stmt=con.createStatement();
          String query="Select count(*) from users where name='"+jTextField1.getText()+"';";
          ResultSet rs=stmt.executeQuery(query);
          rs.next();              
          int num=rs.getInt(1);
              if(num==1){
                  Statement stmt1=con.createStatement();
          String query1="Select * from users where name='"+jTextField1.getText()+"';";
          ResultSet rs1=stmt1.executeQuery(query1);
          rs1.next();
              String Hint=rs1.getString(4);
              String name=rs1.getString(1);
              if(jTextField1.getText().equals(name))
              JOptionPane.showMessageDialog(this,"Password hint: "+Hint);
              else
              JOptionPane.showMessageDialog(this,"Enter correct user name for hint");
              }
 }
catch(Exception e){
       JOptionPane.showMessageDialog(this, e); }// TODO add your handling code here:
    }//GEN-LAST:event_jHintActionPerformed

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
            java.util.logging.Logger.getLogger(Sign_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sign_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sign_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sign_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sign_in().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jHint;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelHome;
    private javax.swing.JLabel jLabelSignup;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JButton jSignin;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
