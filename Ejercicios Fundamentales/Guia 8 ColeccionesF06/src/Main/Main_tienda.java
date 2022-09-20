/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Servicio.Servicio_tienda;
import java.util.Scanner;

/**
 *
 * @author Snakesp2
 */
public class Main_tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Servicio_tienda t1 = new Servicio_tienda();

        int menu;
        do {

            System.out.println("---Elija las opciones del 1/5---");
            System.out.println("***Ingresar producto/Precio***");
            System.out.println("***Modificar valor del producto***");
            System.out.println("***Eliminar producto de la lista***");
            System.out.println("***Mostrar productos***");
            System.out.println("***Salir***");
            System.out.print("Op-> ");
            menu = leer.nextInt();

            switch (menu) {
                case 1:
                    t1.ingresarProducto();
                    break;
                case 2:
                    t1.modificarValorproducto();
                    break;
                case 3:
                    t1.eliminarProducto();
                    break;
                case 4:
                    t1.mostrar();
                    break;
                case 5:
                    System.out.println("Nos vemos");
                    break;
            }
        } while (menu != 5);

    }
}
