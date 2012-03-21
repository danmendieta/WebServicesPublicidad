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
public class operacionesMarketing {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getPromocionIdeal")
    public String getPromocionIdeal(@WebParam(name = "sexo") String sexo,
                                    @WebParam(name = "edad") int edad) {
        String URLPromocion= "http://localhost/sinImagen.jpg";
        if(sexo=="H"){//SI ES HOMBRE
            if(0< edad && edad<18){
                URLPromocion= "http://localhost/sinImagen.jpg";
            }else if(18< edad && edad<21){
                URLPromocion= "http://localhost/sinImagen.jpg";
            }else if(21< edad && edad<25){
                URLPromocion= "http://localhost/sinImagen.jpg";
            }else if(25< edad && edad<35){
                URLPromocion= "http://localhost/sinImagen.jpg";
            }else if(35< edad && edad<40){
                URLPromocion= "http://localhost/sinImagen.jpg";
            }else if(40< edad && edad<55){
                URLPromocion= "http://localhost/sinImagen.jpg";
            }else if(55< edad && edad<70){
                URLPromocion= "http://localhost/sinImagen.jpg";
            }else if(70< edad){
                URLPromocion= "http://localhost/sinImagen.jpg";
            }
        }else if(sexo=="M"){//SI ES MUJER
            if(0< edad && edad<18){
                URLPromocion= "http://localhost/sinImagen.jpg";
            }else if(18< edad && edad<21){
                URLPromocion= "http://localhost/sinImagen.jpg";
            }else if(21< edad && edad<25){
                URLPromocion= "http://localhost/sinImagen.jpg";
            }else if(25< edad && edad<35){
                URLPromocion= "http://localhost/sinImagen.jpg";
            }else if(35< edad && edad<40){
                URLPromocion= "http://localhost/sinImagen.jpg";
            }else if(40< edad && edad<55){
                URLPromocion= "http://localhost/sinImagen.jpg";
            }else if(55< edad && edad<70){
                URLPromocion= "http://localhost/sinImagen.jpg";
            }else if(70< edad){
                URLPromocion= "http://localhost/sinImagen.jpg";
            }
        }
        return URLPromocion;
    }

}
