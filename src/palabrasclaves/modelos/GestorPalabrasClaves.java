/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabrasclaves.modelos;

import interfaces.IGestorPalabrasClaves;
import java.util.ArrayList;

/**
 *
 * @author WINDOWS 10
 */
public class GestorPalabrasClaves implements IGestorPalabrasClaves{
    public static final String PALABRA_EXITO = "se pudo crear la palabra clave";
    public static final String PALABRA_NOMBRE_INCORRECTO = "no se pudo crear la palabra clave, es incorrecto";
    public static final String PALABRA_REPETIDO = "esta la palabra clave ya existe";

    private ArrayList<PalabraClave> palabraClaveList = new ArrayList<>();
    private static GestorPalabrasClaves instancia;
    
    private GestorPalabrasClaves(){
        
    }
    
    public static GestorPalabrasClaves crear() {
        if (instancia == null)
            instancia = new GestorPalabrasClaves();
        return instancia;
    }
    
    @Override
    public String nuevaPalabraClave (String nombre) {
        if ((nombre != null) && (!nombre.isBlank())) {
            PalabraClave r = new PalabraClave(nombre);
            if(!this.palabraClaveList.contains(r)) {
                this.palabraClaveList.add(r);
                return PALABRA_EXITO;    
            }
            else
                return PALABRA_REPETIDO;
        }
        return PALABRA_NOMBRE_INCORRECTO;
    }

    @Override
    public ArrayList<PalabraClave> verPalabrasClaves() {
        return palabraClaveList;
    }

    @Override
    public PalabraClave verPalabraClave(String nombre) {
        for (PalabraClave x : palabraClaveList) {
            if(x.verPalabra().equals(nombre)){
                return x;
            }
        }
        return null;
    }
}
