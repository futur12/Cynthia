/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe;

import AcceeDonne.ConnexionBD;
import java.awt.Font;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Héritier K
 */
public class RemplirTable {
    private static DefaultTableModel table;
    private static PreparedStatement prepare = null;
    private static ResultSet resultat = null;
    public static void Fill_Table(JTable matable, String query) throws Exception {
        try {
            JTableHeader header = (JTableHeader) matable.getTableHeader();

            ((DefaultTableCellRenderer) header.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
            header.setFont(new Font("Century Gothic", Font.BOLD, 14));
            table = new DefaultTableModel();

            prepare = ConnexionBD.connecter().prepareStatement(query);
            resultat = prepare.executeQuery();

            for (int i = 0; i < resultat.getMetaData().getColumnCount(); i++) {
                table.addColumn(resultat.getMetaData().getColumnName(i + 1).toUpperCase());
            }
            matable.setModel(table);
            table.setRowCount(0);

            while (resultat.next()) {
                ObservableList<Object> data = FXCollections.observableArrayList();
                for (int i = 1; i < resultat.getMetaData().getColumnCount() + 1; i++) {
                    data.add(resultat.getObject(i));
                }
                table.addRow(data.toArray());
            }
            matable.setModel(table);
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        } finally {
            if (prepare != null | resultat != null | ConnexionBD.connecter() != null) {
                resultat.close();
                prepare.close();
                ConnexionBD.Deconnecter();
            }
        }
    }
}
