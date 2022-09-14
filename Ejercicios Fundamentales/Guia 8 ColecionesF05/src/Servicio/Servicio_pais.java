package Servicio;

import Entidad.Entidad_pais;
import java.util.Iterator;

import java.util.Scanner;
import java.util.TreeSet;

/*Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
public class Servicio_pais {

    /*e requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
    usaremos un conjunto*/
    TreeSet<String> paisorden = new TreeSet();
    Scanner leer = new Scanner(System.in);
    Entidad_pais p = new Entidad_pais();

    public void agregarPaises() {

        String ingresar = "s";
        /*El programa pedirá un país en un bucle, se guardará el país en el
    conjunto*/
        do {
            System.out.println("Ingrese Paises");
            String pais = leer.next();
            paisorden.add(pais);
            System.out.println("Quiere seguir ingresando Paises? S/N");
            ingresar = leer.next();

            /*después se le preguntará al usuario si quiere guardar otro país o si quiere salir*/
        } while (!ingresar.equalsIgnoreCase("n"));

    }

    /*si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
    los servicios en la clase correspondiente)*/
    public void mostrarpaises() {

        for (String orden : paisorden) {
            System.out.println(orden);
        }
    }

    /*Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
    buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
    usuario y se mostrará el conjunto.*/
    public void borrarPais() {
        Iterator it = paisorden.iterator();
        System.out.println("Ingrese el Paise que decea eliminar");
        String borrar = leer.next();
        boolean verificar = true;
        while (it.hasNext()) {
            if (it.next().equals(borrar)) {
                it.remove();
            }
        }

    }

    public void mostrarPaisBorrado() {
        borrarPais();
        System.out.println("Paises que van al mundial");

        for (String paises : paisorden) {
            System.out.println(paises);
            System.out.println("-------------");
        }

    }
}
