
package celularesomega;

import java.util.Scanner;


public class MenuApple extends Menu implements SistemaOpciones{
    private int opcion;
    
    public MenuApple() {
        super("\n"
            + "\t/////MENU APPLE/////\n" +
            "1. iPhone XR 128GB/3GB\n" +
            "2. iPhone 11 128GB/4GB\n" +
            "3. iPhone 12 Pro 128GB/6GB\n" +
            "4. iPhone 13 Pro 256GB/6GB\n" +
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
