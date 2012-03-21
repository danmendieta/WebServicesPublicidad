/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author zerofkw
 */
@WebService()
public class marketing {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "regresaPublicidadAdecuada")
    public String regresaPublicidadAdecuada(@WebParam(name = "sexo") String sexo,
                                            @WebParam(name = "edad") int edad) {
        
        return null;
    }

}
