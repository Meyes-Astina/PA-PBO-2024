/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.view;


import com.Login.LoginFrame;
import com.database.DataB;
import lonanzoo.Utilitas;
import java.io.IOException;                 // For handling IOExceptions
import javax.swing.JOptionPane;
import lonanzoo.Hewan;
import lonanzoo.Mamalia;
import lonanzoo.Reptil;
import lonanzoo.Unggas;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author M. ARIANDA SAPUTRA
 */
public class AdminMenu extends javax.swing.JFrame {
    
    /**
     * Creates new form AdminFrame
     */
    public AdminMenu() {
        initComponents();
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtkode = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txthabit = new javax.swing.JTextField();
        txtjenis = new javax.swing.JTextField();
        txtasal = new javax.swing.JTextField();
        txtjmlh = new javax.swing.JTextField();
        cbkategori = new javax.swing.JComboBox<>();
        btnadd = new javax.swing.JButton();
        btnview = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(193, 216, 95));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtkode.setBackground(new java.awt.Color(74, 163, 179));
        txtkode.setForeground(new java.awt.Color(255, 255, 255));
        txtkode.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Kode", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        txtkode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkodeActionPerformed(evt);
            }
        });
        jPanel1.add(txtkode, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 110, -1));

        txtnama.setBackground(new java.awt.Color(233, 150, 79));
        txtnama.setForeground(new java.awt.Color(255, 255, 255));
        txtnama.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Nama", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });
        jPanel1.add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 110, -1));

        txthabit.setBackground(new java.awt.Color(74, 163, 179));
        txthabit.setForeground(new java.awt.Color(255, 255, 255));
        txthabit.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Habitat", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(txthabit, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 110, -1));

        txtjenis.setBackground(new java.awt.Color(233, 150, 79));
        txtjenis.setForeground(new java.awt.Color(255, 255, 255));
        txtjenis.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Jenis Makanan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(txtjenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 110, -1));

        txtasal.setBackground(new java.awt.Color(74, 163, 179));
        txtasal.setForeground(new java.awt.Color(255, 255, 255));
        txtasal.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Asal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(txtasal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 110, -1));

        txtjmlh.setBackground(new java.awt.Color(233, 150, 79));
        txtjmlh.setForeground(new java.awt.Color(255, 255, 255));
        txtjmlh.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Jumlah", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(txtjmlh, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 110, -1));

        cbkategori.setBackground(new java.awt.Color(233, 150, 79));
        cbkategori.setForeground(new java.awt.Color(255, 255, 255));
        cbkategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mamalia", "unggas", "reptil" }));
        cbkategori.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Kategori", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(cbkategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 110, -1));

        btnadd.setBackground(new java.awt.Color(74, 163, 179));
        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setText("Tambah");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        jPanel1.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, -1, 30));

        btnview.setBackground(new java.awt.Color(74, 163, 179));
        btnview.setForeground(new java.awt.Color(255, 255, 255));
        btnview.setText("Lihat");
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });
        jPanel1.add(btnview, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, -1, 30));

        jButton1.setBackground(new java.awt.Color(233, 150, 79));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, -1, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(233, 150, 79));
        jLabel3.setText("LONAN");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(74, 163, 179));
        jLabel4.setText("ZOO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tambah Data");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtkodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkodeActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
            try {
        // Mendapatkan koneksi ke database
        if (DataB.con != null) {
            // Ekstraksi nilai dari input fields
            int kodeHewan = Utilitas.validateNumber(txtkode.getText());
            String habitat = Utilitas.notEmpty(txthabit.getText());
            String namaHewan = Utilitas.notEmpty(txtnama.getText());
            String jenisMakanan = Utilitas.notEmpty(txtjenis.getText());
            String asalNegara = Utilitas.notEmpty(txtasal.getText());
            int jumlahHewan = Utilitas.validateNumber(txtjmlh.getText());
            String category = cbkategori.getSelectedItem().toString();

            Hewan newHewan = null;

            // Membuat objek hewan sesuai dengan kategori
            switch (category.toLowerCase()) {
                case "mamalia":
                    newHewan = new Mamalia(kodeHewan, habitat, namaHewan, jenisMakanan, asalNegara, jumlahHewan, category);
                    break;
                case "unggas":
                    newHewan = new Unggas(kodeHewan, habitat, namaHewan, jenisMakanan, asalNegara, jumlahHewan, category);
                    break;
                case "reptil":
                    newHewan = new Reptil(kodeHewan, habitat, namaHewan, jenisMakanan, asalNegara, jumlahHewan, category);
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Invalid category. Animal not added.");
                    return;
            }

            // Menambahkan hewan baru ke database
            String query = "INSERT INTO data_zoo (kode, nama, habitat, jenis, asal, jumlah, kategori) VALUES (?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement statement = DataB.con.prepareStatement(query)) {
                statement.setInt(1, newHewan.getKode());
                statement.setString(2, newHewan.getNama());
                statement.setString(3, newHewan.getHabitat());
                statement.setString(4, newHewan.getJenisMakanan());
                statement.setString(5, newHewan.getAsalNegara());
                statement.setInt(6, newHewan.getJumlah());
                statement.setString(7, newHewan.getKategori());

                int rowsInserted = statement.executeUpdate();
                if (rowsInserted > 0) {
                    JOptionPane.showMessageDialog(this, "Data Berhasil Di Tambah.");
                } else {
                    JOptionPane.showMessageDialog(this, "gagal Menambahkan");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Database connection is not established.");
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Please enter a valid number for kodeHewan and jumlahHewan.");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
    }
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
    AdminList listFrame = new AdminList();
    listFrame.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_btnviewActionPerformed

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                LoginFrame loginFrame = new LoginFrame();
            loginFrame.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMenu().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnview;
    private javax.swing.JComboBox<String> cbkategori;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtasal;
    private javax.swing.JTextField txthabit;
    private javax.swing.JTextField txtjenis;
    private javax.swing.JTextField txtjmlh;
    private javax.swing.JTextField txtkode;
    private javax.swing.JTextField txtnama;
    // End of variables declaration//GEN-END:variables
}
