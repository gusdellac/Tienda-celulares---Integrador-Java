# ProyectoCelulares

// GRUPO OMEGA - OMEGA CELULARES
package Proyecto;

import java.util.Scanner;

public class GrupoOmega {

   public static void main(String[] args) {

Scanner entrada= new Scanner (System.in);
        System.out.println("Digite una opcion del menu: ");
        var numero = Integer.parseInt(entrada.nextLine());
        var numeroTexto = "numero desconocido";
        switch (numero){
                case 1:
                    numeroTexto = "1. SAMSUNG";
                    break;
                case 2:
                    numeroTexto = "2. MOTOROLA";
                    break;
                case 3:
                    numeroTexto = "3. APPLE";
                    break;
                case 4:
                    numeroTexto = "4. XIOAMI";
                    break;
                 case 5:
                    numeroTexto = "5. SALIR";
                    break;
                default:
                    numeroTexto= "Digite otra ocion de menu";  
        }            
        System.out.println("numeroTexto = " + numeroTexto);
}

}
