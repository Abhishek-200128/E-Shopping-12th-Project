/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mobile;
import aran_e.h_shop.main1;
import aran_e.h_shop.aboutus;
import java.sql.*;
import aran_e.h_shop.Checkout;
import Gaming.consoles1;
import Mobile.Samasung.*;
import Computers.computer1;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
/**
 *
 * @author Abhishek
 */
public class zen61 extends javax.swing.JFrame {

    /**
     * Creates new form zen61
     */
    public zen61() {
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

        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabelAboutus = new javax.swing.JLabel();
        jLabelSignin = new javax.swing.JLabel();
        jLabelSignup = new javax.swing.JLabel();
        jLabelHome = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabelBack = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jAdd = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Tech Specs");
        jPanel5.add(jLabel7);
        jLabel7.setBounds(430, 290, 89, 22);

        jPanel6.setBackground(new java.awt.Color(0, 51, 51));

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

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aran_e/h_shop/Newpic-removebg-preview.png"))); // NOI18N

        jLabelBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelBack.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBack.setText("Back");
        jLabelBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(jLabelSignin, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127)
                .addComponent(jLabelSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(jLabelAboutus, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jLabelHome)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelHome)
                    .addComponent(jLabelBack)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSignin)
                    .addComponent(jLabelAboutus)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSignup))
                .addContainerGap())
        );

        jPanel5.add(jPanel6);
        jPanel6.setBounds(0, 0, 1039, 190);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Zenfone 6");
        jPanel5.add(jLabel10);
        jLabel10.setBounds(490, 200, 270, 29);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mobile/zen6.jpg"))); // NOI18N
        jPanel5.add(jLabel4);
        jLabel4.setBounds(240, 280, 130, 260);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("NETWORK\tTechnology\t\nGSM / HSPA\nLAUNCH\tAnnounced\t2014, January\nStatus\tAvailable. Released 2014, May\nBODY\tDimensions\t166.9 x 84.3 x 9.9 mm (6.57 x 3.32 x 0.39 in)\nWeight\t196 g (6.91 oz)\nSIM\tDual SIM (Micro-SIM, dual stand-by)\nDISPLAY\tType\tIPS capacitive touchscreen, 16M colors\nSize\t6.0 inches (~70.5% screen-to-body ratio)\nResolution\t720 x 1280 pixels (~245 ppi pixel density)\nMultitouch\tYes\nProtection\tCorning Gorilla Glass 3\nPLATFORM\tOS\tAndroid OS, v4.3 (Jelly Bean), upgradable to v5.0.2 (Lollipop)\nChipset\tIntel Atom Z2580\nCPU\tDual-core 2.0 GHz\nGPU\tPowerVR SGX544MP2\nMEMORY\tCard slot\tmicroSD, up to 64 GB (dedicated slot)\nInternal\t16/32 GB, 2 GB RAM\nCAMERA\tPrimary\t13 MP, f/2.0, autofocus, LED flash\nFeatures\tGeo-tagging, touch focus, face detection, panorama\nVideo\t1080p@30fps\nSecondary\t2 MP\nSOUND\tAlert types\tVibration; MP3, WAV ringtones\nLoudspeaker\tYes\n3.5mm jack\tYes\nCOMMS\tWLAN\tWi-Fi 802.11 b/g/n, Wi-Fi Direct, hotspot\nBluetooth\tv4.0, A2DP, EDR\nGPS\tYes, with A-GPS\nRadio\tNo\nUSB\tmicroUSB v2.0\nFEATURES\tSensors\tAccelerometer, gyro, proximity, compass\nMessaging\tSMS(threaded view), MMS, Email, Push Email, IM\nBrowser\tHTML\nJava\tNo\n \t- MP3/WAV/eAAC+ player\n- MP4/H.264 player\n- Document viewer\n- Photo viewer/editor\n- Voice memo/dial\nBATTERY\t \tNon-removable Li-Po 3300 mAh battery (12 Wh)\nStand-by\tUp to 398 h (3G)\nTalk time\tUp to 28 h (3G)");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(430, 320, 436, 221);

        jAdd.setText("Add to Cart");
        jAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddActionPerformed(evt);
            }
        });
        jPanel5.add(jAdd);
        jAdd.setBounds(749, 560, 110, 23);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("Price:");
        jPanel5.add(jLabel8);
        jLabel8.setBounds(240, 560, 41, 16);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("Rs 12000");
        jPanel5.add(jLabel9);
        jLabel9.setBounds(290, 560, 80, 20);

        jLabel11.setText("Quantity");
        jPanel5.add(jLabel11);
        jLabel11.setBounds(610, 270, 50, 14);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        jPanel5.add(jComboBox2);
        jComboBox2.setBounds(670, 270, 130, 20);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/pokas.png"))); // NOI18N
        jPanel5.add(jLabel16);
        jLabel16.setBounds(0, 170, 1290, 660);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1038, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        jLabelAboutus.setText(" About_Us");        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelAboutusMouseEntered

    private void jLabelAboutusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAboutusMouseExited
        jLabelAboutus.setText("About Us");        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelAboutusMouseExited

    private void jLabelSigninMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSigninMouseClicked
        new Sign_in().setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelSigninMouseClicked

    private void jLabelSigninMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSigninMouseEntered
        jLabelSignin.setText(" Sign_In");        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelSigninMouseEntered

    private void jLabelSigninMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSigninMouseExited
        jLabelSignin.setText("Sign In");        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelSigninMouseExited

    private void jLabelSignupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSignupMouseClicked
        new Sign_up().setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelSignupMouseClicked

    private void jLabelSignupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSignupMouseEntered
        jLabelSignup.setText(" Sign_Up");        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelSignupMouseEntered

    private void jLabelSignupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSignupMouseExited
        jLabelSignup.setText("Sign Up");        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelSignupMouseExited

    private void jLabelHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeMouseClicked
        new main1().setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabelHomeMouseClicked

    private void jLabelBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBackMouseClicked
        this.setVisible(false);
        new Asus1().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jLabelBackMouseClicked

    private void jAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddActionPerformed
        try{
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhielectronics","root","abhishek28");
            Statement stmt=con.createStatement();
            String query="Select * from active;";
            ResultSet rs=stmt.executeQuery(query);
            rs.next();
            String user=rs.getString(1);
            if(user.equals("No"))
            new Sign_in().setVisible(true);
            else{
                UIManager.put("OptionPane.noButtonText", "Continue shopping");
                int a=  JOptionPane.showConfirmDialog(this,"Do you want to proceed to checkout");
                int i;
                Statement stmt1=con.createStatement();
                String query1="Select count(*) from products;";
                ResultSet rs1=stmt1.executeQuery(query1);
                rs1.next();
                int num=rs1.getInt(1);
                i=num+1;
                int quan=Integer.parseInt((String)jComboBox2.getSelectedItem());

                if(a==JOptionPane.YES_OPTION){
                    Statement stmt2=con.createStatement();
                    String query2="insert into products values("+i+",'Zenfone 6',"+quan*12000+",'"+user+"',"+quan+");";
                    stmt2.executeUpdate(query2);
                    new Checkout().setVisible(true);
                    this.setVisible(false);

                }
                if(a==JOptionPane.NO_OPTION){
                    new main1().setVisible(true);
                    this.setVisible(false);
                    Statement stmt2=con.createStatement();
                    String query2="insert into products values("+i+",'Zenfone 6',"+quan*12000+",'"+user+"',"+quan+");";
                    stmt2.executeUpdate(query2);}
                if(a==JOptionPane.CANCEL_OPTION){
                    this.setVisible(true);}
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e);}
        // TODO add your handling code here:
    }//GEN-LAST:event_jAddActionPerformed

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
            java.util.logging.Logger.getLogger(zen61.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(zen61.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(zen61.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(zen61.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new zen61().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAdd;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAboutus;
    private javax.swing.JLabel jLabelBack;
    private javax.swing.JLabel jLabelHome;
    private javax.swing.JLabel jLabelSignin;
    private javax.swing.JLabel jLabelSignup;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}