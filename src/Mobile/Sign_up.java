/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mobile;

import aran_e.h_shop.*;
import java.sql.*;

import javax.swing.JOptionPane;

/**
 *
 * @author Abhishek
 */
public class Sign_up extends javax.swing.JFrame {

    /**
     * Creates new form Sign_up
     */
    public Sign_up() {
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
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSignup = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                .addContainerGap(319, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123)
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

        jLabel2.setText("User Name");

        jLabel3.setText("Password");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Sign Up");

        jLabel7.setText("Phone No.");

        jSignup.setText("Sign Up");
        jSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSignupActionPerformed(evt);
            }
        });

        jLabel8.setText("Password hint");

        jLabel1.setText("Confirm Password");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel4)
                        .addGap(0, 166, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1)
                            .addComponent(jPasswordField1)
                            .addComponent(jPasswordField2)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jSignup)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField4))))
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
                    .addComponent(jLabel1)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSignup)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(240, 210, 390, 340);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSignupActionPerformed
String a=new String(jPasswordField1.getPassword());
String b=new String(jPasswordField2.getPassword());

        try{
            String c=jTextField4.getText();
            
   Class.forName("java.sql.Driver");
     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhielectronics","root","abhishek28");
         Statement stmt=con.createStatement();
         String query="SELECT count(*) From users where name='"+jTextField1.getText()+"';";
         ResultSet rs=stmt.executeQuery(query);
         while(rs.next()){
                 int Roll=rs.getInt(1);
                 if(c.contains("1")||c.contains("2")||c.contains("3")||c.contains("4")||c.contains("5")||c.contains("6")||c.contains("7")||c.contains("8")||c.contains("9")||c.contains("0")){
                 if(a.equals(b)){
                 if(jTextField1.getText().equals("")||jPasswordField2.getPassword().equals("")||jPasswordField1.getPassword().equals("")||jTextField4.getText().equals("")||jTextField5.getText().equals(""))
                     JOptionPane.showMessageDialog(this,"Please fill in all fields");
                 else{
                 if(Roll==0){
                  Statement stmt1=con.createStatement();
         String query1="insert into users values('"+jTextField1.getText()+"','"+a+"','"+c+"','"+jTextField5.getText()+"');";
        stmt1.executeUpdate(query1);
        JOptionPane.showMessageDialog(this,"Sign up successful");
        jTextField1.setText("");
        jPasswordField2.setText("");
        jPasswordField1.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        this.setVisible(false);
        new Sign_in().setVisible(true);
                 }
                 
                 else
                     JOptionPane.showMessageDialog(this,"User name exists");}}
                 else
                     JOptionPane.showMessageDialog(this,"Both passwords do not match");}
                 else
                     JOptionPane.showMessageDialog(this,"Enter Proper Number");
         }}catch(Exception e){
    JOptionPane.showMessageDialog(this, "Please enter proper phone number");
         }        // TODO add your handling code here:
    }//GEN-LAST:event_jSignupActionPerformed

    private void jLabelHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeMouseClicked
new main1().setVisible(true);
this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelHomeMouseClicked

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
            java.util.logging.Logger.getLogger(Sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sign_up().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelHome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JButton jSignup;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
