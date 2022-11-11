
package main;


import java.util.Scanner;


public class MenuXiaomi extends Menu implements SistemaOpciones{
    private int opcion;
    
    public MenuXiaomi() {
        super("\n"
            + "\t/////MENU XIAOMI/////\n" +
            "1. Xiaomi Note 10 128GB / 4GB\n" +
            "2. Xiaomi Poco X3 128GB / 6GB\n" +
            "3. Xiaomi Poco X3 Pro 256GB / 8GB\n" +
            "4. Xiaomi Poco X3 GT 256GB / 8GB\n" +
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
