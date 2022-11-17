
package test;

import main.BaseDatosProductos;
import main.SistemaCreacionProductos;
        
public class TestBaseDatosProductos {
    public static void main(String[] args) {
        SistemaCreacionProductos.creacionProductos();
        BaseDatosProductos.mostrarListaProductos();
        BaseDatosProductos.mostrarCaracteristicas(1);
        BaseDatosProductos.mostrarProducto(2);
    }
}
