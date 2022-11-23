
package test;

import main.Celular;


public class TestCelular {
    public static void main(String[] args) {
        Celular celular = new Celular("Samsung", "A13", "Caracteristicas..",
                49900.99);
        System.out.println(celular.getMarca()+celular.getModelo()+
                celular.getCaracteristicas()+celular.getPrecio());
        celular.setMarca("Motorola");
        celular.setModelo("G200");
        celular.setCaracteristicas("caracteristicas2");
        celular.setPrecio(49999.99);
        System.out.println(celular); 
    }
}
