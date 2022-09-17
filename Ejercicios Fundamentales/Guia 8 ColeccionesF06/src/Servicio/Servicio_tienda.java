package Servicio;

import Entidad.Entidad_tienda;
import java.util.HashMap;
import java.util.Scanner;

/*Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas. */
public class Servicio_tienda {

    Scanner leer = new Scanner(System.in);
    HashMap< String, Integer> a1 = new HashMap();
    Entidad_tienda p1 = new Entidad_tienda();

    //Creamos un menu:
    public void menu(){
        
       int opcion = 0;
        System.out.println("1)**Ingresar Producto/Precio**");
        System.out.println("2)**Modificar valor del producto**");
        System.out.println("3)**Eliminar Producto**");
        System.out.println("4)**Mostrar Productos/Precios");
        System.out.println("5)**Salir**");
        
        do {
            switch (opcion) {
            case 1:
                ingresarProducto();
                break;
            case 2:
                System.out.println("");
                break;
            case 3:
                System.out.println("");
                break;
            case 4:
                mostrarProducto ();
                break;
            case 5:
                System.out.println("");
                break;    
            default:
                throw new AssertionError();
        }
        } while (opcion!=5);
        
        
        
    }
    
    
    //Ingresar producros
    public void ingresarProducto() {

        String seguir = "s";

        do {
            System.out.println("Ingrese un producto");
            String producto = leer.next().toUpperCase();
            System.out.println("Ingrese su valor");
            int precio = leer.nextInt();
            //Agregamos los valores de Producto y precio a nuestro mapa en en el orden creado
            a1.put(producto, precio);

            System.out.println("Quiere seguir agregando productos?");
            seguir = leer.next().toUpperCase();

        } while (seguir.equalsIgnoreCase("s"));

    }
public void mostrarProducto (){
    System.out.println(a1.toString());
}
}
