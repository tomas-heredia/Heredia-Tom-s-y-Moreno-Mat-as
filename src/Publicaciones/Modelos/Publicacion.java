
package Publicaciones.Modelos;

import grupos.modelos.MiembroEnGrupo;
import idiomas.modelos.Idioma;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import lugares.modelos.Lugar;
import palabrasclaves.modelos.PalabraClave;
import tipos.modelos.Tipo;

public class Publicacion {
    private String titulo;
    private LocalDate fechaPublicacion;
    private String enlace;
    private String resumen;
    
    private ArrayList<PalabraClave> palabraclave = new ArrayList<>();
    private Lugar lugar;
    private Idioma idioma;
    private Tipo tipo;
    private MiembroEnGrupo miembro;
    private PalabraClave palabra;
    
    public Publicacion(String titulo, LocalDate fechaPublicacion, String enlace, String resumen, ArrayList<PalabraClave> palabraclave, Lugar lugar, Idioma idioma, Tipo tipo, MiembroEnGrupo miembro) {
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
        this.enlace = enlace;
        this.resumen = resumen;
        this.palabraclave = palabraclave;
        this.lugar = lugar;
        this.idioma = idioma;
        this.tipo = tipo;
        this.miembro = miembro;
    }
public Publicacion(String titulo, LocalDate fechaPublicacion, String enlace, String resumen, PalabraClave palabra, Lugar lugar, Idioma idioma, Tipo tipo, MiembroEnGrupo miembro) {
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
        this.enlace = enlace;
        this.resumen = resumen;
        this.palabra = palabra;
        this.lugar = lugar;
        this.idioma = idioma;
        this.tipo = tipo;
        this.miembro = miembro;
    }
    public String verTitulo() {
        return titulo;
    }

    public LocalDate verFechaPublicacion() {
        return fechaPublicacion;
    }

    public String verEnlace() {
        return enlace;
    }

    public String verResumen() {
        return resumen;
    }

    public ArrayList<PalabraClave> verPalabraclave() {
        return palabraclave;
    }

    public Lugar verLugar() {
        return lugar;
    }

    public Idioma verIdioma() {
        return idioma;
    }

    public Tipo verTipo() {
        return tipo;
    }

    public MiembroEnGrupo verMiembro() {
        return miembro;
    }

    public void asignarTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void asignarFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public void asignarEnlace(String enlace) {
        this.enlace = enlace;
    }

    public void asignarResumen(String resumen) {
        this.resumen = resumen;
    }

    public void asignarPalabraclave(ArrayList<PalabraClave> palabraclave) {
        this.palabraclave = palabraclave;
    }

    public void asignarLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    public void asignarIdioma(Idioma idioma) {
        this.idioma = idioma;
    }

    public void asignarTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public void asignarMiembro(MiembroEnGrupo miembro) {
        this.miembro = miembro;
    }

   
    
    
    
    
    
     public void mostrar(){
        System.out.println("Titulo: " + titulo + "\nEnlace: " + enlace + "\nResumen; " +  "\nLugar: " + lugar + "\nIdioma: " + idioma + "\nTipo:" + tipo + "\nMiembro: " + miembro);
        
        for (PalabraClave r : palabraclave)
       {
           System.out.println("\nPalabras Claves;" + r);
       } 
     }
//         public void mostrar2(){
//        System.out.println("Titulo: " + titulo + "\nEnlace: " + enlace + "\nResumen; " + "\nPalabra Clave: " + palabra + "\nLugar: " + lugar + "\nIdioma: " + idioma + "\nTipo:" + tipo + "\nMiembro: " + miembro);
//        
//       
//     }

}
