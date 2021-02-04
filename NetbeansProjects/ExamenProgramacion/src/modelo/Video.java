/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author PAVILLION
 */
public class Video {
    String nombre,genero, director,elencoprincipal, duracion;

    public Video(String nombre, String genero, String director, String elencoprincipal, String duracion) {
        this.nombre = nombre;
        this.genero = genero;
        this.director = director;
        this.elencoprincipal = elencoprincipal;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getElencoprincipal() {
        return elencoprincipal;
    }

    public void setElencoprincipal(String elencoprincipal) {
        this.elencoprincipal = elencoprincipal;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    
    
}
