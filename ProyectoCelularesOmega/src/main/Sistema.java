
package main;

import java.util.Scanner;


public class Sistema {
    
    private static int opcionProducto;
    private static int opcion;
    
    public static void iniciarSistema() {
        InterfazUsuario.mostrarTituloMenu();
        SistemaCreacionProductos.creacionProductos();
        InterfazUsuario.mostrarOpcionesDeMarcas();
        elegirMarca();
    }
    
    public static void elegirMarca(){
        InterfazUsuario.pedirDigitarOpcion();
        Scanner input = new Scanner(System.in);
        opcion = Integer.parseInt(input.nextLine());
        switch(opcion){
            case 1:
                BaseDatosProductos.mostrarProductoPorMarca("Samsung");
                elegirProducto(); 
                break;
            case 2:
                BaseDatosProductos.mostrarProductoPorMarca("Motorola");
                elegirProducto(); 
                break;
            case 3:
                BaseDatosProductos.mostrarProductoPorMarca("Apple");
                elegirProducto(); 
                break;
            case 4:
                BaseDatosProductos.mostrarProductoPorMarca("Xiaomi");
                elegirProducto(); 
                break;
            case 5:
                InterfazUsuario.mostrarSeparacionInterfaz();
                BaseDatosProductos.mostrarListaProductos();  
                elegirProducto(); 
                break;
            default:
                InterfazUsuario.mostrarOpcionIngresadaIncorrecta();
                InterfazUsuario.mostrarTituloMenu();
                InterfazUsuario.mostrarOpcionesDeMarcas();
                elegirMarca();
        }
        
    }
    
    public static void elegirProducto(){
        boolean productoExistente;
        Scanner input = new Scanner(System.in);
        InterfazUsuario.pedirDigitarOpcion();
        opcionProducto = Integer.parseInt(input.nextLine());
        productoExistente = BaseDatosProductos.mostrarProducto(opcionProducto);
        if(productoExistente){
            elegirOpciones();
        }else{
            BaseDatosProductos.mostrarListaProductos();
            elegirProducto();
        }      
    }
    
    public static void elegirOpciones(){
        Scanner input = new Scanner(System.in);
        InterfazUsuario.mostrarOpcionCaracteristicasComprar();
        opcion = Integer.parseInt(input.nextLine());
        switch (opcion) {
            case 1:
                InterfazUsuario.mostrarSeparacionInterfaz();
                BaseDatosProductos.mostrarCaracteristicas(opcionProducto);
                InterfazUsuario.mostrarOpcionComprarVolverMenuPrincipal();
                opcion = Integer.parseInt(input.nextLine());
                switch (opcion) {
                    case 1:
                        elegirOpcionesCompra();
                        break;
                    case 2:
                        InterfazUsuario.mostrarTituloMenu();
                        InterfazUsuario.mostrarOpcionesDeMarcas();
                        elegirMarca();
                        break;
                    default:
                        InterfazUsuario.mostrarOpcionIngresadaIncorrecta();
                        elegirOpciones();
                        break;
                }   break;
            case 2:
                elegirOpcionesCompra();
                break;
            default:
                InterfazUsuario.mostrarOpcionIngresadaIncorrecta();
                elegirOpciones();
                break;
        }
    }
    
    public static void elegirOpcionesCompra(){
        Scanner input = new Scanner(System.in);
        InterfazUsuario.mostrarSeparacionInterfaz();
        InterfazUsuario.mostrarMediosDePago();
     
        opcion = Integer.parseInt(input.nextLine());
        
        switch(opcion){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                InterfazUsuario.mostrarOpcionIngresadaIncorrecta();
                elegirOpcionesCompra();
        }
    }
}
