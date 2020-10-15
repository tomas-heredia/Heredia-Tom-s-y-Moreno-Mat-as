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

   

    

    

    public void mostrar(){
        System.out.println("dni: " + dni + "\n apellido: " + apellido + "\nnombre " + nombre + "\nclave " + clave + "\ncargo: " + cargo );
    }
    
}
