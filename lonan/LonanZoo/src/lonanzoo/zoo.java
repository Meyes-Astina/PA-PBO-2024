/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lonanzoo;

import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author M. ARIANDA SAPUTRA
 */
public interface zoo {
    void populateTable(DefaultTableModel model) throws SQLException;
    void displayData(String kode, javax.swing.JTextField txtnama, javax.swing.JTextField txtkategori, javax.swing.JTextField txtjenis, 
                     javax.swing.JTextField txthabitat, javax.swing.JTextField txtasal, javax.swing.JTextField txtjumlah) throws SQLException;
}
