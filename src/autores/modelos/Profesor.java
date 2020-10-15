/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.modelos;


import grupos.modelos.MiembroEnGrupo;
import java.util.ArrayList;

/**
 *
 * @author WINDOWS 10
 */
public class Profesor {
    private int dni;
    private String apellido;
    private String nombre;
    private String clave;
    private Cargo cargo;
    
    private ArrayList<MiembroEnGrupo> miembro = new ArrayList<>();

    public Profesor(int dni, String apellido, String nombre, String clave, Cargo cargo) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.clave = clave;
        this.cargo = cargo;
        
    }
    
   

    public int verDni() {
        return dni;
    }

    public String verApellido() {
        return apellido;
    }

    public String verNombre() {
        return nombre;
    }

    public String verClave() {
        return clave;
    }

    public Cargo verCargo() {
        return cargo;
    }

   

    

    public void asignarDni(int dni) {
        this.dni = dni;
    }

    public void asignarApellido(String apellido) {
        this.apellido = apellido;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    public void asignarClave(String clave) {
        this.clave = clave;
    }

    public void asignarCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + this.dni;
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
        final Profesor other = (Profesor) obj;
        if (this.dni != other.dni) {
            return false;
        }
        return true;
    }

   

    

    

    public void mostrar(){
        System.out.println("dni: " + dni + "\n apellido: " + apellido + "\nnombre " + nombre + "\nclave " + clave + "\ncargo: " + cargo );
    }
    
}
