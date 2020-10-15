/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipos.modelos;

import java.util.Objects;

/**
 *
 * @author WINDOWS 10
 */
public class Tipo {
    
    private String nombre;

    public Tipo(String nombre) {
        this.nombre = nombre;
    }

   
     
    
    @Override
    public String toString()
    {
        return "El Tipo es: " + nombre;
    }
}
