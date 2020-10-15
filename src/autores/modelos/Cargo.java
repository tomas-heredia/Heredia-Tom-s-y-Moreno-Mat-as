/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.modelos;

/**
 *
 * @author WINDOWS 10
 */
public enum Cargo {
    TITULAR("Titular"),
    ASOCIADO("Asociado"),
    ADJUNTO("Asociado"),
    JTP("Jefe de Trabajo Practico"),
    ADG("Aux. Docente Graduado");
private String valor;
  
private Cargo(String valor){
    this.valor = valor;
}

    public String verValor() {
        return valor;
    }

    public void asignarValor(String valor) {
        this.valor = valor;
    }
}
