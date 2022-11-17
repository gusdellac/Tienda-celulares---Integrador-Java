
package main;


public class Sistema {
    
    public static void iniciarSistema() {
        Menu.mostrarTituloMenu();
        SistemaCreacionProductos.creacionProductos();
        BaseDatosProductos.mostrarListaProductos();  
        Menu.elegirProducto(); 
    }
  
}
