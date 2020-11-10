/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lugares.modelos;

import interfaces.IGestorLugares;
import java.util.ArrayList;

/**
 *
 * @author WINDOWS 10
 */
public class GestorLugares implements IGestorLugares{
     
    public static final String LUGAR_EXITO = "se pudo crear el Lugar";
    public static final String LUGAR_NOMBRE_INCORRECTO = "no se pudo crear el lugar, el nombre es incorrecto";
    public static final String LUGAR_REPETIDO = "este lugar ya existe";

    private ArrayList<Lugar> lugarList = new ArrayList<>();
    private static GestorLugares instancia;
    
    private GestorLugares(){
        
    }
    
    public static GestorLugares crear() {
        if (instancia == null)
            instancia = new GestorLugares();
        return instancia;
    }
    
    @Override
    public String nuevoLugar(String nombre) {
        if ((nombre != null) && (!nombre.isBlank())) {
            Lugar r = new Lugar(nombre);
            if(!this.lugarList.contains(r)) {
                this.lugarList.add(r);
                return LUGAR_EXITO;    
            }
            else
                return LUGAR_REPETIDO;
        }
        return LUGAR_NOMBRE_INCORRECTO;
    }

    @Override
    public ArrayList<Lugar> verLugares() {
        return lugarList;
    }

    @Override
    public Lugar verLugar(String nombre) {
        for (Lugar x : lugarList) {
            if(x.verNombre().equals(nombre)){
                return x;
            }
        }
        return null;
    }
    
    
}
