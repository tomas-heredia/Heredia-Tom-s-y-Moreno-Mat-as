/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idiomas.modelos;

import interfaces.IGestorIdiomas;
import java.util.ArrayList;

/**
 *
 * @author Tribilin
 */
public class GestorIdiomas implements IGestorIdiomas{

    public static final String IDIOMA_EXITO = "se pudo crear el Idioma";
    public static final String IDIOMA_NOMBRE_INCORRECTO = "no se pudo crear el Idioma, el nombre es incorrecto";
    public static final String IDIOMA_REPETIDO = "este idioma ya existe";

    private ArrayList<Idioma> idiomaList = new ArrayList<>();
    private static GestorIdiomas instancia;
    
    private GestorIdiomas(){
        
    }
    
    public static GestorIdiomas crear() {
        if (instancia == null)
            instancia = new GestorIdiomas();
        return instancia;
    }
    
    @Override
    public String nuevoIdioma(String nombre) {
        if ((nombre != null) && (!nombre.isBlank())) {
            Idioma r = new Idioma(nombre);
            if(!this.idiomaList.contains(r)) {
                this.idiomaList.add(r);
                return IDIOMA_EXITO;    
            }
            else
                return IDIOMA_REPETIDO;
        }
        return IDIOMA_NOMBRE_INCORRECTO;
    }

    @Override
    public ArrayList<Idioma> verIdiomas() {
        return idiomaList;
    }

    @Override
    public Idioma verIdioma(String nombre) {
        
        for (Idioma x : idiomaList) {
            if(x.verIdioma().equals(nombre)){
                return x;
            }
        }
        return null;
    }
    
}
