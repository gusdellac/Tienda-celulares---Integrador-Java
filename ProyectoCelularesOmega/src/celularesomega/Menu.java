
package celularesomega;


public abstract class Menu {
    private String opcionesMenu;
    
    private int opcionUsuario;
    
    public Menu(String opcionesMenu){
        this.opcionesMenu = opcionesMenu;
    }

    public String getOpcionesMenu() {
        return this.opcionesMenu;
    }

    public void setOpcionesMenu(String opcionesMenu) {
        this.opcionesMenu = opcionesMenu;
    }
    
    public int getOpcionUsuario(){
        return this.opcionUsuario;
    }
    public void setOpcionUsuario(int opcion){
        this.opcionUsuario = opcion;  
    }
      
}
