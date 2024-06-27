/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz.spotifyy;

/**
 *
 * @author sebastian
 */
public class cancion {

    public int id;
    public String titulo;
    public String autor;
    public int duracion;
    public int anioC;
//Creamos todos los "Actores"

    public cancion(int id, String titulo, String autor, int duracion, int anioC) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.anioC = anioC;
        //Les asignamos un constructor a cada uno 
    }
//Creamos los sets n gets
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getAnioC() {
        return anioC;
    }

    public void setAnioC(int anioC) {
        this.anioC = anioC;
    }

}
