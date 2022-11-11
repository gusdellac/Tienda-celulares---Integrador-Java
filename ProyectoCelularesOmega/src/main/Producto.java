
package main;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public abstract class Producto {
    private String marca;
    private String modelo;
    private String caracteristicas;
    private double precio;
    
//    private static final String [] listaProductos =  new String [100];
    private static final Map <Integer, String> listaProductos = new TreeMap<>();
    
    private final int idProducto;
    public static int contadorItems;
    
    public Producto(String marca, String modelo, String caracteristicas,
            double precio){
        
            this.marca = marca;
            this.modelo = modelo;
            this.caracteristicas = caracteristicas;
            this.precio = precio;
            this.idProducto = ++Producto.contadorItems; 
            ingresarProductosLista();
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
    
    public int getIdProducto(){
        return idProducto;
    }
    
    public void ingresarProductosLista(){
        listaProductos.put(this.idProducto, this.toString());
//        int indiceProducto = contadorItems - 1;
//        listaProductos[indiceProducto] = this.toString();  
    }
    
    public static void mostrarListaProductos(){
//        System.out.println(listaProductos.values());
//        System.out.println("\n");
        for (Entry<Integer, String> productos : listaProductos.entrySet()){
            int clave = productos.getKey();
            String valor = productos.getValue();
            System.out.println(clave+"  ->  "+valor);
        }
//        for (String listaProducto : listaProductos) {
//            if (listaProducto != null) {
//                System.out.println(listaProducto);
//            } else {
//                break;
//            }
//        }      
    }
    
    public static String mostrarProducto(int IDproducto){
        return listaProductos.get(IDproducto);
    }
    
    public static boolean buscarProducto(int opcionModelo){
        return listaProductos.containsKey(opcionModelo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID(").append(idProducto).append(").");
        sb.append("\nMarca = ").append(marca);
        sb.append("\nModelo= ").append(modelo);
        sb.append("\nCaracteristicas= ").append(caracteristicas);
        sb.append("\nPrecio= $ ").append(precio);
        sb.append("\n");
        return sb.toString();
    }
    
}


//public void mostrarListaProductos(){
//        for(int i = 0; i < listaProductos.length; i++ ){
//            if(listaProductos[i] != null){
//                System.out.println(listaProductos[i]);
//            }else{
//                break;
//            }
//        }      
//}