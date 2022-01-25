package Servicio;

import ENTIDADES.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Servicio_Pelicula {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Pelicula> peliculas = new ArrayList();

    public void CrearPelicula() {

        ArrayList<String> caracteristicas = new ArrayList();
        Pelicula p = new Pelicula();
        System.out.println("Ingrese el titulo de la película");
        String titulo = leer.next();
        p.setTitulo(titulo);
        System.out.println("Ingrese el nombre del director de la película");
        String director = leer.next();
        p.setDirector(director);
        System.out.println("Ingrese la duracion de la película");
        double duracion = leer.nextDouble();
        p.setDuracion(Double.NaN);
        peliculas.add(p);
    }
    public void MostrarPelicula(){
        for (Pelicula aux : peliculas) {
            System.out.println("• "+ aux.getTitulo());
        }
    }
    public void MostrarPeliculaMayor(){
        for (Pelicula aux2 : peliculas) {
            System.out.println("Películas con una duración mayor a 1 hora");
            if (aux2.getDuracion()>1) {
                System.out.println("• " + aux2.getTitulo());
            }
        }
    }
    
    public void OrdenarMayorMenor(){
        Collections.sort(peliculas, Servicio_Comparar.ordenDuracionMm);
        for (Pelicula pelicula : peliculas) {
            System.out.println("• " + pelicula.getDuracion() + "(" +pelicula.getTitulo()+")");
        }
    }
    public void OrdenarMenorMayor(){
        Collections.sort(peliculas, Servicio_Comparar.ordenDuracionmM);
        for (Pelicula pelicula : peliculas) {
            System.out.println("• " + pelicula.getDuracion() + "(" +pelicula.getTitulo()+")");
        }
    }
    public void OrdenarTitulo(){
        Collections.sort(peliculas, Servicio_Comparar.ordenTitulos);
        System.out.println("Orden alfabético de títulos");
        for (Pelicula pelicula : peliculas) {
            System.out.println("• " +  "(" +pelicula.getTitulo()+")");
        }
    }
    
    public void OrdenarDirector(){
        Collections.sort(peliculas, Servicio_Comparar.ordenDirectores);
        System.out.println("Orden alfabético de nombres de directores");
        for (Pelicula pelicula : peliculas) {
            System.out.println("• " +  "(" +pelicula.getDirector()+")");
        }
    }
    
    }
    

