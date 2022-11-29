
package main;

import java.util.Scanner;


public abstract class Sistema {
    
    //variable estática de tipo int para almacenar un número ingresado por
    //el usuario. Está variable será utilizada para identificar un producto
    //por su clave en el Map de clase BaseDatosProductos
    private static int opcionProducto;
    
    //variable estática de tipo int para almacenar distintas opciones en
    //diferentes métodos y ser reutilizada
    private static int opcion;
    
    //método estático void para iniciar sistema
    public static void iniciarSistema() {
        SistemaCreacionProductos.creacionProductos();
        elegirMarca();
    }
    
    //método estático void para operar con una marca en específco
    public static void elegirMarca(){
        InterfazUsuario.mostrarSeparacionInterfaz();
        InterfazUsuario.mostrarTituloMenu();
        InterfazUsuario.mostrarOpcionesDeMarcas();
        
        InterfazUsuario.pedirDigitarOpcion();
        Scanner input = new Scanner(System.in);
        opcion = Integer.parseInt(input.nextLine());
        switch(opcion){
            case 1:
                InterfazUsuario.mostrarSeparacionInterfaz();
                BaseDatosProductos.mostrarProductoPorMarca("Samsung");
                InterfazUsuario.mostrarSeparacionInterfaz();
                elegirProducto(); 
                break;
            case 2:
                InterfazUsuario.mostrarSeparacionInterfaz();
                BaseDatosProductos.mostrarProductoPorMarca("Motorola");
                InterfazUsuario.mostrarSeparacionInterfaz();
                elegirProducto(); 
                break;
            case 3:
                InterfazUsuario.mostrarSeparacionInterfaz();
                BaseDatosProductos.mostrarProductoPorMarca("Apple");
                InterfazUsuario.mostrarSeparacionInterfaz();
                elegirProducto(); 
                break;
            case 4:
                InterfazUsuario.mostrarSeparacionInterfaz();
                BaseDatosProductos.mostrarProductoPorMarca("Xiaomi");
                InterfazUsuario.mostrarSeparacionInterfaz();
                elegirProducto(); 
                break;
            case 5:
                InterfazUsuario.mostrarSeparacionInterfaz();
                BaseDatosProductos.mostrarListaProductos();  
                elegirProducto(); 
                break;
            default:
                InterfazUsuario.mostrarOpcionIngresadaIncorrecta();
                elegirMarca();
        }
        
    }
    
    //método estático void para elegir un producto
    public static void elegirProducto(){
        boolean productoExistente;
        Scanner input = new Scanner(System.in);
        InterfazUsuario.pedirDigitarOpcion();
        opcionProducto = Integer.parseInt(input.nextLine());
        productoExistente = BaseDatosProductos.mostrarProducto(opcionProducto);
        if(productoExistente){
            elegirOpcionCaracteristicasComprar();
        }else{
            BaseDatosProductos.mostrarListaProductos();
            elegirProducto();
        }      
    }
    
    //método estático void para elegir entre ver las características de un 
    //producto o comprarlo
    public static void elegirOpcionCaracteristicasComprar(){
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
                        elegirOpcionCaracteristicasComprar();
                        break;
                }   break;
            case 2:
                elegirOpcionesCompra();
                break;
            default:
                InterfazUsuario.mostrarOpcionIngresadaIncorrecta();
                elegirOpcionCaracteristicasComprar();
                break;
        }
    }
    
    //método estático void para elegir el método de pago que se desea utilizar
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
                precio = BaseDatosProductos.
                        obtenerPrecioProducto(opcionProducto);
                InterfazUsuario.mostrarPrecio(precio);
                elegirOpcionCompraMenuPrincipalSalir();
                break;
            case 2:
                precio = MetodoDePago.calcularDescuentoQuincePorciento
                (BaseDatosProductos.obtenerPrecioProducto(opcionProducto));
                InterfazUsuario.mostrarPrecio(precio);
                elegirOpcionCompraMenuPrincipalSalir();
                break;
            case 3:
                precio = MetodoDePago.calcularDescuentoDiezPorciento
                (BaseDatosProductos.obtenerPrecioProducto(opcionProducto));
                InterfazUsuario.mostrarPrecio(precio);
                elegirOpcionCompraMenuPrincipalSalir();
                break;
            case 4:
                //precio 6 cuotas
                precioSeisCuotas = MetodoDePago.calcularCuotasSeis
                  ((BaseDatosProductos.obtenerPrecioProducto(opcionProducto)));
                InterfazUsuario.mostrarPrecioSeisCuotas(precioSeisCuotas);
                elegirOpcionCompraMenuPrincipalSalir();
                break;
            case 5:
                //precio 12 cuotas
                precioDoceCuotas = MetodoDePago.calcularCuotasDoce
                  ((BaseDatosProductos.obtenerPrecioProducto(opcionProducto)));
                InterfazUsuario.mostrarPrecioDoceCuotas(precioDoceCuotas);
                elegirOpcionCompraMenuPrincipalSalir();
                break;
            default:
                InterfazUsuario.mostrarOpcionIngresadaIncorrecta();
                elegirOpcionesCompra();
        }
    }
    
    //método estático void para elegir entre opción Comprar, ir al menú 
    //principal, o salir del sistema
    public static void elegirOpcionCompraMenuPrincipalSalir(){
        InterfazUsuario.mostrarSeparacionInterfaz();
        InterfazUsuario.mostrarOpcionCompraMenuPrincipalSalir();
        InterfazUsuario.pedirDigitarOpcion();
        Scanner input = new Scanner(System.in);
        opcion = Integer.parseInt(input.nextLine());
        switch(opcion){
            case 1:
                InterfazUsuario.mostrarCompraFinalizada();
                break;
            case 2:
                elegirMarca();
                break;
            default:
                InterfazUsuario.mostrarMensajeDespedidaUsuario();  
        }
    }
}
