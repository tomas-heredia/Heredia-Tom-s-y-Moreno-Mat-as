/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupos.modelos;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author WINDOWS 10
 */
public class Grupo {
  private String nombre;
  private String descripcion;
  private ArrayList<MiembroEnGrupo> miembro = new ArrayList<>();
  
    public Grupo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
  
  

    public String verNombre() {
        return nombre;
    }

    public String verDescripcion() {
        return descripcion;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    public void asignarDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.nombre);
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
        final Grupo other = (Grupo) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

   
  
  
    
  public void mostrar()
    {
        System.out.println("Nombre: " + nombre + "\nLa descripcion es: "+ descripcion);
    }
}
 
