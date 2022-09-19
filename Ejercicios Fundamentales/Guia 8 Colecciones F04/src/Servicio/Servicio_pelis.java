package Servicio;

import Entidad.Entidad_pelis;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
22
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.*/
public class Servicio_pelis {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Entidad_pelis peli = new Entidad_pelis();
    ArrayList<Entidad_pelis> movie = new ArrayList();

    public void crearpelicula() {
        String seguir = "s";
        do {
            System.out.println("Ingrese el Titulo de la Pelicula");
            String titulo = leer.next().toUpperCase();

            System.out.println("Ingrese el Director de la Pelicula");
            String director = leer.next().toUpperCase();

            System.out.println("Ingrese la Duracion de la Pelicula");
            double duracion = leer.nextDouble();

            Entidad_pelis peli = new Entidad_pelis(director, titulo, duracion);
            movie.add(peli);
            System.out.println("Agregamos mas peliculas? (s/n) ");
            seguir = leer.next();

        } while (!seguir.equalsIgnoreCase("n"));
    }

    public void mostrarTodasLasPeliculas() {

        for (Entidad_pelis aux : movie) {
            System.out.println(aux.toString());

        }
    }

    public void duracionPeli() {
        double duracion = 1;
        for (Entidad_pelis aux : movie) {

            if (aux.getDuracion() >= duracion) {
                System.out.println(aux.toString());
            }
        }
    }

    public void peliMayorMenor() {

        Collections.sort(movie, mayormenor);
        mostrarTodasLasPeliculas();
    }

    public void peliMenorMayor() {
        Collections.sort(movie, menorMayor);
        mostrarTodasLasPeliculas();
    }

    public static Comparator<Entidad_pelis> mayormenor = new Comparator<Entidad_pelis>() {
        @Override
        public int compare(Entidad_pelis t, Entidad_pelis t1) {
            double diferencia = t1.getDuracion() - t.getDuracion();

            if (diferencia > 0) {
                return 1;
            } else if (diferencia < 0) {
                return -1;
            } else {
                return 0;

            }
        }
    };
    public static Comparator<Entidad_pelis> menorMayor = new Comparator<Entidad_pelis>() {
        @Override
        public int compare(Entidad_pelis t, Entidad_pelis t1) {
            double diferencia = t.getDuracion() - t1.getDuracion();

            if (diferencia > 0) {
                return 1;
            } else if (diferencia < 0) {
                return -1;
            } else {
                return 0;

            }
        }
    };

    public void ordenarPelisAlfabe() {

        Collections.sort(movie, ordenarPorTitulo);
        mostrarTodasLasPeliculas();
    }
    public static Comparator<Entidad_pelis> ordenarPorTitulo = new Comparator<Entidad_pelis>() {
        @Override
        public int compare(Entidad_pelis t, Entidad_pelis t1) {

            return t.getNombre().compareTo(t1.getNombre());
        }
    };

    public void ordenarDireAlfabe() {
        Collections.sort(movie, ordenarPorDire);
        mostrarTodasLasPeliculas();
    }
    public static Comparator<Entidad_pelis> ordenarPorDire = new Comparator<Entidad_pelis>() {
        @Override
        public int compare(Entidad_pelis t, Entidad_pelis t1) {

            return t.getDirector().compareTo(t1.getDirector());
        }
    };
}
