/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.view;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;



/**
 *
 * @author M. ARIANDA SAPUTRA
 */
public class UserKomen extends javax.swing.JFrame {

    /**
     * Creates new form UserKomen
     */
    public UserKomen() {
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
        txtkritik = new javax.swing.JTextField();
        btnsub = new javax.swing.JButton();
        txtsaran = new javax.swing.JTextField();
        btnsub1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(193, 216, 95));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtkritik.setBackground(new java.awt.Color(74, 163, 179));
        txtkritik.setForeground(new java.awt.Color(255, 255, 255));
        txtkritik.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Kritik", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        txtkritik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkritikActionPerformed(evt);
            }
        });
        jPanel1.add(txtkritik, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 215, 40));

        btnsub.setBackground(new java.awt.Color(74, 163, 179));
        btnsub.setForeground(new java.awt.Color(255, 255, 255));
        btnsub.setText("Submit");
        btnsub.setToolTipText("");
        btnsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubActionPerformed(evt);
            }
        });
        jPanel1.add(btnsub, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, -1, 30));

        txtsaran.setBackground(new java.awt.Color(233, 150, 79));
        txtsaran.setForeground(new java.awt.Color(255, 255, 255));
        txtsaran.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Saran", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(txtsaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 215, 40));

        btnsub1.setBackground(new java.awt.Color(74, 163, 179));
        btnsub1.setForeground(new java.awt.Color(255, 255, 255));
        btnsub1.setText("Kembali");
        btnsub1.setToolTipText("");
        btnsub1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsub1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnsub1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(233, 150, 79));
        jLabel2.setText("LONAN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(74, 163, 179));
        jLabel1.setText("ZOO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Kritik & Saran");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubActionPerformed
    String kritik = txtkritik.getText(); 
    String saran = txtsaran.getText();

    Connection conn = null;
    PreparedStatement stmt = null;

    try {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lonan_zoo", "root", "");

        String sql = "INSERT INTO komentar (kritik, saran) VALUES (?, ?)";

        stmt = conn.prepareStatement(sql);

        stmt.setString(1, kritik);
        stmt.setString(2, saran);

        stmt.executeUpdate();

        // Tampilkan notifikasi jika data berhasil dimasukkan
        JOptionPane.showMessageDialog(null, "Data berhasil Masuk", "Sukses", JOptionPane.INFORMATION_MESSAGE);

    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        try {
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    }//GEN-LAST:event_btnsubActionPerformed

    private void txtkritikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkritikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkritikActionPerformed

    private void btnsub1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsub1ActionPerformed
    UserMenu listFrame = new UserMenu();
    listFrame.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_btnsub1ActionPerformed

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
            java.util.logging.Logger.getLogger(UserKomen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserKomen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserKomen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserKomen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserKomen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsub;
    private javax.swing.JButton btnsub1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtkritik;
    private javax.swing.JTextField txtsaran;
    // End of variables declaration//GEN-END:variables
}
