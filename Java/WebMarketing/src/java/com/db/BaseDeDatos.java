/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author zerofkw
 */
public class BaseDeDatos {
    private BaseDeDatos(){

    }

    public static Connection getConexion(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/FORO", "root", null);
        }catch(SQLException ex){

        }catch(ClassNotFoundException noclass){
            
        }
        return con;
    }
}
