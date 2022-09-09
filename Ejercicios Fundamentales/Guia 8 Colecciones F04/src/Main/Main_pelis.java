
package Main;

import Servicio.Servicio_pelis;

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
public class Main_pelis {

    
    public static void main(String[] args) {
        
        Servicio_pelis p1 = new Servicio_pelis();
        

        p1.crearpelicula();
        System.out.println("---------------");
        System.out.println("************************");
        System.out.println("*PELICULAS EN CARTELERA*");
        System.out.println("************************");
        p1.mostrarTodasLasPeliculas();
        System.out.println("---------------");
        System.out.println("***************************");
        System.out.println("*DURACION DE CADA PELICULA*");
        System.out.println("***************************");
        p1.duracionPeli();
        System.out.println("----------------");
        System.out.println("*********************************************");
        System.out.println("*PELICULAS ORDENADAS DE MAYOR A MENOR TIEMPO*");
        System.out.println("*********************************************");
        p1.peliMayorMenor();
        System.out.println("----------------");
        System.out.println("*********************************************");
        System.out.println("*PELICULAS ORDENADAS DE MENOR A MAYOR TIEMPO*");
        System.out.println("*********************************************");
        p1.peliMenorMayor();
        System.out.println("----------------");
        System.out.println("***********************************************");
        System.out.println("*PELICULAS ORDENADAS POR ORDEN ALFABETICAMENTE*");
        System.out.println("***********************************************");
        p1.ordenarPelisAlfabe();
        System.out.println("----------------");
        System.out.println("******************************************************");
        System.out.println("*PELICULAS ORDENADAS POR DIRECTOR EN ORDEN ALFABETICO*");
        System.out.println("******************************************************");
        p1.ordenarDireAlfabe();
        
        
        
    }
    
}
