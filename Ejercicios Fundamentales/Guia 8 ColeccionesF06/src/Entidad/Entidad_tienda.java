/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Snakesp2
 */
public class Entidad_tienda {

    public String producto;
    public int valor;

    public Entidad_tienda() {
    }

    public Entidad_tienda(String producto, int valor) {
        this.producto = producto;
        this.valor = valor;
    }

    public String getProducto() {
        return producto;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "" + "producto= " + producto + "\n"
                + "valor= " + valor + "";
    }
}
