
package main;


public class Main {
    public static void main(String[] args) {
        SistemaCreacionProductos sis = new SistemaCreacionProductos();
        sis.creacionProductos();
        
        Sistema sistema = new Sistema();
        sistema.iniciarSistema();
    }
}
