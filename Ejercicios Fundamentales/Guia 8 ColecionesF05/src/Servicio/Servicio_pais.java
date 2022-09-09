package Servicio;

import Entidad.Entidad_pais;
import java.util.ArrayList;
import java.util.Scanner;

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

    ArrayList<Entidad_pais> paises = new ArrayList();
    Scanner leer = new Scanner(System.in);
    Entidad_pais p = new Entidad_pais();

    public void agregarPaises() {

        String ingresar = "s";

        do {
            System.out.println("Ingrese Paises");
            p.paises = leer.next();
            System.out.println("Quiere seguir ingresando Paises? S/N");
            ingresar = leer.next();
        } while (ingresar.equalsIgnoreCase("s"));

    }

    public void mostrarpaises() {
        
        for (Entidad_pais paise : paises) {
            System.out.println(paise.toString());
        }
        }
        

    }

}
