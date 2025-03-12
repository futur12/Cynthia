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
public class Supprimer {
     public static PreparedStatement ps=null;
    public static boolean delete(Object o) throws SQLException, ClassNotFoundException{
        if (o instanceof Client){
            Client e=(Client)o;
            ps=ConnexionBD.connecter().prepareStatement("DELETE FROM Client WHERE matricule=?");
            ps.setString(1, e.getMatricule());
            ps.execute();
            ps.close();
            ConnexionBD.Deconnecter();
            return true;
        }
        return false;
    }
    
}
    

