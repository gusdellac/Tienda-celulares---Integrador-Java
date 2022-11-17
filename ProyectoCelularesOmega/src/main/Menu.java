
package main;

import java.util.Scanner;

public class Menu {
    
    private static int opcionProducto;
    private static int opcion;
    
    public static void mostrarTituloMenu(){
        System.out.println("\t\t\t<<<<<<CELULARES OMEGA>>>>>>>\n");
    }
    
    public static void elegirProducto(){
        boolean productoExistente;
        Scanner input = new Scanner(System.in);
        System.out.print("\nDigite una opción: ");
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
        System.out.println("1. Ver características.");
        System.out.println("2. Comprar.");
        System.out.print("\nDigite una opción: ");
        opcion = Integer.parseInt(input.nextLine());
        if(opcion == 1){
            System.out.println("------------------------------------------"
                + "-------------------------------------");
            BaseDatosProductos.mostrarCaracteristicas(opcionProducto);
            System.out.println("\n1. Comprar.");
            System.out.println("2. Volver al ménu principal.");
            System.out.print("\nDigite una opción: ");
            opcion = Integer.parseInt(input.nextLine());
            switch (opcion) {
                case 1:
                    elegirOpcionesCompra();
                    break;
                case 2:
                    mostrarTituloMenu();
                    BaseDatosProductos.mostrarListaProductos();
                    elegirProducto();
                    break;
                default:
                    System.out.println("\t\t***La opción elegida es "
                            + "inexistente***\n");
                    elegirOpciones();
                    break;
            }  
        }else if(opcion == 2){
            elegirOpcionesCompra();
        } else {
            System.out.println("\t\t***La opción elegida es "
                            + "inexistente***\n");
            elegirOpciones();
        }
    }
    
    public static void elegirOpcionesCompra(){
        Scanner input = new Scanner(System.in);
        System.out.println("------------------------------------------"
                + "-------------------------------------");
        System.out.println("\t\t\t<<<<<<METODOS DE PAGO>>>>>>>\n");
        System.out.println("1. Mercado Pago (15% de descuento)");
        System.out.println("2. Transferencia bancaria  (15% de descuento)");
        System.out.println("3. Tarjeta débito (10% de descuento)");
        System.out.println("4. Tarjeta crédito 6/12 cuotas sin interes");
        System.out.print("\nDigite una opción: ");
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
                System.out.println("\t\t***La opción elegida es inexistente***\n");
                elegirOpcionesCompra();
        }
       
    }
    
    
    
    
    
    
}
