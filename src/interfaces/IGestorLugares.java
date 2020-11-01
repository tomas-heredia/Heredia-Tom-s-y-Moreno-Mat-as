/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;
import lugares.modelos.Lugar;

/**
 *
 * @author WINDOWS 10
 */
public interface IGestorLugares {
    
    public String nuevoLugar (String nombre);
    
    public ArrayList<Lugar>verLugares();
    
    public Lugar verPalabraClave (String nombre);
}
