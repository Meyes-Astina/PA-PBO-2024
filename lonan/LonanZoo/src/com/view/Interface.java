/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.view;

import lonanzoo.zoo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Laptop ASUS TUF
 */
public class Interface extends javax.swing.JFrame implements zoo{

    private Connection con;
    private PreparedStatement stmt;
    private ResultSet rs;

    public Interface() {
        initComponents();
        try {
            DefaultTableModel model = new DefaultTableModel(new String[]{"Kode", "Nama", "Kategori", "Jenis", "Habitat", "Asal", "Jumlah"}, 0);
            populateTable(model);
            jTable1.setModel(model);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error initializing table: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                if (jTable1.getSelectedRow() > -1) {
                    String kode = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
                    try {
                        displayData(kode, txtnama, txtkategori, txtjenis, txthabitat, txtasal, txtjumlah);
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(Interface.this, "Error retrieving data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
    }

    @Override
    public void populateTable(DefaultTableModel model) throws SQLException {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lonan_zoo", "root", "");
            String query = "SELECT * FROM data_zoo";
            stmt = con.prepareStatement(query);
            rs = stmt.executeQuery();
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("kode"),
                    rs.getString("nama"),
                    rs.getString("kategori"),
                    rs.getString("jenis"),
                    rs.getString("habitat"),
                    rs.getString("asal"),
                    rs.getInt("jumlah")
                });
            }
        } catch (SQLException ex) {
            throw new SQLException("Error populating table: " + ex.getMessage(), ex);
        } finally {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (con != null) con.close();
        }
    }

    @Override
    public void displayData(String kode, javax.swing.JTextField txtnama, javax.swing.JTextField txtkategori, javax.swing.JTextField txtjenis,
                            javax.swing.JTextField txthabitat, javax.swing.JTextField txtasal, javax.swing.JTextField txtjumlah) throws SQLException {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lonan_zoo", "root", "");
            String query = "SELECT * FROM data_zoo WHERE kode = ?";
            stmt = con.prepareStatement(query);
            stmt.setString(1, kode);
            rs = stmt.executeQuery();
            if (rs.next()) {
                txtnama.setText(rs.getString("nama"));
                txtkategori.setText(rs.getString("kategori"));
                txtjenis.setText(rs.getString("jenis"));
                txthabitat.setText(rs.getString("habitat"));
                txtasal.setText(rs.getString("asal"));
                txtjumlah.setText(String.valueOf(rs.getInt("jumlah")));
            } else {
                JOptionPane.showMessageDialog(this, "No data found for kode: " + kode, "Info", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            throw new SQLException("Error displaying data: " + ex.getMessage(), ex);
        } finally {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (con != null) con.close();
        }
    }
    public void updateData(String kode, String nama, String kategori, String jenis, String habitat, String asal, int jumlah) throws SQLException {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lonan_zoo", "root", "");
            String query = "UPDATE data_zoo SET nama=?, kategori=?, jenis=?, habitat=?, asal=?, jumlah=? WHERE kode=?";
            stmt = con.prepareStatement(query);
            stmt.setString(1, nama);
            stmt.setString(2, kategori);
            stmt.setString(3, jenis);
            stmt.setString(4, habitat);
            stmt.setString(5, asal);
            stmt.setInt(6, jumlah);
            stmt.setString(7, kode);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            throw new SQLException("Error updating data: " + ex.getMessage(), ex);
        } finally {
            if (stmt != null) stmt.close();
            if (con != null) con.close();
        }
    }

    public void deleteData(String kode) throws SQLException {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lonan_zoo", "root", "");
            String query = "DELETE FROM data_zoo WHERE kode=?";
            stmt = con.prepareStatement(query);
            stmt.setString(1, kode);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            throw new SQLException("Error deleting data: " + ex.getMessage(), ex);
        } finally {
            if (stmt != null) stmt.close();
            if (con != null) con.close();
        }
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
        txtjenis = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txtjumlah = new javax.swing.JTextField();
        txthabitat = new javax.swing.JTextField();
        txtkategori = new javax.swing.JTextField();
        txtasal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnedit = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(193, 216, 95));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtjenis.setBackground(new java.awt.Color(233, 150, 79));
        txtjenis.setForeground(new java.awt.Color(255, 255, 255));
        txtjenis.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Jenis", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(txtjenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 140, 40));

        txtnama.setBackground(new java.awt.Color(74, 163, 179));
        txtnama.setForeground(new java.awt.Color(255, 255, 255));
        txtnama.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Nama", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });
        jPanel1.add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 140, 40));

        txtjumlah.setBackground(new java.awt.Color(74, 163, 179));
        txtjumlah.setForeground(new java.awt.Color(255, 255, 255));
        txtjumlah.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Jumlah", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(txtjumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 150, 40));

        txthabitat.setBackground(new java.awt.Color(74, 163, 179));
        txthabitat.setForeground(new java.awt.Color(255, 255, 255));
        txthabitat.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Habitat", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(txthabitat, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 140, 40));

        txtkategori.setBackground(new java.awt.Color(233, 150, 79));
        txtkategori.setForeground(new java.awt.Color(255, 255, 255));
        txtkategori.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Kategori", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        txtkategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkategoriActionPerformed(evt);
            }
        });
        jPanel1.add(txtkategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 150, 40));

        txtasal.setBackground(new java.awt.Color(233, 150, 79));
        txtasal.setForeground(new java.awt.Color(255, 255, 255));
        txtasal.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Asal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(txtasal, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 150, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode", "Nama", "Habitat", "Jenis", "Asal", "Jumlah", "Kategori"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, 220));

        jButton1.setBackground(new java.awt.Color(74, 163, 179));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, -1, 30));

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
        jLabel5.setText("Daftar Hewan");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });
        jPanel1.add(btnedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, -1, -1));

        btnhapus.setText("Hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });
        jPanel1.add(btnhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtkategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkategoriActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AdminMenu admenu = new AdminMenu();
        admenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        // TODO add your handling code here:
        try {
        String kode = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String nama = txtnama.getText();
        String kategori = txtkategori.getText();
        String jenis = txtjenis.getText();
        String habitat = txthabitat.getText();
        String asal = txtasal.getText();
        int jumlah = Integer.parseInt(txtjumlah.getText());
        
        updateData(kode, nama, kategori, jenis, habitat, asal, jumlah);
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Clear table
        populateTable(model); // Re-populate table
        
        JOptionPane.showMessageDialog(this, "Data berhasil diupdate", "Sukses", JOptionPane.INFORMATION_MESSAGE);
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error updating data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btneditActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        // TODO add your handling code here:
        try {
        String kode = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
        
        deleteData(kode);
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Clear table
        populateTable(model); // Re-populate table
        
        JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error deleting data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnhapusActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtasal;
    private javax.swing.JTextField txthabitat;
    private javax.swing.JTextField txtjenis;
    private javax.swing.JTextField txtjumlah;
    private javax.swing.JTextField txtkategori;
    private javax.swing.JTextField txtnama;
    // End of variables declaration//GEN-END:variables
}
