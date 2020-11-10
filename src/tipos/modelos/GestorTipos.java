/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipos.modelos;

import interfaces.IGestorTipos;
import java.util.ArrayList;

/**
 *
 * @author WINDOWS 10
 */
public class GestorTipos implements IGestorTipos{
    
    public static final String TIPO_EXITO = "se pudo crear el tipo de publicacion";
    public static final String TIPO_NOMBRE_INCORRECTO = "no se pudo crear el tipo de publicacion, el nobre es incorrecto";
    public static final String TIPO_REPETIDO = "este tipo de recurso ya existe";

    private ArrayList<Tipo> tipoList = new ArrayList<>();
    private static GestorTipos instancia;
    
    private GestorTipos(){
        
    }
    
    public static GestorTipos crear() {
        if (instancia == null)
            instancia = new GestorTipos();
        return instancia;
    }
    
    @Override
    public String nuevoTipo(String nombre) {
        if ((nombre != null) && (!nombre.isBlank())) {
            Tipo r = new Tipo(nombre);
            if(!this.tipoList.contains(r)) {
                this.tipoList.add(r);
                return TIPO_EXITO;    
            }
            else
                return TIPO_REPETIDO;
        }
        return TIPO_NOMBRE_INCORRECTO;
    }

    @Override
    public ArrayList<Tipo> verTipos() {
        return tipoList;
    }

    @Override
    public Tipo verTipo(String nombre) {
        for (Tipo x : tipoList) {
            if(x.verNombre().equals(nombre)){
                return x;
            }
        }
        return null;
    }
    
    
}
