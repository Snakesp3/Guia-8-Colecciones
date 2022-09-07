
package Entidad;

/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList
 */
public class Entidad_RazasPerros {
    
    public String raza;
    public String perro;

    public Entidad_RazasPerros() {
    }

    public Entidad_RazasPerros(String raza, String perro) {
        this.raza = raza;
        this.perro = perro;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getPerro() {
        return perro;
    }

    public void setPerro(String perro) {
        this.perro = perro;
    }
    
    
    
    
    
    
}
