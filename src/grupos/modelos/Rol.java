
package grupos.modelos;


public enum Rol {
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
