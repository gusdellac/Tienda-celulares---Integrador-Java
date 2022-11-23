
package test;

import main.SistemaCreacionProductos;
import main.BaseDatosProductos;

public class TestSistemaCreacionProductos {
    public static void main(String[] args) {
        SistemaCreacionProductos.creacionProductos();
        BaseDatosProductos.mostrarListaProductos();
    }
}
