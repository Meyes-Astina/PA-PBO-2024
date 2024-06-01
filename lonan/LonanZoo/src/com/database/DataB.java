package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DataB {
    public static Connection con = null;

    public static void loadConnection() {
        String url = "jdbc:mysql://localhost:3306/lonan_zoo";
        String root = "root";
        String pass = "";

        try {
            con = DriverManager.getConnection(url, root, pass);

            if (con != null) {
                JOptionPane.showMessageDialog(null, "Database berhasil terkoneksi");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database tidak terkoneksi: " + e.getMessage());
        }
    }
}
