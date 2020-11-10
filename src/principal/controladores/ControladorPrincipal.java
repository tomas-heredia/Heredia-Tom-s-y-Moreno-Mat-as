
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
        
        ArrayList<Alumno> alumnoList = new ArrayList<>();
        ArrayList<Profesor> profesorList = new ArrayList<>();
        ArrayList<Idioma> idiomaList = new ArrayList<>();
        ArrayList<Lugar> lugarList = new ArrayList<>();
        ArrayList<PalabraClave> palabraClaveList = new ArrayList<>();
        ArrayList<PalabraClave> palabraClaveList2 = new ArrayList<>();
        ArrayList<PalabraClave> palabraClaveList3 = new ArrayList<>();
        ArrayList<PalabraClave> palabraClaveList4 = new ArrayList<>();
        ArrayList<PalabraClave> palabraClaveList5 = new ArrayList<>();
        ArrayList<Tipo> tipoList = new ArrayList<>();
        ArrayList<Grupo> grupoList = new ArrayList<>(); 
        ArrayList<Publicacion> publicacionList = new ArrayList<>();
        ArrayList<Autor> autorList = new ArrayList<>();
        
        
////<editor-fold defaultstate="collapsed" desc="Alumnos">

    System.out.println("***************ALUMNOS***************");
    Alumno alumno1 = new Alumno(1, "apellidos1", "nombres1" ,"clave1", "cx1");
    Alumno alumno2 = new Alumno(2, "apellidos2", "nombres2" ,"clave2", "cx2");
    Alumno alumno3 = new Alumno(3, "apellidos3", "nombres3" ,"clave3", "cx3");
    Alumno alumno4 = new Alumno(4, "apellidos4", "nombres4" ,"clave4", "cx4");
    Alumno alumno5 = new Alumno(5, "apellidos5", "nombres5" ,"clave5", "cx5");

    Alumno alumno6 = new Alumno(11, "apellidos6", "nombres6" ,"clave6", "cx6");  //tp 4 parte 3_3
    
    alumnoList.add (alumno1);

    if(!alumnoList.contains(alumno2))
    {
        alumnoList.add (alumno2);
    }

    if(!alumnoList.contains(alumno3))
    {
        alumnoList.add (alumno3);
    }

    if(!alumnoList.contains(alumno4))
    {
        alumnoList.add (alumno4);
    }

    if(!alumnoList.contains(alumno5))
    {
        alumnoList.add (alumno5);
    }

    for (Alumno r : alumnoList)
    {
        r.mostrar();
    }
//</editor-fold>
    
    
//<editor-fold defaultstate="collapsed" desc="Profesores">

    System.out.println("***************PROFESORES***************");
    Profesor profesor1 = new Profesor(6, "apellidos6", "nombres6", "clave6", Cargo.TITULAR);
    Profesor profesor2 = new Profesor(7, "apellidos7", "nombres7", "clave7", Cargo.ADJUNTO);
    Profesor profesor3 = new Profesor(8, "apellidos8", "nombres8", "clave8", Cargo.ASOCIADO);
    Profesor profesor4 = new Profesor(9, "apellidos9", "nombres9", "clave9", Cargo.ADG);
    Profesor profesor5 = new Profesor(10, "apellidos10", "nombres10", "clave10", Cargo.JTP);

    Profesor profesor6 = new Profesor(12, "apellidos11", "nombres11", "clave11", Cargo.ADG);

    
    profesorList.add (profesor1);

    if(!profesorList.contains(profesor2))
    {
        profesorList.add (profesor2);
    }

    if(!profesorList.contains(profesor3))
    {
        profesorList.add (profesor3);
    }

    if(!profesorList.contains(profesor4))
    {
        profesorList.add (profesor4);
    }

    if(!profesorList.contains(profesor5))
    {
        profesorList.add (profesor5);
    }


    for (Profesor r : profesorList)
    {
        r.mostrar();
    }
//</editor-fold>


//<editor-fold defaultstate="collapsed" desc="Idiomas">

    System.out.println("***************IDIOMAS***************");
    Idioma idioma1 = new Idioma("idioma1");
    Idioma idioma2 = new Idioma("idioma2");
    Idioma idioma3 = new Idioma("idioma3");
    Idioma idioma4 = new Idioma("idioma4");
    Idioma idioma5 = new Idioma("idioma5");

    idiomaList.add (idioma1);

    if(!idiomaList.contains(idioma2))
    {
        idiomaList.add (idioma2);
    }

    if(!idiomaList.contains(idioma3))
    {
        idiomaList.add (idioma3);
    }

    if(!idiomaList.contains(idioma4))
    {
        idiomaList.add (idioma4);
    }

    if(!idiomaList.contains(idioma5))
    {
        idiomaList.add (idioma5);
    }

    for (Idioma r : idiomaList)
    {
        System.out.println(r);
    }
//</editor-fold>
      
    
//<editor-fold defaultstate="collapsed" desc="Lugares">

    System.out.println("***************LUGARES***************");
    Lugar lugar1 = new Lugar("lugar1");
    Lugar lugar2 = new Lugar("lugar2");
    Lugar lugar3 = new Lugar("lugar3");
    Lugar lugar4 = new Lugar("lugar4");
    Lugar lugar5 = new Lugar("lugar5");

    lugarList.add (lugar1);

    if(!lugarList.contains(lugar2))
    {
        lugarList.add (lugar2);
    }

    if(!lugarList.contains(lugar3))
    {
        lugarList.add (lugar3);
    }

    if(!lugarList.contains(lugar4))
    {
        lugarList.add (lugar4);
    }

    if(!lugarList.contains(lugar5))
    {
        lugarList.add (lugar5);
    }


    for (Lugar r : lugarList)
    {
        System.out.println(r);
    }
//</editor-fold>
    
    
//<editor-fold defaultstate="collapsed" desc="Palabras Claves">

    System.out.println("***************PALABRAS CLAVE***************");
    PalabraClave palabraClave1 = new PalabraClave("palabraClave1");
    PalabraClave palabraClave2 = new PalabraClave("palabraClave2");
    PalabraClave palabraClave3 = new PalabraClave("palabraClave3");
    PalabraClave palabraClave4 = new PalabraClave("palabraClave4");
    PalabraClave palabraClave5 = new PalabraClave("palabraClave5");
    PalabraClave palabraClave6 = new PalabraClave("palabraClave6");
    PalabraClave palabraClave7 = new PalabraClave("palabraClave7");


    palabraClaveList.add (palabraClave1);
    if(!palabraClaveList.contains(palabraClave2))
    {
        palabraClaveList.add (palabraClave2);
    }

    if(!palabraClaveList.contains(palabraClave3))
    {
        palabraClaveList.add (palabraClave3);
    }

    if(!palabraClaveList.contains(palabraClave4))
    {
        palabraClaveList.add (palabraClave4);
    }

    if(!palabraClaveList.contains(palabraClave5))
    {
        palabraClaveList.add (palabraClave5);
    }

    if(!palabraClaveList.contains(palabraClave6))
    {
        palabraClaveList.add (palabraClave6);
    }

    if(!palabraClaveList.contains(palabraClave7))
    {
        palabraClaveList.add (palabraClave7);
    }
    palabraClaveList2.add (palabraClave1);
    palabraClaveList3.add (palabraClave2);
    palabraClaveList2.add (palabraClave3);
    palabraClaveList3.add (palabraClave4);
    palabraClaveList4.add (palabraClave6);
    palabraClaveList5.add (palabraClave6);
    palabraClaveList5.add (palabraClave7);

    for (PalabraClave r : palabraClaveList)
    {
        System.out.println(r);
    }
//</editor-fold>
    
    
//<editor-fold defaultstate="collapsed" desc="Tipos">

    System.out.println("***************TIPOS***************");
    Tipo tipo1 = new Tipo ("tipo1");
    Tipo tipo2 = new Tipo ("tipo2");
    Tipo tipo3 = new Tipo ("tipo3");
    Tipo tipo4 = new Tipo ("tipo4");
    Tipo tipo5 = new Tipo ("tipo5");


    tipoList.add (tipo1);

    if(!tipoList.contains(tipo2))
    {
        tipoList.add (tipo2);
    }

    if(!tipoList.contains(tipo3))
    {
        tipoList.add (tipo3);
    }

    if(!tipoList.contains(tipo4))
    {
        tipoList.add (tipo4);
    }

    if(!tipoList.contains(tipo5))
    {
        tipoList.add (tipo5);
    }

    for (Tipo r : tipoList)
    {
        System.out.println(r);
    }
//</editor-fold>
    
     
//<editor-fold defaultstate="collapsed" desc="Grupos">
        
    System.out.println("***************GRUPOS***************");
    
    Grupo grupo1 = new Grupo("grupo1", "descripcion1");
    Grupo grupo2 = new Grupo("grupo2", "descripcion2");
    Grupo grupo3 = new Grupo("grupo3", "descripcion3");
    Grupo grupo4 = new Grupo("grupo4", "descripcion4");
    Grupo grupo5 = new Grupo("grupo5", "descripcion5");
    
   
    Grupo grupo6 = new Grupo("grupo6", "descripcion6"); //tp 4 parte 3_3
    Grupo grupo7 = new Grupo("grupo7", "descripcion7"); //tp 4 parte 3_3
    Grupo grupo8 = new Grupo("Super Administradores", "descripcion8"); //tp 4 parte 3_3
    
    grupoList.add (grupo1);

    if(!grupoList.contains(grupo2))
    {
        grupoList.add (grupo2);
    }

    if(!grupoList.contains(grupo3))
    {
        grupoList.add (grupo3);
    }

    if(!grupoList.contains(grupo4))
    {
        grupoList.add (grupo4);
    }

    if(!grupoList.contains(grupo5))
    {
        grupoList.add (grupo5);
    }


    for (Grupo r : grupoList)
    {
        r.mostrar();
    }
//</editor-fold>
    
    
//<editor-fold defaultstate="collapsed" desc="Miembros de grupo y Publicaciones">

    System.out.println("***************PUBLICACIONES***************");
    MiembroEnGrupo miembro1 = new MiembroEnGrupo(grupo1,  alumno1, Rol.COLABORADOR);
    LocalDate fecha = LocalDate.of(2020, 9, 24);

    Publicacion publicacion1 = new Publicacion("Super Libro", fecha, "Link", "Super",palabraClaveList5, lugar1, idioma1, tipo1, miembro1);
    //   PUBLICACION 1

    MiembroEnGrupo miembro2 = new MiembroEnGrupo(grupo2,  profesor1, Rol.ADMINISTRADOR);

    Publicacion publicacion2 = new Publicacion("Epopella", LocalDate.of(2020, 04, 20), "Link", "Historia", palabraClaveList4, lugar2, idioma2, tipo2, miembro2);
    //   PUBLICACION 2

    MiembroEnGrupo miembro3 = new MiembroEnGrupo(grupo3,  profesor3, Rol.COLABORADOR);

    Publicacion publicacion3 = new Publicacion("Fisica 101", LocalDate.of(2020, 05, 17), "Link", "Ciencia", palabraClaveList3, lugar3, idioma3, tipo3, miembro3);
    //   PUBLICACION 3

    MiembroEnGrupo miembro4 = new MiembroEnGrupo(grupo4,  profesor4, Rol.COLABORADOR);

    Publicacion publicacion4 = new Publicacion("Programacion para Tarados", LocalDate.of(2020, 07, 15), "Link", "Libro",palabraClaveList2, lugar4, idioma4, tipo4, miembro4);
    //   PUBLICACION 4

    MiembroEnGrupo miembro5 = new MiembroEnGrupo(grupo5,  alumno5, Rol.COLABORADOR);

    Publicacion publicacion5 = new Publicacion("La Divina Comedia", LocalDate.of(2020, 01, 01), "Link", "Hobra maestra", palabraClaveList, lugar5, idioma5, tipo5, miembro5);
    //   PUBLICACION 5


    publicacionList.add(publicacion1);
    
    if(!publicacionList.contains(publicacion2))
    {
        publicacionList.add(publicacion2);
    }
    
     if(!publicacionList.contains(publicacion3))
    {
        publicacionList.add(publicacion3);
    }
    
    if(!publicacionList.contains(publicacion4))
    {
        publicacionList.add(publicacion4);
    }
     
    if(!publicacionList.contains(publicacion5))
    {
        publicacionList.add(publicacion5);
    }
    

    for (Publicacion r : publicacionList)
    {
        r.mostrar();
    }
//</editor-fold>
    
    
//<editor-fold defaultstate="collapsed" desc="Autores">

        System.out.println("***************AUTORES***************");

        autorList.add(alumno1);
        
        if(!autorList.contains(alumno2)){
            autorList.add (alumno2);
        }
        if(!autorList.contains(alumno3)){
            autorList.add (alumno3);
        }
        if(!autorList.contains(profesor1)){
            autorList.add (profesor1);
        }
        if(!autorList.contains(profesor2)){
            autorList.add (profesor2);
        }
        
        for (Autor x : autorList){
            x.mostrar();
        }

//</editor-fold>
  
//<editor-fold defaultstate="collapsed" desc="TP4">


    System.out.println("************TP4***********");

    grupo6.agregarMiembro(alumno6, Rol.ADMINISTRADOR);
    grupo6.agregarMiembro(profesor6, Rol.ADMINISTRADOR);
    grupo6.agregarMiembro(alumno5, Rol.ADMINISTRADOR);
    
    System.out.println("***Grupo 6***");
    grupo6.mostrar();
    
    
    grupo7.agregarMiembro(alumno6, Rol.ADMINISTRADOR);
    
    alumno6.agregarGrupo(grupo6, Rol.COLABORADOR);
    
    System.out.println("***alumno6***");

    alumno6.mostrar();
    
    System.out.println("***profesor6***");

    profesor6.mostrar();
    
    
    grupo6.quitarMiembro(alumno6);
    
    System.out.println("***Eliminacion de alumno6 del grupo6***");
    grupo6.mostrar();
    
    System.out.println("....Grupo Super Administrador...");
    grupo8.agregarMiembro(alumno6, Rol.COLABORADOR);
    grupo8.mostrar();
    
    System.out.println("\n ... Verificacion de Grupos ...\n");

    
    if(grupo8.esSuperAdministradores())
    {
        System.out.println(" GrupoSup es un grupo de Super Administradores");
    }
    else{
        System.out.println(" GrupoSup no es un grupo de Super Administradores");
    }
    
    if(grupo6.esSuperAdministradores())
    {
        System.out.println(" GrupoDeDos es un grupo de Super Administradores");
    }
    else{
        System.out.println(" GrupoDeDos no es un grupo de Super Administradores");
    }
    
    if(grupo7.esSuperAdministradores())
    {
        System.out.println(" GrupoDeUno es un grupo de Super Administradores");
    }
    else{
        System.out.println(" GrupoDeUno no es un grupo de Super Administradores");
    }
    
        System.out.println("\n ... Verificacion de Super Administradores ...\n");

    if(alumno6.esSuperAdministrador())
    {
        System.out.println("alumno6 es un Super Administrador");
    }
    else{
        System.out.println("alumno7 no es un Super Administrador");
    }
    
     if(profesor6.esSuperAdministrador())
    {
        System.out.println("profesor6 es un Super Administrador");
    }
    else{
        System.out.println("profesor6 no es un Super Administrador");
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
