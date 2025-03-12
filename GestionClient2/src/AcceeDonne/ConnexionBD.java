/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AcceeDonne;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LENOVO
 */
public class ConnexionBD {
    public static Connection maCon=null;
    public static Connection connecter() throws ClassNotFoundException, SQLException{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        maCon=DriverManager.getConnection( "jdbc:sqlserver://DESKTOP-PUBM674//CYNTHIA;databaseName=EnregistrementClient;user=sa;password=2004");
     return maCon;  
}
    public static boolean Deconnecter() throws SQLException{
        if(!maCon.isClosed()){
            maCon.close();
        }
        return false;
    }

    
}