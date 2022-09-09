
package Main;

import Servicio.Servicio_pelicula;

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
public class Main_pelicula {

   
    public static void main(String[] args) {
       
        Servicio_pelicula p1 = new Servicio_pelicula();
        
        p1.crearpelicula();
        System.out.println("---------------");
        p1.mostrarTodasLasPeliculas();
        System.out.println("---------------");
        p1.duracionPeli();
        System.out.println("----------------");
        p1.peliMayorMenor();
        System.out.println("----------------");
        p1.peliMenorMayor();
        System.out.println("----------------");
        p1.ordenarPelisAlfabe();
        System.out.println("----------------");
        p1.ordenarDireAlfabe();
        
    }
    
}
