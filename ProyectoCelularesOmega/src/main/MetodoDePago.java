
package main;


public class MetodoDePago {

    public static double calcularDescuentoQuincePorciento(double precio){
        double precioResultado = precio - precio* 15/100;
        return precioResultado;
    }
    
    public static double calcularDescuentoDiezPorciento(double precio){
        double precioResultado = precio - precio* 10/100;
        return precioResultado;
    }
    
    public static double calcularCuotasSeis(double precio){
        double precioResultado = precio / 6;
        return precioResultado;
    }
    
     public static double calcularCuotasDoce(double precio){
        double precioResultado = precio / 12;
        return precioResultado;
    }
    
    
    
    
}
