
package main;


public abstract class MetodoDePago {
    
    //método estático para calcular descuento 15 %
    public static double calcularDescuentoQuincePorciento(double precio){
        double precioResultado = precio - precio* 15/100;
        return precioResultado;
    }
    
    //método estático para calcular descuento 10 %
    public static double calcularDescuentoDiezPorciento(double precio){
        double precioResultado = precio - precio* 10/100;
        return precioResultado;
    }
    
    //método estático para calcular 6 cuotas
    public static double calcularCuotasSeis(double precio){
        double precioResultado = precio / 6;
        return precioResultado;
    }
    
    //método estático para calcular 12 cuotas
    public static double calcularCuotasDoce(double precio){
        double precioResultado = precio / 12;
        return precioResultado;
    }
    
    
    
    
}
