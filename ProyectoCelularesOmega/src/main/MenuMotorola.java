
package main;


import java.util.Scanner;

public class MenuMotorola extends Menu implements SistemaOpciones{
    private int opcion;
    
    public MenuMotorola() {
        super("\n"
            + "\t/////MENU MOTOROLA/////\n" +
            "1. Motorola G20SE 128GB/4GB\n" +
            "2. Motorola G60S 128GB/6GB\n" +
            "3. Motorola 6200 128GB/8GB\n" +
            "4. Motorola Edge 20 Pro 256GB/12GB\n" +
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
