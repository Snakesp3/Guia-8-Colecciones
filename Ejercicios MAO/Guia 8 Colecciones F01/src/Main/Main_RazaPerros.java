
package Main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
 Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList
 */
public class Main_RazaPerros {

    
    public static void main(String[] args) {
      
        ArrayList<String> Dog = new ArrayList();
        Scanner Leer = new Scanner(System.in);
       
        String R = "S"; 
        
        do {
            
            System.out.println("Ingrese la raza del perro");
            Dog.add(Leer.next());
            
            System.out.println("Desea ingresar otra raza de perro S/N");
            R = Leer.next();   
            
        } while (R.equalsIgnoreCase("S"));   
        
        System.out.println(Dog.toString());
        
        System.out.println("Ingrese la raza del perro");
        String Raza = Leer.next();
        
        Iterator <String> nombre = Dog.iterator();
        
        boolean found=false;
        while(nombre.hasNext()){
            
            if (Raza.equals(nombre.next())) {
                
                nombre.remove();
                found = true;
            } 
        }
        if (!found) {
            System.out.println("La raza no se encontro");
        } 
        System.out.println(Dog.toString());
        
        do {
            
        } while (found);
        
        
    }
    
}
