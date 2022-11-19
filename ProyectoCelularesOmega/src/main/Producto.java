
package main;

public abstract class Producto {
    private String marca;
    private String modelo;
    private String caracteristicas;
    private double precio;

    public Producto(String marca, String modelo, String caracteristicas,
            double precio){
   
            this.marca = marca;
            this.modelo = modelo;
            this.caracteristicas = caracteristicas;
            this.precio = precio;     
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nMarca = ").append(marca);
        sb.append("\nModelo = ").append(modelo);
        sb.append("\nPrecio = $ ").append(precio);
        sb.append("\n");
        return sb.toString();
    }
    
}


