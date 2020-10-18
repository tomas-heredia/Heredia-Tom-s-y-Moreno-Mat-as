
package principal.controladores;

import Publicaciones.Modelos.Publicacion;
import autores.modelos.Alumno;
import autores.modelos.Autor;
import autores.modelos.Cargo;
import autores.modelos.Profesor;
import autores.vistas.VentanaAMAlumno;
import autores.vistas.VentanaAMProfesor;
import grupos.modelos.Grupo;
import grupos.modelos.Rol;
import grupos.modelos.MiembroEnGrupo;
import grupos.vistas.VentanaAMGrupo;
import idiomas.modelos.Idioma;
import idiomas.vistas.VentanaAIdioma;
import java.time.LocalDate;
import java.util.ArrayList;
import lugares.modelos.Lugar;
import lugares.vistas.VentanaALugar;
import palabrasclaves.modelos.PalabraClave;
import palabrasclaves.vistas.VentanaAPalabraClave;
import tipos.modelos.Tipo;
import tipos.vistas.VentanaATipo;


public class ControladorPrincipal {
    public static void main(String[] args) {
        
        ArrayList<Alumno> deAlumno = new ArrayList<>();
        ArrayList<Profesor> deProfesor = new ArrayList<>();
        ArrayList<Idioma> deIdioma = new ArrayList<>();
        ArrayList<Lugar> deLugar = new ArrayList<>();
        ArrayList<PalabraClave> dePalabraClave = new ArrayList<>();
        ArrayList<PalabraClave> dePalabraClave1 = new ArrayList<>();
        ArrayList<PalabraClave> dePalabraClave2 = new ArrayList<>();
        ArrayList<PalabraClave> dePalabraClave3 = new ArrayList<>();
        ArrayList<PalabraClave> dePalabraClave4 = new ArrayList<>();
        ArrayList<Tipo> deTipo = new ArrayList<>();
        ArrayList<Grupo> deGrupo = new ArrayList<>(); 
        ArrayList<Publicacion> dePublicacion = new ArrayList<>();
        ArrayList<Autor> deAutor = new ArrayList<>();
        
        
////<editor-fold defaultstate="collapsed" desc="Alumnos">

    System.out.println("***************ALUMNOS***************");
    Alumno AlumnoUno = new Alumno(1234, "Heredia", "tomas" ,"si", "sx");
    Alumno AlumnoDos = new Alumno(4321, "Jolyne", "Cujoh" ,"no", "cx");
    Alumno AlumnoTres = new Alumno(42324, "Moreno", "Matias" ,"nel", "ds");
    Alumno AlumnoCuatro = new Alumno(45454, "De La Fuente", "Ernesto" ,"pel", "fu");
    Alumno AlumnoCinco = new Alumno(666, "Dall'inferno ", "Dante" ,"yes", "fp");

    deAlumno.add (AlumnoUno);

    if(!deAlumno.contains(AlumnoDos))
    {
        deAlumno.add (AlumnoDos);
    }

    if(!deAlumno.contains(AlumnoTres))
    {
        deAlumno.add (AlumnoTres);
    }

    if(!deAlumno.contains(AlumnoCuatro))
    {
        deAlumno.add (AlumnoCuatro);
    }

    if(!deAlumno.contains(AlumnoCinco))
    {
        deAlumno.add (AlumnoCinco);
    }



    for (Alumno r : deAlumno)
    {
        r.mostrar();
    }
//</editor-fold>
    
    
//<editor-fold defaultstate="collapsed" desc="Profesores">

    System.out.println("***************PROFESORES***************");
    Profesor ProfesorUno = new Profesor(12334, "Del Sueldo", "Carolina", "sd", Cargo.TITULAR);
    Profesor ProfesorDos = new Profesor(999, "Hawking", "Stephen", "ed", Cargo.ADJUNTO);
    Profesor ProfesorTres = new Profesor(5464, "Dirac", "Paul", "jh", Cargo.ASOCIADO);
    Profesor ProfesorCuatro = new Profesor(7897, "Lovecraft", "Howard Phillips", "fg", Cargo.ADG);
    Profesor ProfesorCinco = new Profesor(0001, "Maron", "Virgilio", "kb", Cargo.JTP);

    deProfesor.add (ProfesorUno);

    if(!deProfesor.contains(ProfesorDos))
    {
        deProfesor.add (ProfesorDos);
    }

    if(!deProfesor.contains(ProfesorTres))
    {
        deProfesor.add (ProfesorTres);
    }

    if(!deProfesor.contains(ProfesorCuatro))
    {
        deProfesor.add (ProfesorCuatro);
    }

    if(!deProfesor.contains(ProfesorCinco))
    {
        deProfesor.add (ProfesorCinco);
    }


    for (Profesor r : deProfesor)
    {
        r.mostrar();
    }
//</editor-fold>


//<editor-fold defaultstate="collapsed" desc="Idiomas">

    System.out.println("***************IDIOMAS***************");
    Idioma IdiomaUno = new Idioma("Español");
    Idioma IdiomaDos = new Idioma("Japones");
    Idioma IdiomaTres = new Idioma("Ingles");
    Idioma IdiomaCuatro = new Idioma("Klingon");
    Idioma IdiomaCinco = new Idioma("Elfico");

    deIdioma.add (IdiomaUno);

    if(!deIdioma.contains(IdiomaDos))
    {
        deIdioma.add (IdiomaDos);
    }

    if(!deIdioma.contains(IdiomaTres))
    {
        deIdioma.add (IdiomaTres);
    }

    if(!deIdioma.contains(IdiomaCuatro))
    {
        deIdioma.add (IdiomaCuatro);
    }

    if(!deIdioma.contains(IdiomaCinco))
    {
        deIdioma.add (IdiomaCinco);
    }



    for (Idioma r : deIdioma)
    {
        System.out.println(r);
    }
//</editor-fold>
      
    
//<editor-fold defaultstate="collapsed" desc="Lugares">

    System.out.println("***************LUGARES***************");
    Lugar LugarUno = new Lugar("Facultad");
    Lugar LugarDos = new Lugar("Congreso");
    Lugar LugarTres = new Lugar("Revista CIentífica");
    Lugar LugarCuatro = new Lugar("Libro");
    Lugar LugarCinco = new Lugar("Ponencia");

    deLugar.add (LugarUno);

    if(!deLugar.contains(LugarDos))
    {
        deLugar.add (LugarDos);
    }

    if(!deLugar.contains(LugarTres))
    {
        deLugar.add (LugarTres);
    }

    if(!deLugar.contains(LugarCuatro))
    {
        deLugar.add (LugarCuatro);
    }

    if(!deLugar.contains(LugarCinco))
    {
        deLugar.add (LugarCinco);
    }


    for (Lugar r : deLugar)
    {
        System.out.println(r);
    }
//</editor-fold>
    
    
//<editor-fold defaultstate="collapsed" desc="Palabras Claves">

    System.out.println("***************PALABRAS CLAVE***************");
    PalabraClave palabraUno = new PalabraClave("www.League of Leagend.com");
    PalabraClave palabraDos = new PalabraClave("www.Youtuve.com");
    PalabraClave palabraTres = new PalabraClave("www.Spotify.com");
    PalabraClave palabraCuatro = new PalabraClave("www.Twich.tv");
    PalabraClave palabraCinco = new PalabraClave("www.Facebook.com");
    PalabraClave palabraSeis = new PalabraClave("www.Genshin_Inpact.com");
    PalabraClave palabraSiete = new PalabraClave("www.meet.com");


    dePalabraClave.add (palabraUno);
    if(!dePalabraClave.contains(palabraDos))
    {
        dePalabraClave.add (palabraDos);
    }

    if(!dePalabraClave.contains(palabraTres))
    {
        dePalabraClave.add (palabraTres);
    }

    if(!dePalabraClave.contains(palabraCuatro))
    {
        dePalabraClave.add (palabraCuatro);
    }

    if(!dePalabraClave.contains(palabraCinco))
    {
        dePalabraClave.add (palabraCinco);
    }

    if(!dePalabraClave.contains(palabraSeis))
    {
        dePalabraClave.add (palabraSeis);
    }

    if(!dePalabraClave.contains(palabraSiete))
    {
        dePalabraClave.add (palabraSiete);
    }
    dePalabraClave1.add (palabraUno);
    dePalabraClave2.add (palabraDos);
    dePalabraClave1.add (palabraTres);
    dePalabraClave2.add (palabraCuatro);
    dePalabraClave3.add (palabraSeis);
    dePalabraClave4.add (palabraSeis);
    dePalabraClave4.add (palabraSiete);

    for (PalabraClave r : dePalabraClave)
    {
        System.out.println(r);
    }
//</editor-fold>
    
    
//<editor-fold defaultstate="collapsed" desc="Tipos">

    System.out.println("***************TIPOS***************");
    Tipo TipoUno = new Tipo ("trabajo en Congreso");
    Tipo TipoDos = new Tipo ("Capitulo de Libro");
    Tipo TipoTres = new Tipo ("Libro");
    Tipo TipoCuatro = new Tipo ("tesis");
    Tipo TipoCinco = new Tipo ("trabajo Recopilatorio");


    deTipo.add (TipoUno);

    if(!deTipo.contains(TipoDos))
    {
        deTipo.add (TipoDos);
    }

    if(!deTipo.contains(TipoTres))
    {
        deTipo.add (TipoTres);
    }

    if(!deTipo.contains(TipoCuatro))
    {
        deTipo.add (TipoCuatro);
    }

    if(!deTipo.contains(TipoCinco))
    {
        deTipo.add (TipoCinco);
    }

    for (Tipo r : deTipo)
    {
        System.out.println(r);
    }
//</editor-fold>
    
     
//<editor-fold defaultstate="collapsed" desc="Grupos">
        
    System.out.println("***************GRUPOS***************");
    
    Grupo GrupoUno = new Grupo("Dinamita", "Grupo de Colegas");
    Grupo GrupoDos = new Grupo("LIga de la Justicia", "asociación de Heroes");
    Grupo GrupoTres = new Grupo("Liga de la Injusticia", "asociación de Villanos");
    Grupo GrupoCuatro = new Grupo("T1", "Grupo de Jugadores");
    Grupo GrupoCinco = new Grupo("Los Externos", "Grupo de Deidades Externas");
    
    Autor autor1 = new Profesor(123, "apellido1", "nombre1", "1234", Cargo.ADG);
    Autor autor2 = new Profesor(1234, "apellido2", "nombre2", "1234", Cargo.ADG);
    Autor autor3 = new Profesor(1235, "apellido3", "nombre3", "1234", Cargo.ADG);

    deGrupo.add (GrupoUno);

    if(!deGrupo.contains(GrupoDos))
    {
        deGrupo.add (GrupoDos);
    }

    if(!deGrupo.contains(GrupoTres))
    {
        deGrupo.add (GrupoTres);
    }

    if(!deGrupo.contains(GrupoCuatro))
    {
        deGrupo.add (GrupoCuatro);
    }

    if(!deGrupo.contains(GrupoCinco))
    {
        deGrupo.add (GrupoCinco);
    }


    for (Grupo r : deGrupo)
    {
        r.mostrar();
    }
//</editor-fold>
    
    
//<editor-fold defaultstate="collapsed" desc="Miembros de grupo y Publicaciones">

    System.out.println("***************PUBLICACIONES***************");
    MiembroEnGrupo miembro1 = new MiembroEnGrupo(GrupoUno,  AlumnoUno, Rol.COLABORADOR);

    LocalDate fecha = LocalDate.of(2020, 9, 24);

    Publicacion publicacion1 = new Publicacion("Super Libro", fecha, "Link", "Super",dePalabraClave4, LugarUno, IdiomaUno, TipoUno, miembro1);
    //   PUBLICACION 1

    MiembroEnGrupo miembro2 = new MiembroEnGrupo(GrupoDos,  ProfesorUno, Rol.ADMINISTRADOR);

    Publicacion publicacion2 = new Publicacion("Epopella", LocalDate.of(2020, 04, 20), "Link", "Historia", dePalabraClave3, LugarDos, IdiomaDos, TipoDos, miembro2);
    //   PUBLICACION 2

    MiembroEnGrupo miembro3 = new MiembroEnGrupo(GrupoTres,  ProfesorTres, Rol.COLABORADOR);

    Publicacion publicacion3 = new Publicacion("Fisica 101", LocalDate.of(2020, 05, 17), "Link", "Ciencia", dePalabraClave2, LugarTres, IdiomaTres, TipoTres, miembro3);
    //   PUBLICACION 3

    MiembroEnGrupo miembro4 = new MiembroEnGrupo(GrupoCuatro,  ProfesorCuatro, Rol.COLABORADOR);

    Publicacion publicacion4 = new Publicacion("Programacion para Tarados", LocalDate.of(2020, 07, 15), "Link", "Libro",dePalabraClave1, LugarCuatro, IdiomaCuatro, TipoCuatro, miembro4);
    //   PUBLICACION 4

    MiembroEnGrupo miembro5 = new MiembroEnGrupo(GrupoCinco,  ProfesorCinco, Rol.COLABORADOR);

    Publicacion publicacion5 = new Publicacion("La Divina Comedia", LocalDate.of(2020, 01, 01), "Link", "Hobra maestra", dePalabraClave, LugarCinco, IdiomaCinco, TipoCinco, miembro5);
    //   PUBLICACION 5


    dePublicacion.add(publicacion1);
    
    if(!dePublicacion.contains(publicacion2))
    {
        dePublicacion.add(publicacion2);
    }
    
     if(!dePublicacion.contains(publicacion3))
    {
        dePublicacion.add(publicacion3);
    }
    
    if(!dePublicacion.contains(publicacion4))
    {
        dePublicacion.add(publicacion4);
    }
     
    if(!dePublicacion.contains(publicacion5))
    {
        dePublicacion.add(publicacion5);
    }
    

    for (Publicacion r : dePublicacion)
    {
        r.mostrar();
    }
//</editor-fold>
    
    
//<editor-fold defaultstate="collapsed" desc="Autores">

        System.out.println("***************AUTORES***************");

        deAutor.add(AlumnoUno);
        
        if(!deAutor.contains(AlumnoDos)){
            deAutor.add (AlumnoDos);
        }
        if(!deAutor.contains(AlumnoTres)){
            deAutor.add (AlumnoTres);
        }
        if(!deAutor.contains(ProfesorUno)){
            deAutor.add (ProfesorUno);
        }
        if(!deAutor.contains(ProfesorDos)){
            deAutor.add (ProfesorDos);
        }
        
        for (Autor x : deAutor){
            x.mostrar();
        }

//</editor-fold>
    

//<editor-fold defaultstate="collapsed" desc="Ventanas">
//parte grafica

////        VentanaAMAlumno VentAlumno = new VentanaAMAlumno(null);
////        VentanaAMProfesor VentProfesor = new VentanaAMProfesor(null);
////        VentanaAMGrupo VentGrupo = new VentanaAMGrupo(null);
////        VentanaAIdioma VentIdioma = new VentanaAIdioma(null);
////        VentanaALugar VentLugar = new VentanaALugar(null);
////        VentanaAPalabraClave VentPalabraclave = new VentanaAPalabraClave (null);
////        VentanaATipo VentTipo = new VentanaATipo(null);
////
////        VentAlumno.setVisible(true);
////        VentProfesor.setVisible(true);
////        VentGrupo.setVisible(true);
////        VentIdioma.setVisible(true);
////        VentLugar.setVisible(true);
////        VentPalabraclave.setVisible(true);
////        VentTipo.setVisible(true);
//</editor-fold>
       
    
     
       
} 
}
