/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ws;

import java.sql.Connection;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import com.db.BaseDeDatos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author zerofkw
 */
@WebService()
public class operacionesForo {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "nuevoUsuario")
    public String nuevoUsuario( @WebParam(name = "nombre")      String nombre,
                                @WebParam(name = "apellidos")   String apellidos,
                                @WebParam(name = "correo")      String correo,
                                @WebParam(name = "contrasena")  String contrasena,
                                @WebParam(name = "sexo")        String sexo,
                                @WebParam(name = "edad")        int edad) {
        String retorno ="";
        Connection conn= BaseDeDatos.getConexion();
        Statement st= null;
        
        try{
            st= conn.createStatement();
            st.executeUpdate("INSERT INTO USUARIOS VALUES ('"+nombre+"', '"+apellidos+"', '"+correo+"','"+contrasena+"','"+sexo+"',"+edad+ ")");
            if(st!=null){
                st.close();
            }
            retorno="BIENVENIDO A ESTE NUEVO FORO!";
        }catch(SQLException e){
            retorno = e.getMessage();
        }        
        return retorno;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "login")
    public boolean login(@WebParam(name = "correo")    String correo,
                        @WebParam(name = "contrasena")    String contrasena) {
        boolean respuesta= false;
        Connection conn= BaseDeDatos.getConexion();
        Statement st= null;
        ResultSet rs=null;
        try{
            st= conn.createStatement();
            rs = st.executeQuery("select count(*) from usuarios where correo = '"+correo +"' and contrasena= '"+contrasena+"'");
            rs.next();
            int contadr = rs.getInt(1);
            if(contadr>0){
                respuesta= true;
            }
            if(st!=null){
                st.close();
            }
            if(rs!=null){
                rs.close();
            }
        }catch(SQLException e){
            respuesta = false;
        }
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getSexo")
    public String getSexo(@WebParam(name = "correo")
    String correo) {
        String retorno ="";
        Connection conn= BaseDeDatos.getConexion();
        Statement st= null;
        ResultSet rs=null;
        try{
            st= conn.createStatement();
            rs = st.executeQuery("select sexo from usuarios where correo = '" + correo+"'");
            rs.next();
            retorno = rs.getString(1);
            if(st!=null){
                st.close();
            }
            if(rs!=null){
                rs.close();
            }
        }catch(SQLException e){
            retorno = e.getMessage();
        }
        return retorno;
    }

    @WebMethod(operationName = "getEdad")
    public int getEdad(@WebParam(name = "correo")
    String correo) {
        int retorno =0;
        Connection conn= BaseDeDatos.getConexion();
        Statement st= null;
        ResultSet rs=null;
        try{
            st= conn.createStatement();
            rs = st.executeQuery("select edad from usuarios where correo = '"+correo + "'");
            rs.next();
            retorno = rs.getInt(1);
            
            if(st!=null){
                st.close();
            }
            if(rs!=null){
                rs.close();
            }
        }catch(SQLException e){
            
        }
        return retorno;
    }

    

}
