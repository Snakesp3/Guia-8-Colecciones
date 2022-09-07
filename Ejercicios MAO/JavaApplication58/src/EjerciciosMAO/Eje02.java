
package EjerciciosMAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class Eje02 {

    public static void main(String[] args) {
        
       //*Toma la Lista, el Conjunto y el Mapa del ejemplo y agrega 5 objetos a cada uno. 
        ArrayList<Integer> listado = new ArrayList();
        int a =20;
        int b =30;
        int c =45;
        int d =55;
        int e =15;      
        listado.add(a);
        listado.add(b);
        listado.add(c);
        listado.add(d);
        listado.add(e);
        
        for (Integer aux : listado) {
            System.out.println(aux);
        }
        System.out.println("---------------------");
       
        HashSet<Integer> numeros = new HashSet();
        Integer a1 = 21;
        Integer b2 = 33;
        Integer c3 = 44;
        Integer d4 = 53;
        Integer e5 = 16;
       
        numeros.add(a1);
        numeros.add(b2);
        numeros.add(c3);
        numeros.add(d4);
        numeros.add(e5);
       for (Integer aux1 : numeros) {
           System.out.println(aux1);
        }
        System.out.println("----------------------");
        
       HashMap<Integer, Alumno> alumno = new HashMap();
        int dni = 32668773;
        
      
    }
     
      
        
    }
    

