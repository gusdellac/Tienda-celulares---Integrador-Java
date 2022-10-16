/**
 * pruebo commit desde rama gustavo
 */
package celularesomega;

public class Celular {
    String marca;
    String modelo;
    String caracteristicas;
    double precio;
    
    public Celular(String marca, String modelo, String caracteristicas, 
            double precio){
        
        this.marca = marca;
        this.modelo = modelo;
        this.caracteristicas = caracteristicas;
        this.precio = precio;
    }
    
    public String verCaracteristicas(){
        return this.caracteristicas;
    }
}
