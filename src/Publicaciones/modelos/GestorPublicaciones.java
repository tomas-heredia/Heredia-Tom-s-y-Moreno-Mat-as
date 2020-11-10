/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicaciones.modelos;

import autores.modelos.Autor;
import grupos.modelos.MiembroEnGrupo;
import idiomas.modelos.Idioma;
import interfaces.IGestorPublicaciones;
import java.time.LocalDate;
import java.util.ArrayList;
import lugares.modelos.Lugar;
import palabrasclaves.modelos.PalabraClave;
import tipos.modelos.Tipo;

/**
 *
 * @author Tribilin
 */
public class GestorPublicaciones implements IGestorPublicaciones{

    public static final String PUBLICACION_EXITO = "se pudo crear la Publicacion";
    public static final String PUBLICACION_NOMBRE_INCORRECTO = "no se pudo crear la Publicacion, el nombre es incorrecto";
    public static final String PUBLICACION_REPETIDA = "esta Publicacion ya existe";
    public static final String MODIFICACION_EXITOSA = "Modificacion Exitosa";
    public static final String MODIFICACION_INVALIDA = "Datos ingresados invalidos";
    
    private ArrayList<Publicacion> publicacionList = new ArrayList<>();
    private static GestorPublicaciones instancia;
    
    private GestorPublicaciones(){
        
    }
    
    public static GestorPublicaciones crear() {
        if (instancia == null)
            instancia = new GestorPublicaciones();
        return instancia;
    }
    
    @Override
    public String nuevaPublicacion(String titulo, MiembroEnGrupo miembroEnGrupo, LocalDate fechaPublicacion, Tipo tipo, Idioma idioma, Lugar lugar, ArrayList<PalabraClave> palabrasClaves, String enlace, String resumen) {
        if ((titulo != null) && (!titulo.isBlank()) && (miembroEnGrupo!=null) && (fechaPublicacion!=null) && (tipo!=null) && (idioma!=null) && (lugar!=null) && (palabrasClaves!=null) && (enlace!=null) && (!enlace.isBlank()) && (resumen!=null) && (!resumen.isBlank())){
              Publicacion nueva = new Publicacion(titulo, fechaPublicacion, enlace, resumen, palabrasClaves, lugar, idioma, tipo, miembroEnGrupo);
            
            if(!this.publicacionList.contains(nueva)) {
                publicacionList.add(nueva);
                return PUBLICACION_EXITO;    
            }
            else
                return PUBLICACION_REPETIDA;
        }
        return PUBLICACION_NOMBRE_INCORRECTO;
    }

    @Override
    public String modificarPublicacion(Publicacion publicacion, MiembroEnGrupo miembroEnGrupo, LocalDate fechaPublicacion, Tipo tipo, Idioma idioma, Lugar lugar, ArrayList<PalabraClave> palabrasClaves, String enlace, String resumen) {
        if ((publicacion != null)&& (miembroEnGrupo!=null) && (fechaPublicacion!=null) && (tipo!=null) && (idioma!=null) && (lugar!=null) && (palabrasClaves!=null) && (enlace!=null) && (!enlace.isBlank()) && (resumen!=null) && (!resumen.isBlank())){
             
            for (Publicacion x : publicacionList) {
                
                if(x.equals(publicacion)){
                    x.asignarMiembro(miembroEnGrupo);
                    x.asignarFechaPublicacion(fechaPublicacion);
                    x.asignarTipo(tipo);
                    x.asignarIdioma(idioma);
                    x.asignarLugar(lugar);
                    x.asignarPalabraclave(palabrasClaves);
                    x.asignarEnlace(enlace);
                    x.asignarResumen(resumen);
                            
                    return MODIFICACION_EXITOSA;
                }
            }
        }
        return MODIFICACION_INVALIDA;
    }

    @Override
    public boolean hayPublicacionesConEstaPalabraClave(PalabraClave palabraClave) {
        for (Publicacion x : publicacionList) {
            if(x.verPalabraclave().contains(palabraClave)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean hayPublicacionesConEsteLugar(Lugar lugar) {
        for (Publicacion x : publicacionList) {
            if(x.verLugar().equals(lugar)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean hayPublicacionesConEsteIdioma(Idioma idioma) {
        for (Publicacion x : publicacionList) {
            if(x.verIdioma().equals(idioma)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean hayPublicacionesConEsteTipo(Tipo tipo) {
        for (Publicacion x : publicacionList) {
            if(x.verTipo().equals(tipo)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean hayPublicacionesConEsteAutor(Autor autor) {
        for (Publicacion x : publicacionList) {
            if(x.verMiembro().verAutor().equals(autor)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean existeEstaPublicacion(Publicacion publicacion) {
        for (Publicacion x : publicacionList) {
            if(x.equals(publicacion)){
                return true;
            }
        }
        return false;
    }

    @Override
    public ArrayList<Publicacion> verPublicaciones() {
        return publicacionList;
    }

    @Override
    public Publicacion verPublicacion(String titulo) {
        for (Publicacion x : publicacionList) {
            if(x.verTitulo().equals(titulo)){
                return x;
            }
        }
        return null;
    }
    
}
