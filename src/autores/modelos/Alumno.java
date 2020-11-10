/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.modelos;

import java.util.Objects;

/**
 *
 * @author WINDOWS 10
 */
public class Alumno extends Autor{
    
    private String cx;

    public Alumno(int dni, String apellido, String nombre, String clave, String cx) {
        super(dni,apellido,nombre,clave);
        this.cx = cx;
    }
    
    public String verCX() {
        return cx;
    }

    public void asignarCX(String CX) {
        this.cx = CX;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.verDni();
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
            
        if(!super.equals(obj)){

            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Alumno other = (Alumno) obj;
            if (!Objects.equals(this.cx, other.cx)) {
                return false;
            }
        }
        return true; 
    }
  
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("CX: " + cx);
    }
}

