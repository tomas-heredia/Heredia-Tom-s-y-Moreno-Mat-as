/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.modelos;

import interfaces.IGestorAutores;
import java.util.ArrayList;

/**
 *
 * @author Tribilin
 */
public class GestorAutores implements IGestorAutores{

    public static final String AUTOR_EXITO = "se pudo crear el Autor";
    public static final String AUTOR_NOMBRE_INCORRECTO = "no se pudo crear el Autor, el nombre es incorrecto";
    public static final String AUTOR_REPETIDO = "este Autor ya existe";
    public static final String MODIFICACION_EXITOSA = "Modificacion Exitosa";
    public static final String MODIFICACION_INVALIDA = "Datos ingresados invalidos";
    
    private ArrayList<Autor> autorList = new ArrayList<>();
    private static GestorAutores instancia;
    
    private GestorAutores(){
        
    }
    
    public static GestorAutores crear() {
        if (instancia == null)
            instancia = new GestorAutores();
        return instancia;
    }
    
    @Override
    public String nuevoAutor(int dni, String apellidos, String nombres, Cargo cargo, String clave, String claveRepetida) {
        if ((nombres != null) && (!nombres.isBlank()) && (apellidos != null) && (!apellidos.isBlank()) && (cargo!=null)){
            Autor x = new Profesor(dni, apellidos, nombres, clave, cargo);
            
            if(!this.autorList.contains(x)) {
                this.autorList.add(x);
                return AUTOR_EXITO;    
            }
            else
                return AUTOR_REPETIDO;
        }
        return AUTOR_NOMBRE_INCORRECTO;
    }
    
    @Override
    public String nuevoAutor(int dni, String apellidos, String nombres, String cx, String clave, String claveRepetida) {
        if ((nombres != null) && (!nombres.isBlank()) && (apellidos != null) && (!apellidos.isBlank()) && (cx!=null) && (!cx.isBlank())){
            Autor x = new Alumno(dni, apellidos, nombres, clave, cx);
            
            if(!this.autorList.contains(x)) {
                this.autorList.add(x);
                return AUTOR_EXITO;    
            }
            else
                return AUTOR_REPETIDO;
        }
        return AUTOR_NOMBRE_INCORRECTO;
    }

    @Override
    public String modificarAutor(Autor autor, String apellidos, String nombres, Cargo cargo, String clave, String claveRepetida) {
        if ((autor != null) && (nombres != null) && (!nombres.isBlank()) && (apellidos != null) && (!apellidos.isBlank()) && (cargo!=null)){
            for (Autor x : autorList) {
                
                if(x.getClass()==autor.getClass()){
                    final Profesor y = (Profesor) x;
                    
                        if(y.equals(autor)){
                            y.asignarApellido(apellidos); //No estoy seguro si esto
                            y.asignarNombre(nombres);     //efectuará los cambios dentro
                            y.asignarCargo(cargo);        //del objeto en el ArrayList
                            y.asignarClave(clave);
                            
                            return MODIFICACION_EXITOSA;
                        }
                }
            }
        }
        return MODIFICACION_INVALIDA;
    }

    @Override
    public String modificarAutor(Autor autor, String apellidos, String nombres, String cx, String clave, String claveRepetida) {
        if ((autor != null) && (nombres != null) && (!nombres.isBlank()) && (apellidos != null) && (!apellidos.isBlank()) && (cx!=null) && (!cx.isBlank())){
            for (Autor x : autorList) {
                
                if(x.getClass()==autor.getClass()){
                    final Alumno y = (Alumno) x;
                    
                        if(y.equals(autor)){
                            y.asignarApellido(apellidos); //No estoy seguro si esto
                            y.asignarNombre(nombres);     //efectuará los cambios dentro
                            y.asignarCX(cx);              //del objeto en el ArrayList
                            y.asignarClave(clave);
                            
                            return MODIFICACION_EXITOSA;
                        }
                }
            }
        }
        return MODIFICACION_INVALIDA;
    }

    @Override
    public boolean existeEsteAutor(Autor autor) {
        for (Autor x : autorList) {
            if(x.equals(autor)){
                return true;
            }
        }
        return false;
    }

    @Override
    public ArrayList<Autor> verAutores() {
        return autorList;
    }

    @Override
    public ArrayList<Profesor> verProfesores() {
        
        ArrayList<Profesor> profesorList = new ArrayList<>();
        
            for (Autor x : autorList) {
                
                if(x.getClass()==Profesor.class){//No estoy seguro como funciona Profesor.class
                     Profesor y = (Profesor) x;
                     profesorList.add(y);
                }
            }
        return profesorList;
    }

    @Override
    public ArrayList<Alumno> verAlumnos() {
        ArrayList<Alumno> alumnoList = new ArrayList<>();
        
            for (Autor x : autorList) {
                
                if(x.getClass()==Alumno.class){//No estoy seguro como funciona Alumno.class
                     Alumno y = (Alumno) x;
                     alumnoList.add(y);
                }
            }
        return alumnoList;
    }

    @Override
    public Autor verAutor(int dni) {
        for (Autor x : autorList) {
            if(x.verDni()==dni){
                return x;
            }
        }
        return null;
    }
    
}
