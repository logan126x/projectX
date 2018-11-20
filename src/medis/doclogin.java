/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medis;

import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author KHSCI5MCA16126
 */
public class doclogin extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    /**
     * Creates new form doclogin
     */
    public doclogin() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backPanel = new javax.swing.JPanel();
        doctorPanel = new javax.swing.JPanel();
        doctorLogin = new javax.swing.JLabel();
        doctorBG = new javax.swing.JLabel();
        login = new javax.swing.JLabel();
        doctorIDLabel = new javax.swing.JLabel();
        doctorId = new javax.swing.JTextField();
        passwoedLabel = new javax.swing.JLabel();
        doctorPassword = new javax.swing.JPasswordField();
        doc_login = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        loginBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        backPanel.setBackground(new java.awt.Color(255, 255, 255));
        backPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 0), 2, true));
        backPanel.setPreferredSize(new java.awt.Dimension(300, 500));
        backPanel.setLayout(null);

        doctorPanel.setBackground(new java.awt.Color(0, 102, 51));
        doctorPanel.setPreferredSize(new java.awt.Dimension(300, 500));
        doctorPanel.setLayout(null);

        doctorLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        doctorLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medis/icons/login-doctor.png"))); // NOI18N
        doctorPanel.add(doctorLogin);
        doctorLogin.setBounds(30, 80, 245, 211);

        doctorBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medis/icons/dialo_background.jpg"))); // NOI18N
        doctorBG.setText("jLabel3");
        doctorPanel.add(doctorBG);
        doctorBG.setBounds(0, 0, 300, 400);

        backPanel.add(doctorPanel);
        doctorPanel.setBounds(0, 0, 300, 400);

        login.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login.setText("Login");
        backPanel.add(login);
        login.setBounds(300, 40, 300, 50);

        doctorIDLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        doctorIDLabel.setText("Doctor ID");
        backPanel.add(doctorIDLabel);
        doctorIDLabel.setBounds(330, 110, 110, 30);

        doctorId.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        doctorId.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 0), 2, true));
        backPanel.add(doctorId);
        doctorId.setBounds(330, 140, 190, 40);

        passwoedLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        passwoedLabel.setText("Password");
        backPanel.add(passwoedLabel);
        passwoedLabel.setBounds(330, 210, 140, 30);

        doctorPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 0), 2, true));
        backPanel.add(doctorPassword);
        doctorPassword.setBounds(330, 240, 190, 40);

        doc_login.setBackground(new java.awt.Color(204, 204, 255));
        doc_login.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        doc_login.setText("Login");
        doc_login.setBorder(null);
        doc_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doc_loginActionPerformed(evt);
            }
        });
        backPanel.add(doc_login);
        doc_login.setBounds(390, 310, 90, 40);

        closeBtn.setBackground(new java.awt.Color(255, 0, 0));
        closeBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        closeBtn.setForeground(new java.awt.Color(255, 255, 255));
        closeBtn.setText("X");
        closeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_button(evt);
            }
        });
        backPanel.add(closeBtn);
        closeBtn.setBounds(560, 0, 40, 20);

        loginBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medis/icons/dialo_background.jpg"))); // NOI18N
        loginBG.setText("jLabel2");
        backPanel.add(loginBG);
        loginBG.setBounds(300, 0, 300, 400);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(600, 397));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void close_button(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_button
        dispose();
    }//GEN-LAST:event_close_button

    private void doc_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doc_loginActionPerformed

        con=my_sql_connect.connectdb();
        String sq="Select * from doctor where DocID = ?";
        
        String doc_id=doctorId.getText().toLowerCase();
        String doc_password= String.copyValueOf(doctorPassword.getPassword());     
                              
            try
            {
                pst=con.prepareStatement(sq);
                pst.setString(1,doc_id);
                rs=pst.executeQuery();

                if(rs.next()) 
                {
                    if(doc_id.equals(rs.getString(1)) && doc_password.equals(rs.getString(2))){
                        doctor_page docPage=new doctor_page(doc_id);
                        docPage.setVisible(true);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"INVALID USERNAME/PASSWORD","Access Denied...",JOptionPane.ERROR_MESSAGE);   
                    }
                }
                doctorPassword.setText(null);
 
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
    }//GEN-LAST:event_doc_loginActionPerformed

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
            java.util.logging.Logger.getLogger(doclogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(doclogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(doclogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(doclogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new doclogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backPanel;
    private javax.swing.JButton closeBtn;
    private javax.swing.JButton doc_login;
    private javax.swing.JLabel doctorBG;
    private javax.swing.JLabel doctorIDLabel;
    private javax.swing.JTextField doctorId;
    private javax.swing.JLabel doctorLogin;
    private javax.swing.JPanel doctorPanel;
    private javax.swing.JPasswordField doctorPassword;
    private javax.swing.JLabel login;
    private javax.swing.JLabel loginBG;
    private javax.swing.JLabel passwoedLabel;
    // End of variables declaration//GEN-END:variables
}
