/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabrasclaves.modelos;

import java.util.Objects;

/**
 *
 * @author WINDOWS 10
 */
public class PalabraClave {
    private String palabra;

    public PalabraClave(String palabra) {
        this.palabra = palabra;
    }
    
    

    public String verPalabra() {
        return palabra;
    }

    public void asignarPalabra(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.palabra);
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
        final PalabraClave other = (PalabraClave) obj;
        if (!Objects.equals(this.palabra, other.palabra)) {
            return false;
        }
        return true;
    }

    
    
    
    
    @Override
    public String toString()
    {
        return "La palabra clave es: " + palabra;
    }
}
