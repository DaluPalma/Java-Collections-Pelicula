package Servicio;

import ENTIDADES.Pelicula;
import java.util.Comparator;

public class Servicio_Comparar {

    public static Comparator<Pelicula> ordenDuracionMm = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return Double.compare(t1.getDuracion(), t.getDuracion());

        }
    };

    public static Comparator<Pelicula> ordenDuracionmM = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return Double.compare(t.getDuracion(), t1.getDuracion());

        }
    };

    public static Comparator<Pelicula> ordenTitulos = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareTo( t1.getTitulo());

        }
    };
    public static Comparator<Pelicula> ordenDirectores = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareTo( t1.getDirector());

        }
    };
}
