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
public class i71 extends javax.swing.JFrame {

    /**
     * Creates new form i71
     */
    public i71() {
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
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSignin)
                    .addComponent(jLabelAboutus)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSignup))
                .addContainerGap())
        );

        jPanel5.add(jPanel6);
        jPanel6.setBounds(0, 0, 1039, 180);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("iPhone 7 ");
        jPanel5.add(jLabel10);
        jLabel10.setBounds(490, 200, 270, 29);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mobile/i7big.jpg"))); // NOI18N
        jPanel5.add(jLabel4);
        jLabel4.setBounds(240, 280, 130, 260);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("NETWORK\tTechnology\t\nGSM / CDMA / HSPA / EVDO / LTE\nLAUNCH\tAnnounced\t2016, September\nStatus\tAvailable. Released 2016, September\nBODY\tDimensions\t138.3 x 67.1 x 7.1 mm (5.44 x 2.64 x 0.28 in)\nWeight\t138 g (4.87 oz)\nSIM\tNano-SIM\n \t- IP67 certified - dust and water resistant\n- Water resistant up to 1 meter and 30 minutes\n- Apple Pay (Visa, MasterCard, AMEX certified)\nDISPLAY\tType\tLED-backlit IPS LCD, capacitive touchscreen, 16M colors\nSize\t4.7 inches (~65.6% screen-to-body ratio)\nResolution\t750 x 1334 pixels (~326 ppi pixel density)\nMultitouch\tYes\nProtection\tIon-strengthened glass, oleophobic coating\n \t- Wide color gamut display\n- 3D Touch display & home button\n- Display Zoom\nPLATFORM\tOS\tiOS 10.0.1, upgradable to iOS 10.1\nChipset\tApple A10 Fusion\nCPU\tQuad-core\nGPU\t(six-core graphics)\nMEMORY\tCard slot\tNo\nInternal\t32/128/256 GB, GB, 2 GB RAM\nCAMERA\tPrimary\t12 MP, f/1.8, 28mm, phase detection autofocus, OIS, quad-LED (dual tone) flash, check quality\nFeatures\t1/3\" sensor size, geo-tagging, simultaneous 4K video and 8MP image recording, touch focus, face/smile detection, HDR (photo/panorama)\nVideo\t2160p@30fps, 1080p@30/60/120fps, 720p@240fps, check quality\nSecondary\t7 MP, f/2.2, 32mm, 1080p@30fps, 720p@240fps, face detection, HDR, panorama\nSOUND\tAlert types\tVibration, proprietary ringtones\nLoudspeaker\tYes, with stereo speakers\n3.5mm jack\tNo\n \t- Active noise cancellation with dedicated mic\n- Lightning to 3.5 mm headphone jack adapter incl.\nCOMMS\tWLAN\tWi-Fi 802.11 a/b/g/n/ac, dual-band, hotspot\nBluetooth\tv4.2, A2DP, LE\nGPS\tYes, with A-GPS, GLONASS\nNFC\tYes (Apple Pay only)\nRadio\tNo\nUSB\tv2.0, reversible connector\nFEATURES\tSensors\tFingerprint, accelerometer, gyro, proximity, compass, barometer\nMessaging\tiMessage, SMS (threaded view), MMS, Email, Push Email\nBrowser\tHTML5 (Safari)\nJava\tNo\n \t- Siri natural language commands and dictation\n- iCloud cloud service\n- MP3/WAV/AAX+/AIFF/Apple Lossless player\n- MP4/H.264 player\n- Audio/video/photo editor\n- Document editor\nBATTERY\t \tNon-removable Li-Ion 1960 mAh battery (7.45 Wh)\nTalk time\tUp to 14 h (3G)\nMusic play\tUp to 40 h\nMISC\tColors\tJet Black, Black, Silver, Gold, Rose Gold\nSAR US\t1.19 W/kg (head)     1.19 W/kg (body)    \nSAR EU\t1.38 W/kg (head)     1.34 W/kg (body)    \nPrice group\t9/10\nTESTS\tPerformance\tBasemark OS II 2.0: 3416\nDisplay\tContrast ratio: 1603:1 (nominal), 3.964 (sunlight)\nCamera\tPhoto / Video\nLoudspeaker\tVoice 67dB / Noise 73dB / Ring 75dB\nAudio quality\tNoise -92.4dB / Crosstalk -80.9dB\nBattery life\t\nEndurance rating 61h");
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
        jLabel9.setText("Rs 45000");
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
        new Iphone1().setVisible(true);// TODO add your handling code here:
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
                    String query2="insert into products values("+i+",'iPhone 7',"+quan*45000+",'"+user+"',"+quan+");";
                    stmt2.executeUpdate(query2);
                    new Checkout().setVisible(true);
                    this.setVisible(false);

                }
                if(a==JOptionPane.NO_OPTION){
                    new main1().setVisible(true);
                    this.setVisible(false);
                    Statement stmt2=con.createStatement();
                    String query2="insert into products values("+i+",'iPhone 7',"+quan*45000+",'"+user+"',"+quan+");";
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
            java.util.logging.Logger.getLogger(i71.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(i71.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(i71.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(i71.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new i71().setVisible(true);
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
