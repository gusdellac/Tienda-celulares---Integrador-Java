
package celularesomega;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion;
        
        //Instancia Menu (objeto menuPrincipal)
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        System.out.println(menuPrincipal.getOpcionesMenu());
        
        opcion = menuPrincipal.ingresarOpcion();
       
        menuPrincipal.setOpcionUsuario(opcion);
       
        switch (opcion){
            case 1: {
                MenuSamsung menuSamsung = new MenuSamsung();
                System.out.println(menuSamsung.getOpcionesMenu());
                menuSamsung.ingresarOpcion();
                break;
            }
            
            case 2: {
                MenuMotorola menuMotorola = new MenuMotorola();
                System.out.println(menuMotorola.getOpcionesMenu());
                menuMotorola.ingresarOpcion();
                break;
            }
            
            case 3: {
                MenuApple menuApple = new MenuApple();
                System.out.println(menuApple.getOpcionesMenu());
                menuApple.ingresarOpcion();
                break;
            }
            
            case 4: {
                MenuXiaomi menuXiaomi = new MenuXiaomi();
                System.out.println(menuXiaomi.getOpcionesMenu());
                menuXiaomi.ingresarOpcion();
                break;
            }
            
            default:{
                System.out.println("SALIR");
            }
            
        }
        

         
    }
}
