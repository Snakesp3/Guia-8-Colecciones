
package Entidad;

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
public class Entidad_pelis {
    
    private String director;
    private String nombre;
    private Double duracion;

    public Entidad_pelis() {
    }

    public Entidad_pelis(String director, String nombre, Double duracion) {
        this.director = director;
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public String getDirector() {
        return director;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return "***INFO***" + " \nDirector:\n" +"-"+ director + "\nNombre:\n" +"-"+ nombre + " \nDuracion:\n"  +"-"+ duracion + "-";
    }
    
    
}
