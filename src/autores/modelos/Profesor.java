/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.modelos;


import grupos.modelos.MiembroEnGrupo;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author WINDOWS 10
 */
public class Profesor extends Autor{
    
    private Cargo cargo;
    
    private ArrayList<MiembroEnGrupo> miembro = new ArrayList<>();

    public Profesor(int dni, String apellido, String nombre, String clave, Cargo cargo) {
        super(dni,apellido,nombre,clave);
        this.cargo = cargo;
        
    }
    
    public Cargo verCargo() {
        return cargo;
    }

    public void asignarCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + this.verDni();
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(!super.equals(obj)){
            return false;
        }
        return true;
    }
    
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Cargo: "+cargo.verValor());
    }
    
}
