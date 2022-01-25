/*
 Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
Para esto, tendremos una clase Pelicula con el titulo, director y duración de la
película (en horas). Implemente las clases y métodos necesarios para esta
situación, teniendo en cuenta lo que se pide a continuación:
En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
usuario todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario
si quiere crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
en pantalla.
• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
Nota: recordar el uso del Comparator para ordenar colecciones con objetos.
 */
package colecc_ejercicio_4;

import Servicio.Servicio_Pelicula;
import java.util.Scanner;

public class COLECC_Ejercicio_4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Servicio_Pelicula serv = new Servicio_Pelicula();
        String opcion= null;
        do{
            serv.CrearPelicula();
            System.out.println("¿Desea añadir otra película? (S/N)");
            opcion= leer.next();
            
        }while (!"n".equals(opcion) && !"N".equals(opcion));
        
        serv.MostrarPelicula();
        serv.MostrarPeliculaMayor();
        serv.OrdenarMayorMenor();
        serv.OrdenarMenorMayor();
        serv.OrdenarTitulo();
        serv.OrdenarDirector();
        
        
    }
    

}
