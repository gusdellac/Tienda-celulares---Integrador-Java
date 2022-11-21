
package test;

import main.MetodoDePago;
        
public class TestMetodoDePago {
    public static void main(String[] args) {
        double precio;
        precio = MetodoDePago.calcularDescuentoQuincePorciento(2500.55);
        System.out.println(precio);
        
        precio = MetodoDePago.calcularDescuentoDiezPorciento(2500.55);
        System.out.println(precio);
        
        precio = MetodoDePago.calcularCuotasSeis(2500.55);
        System.out.println(precio);
        
        precio = MetodoDePago.calcularCuotasDoce(2500.55);
        System.out.println(precio);
    }
}
