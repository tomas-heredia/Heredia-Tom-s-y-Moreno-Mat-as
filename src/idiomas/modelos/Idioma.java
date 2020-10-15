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
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.idioma);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Idioma other = (Idioma) obj;
        if (!Objects.equals(this.idioma, other.idioma)) {
            return false;
        }
        return true;
    }

   
     
    
    
    
    @Override
    public  String  toString () {
        return "idioma: " + idioma;
    }
}
    
    
    
    

