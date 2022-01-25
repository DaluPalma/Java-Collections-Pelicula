package ENTIDADES;

import java.util.ArrayList;

public class Pelicula {

    private String titulo;
    private String director;
    private Double duracion;
    private ArrayList<String> caracterisiticas;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Double duracion, ArrayList<String> caracterisiticas) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.caracterisiticas = caracterisiticas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    public ArrayList<String> getCaracterisiticas() {
        return caracterisiticas;
    }

    public void setCaracterisiticas(ArrayList<String> caracterisiticas) {
        this.caracterisiticas = caracterisiticas;
    }

    

}
