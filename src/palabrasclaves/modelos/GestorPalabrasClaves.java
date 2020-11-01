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
    public static final String PALABRA_NOMBRE_INCORECTO = "no se pudo crear la palabra clave, es incorrecto";
    public static final String PALABRA_REPETIDO = "esta la palabra clave ya existe";

    private ArrayList<PalabraClave> palabrasClaves = new ArrayList<>();
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
            if(!this.palabrasClaves.contains(r)) {
                this.palabrasClaves.add(r);
                return PALABRA_EXITO;    
            }
            else
                return PALABRA_REPETIDO;
        }
        else
            return PALABRA_NOMBRE_INCORECTO;
    }

    @Override
    public ArrayList<PalabraClave> verPalabrasClaves() {
        return palabrasClaves;
    }

    @Override
    public PalabraClave verPalabraClave(String nombre) {
        PalabraClave r = new PalabraClave(nombre);
        if (this.palabrasClaves.contains(r)){
            return r;
        }
        else
            return null;
    }
}
