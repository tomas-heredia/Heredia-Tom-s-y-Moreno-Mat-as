/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idiomas.modelos;

import java.util.Objects;

/**
 *
 * @author WINDOWS 10
 */
public class Idioma {
    private String idioma;

    public Idioma(String idioma) {
        this.idioma = idioma;
    }

    public String verIdioma() {
        return idioma;
    }

    public void asignarIdioma(String idioma) {
        this.idioma = idioma;
    }

   
     
    
    
    
    @Override
    public  String  toString () {
        return "idioma: " + idioma;
    }
}
    
    
    
    

