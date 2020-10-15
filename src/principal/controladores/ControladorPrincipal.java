
package principal.controladores;

import Publicaciones.Modelos.Publicacion;
import autores.modelos.Alumno;
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

   
   
    Alumno AlumnoUno = new Alumno(1234, "Heredia", "tomas" ,"si", "sx");
    Alumno AlumnoDos = new Alumno(4321, "Meltroso", "Devora" ,"no", "cx");
    Alumno AlumnoTres = new Alumno(42324, "Distancia", "Susana" ,"nel", "ds");    
    Alumno AlumnoCuatro = new Alumno(45454, "De La Fuente", "Ernesto" ,"pel", "fu");
    Alumno AlumnoCinco = new Alumno(666, "Dall'inferno ", "Dante" ,"yes", "fp");

    deAlumno.add (AlumnoUno);
    deAlumno.add (AlumnoDos);
    deAlumno.add (AlumnoTres);
    deAlumno.add (AlumnoCuatro);
    deAlumno.add (AlumnoCinco); 

    for (Alumno r : deAlumno)
   {
       r.mostrar();
   }

    
    
    Profesor ProfesorUno = new Profesor(12334, "Del Sueldo", "Carolina", "sd", Cargo.TITULAR);
    Profesor ProfesorDos = new Profesor(999, "Hawking", "Stephen", "ed", Cargo.ADJUNTO);
    Profesor ProfesorTres = new Profesor(5464, "Dirac", "Paul", "jh", Cargo.ASOCIADO);
    Profesor ProfesorCuatro = new Profesor(7897, "Lovecraft", "Howard Phillips", "fg", Cargo.ADG);
    Profesor ProfesorCinco = new Profesor(0001, "Maron", "Virgilio", "kb", Cargo.JTP);

    deProfesor.add (ProfesorUno);
    deProfesor.add (ProfesorDos);
    deProfesor.add (ProfesorTres);
    deProfesor.add (ProfesorCuatro);
    deProfesor.add (ProfesorCinco);

    for (Profesor r : deProfesor)
   {
       r.mostrar();
   }
    
    Idioma IdiomaUno = new Idioma("Español");
    Idioma IdiomaDos = new Idioma("Japones");
    Idioma IdiomaTres = new Idioma("Ingles");
    Idioma IdiomaCuatro = new Idioma("Klingon");
    Idioma IdiomaCinco = new Idioma("Elfico");

    deIdioma.add (IdiomaUno);
    deIdioma.add (IdiomaDos);
    deIdioma.add (IdiomaTres);
    deIdioma.add (IdiomaCuatro);
    deIdioma.add (IdiomaCinco);

    for (Idioma r : deIdioma)  
   {
       System.out.println(r);
   }
   
    
    Lugar LugarUno = new Lugar("Facultad");
    Lugar LugarDos = new Lugar("Congreso");
    Lugar LugarTres = new Lugar("Revista CIentífica");
    Lugar LugarCuatro = new Lugar("Libro");
    Lugar LugarCinco = new Lugar("Ponencia");

    deLugar.add (LugarUno);
    deLugar.add (LugarDos);
    deLugar.add (LugarTres);
    deLugar.add (LugarCuatro);
    deLugar.add (LugarCinco);

    for (Lugar r : deLugar)
    {
       System.out.println(r);     
    }
    
    
    PalabraClave palabraUno = new PalabraClave("www.League of Leagend.com");
    PalabraClave palabraDos = new PalabraClave("www.Youtuve.com");
    PalabraClave palabraTres = new PalabraClave("www.Spotify.com");
    PalabraClave palabraCuatro = new PalabraClave("www.Twich.tv");  
    PalabraClave palabraCinco = new PalabraClave("www.Facebook.com");  
    PalabraClave palabraSeis = new PalabraClave("www.Genshin_Inpact.com");  
    PalabraClave palabraSiete = new PalabraClave("www.meet.com");
    
     
    dePalabraClave.add (palabraUno);
    dePalabraClave1.add (palabraUno);
    dePalabraClave.add (palabraDos);
    dePalabraClave2.add (palabraDos);
    dePalabraClave.add (palabraTres);
    dePalabraClave1.add (palabraTres);   
    dePalabraClave.add (palabraCuatro);
    dePalabraClave2.add (palabraCuatro);
    dePalabraClave.add (palabraCinco);
    dePalabraClave.add (palabraSeis);
    dePalabraClave3.add (palabraSeis);
    dePalabraClave4.add (palabraSeis);
    dePalabraClave.add (palabraSiete);
    dePalabraClave4.add (palabraSiete);
     
    for (PalabraClave r : dePalabraClave) 
    {
        System.out.println(r);   
    }
    
    
    Tipo TipoUno = new Tipo ("trabajo en Congreso");
    Tipo TipoDos = new Tipo ("Capitulo de Libro");
    Tipo TipoTres = new Tipo ("Libro");
    Tipo TipoCuatro = new Tipo ("tesis");
    Tipo TipoCinco = new Tipo ("trabajo Recopilatorio");
        
    deTipo.add (TipoUno);
    deTipo.add (TipoDos);
    deTipo.add (TipoTres);
    deTipo.add (TipoCuatro);
    deTipo.add (TipoCinco);

    for (Tipo r : deTipo) 
    {
       System.out.println(r);     
    }
    
     
    Grupo GrupoUno = new Grupo("Dinamita", "Grupo de Colegas");
    Grupo GrupoDos = new Grupo("LIga de la Justicia", "asociación de Heroes");
    Grupo GrupoTres = new Grupo("Liga de la Injusticia", "asociación de Villanos");
    Grupo GrupoCuatro = new Grupo("T1", "Grupo de Jugadores");
    Grupo GrupoCinco = new Grupo("Los Externos", "Grupo de Deidades Externas");

    deGrupo.add (GrupoUno);
    deGrupo.add (GrupoDos);
    deGrupo.add (GrupoTres);
    deGrupo.add (GrupoCuatro);
    deGrupo.add (GrupoCinco);

    for (Grupo r : deGrupo) 
    {
       r.mostrar();
    }
    
    
    MiembroEnGrupo miembro1 = new MiembroEnGrupo(GrupoUno,  ProfesorUno, Rol.ADMINISTRADOR);
    
    LocalDate fecha = LocalDate.of(2020, 9, 24);        
    
    Publicacion publicacion1 = new Publicacion("Super Libro", fecha, "Link", "Super",dePalabraClave4, LugarUno, IdiomaUno, TipoUno, miembro1);
      //   PUBLICACION 1   


    MiembroEnGrupo miembro2 = new MiembroEnGrupo(GrupoDos,  ProfesorUno, Rol.ADMINISTRADOR);
   
    Publicacion publicacion2 = new Publicacion("Epopella", LocalDate.of(2020, 04, 20), "Link", "Historia", dePalabraClave3, LugarDos, IdiomaDos, TipoDos, miembro2);
    //   PUBLICACION 2

    MiembroEnGrupo miembro3 = new MiembroEnGrupo(GrupoTres,  ProfesorTres, Rol.COLAVORADOR);

    Publicacion publicacion3 = new Publicacion("Fisica 101", LocalDate.of(2020, 05, 17), "Link", "Ciencia", dePalabraClave2, LugarTres, IdiomaTres, TipoTres, miembro3);
      //   PUBLICACION 3
    
    MiembroEnGrupo miembro4 = new MiembroEnGrupo(GrupoCuatro,  ProfesorCuatro, Rol.COLAVORADOR);

    Publicacion publicacion4 = new Publicacion("Programacion para Tarados", LocalDate.of(2020, 07, 15), "Link", "Libro",dePalabraClave1, LugarCuatro, IdiomaCuatro, TipoCuatro, miembro4);
      //   PUBLICACION 4
   
    MiembroEnGrupo miembro5 = new MiembroEnGrupo(GrupoCinco,  ProfesorCinco, Rol.COLAVORADOR);
 
    Publicacion publicacion5 = new Publicacion("La Divina Comedia", LocalDate.of(2020, 01, 01), "Link", "Hobra maestra", dePalabraClave, LugarCinco, IdiomaCinco, TipoCinco, miembro5);
      //   PUBLICACION 5  
    
   
    dePublicacion.add(publicacion1);
    dePublicacion.add(publicacion2);
    dePublicacion.add(publicacion3);
    dePublicacion.add(publicacion4);
    dePublicacion.add(publicacion5);
   
    for (Publicacion r : dePublicacion) 
    {
        r.mostrar();
    }
    
   
    
  
    
    
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
       
    
    
 
 
 
  
    
   
 
    
 
        
       
}
 
}
