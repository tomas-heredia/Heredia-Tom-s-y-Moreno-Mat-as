/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.modelos;

/**
 *
 * @author WINDOWS 10
 */
public class Alumno {
    private int dni;
    private String apellido;
    private String nombre;
    private String clave;
    private String CX;

    public Alumno(int dni, String apellido, String nombre, String clave, String CX) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.clave = clave;
        this.CX = CX;
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

    public String verCX() {
        return CX;
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

    public void asignarCX(String CX) {
        this.CX = CX;
    }

  
    
    
    
    
    public void mostrar(){
        System.out.println("dni: " + dni + "\n apellido: " + apellido + "\nnombre " + nombre + "\nclave " + clave + "\nCX: " + CX);
    }
}

