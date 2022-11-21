
package main;

import java.util.Scanner;


public abstract class Sistema {
    
    private static int opcionProducto;
    private static int opcion;
    
    public static void iniciarSistema() {
        SistemaCreacionProductos.creacionProductos();
        InterfazUsuario.mostrarTituloMenu();
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
        double precio;
        double precioSeisCuotas;
        double precioDoceCuotas;
        switch(opcion){
            case 1:
                precio = MetodoDePago.calcularDescuentoQuincePorciento
                (BaseDatosProductos.obtenerPrecioProducto(opcionProducto));
                InterfazUsuario.mostrarPrecioConDescuento(precio);
                break;
            case 2:
                precio = MetodoDePago.calcularDescuentoQuincePorciento
                (BaseDatosProductos.obtenerPrecioProducto(opcionProducto));
                InterfazUsuario.mostrarPrecioConDescuento(precio);
                break;
            case 3:
                precio = MetodoDePago.calcularDescuentoDiezPorciento
                (BaseDatosProductos.obtenerPrecioProducto(opcionProducto));
                InterfazUsuario.mostrarPrecioConDescuento(precio);
                
                break;
            case 4:
                //precio 6 cuotas
                precioSeisCuotas = MetodoDePago.calcularCuotasSeis
                  ((BaseDatosProductos.obtenerPrecioProducto(opcionProducto)));
                InterfazUsuario.mostrarPrecioSeisCuotas(precioSeisCuotas);
                
                //precio 12 cuotas
                precioDoceCuotas = MetodoDePago.calcularCuotasDoce
                  ((BaseDatosProductos.obtenerPrecioProducto(opcionProducto)));
                InterfazUsuario.mostrarPrecioDoceCuotas(precioDoceCuotas);
                break;
            default:
                InterfazUsuario.mostrarOpcionIngresadaIncorrecta();
                elegirOpcionesCompra();
        }
    }
}
