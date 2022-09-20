
package Servicio;

import Entidad.Entidad_tienda;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Snakesp2
 */
public class Servicio_tienda {
    
    Scanner leer = new Scanner(System.in);
    HashMap< String, Integer> t1 = new HashMap();
    Entidad_tienda p1=new Entidad_tienda();
    
    //Ingresar producros
    public void ingresarProducto() {

        String seguir = "s";

        do {
            System.out.println("Ingrese un producto");
            String producto = leer.next().toUpperCase();
            System.out.println("Ingrese su valor");
            int precio = leer.nextInt();
            //Agregamos los valores de Producto y precio a nuestro mapa en en el orden creado
            t1.put(producto, precio);

            System.out.println("Quiere seguir agregando productos? S/N");
            seguir = leer.next().toUpperCase();

        } while (seguir.equalsIgnoreCase("s"));
        mostrar();

    }

    public void modificarValorproducto() {

        System.out.println("Elija el producto al que se le modificara su valor");
        String producto = leer.next().toUpperCase();
        if (t1.containsKey(producto)) {
            System.out.println("Ingrese su nuevo valor");
            int precio = leer.nextInt();

            t1.replace(producto, precio);
            System.out.println("Los Productos son: " + t1.toString());
        } else {
            System.out.println("No se encontro el producto");
            

        }
    }

    public void mostrar() {
       // System.out.println(t1);
        for (Map.Entry<String, Integer> TiendaSeba : t1.entrySet()) {
//            String key = TiendaSeba.getKey();
//            Integer value = TiendaSeba.getValue();
            System.out.println("producto-> " + TiendaSeba.getKey()+"\n"+
                    "Precio->$ " +TiendaSeba.getValue()+"\n");
        }
    }
      public void eliminarProducto() {

        System.out.println("Elija el producto que desea eliminar");
        String producto = leer.next().toUpperCase();
        if (t1.containsKey(producto)) {
           
            t1.remove(producto);
            System.out.println("Se elimino el producto: "+producto);
            
        } else {
            System.out.println("No se encontro el producto");
            

        }
    }
}
