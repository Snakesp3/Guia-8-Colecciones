package Servicio;

import Entidad.Entidad_pelicula;
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
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.*/
public class Servicio_pelicula {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Entidad_pelicula peli = new Entidad_pelicula();
    ArrayList<Entidad_pelicula> movie = new ArrayList();

    public void crearpelicula() {
        String seguir = "s";
        do {
            System.out.println("Ingrese Titulo de la Pelicula");
            String titulo = leer.next();

            System.out.println("Ingrese Director de la Pelicula");
            String director = leer.next();

            System.out.println("Ingrese Duracion de la Pelicula");
            double duracion = leer.nextDouble();

            Entidad_pelicula peli = new Entidad_pelicula(director, titulo, duracion);
            movie.add(peli);
            System.out.println("Cargamos otra peli? (s/n) ");
            seguir = leer.next();

        } while (seguir.equalsIgnoreCase("s"));

    }

    public void mostrarTodasLasPeliculas() {

        for (Entidad_pelicula aux : movie) {
            System.out.println(aux.toString());

        }

    }

    public void duracionPeli() {
        double duracion = 1;
        for (Entidad_pelicula aux : movie) {

            if (aux.getDuracion() >= duracion) {
                System.out.println(aux.toString());
            }
         }
    }
    
    
    public void peliMayorMenor(){
        
      Collections.sort(movie, mayormenor);
        mostrarTodasLasPeliculas();
    }
     public void peliMenorMayor(){
         Collections.sort(movie, menorMayor);
        mostrarTodasLasPeliculas();
     }
        
      
    public static Comparator<Entidad_pelicula> mayormenor = new Comparator<Entidad_pelicula>(){
        @Override
        public int compare(Entidad_pelicula t, Entidad_pelicula t1) {
            double diferencia = t1.getDuracion()-t.getDuracion();
            
            if (diferencia>0) {
                return 1;
            }else if (diferencia<0) {
                return -1;
            }else{
                return 0;
                
            }
        }
        
    };
     public static Comparator<Entidad_pelicula> menorMayor = new Comparator<Entidad_pelicula>(){
        @Override
        public int compare(Entidad_pelicula t, Entidad_pelicula t1) {
            double diferencia = t.getDuracion()-t1.getDuracion();
            
            if (diferencia>0) {
                return 1;
            }else if (diferencia<0) {
                return -1;
            }else{
                return 0;
                
            }
        }
        
    };       
           
     public void ordenarPelisAlfabe(){
         
         Collections.sort(movie, ordenarPorTitulo);
         mostrarTodasLasPeliculas();
         
     }
     public static Comparator<Entidad_pelicula> ordenarPorTitulo = new Comparator<Entidad_pelicula>(){
        @Override
        public int compare(Entidad_pelicula t, Entidad_pelicula t1) {
             
            return t.getNombre().compareTo(t1.getNombre());
        }
        };       
     public void ordenarDireAlfabe(){
         Collections.sort(movie, ordenarPorDire);
         mostrarTodasLasPeliculas(); 
     }
         public static Comparator<Entidad_pelicula> ordenarPorDire = new Comparator<Entidad_pelicula>(){
        @Override
        public int compare(Entidad_pelicula t, Entidad_pelicula t1) {
             
            return t.getDirector().compareTo(t1.getDirector());
        }
        }; 
         
     
 }       
    

   

    
