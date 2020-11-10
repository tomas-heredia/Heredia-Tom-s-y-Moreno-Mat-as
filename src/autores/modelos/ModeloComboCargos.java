/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.modelos;

import autores.modelos.Cargo;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author WINDOWS 10
 */
public class ModeloComboCargos extends DefaultComboBoxModel{
    public ModeloComboCargos() {
      for(Cargo x : Cargo.values()) 
         this.addElement(x);
    }
    
    public Cargo obtenerCargo (){
        return (Cargo)this.getSelectedItem();
    }
    
    public void seleccionarCargos(Cargo cargo) {
        this.setSelectedItem(cargo);
    }
    
    
}
