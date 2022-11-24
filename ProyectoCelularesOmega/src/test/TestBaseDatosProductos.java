
package test;

import main.BaseDatosProductos;
     
public class TestBaseDatosProductos {
    public static void main(String[] args) {
        BaseDatosProductos.ingresarProductosLista("Samsung", "A13", 
                "Caracteristicas...", 49900.99);
        BaseDatosProductos.mostrarListaProductos();
        BaseDatosProductos.mostrarCaracteristicas(1);
        BaseDatosProductos.mostrarProducto(1);
        BaseDatosProductos.mostrarProductoPorMarca("Samsung");
        double precio = BaseDatosProductos.obtenerPrecioProducto(1);
        System.out.println("\n"+precio);
    }
}
