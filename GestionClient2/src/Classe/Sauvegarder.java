/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe;

import AcceeDonne.ConnexionBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author LENOVO
 */
public class Sauvegarder {
        public static PreparedStatement ps=null;
    public static boolean miseAjour(Object o) throws ClassNotFoundException, SQLException{
        if (o instanceof Client){
            Client e=(Client)o;
            ps=ConnexionBD.connecter().prepareCall("EXECUTE SauvegarderEt ?,?,?,?,?,?,?,?,?");
            ps.setString(1, e.getMatricule());
            ps.setString(2, e.getNom());
            ps.setString(3, e.getPostnom());
            ps.setString(4, e.getPrenom());
            ps.setString(5, e.getAge());
            ps.setString(6, e.getAdresse());
            ps.setString(6, e.getEtatCivil());
            ps.setString(7, e.getNationalite());
            ps.setString(8, e.getCoordonnées());
            ps.setString(9, e.getAgenda());
            ps.execute();
            ps.close();
            ConnexionBD.Deconnecter();
            return true;
        }
        return false;
    }
    
}
