/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ws;

import java.util.Date;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author zerofkw
 */
@WebService()
public class foro {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "creaUsuario")
    public String creaUsuario(  @WebParam(name = "Nombre")      String Nombre,
                                @WebParam(name = "Apellidos")   String Apellidos,
                                @WebParam(name = "email")       String email,
                                @WebParam(name = "password")    String password,
                                @WebParam(name = "sexo")        String sexo,
                                @WebParam(name = "FechaNacimiento")Date FechaNacimiento) {
        
        return null;
    }

    

}
