/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.modelos;

import grupos.modelos.Grupo;
import grupos.modelos.MiembroEnGrupo;
import grupos.modelos.Rol;
import java.util.ArrayList;

public abstract class Autor {
    private int dni;
    private String apellido;
    private String nombre;
    private String clave;
    private MiembroEnGrupo miembroEnGrupo;
    private ArrayList<MiembroEnGrupo> miembroEnGrupoList = new ArrayList<>();

    public Autor(int dni, String apellido, String nombre, String clave) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.clave = clave;
    }

    public ArrayList<MiembroEnGrupo> verGrupos() {
        return miembroEnGrupoList;
    }
    
    public void agregarGrupo(Grupo grupo, Rol rol){
        miembroEnGrupo = new MiembroEnGrupo(grupo, this, rol);
        
        if(!miembroEnGrupoList.contains(miembroEnGrupo)){
            miembroEnGrupoList.add(miembroEnGrupo);
            grupo.agregarMiembro(this, rol);
        } 
    }
    
    public void quitarGrupo(Grupo grupo){
        int i=0,b=0;
        for (MiembroEnGrupo x : miembroEnGrupoList) {
            
            if(x.verGrupo().equals(grupo)){
                b=i;
                miembroEnGrupoList.remove(b);
                grupo.quitarMiembro(this);
            }
            i++;
        }
    }
    
    public boolean esSuperAdministrador(){
        for (MiembroEnGrupo x : miembroEnGrupoList) {
            if(x.verGrupo().esSuperAdministradores()){
                return true;
            }
        }
        return false;
    }
    
    public int verDni() {
        return dni;
    }

    public void asignarDni(int dni) {
        this.dni = dni;
    }

    public String verApellido() {
        return apellido;
    }

    public void asignarApellido(String apellido) {
        this.apellido = apellido;
    }

    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    public String verClave() {
        return clave;
    }

    public void asignarClave(String clave) {
        this.clave = clave;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.dni;
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
        if (this.getClass().getSuperclass() != obj.getClass().getSuperclass()) {
            return false;
        }
        final Autor other = (Autor) obj;
        if (this.dni != other.dni) {
            return false;
        }
        return true;
    }
    
    public void mostrar(){
        System.out.println("["+dni+"]"+" "+apellido+", "+nombre);
        System.out.println("__GRUPOS__");
        for (MiembroEnGrupo x : miembroEnGrupoList) {
            System.out.println("Grupo: "+x.verGrupo().verNombre());
            System.out.println("Rol: "+x.verRol().verValor());
        }
    }
}
