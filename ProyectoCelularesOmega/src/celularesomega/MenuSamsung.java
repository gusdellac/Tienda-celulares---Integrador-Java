
package celularesomega;

import java.util.Scanner;

public class MenuSamsung extends Menu implements SistemaOpciones {
    
    private int opcion;
    
    public MenuSamsung() {
        super("\n"
            + "\t/////MENU SAMSUNG/////\n\n" +
            "1. Samsung A12 128GB/4GB\n" +
            "2. Samsung A22 128GB/4GB\n" +
            "3. Samsung S9 Plus 64GB/6GB\n" +
            "4. Samsung S20 FE 128GB / 6GB\n" +
            "5. Salir");
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
