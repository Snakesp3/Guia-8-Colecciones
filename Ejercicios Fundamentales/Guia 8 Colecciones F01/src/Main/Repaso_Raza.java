
package Main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.*/
public class Repaso_Raza {

    
    public static void main(String[] args) {
        //Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
        
        ArrayList<String> raza = new ArrayList();
        Scanner leer = new Scanner(System.in);

        //Elprograma pedirá una raza de perro en un bucle   
        String r = "S";
        do {
           
            System.out.println("Ingrese raza de perro");
            raza.add(leer.next());
            
        //espués se le preguntará al usuario si quiere guardar otro perro o si quiere salir.
           System.out.println("Quiere guardar otra raza de perro?");
            r = leer.next();

        } while (r.equalsIgnoreCase("S"));
      
        //Si decidesalir, se mostrará todos los perros guardados en el ArrayList.
        
        System.out.println(raza.toString());
         
        /*Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
    un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
    está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
    ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
    la lista ordenada.*/
   
        Iterator<String> perros = raza.iterator();

        System.out.println("Ingrese la raza de perro que quiere buscar");
        String busqueda = leer.next();

        boolean can = false;
        while (perros.hasNext()) {
            String nombre = perros.next();
            if (nombre.equals(busqueda)) {
                perros.remove();
                can = true;
            }
        }
        if (!can) {
            System.out.println("no se encontro el maldito can");
        }
        System.out.println("Quedan" + raza.toString());
    }
 }
