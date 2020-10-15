
package grupos.modelos;

import autores.modelos.Profesor;
import grupos.modelos.Grupo;
import grupos.modelos.Rol;


public class MiembroEnGrupo {
   private Grupo grupo;
   private Rol rol;
   private Profesor profesor;

    public MiembroEnGrupo(Grupo grupo,  Profesor profesor, Rol rol ) {
        this.grupo = grupo;
        this.rol = rol;
        this.profesor = profesor;
    }

    public Grupo verGrupo() {
        return grupo;
    }

    public Rol verRol() {
        return rol;
    }

   

    public Profesor verProfesor() {
        return profesor;
    }

    public void asignarGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public void asignarRol(Rol rol) {
        this.rol = rol;
    }

   

    public void asignarProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
   
   public void mostrar(){
       System.out.println("\nGrupo:" + grupo + "\nProfesor: " + profesor + "\nRol: " + rol );
   }
}
