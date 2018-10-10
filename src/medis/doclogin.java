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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        doctorId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        doctorPassword = new javax.swing.JPasswordField();
        doc_login = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 0), 2, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 500));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 102, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 500));
        jPanel2.setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medis/login-doctor.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(30, 80, 245, 211);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medis/dialo_background.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(0, 0, 300, 400);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 300, 500);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Login");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(300, 40, 300, 50);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setText("Doctor ID");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(330, 110, 110, 30);

        doctorId.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        doctorId.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 0), 2, true));
        jPanel1.add(doctorId);
        doctorId.setBounds(330, 140, 190, 40);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setText("Password");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(330, 210, 140, 30);

        doctorPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 0), 2, true));
        doctorPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(doctorPassword);
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
        jPanel1.add(doc_login);
        doc_login.setBounds(390, 310, 90, 40);

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("X");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_button(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(560, 0, 40, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medis/dialo_background.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(300, 0, 300, 400);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(600, 397));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void doctorPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorPasswordActionPerformed

    private void close_button(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_button
        dispose();
    }//GEN-LAST:event_close_button

    private void doc_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doc_loginActionPerformed
        // TODO add your handling code here:

        con=my_sql_connect.connectdb();
        String sq="Select * from doctor where doctorID = ?";
        
        String doc_id=doctorId.getText();
        String doc_password= String.copyValueOf(doctorPassword.getPassword());     
                              
            try
            {
                pst=con.prepareStatement(sq);
                pst.setString(1,doc_id);
                rs=pst.executeQuery();

                if(rs.next()) 
                {
                    if(doc_id.equals(rs.getString(1)) && doc_password.equals(rs.getString(2)))
                    {
                        //JOptionPane.showMessageDialog(null,"WELCOME ADMIN");
                        doctor_page docPage=new doctor_page();
                        docPage.setVisible(true);
                    } 
                }                   
                else
                {
                     JOptionPane.showMessageDialog(null,"INVALID USERNAME/PASSWORD","Access Denied...",JOptionPane.ERROR_MESSAGE);   
                }
 
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
    private javax.swing.JButton doc_login;
    private javax.swing.JTextField doctorId;
    private javax.swing.JPasswordField doctorPassword;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
