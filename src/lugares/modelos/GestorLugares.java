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
    public static final String LUGAR_NOMBRE_INCORECTO = "no se pudo crear el lugar, el nobre es incorrecto";
    public static final String LUGAR_REPETIDO = "este tipo de lugar ya existe";

    private ArrayList<Lugar> lugares = new ArrayList<>();
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
            if(!this.lugares.contains(r)) {
                this.lugares.add(r);
                return LUGAR_EXITO;    
            }
            else
                return LUGAR_REPETIDO;
        }
        else
            return LUGAR_NOMBRE_INCORECTO;
    }

    @Override
    public ArrayList<Lugar> verLugares() {
        return lugares;
    }

    @Override
    public Lugar verPalabraClave(String nombre) {
        Lugar r = new Lugar(nombre);
        if (this.lugares.contains(r)){
            return r;
        }
        else
            return null;
    }
    
    
}
