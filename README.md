# ProyectoCelulares

package GrupoOmega;

import java.util.Scanner;

public class GrupoOmega {
    // GRUPO OMEGA - OMEGA CELULARES

   public static void main(String[] args) {

Scanner entrada= new Scanner (System.in);
        
        System.out.println("<<<<< GRUPO OMEGA - OMEGA CELULARES >>>>>");
        System.out.println(" ");
        System.out.println("Digite una opcion del menu: ");
        var numero = Integer.parseInt(entrada.nextLine());
        var opcion = "numero desconocido";
        switch (numero){
                case 1:
                    opcion = "1. SAMSUNG";
                    break;
                case 2:
                    opcion = "2. MOTOROLA";
                    break;
                case 3:
                    opcion = "3. APPLE";
                    break;
                case 4:
                    opcion = "4. XIOAMI";
                    break;
                 case 5:
                    opcion = "5. SALIR";
                    break;
                default:
                    opcion= "Digite otra ocion de menu";  
        }            
        System.out.println(opcion);
}

}
