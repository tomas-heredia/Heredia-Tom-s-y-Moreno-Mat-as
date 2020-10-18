
package grupos.modelos;


public enum Rol { //ROL DE CIERTO AUTOR EN UN DETERMINADO GRUPO DE TRABAJO
    ADMINISTRADOR("Administrador"),
    COLABORADOR("Colaborador"); 
private String valor;
  
private Rol(String valor){
    this.valor = valor;
}

    public String verValor() {
        return valor;
    }

    public void asignarValor(String valor) {
        this.valor = valor;
    }

}
