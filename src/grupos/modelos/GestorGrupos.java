/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupos.modelos;

import interfaces.IGestorGrupos;
import java.util.ArrayList;

/**
 *
 * @author Tribilin
 */
public class GestorGrupos implements IGestorGrupos{

    public static final String GRUPO_EXITO = "se pudo crear el Grupo";
    public static final String GRUPO_NOMBRE_INCORRECTO = "no se pudo crear el Grupo, el nombre es incorrecto";
    public static final String GRUPO_REPETIDO = "este Grupo ya existe";
    public static final String MODIFICACION_EXITOSA = "Modificacion Exitosa";
    public static final String MODIFICACION_INVALIDA = "Modificacion Invalida";
    
    private ArrayList<Grupo> grupoList = new ArrayList<>();
    private static GestorGrupos instancia;
    
    private GestorGrupos(){
        
    }
    
    public static GestorGrupos crear() {
        if (instancia == null)
            instancia = new GestorGrupos();
        return instancia;
    }
    
    
    @Override
    public String nuevoGrupo(String nombre, String descripcion) {
        if ((nombre != null) && (!nombre.isBlank())) {
            Grupo r = new Grupo(nombre,descripcion);
            if(!this.grupoList.contains(r)) {
                this.grupoList.add(r);
                return GRUPO_EXITO;    
            }
            else
                return GRUPO_REPETIDO;
        }
        return GRUPO_NOMBRE_INCORRECTO;
    }

    @Override
    public String modificarGrupo(Grupo grupo, String descripcion) {
        if ((descripcion != null) && (!descripcion.isBlank())){
            grupo.asignarDescripcion(descripcion);
            return MODIFICACION_EXITOSA;
        }else{
            return MODIFICACION_INVALIDA;
        }
    }

    @Override
    public ArrayList<Grupo> verGrupos() {
        return grupoList;
    }

    @Override
    public Grupo verGrupo(String nombre) {
        
        for (Grupo x : grupoList) {
            if(x.verNombre().equals(nombre)){
                return x;
            }
        }
        return null;
    }

    @Override
    public boolean existeEsteGrupo(Grupo grupo) {
        for (Grupo x : grupoList) {
            if(x.equals(grupo)){
                return true;
            }
        }
        return false;
    }
    
}
