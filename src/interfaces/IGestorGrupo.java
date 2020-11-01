/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import grupos.modelos.Grupo;
import java.util.ArrayList;

/**
 *
 * @author WINDOWS 10
 */
public interface IGestorGrupo {
    
    public String nuevoGrupo (String nombre, String descripcion);
    
    public String modificarGrupo (String nobre, String descripcion);

    public ArrayList<Grupo>verGrupos();
    
    public Grupo verPalabraClave (String nombre);
    
    public boolean existeEsteGrupo (Grupo grupo);
}
