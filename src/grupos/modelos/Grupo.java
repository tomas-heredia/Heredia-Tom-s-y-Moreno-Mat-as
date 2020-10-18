/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupos.modelos;

import autores.modelos.Autor;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author WINDOWS 10
 */
public class Grupo { //GRUPO DE TRABAJO
    private String nombre;
    private String descripcion;
    private MiembroEnGrupo posibleMiembro;
    private ArrayList<MiembroEnGrupo> miembroEnGrupoList = new ArrayList<>();
  
    //PARA CREAR UN GRUPO SIN MIEMBROS INICIALES
    public Grupo(String nombre, String descripcion){ 
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    //PARA CREAR UN GRUPO CON MIEMBROS INICIALES (No estoy seguro si es necesario xD)
    public Grupo(String nombre, String descripcion, ArrayList<MiembroEnGrupo> Miembros) {
        this(nombre,descripcion);
        this.miembroEnGrupoList=Miembros;
    }
    
    //AGREGA UN AUTOR A LA LISTA (Hace distincion para grupo de super administradores)
    public void agregarMiembro(Autor autor, Rol rol) {
        
        if(this.esSuperAdministradores()){

            posibleMiembro = new MiembroEnGrupo(this, autor, Rol.ADMINISTRADOR);
        
            if(!miembroEnGrupoList.contains(posibleMiembro)){
                miembroEnGrupoList.add(posibleMiembro);
                autor.agregarGrupo(this, rol);
            }
        }
        
        if(!this.esSuperAdministradores()){

            posibleMiembro = new MiembroEnGrupo(this, autor, rol);
        
            if(!miembroEnGrupoList.contains(posibleMiembro)){
                miembroEnGrupoList.add(posibleMiembro);
                autor.agregarGrupo(this, rol);
            }
        }
    }
    
    //ELIMINA UN AUTOR DE LA LISTA
    public void quitarMiembro(Autor miembro){
        
     int i=0,b=0;
        for (MiembroEnGrupo x : miembroEnGrupoList) {
            
            if(x.verAutor().equals(miembro)){
                b=i;
            }
            i++;
        }
        miembroEnGrupoList.remove(b);
        
        if(miembro.verGrupos().contains(this)){ //<- Verifica dentro del ArrayList de la clase Autor, la contencion de este grupo.
            miembro.quitarGrupo(this);
        }
    }
    
    public boolean esSuperAdministradores(){
        
        if(this.nombre.equals("Super Administradores")){
            return true;
        }
        return false;
    }
    
    //Verifica si la lista de miembros esta vacia
    public boolean tieneMiembros(){
        return miembroEnGrupoList.isEmpty();
    }
    
    public String verNombre() {
        return nombre;
    }

    public String verDescripcion() {
        return descripcion;
    }
    
    public ArrayList<MiembroEnGrupo> verMiembros() {
        return miembroEnGrupoList;
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

    public void mostrar(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Descripcion: "+descripcion);
        System.out.println("___MIEMBROS___");
        for (MiembroEnGrupo x : miembroEnGrupoList) {
            System.out.println("Nombre: "+x.verAutor().verApellido()+" "+x.verAutor().verNombre());
            System.out.println("Rol: "+x.verRol().verValor());
        }
        
    }
}
 
