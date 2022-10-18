
package celularesomega;

import java.util.Scanner;


public class MenuPrincipal extends Menu implements SistemaOpciones{
    
    private int opcion;
    
    public MenuPrincipal() {
        super("\t***********MENU OMEGA*************\n\n"
            + "1.SAMSUNG    /////////////////////   2.MOTOROLA\n\n"
            + "3.APPLE     /////////////////////    4.XIAOMI\n\n"
            + "5.SALIR\n");
    }

    @Override
    public int ingresarOpcion() {
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("\n\tDigite una opción de menú: ");
            this.opcion = Integer.parseInt(input.nextLine());
            
            if(this.opcion <= 0 || this.opcion > 5){
                System.out.print("\nOpción incorrecta, digite nuevamente.");
            }
        }while(this.opcion <= 0 || this.opcion > 5);
        return this.opcion;
    }

}
