
package main;

public abstract class InterfazUsuario {

    public static void mostrarTituloMenu(){
        System.out.println("\t\t\t   <<<<<<CELULARES OMEGA>>>>>>>\n");
    }
    
    public static void mostrarSeparacionInterfaz(){
        System.out.println("------------------------------------------"
                + "-------------------------------------");
    }
    
    public static void mostrarOpcionesDeMarcas(){
        System.out.println("\t<<<SAMSUNG>>>\t\t\t\t\t\t<<<MOTOROLA>>>");
        System.out.println("\t<<<APPLE>>>\t\t\t\t\t\t<<<XIAOMI>>>");
        System.out.println("");
        System.out.println("1. Samsung");
        System.out.println("2. Motorola");
        System.out.println("3. Apple");
        System.out.println("4. Xiaomi");
        System.out.println("5. Mostrar todas");
    }
    
    public static void pedirDigitarOpcion() {
        System.out.print("\nDigite una opción: ");
    }
    
    public static void mostrarOpcionCaracteristicasComprar(){
        System.out.println("1. Ver características.");
        System.out.println("2. Comprar.");
        pedirDigitarOpcion();
    }
    
    public static void mostrarTituloCaracteristicas(){
        System.out.println("\n<<<Características>>> \n");
    }
    
    public static void mostrarOpcionComprarVolverMenuPrincipal(){
        System.out.println("\n1. Comprar.");
        System.out.println("2. Volver al ménu principal.");
        pedirDigitarOpcion();
    }
    
    public static void mostrarOpcionIngresadaIncorrecta(){
        System.out.println("\t\t***La opción elegida es "
                            + "inexistente***\n");
        System.out.println("\t\t***Por favor digite nuevamente***\n");
    }
    
    public static void mostrarIdIngresadoIncorrecto(){
        System.out.println("\t\t***El id ingresado es inexistente***\n");
    }
    
    public static void mostrarMediosDePago(){
        System.out.println("\t\t\t<<<<<<METODOS DE PAGO>>>>>>>\n");
        System.out.println("1. Mercado Pago (15% de descuento)");
        System.out.println("2. Transferencia bancaria  (15% de descuento)");
        System.out.println("3. Tarjeta débito (10% de descuento)");
        System.out.println("4. Tarjeta crédito 6/12 cuotas sin interes");
        pedirDigitarOpcion();
    }
    
    public static void mostrarPrecioConDescuento(double precio){
        System.out.print("El precio con descuento es: "+ precio);
    }
    
    public static void mostrarPrecioSeisCuotas(double precio){
        System.out.println("El monto a pagar en 6 cuotas es de: "+precio+
                " sin interés");
    }
    
    public static void mostrarPrecioDoceCuotas(double precio){
        System.out.println("El monto a pagar en 12 cuotas es de: "+precio+
                " sin interés");
    }
    
}
