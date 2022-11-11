
package main;


public class Sistema {
    
    public void iniciarSistema() {
        int opcion;
        
        //Instancia Menu (objeto menuPrincipal)
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        System.out.println(menuPrincipal.getOpcionesMenu());
        
        //pedimos opción a usuario
        opcion = menuPrincipal.ingresarOpcion();
       
        //ver este setter
        menuPrincipal.setOpcionUsuario(opcion);
       
        switch (opcion){
            case 1: {
                MenuSamsung menuSamsung = new MenuSamsung();
                System.out.println(menuSamsung.getOpcionesMenu());
                int opcionModelo = menuSamsung.ingresarOpcion();
                System.out.println(menuSamsung.mostrarProductoElegido(opcionModelo));
                System.out.println();
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
