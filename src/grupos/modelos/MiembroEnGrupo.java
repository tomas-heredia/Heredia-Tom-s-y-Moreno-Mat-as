
package grupos.modelos;

import autores.modelos.Autor;
import autores.modelos.Profesor;
import grupos.modelos.Grupo;
import grupos.modelos.Rol;
import java.util.Objects;


public class MiembroEnGrupo {
   private Grupo grupo;
   private Rol rol;
   private Autor autor;

    public MiembroEnGrupo(Grupo grupo,  Autor autor, Rol rol ) {
        this.grupo = grupo;
        this.rol = rol;
        this.autor = autor;
    }

    public Grupo verGrupo() {
        return grupo;
    }

    public Rol verRol() {
        return rol;
    }

    public Autor verAutor() {
        return autor;
    }

    public void asignarGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public void asignarRol(Rol rol) {
        this.rol = rol;
    }

    public void asignarAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.autor);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MiembroEnGrupo other = (MiembroEnGrupo) obj;
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        if (!Objects.equals(this.grupo, other.grupo)) {
            return false;
        }
        return true;
    }
   
    
   public void mostrar(){
       System.out.println("Grupo: "+grupo.verNombre());
       System.out.println("Autor: "+autor.verApellido()+" "+autor.verNombre());
       System.out.println("Rol: "+rol.verValor());
   }
}
