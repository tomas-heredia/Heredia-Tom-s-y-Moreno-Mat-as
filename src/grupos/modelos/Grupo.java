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
public class Grupo {
    private String nombre;
    private String descripcion;
    private MiembroEnGrupo posibleMiembro;
    private ArrayList<MiembroEnGrupo> miembroEnGrupoList = new ArrayList<>();
  
    public Grupo(String nombre, String descripcion){ 
        this.nombre = nombre;
        this.descripcion = descripcion;
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
    
    public void agregarMiembro(Autor autor, Rol rol) {
        
        if(this.esSuperAdministradores()){

            posibleMiembro = new MiembroEnGrupo(this, autor, Rol.ADMINISTRADOR);
        
            if(!miembroEnGrupoList.contains(posibleMiembro)){
                miembroEnGrupoList.add(posibleMiembro);
                autor.agregarGrupo(this, Rol.ADMINISTRADOR);
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
    
    public void quitarMiembro(Autor miembro){
        
     int i=0,b=0,c=0;
        for (MiembroEnGrupo x : miembroEnGrupoList){
                                                    
            if(x.verAutor().equals(miembro)){
                b=i;
                c++; 
            }
            i++;
        }
        
        if(c!=0){
            miembroEnGrupoList.remove(b); 
        }

        for (MiembroEnGrupo x : miembro.verGrupos()) {
            if(x.verGrupo().equals(this)){
                miembro.quitarGrupo(this);
            }
        }
        
    }
    
    public boolean esSuperAdministradores(){
        
        if(this.nombre.equals("Super Administradores")){
            return true;
        }
        return false;
    }
    
    public boolean tieneMiembros(){
        return miembroEnGrupoList.isEmpty();
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
 
