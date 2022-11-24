
package test;

import main.InterfazUsuario;

public class TestInterfazUsuario {
    public static void main(String[] args) {
        InterfazUsuario.mostrarTituloMenu();
        InterfazUsuario.mostrarSeparacionInterfaz();
        InterfazUsuario.mostrarOpcionesDeMarcas();
        InterfazUsuario.pedirDigitarOpcion();
        InterfazUsuario.mostrarOpcionCaracteristicasComprar();
        InterfazUsuario.mostrarTituloCaracteristicas();
        InterfazUsuario.mostrarOpcionIngresadaIncorrecta();
        InterfazUsuario.mostrarIdIngresadoIncorrecto();
        InterfazUsuario.mostrarMediosDePago();
        InterfazUsuario.mostrarPrecioConDescuento(2500);
        InterfazUsuario.mostrarPrecioSeisCuotas(2500);
        InterfazUsuario.mostrarPrecioDoceCuotas(2500);
    }
}
