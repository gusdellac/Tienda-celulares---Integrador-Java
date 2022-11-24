
package main;

import java.util.Map;
import java.util.TreeMap;

public abstract class BaseDatosProductos {
    
    //constante estática de tipo Map para almacenar datos con clave/valor
    private static final Map <Integer, Producto> productos = new TreeMap<>();
    
    //variable estática de tipo int para el id de cada producto ingresado a Map
    private static int idProducto;
    
    //método estático void para ingresar productos al Map
    public static void ingresarProductosLista(String marca, String modelo,
            String caracteristicas, double precio){
        idProducto++;
      productos.put(idProducto, new Celular(marca,modelo,caracteristicas,precio));
    }
    
    //método estático void para recorrer el Map y obtener los valores
    public static void mostrarListaProductos(){
        for (Map.Entry<Integer, Producto> producto : productos.entrySet()){
            int clave = producto.getKey();
            String marca = producto.getValue().getMarca();
            String modelo = producto.getValue().getModelo();
            double precio = producto.getValue().getPrecio();
            System.out.println(clave+" : "+ "Marca = "+marca+
                    " / Modelo = "+modelo+" / Precio = $"+precio);
        }
    }
    
    //método estático boolean para comprobar la existencia de un producto en 
    //el Map
    public static boolean buscarProducto(int opcionModelo){
        return productos.containsKey(opcionModelo);
    }
    
    //método estático boolean para mostrar un producto en específico
    public static boolean mostrarProducto(int IDproducto){
        if (buscarProducto(IDproducto)){
            InterfazUsuario.mostrarSeparacionInterfaz();
            System.out.println(productos.get(IDproducto).toString());
            return true;
        }else{
            InterfazUsuario.mostrarOpcionIngresadaIncorrecta();
            return false;
        }
    }
    
    //método estático void para mostrar las características de un producto
    //en específico
    public static void mostrarCaracteristicas(int IDproducto){
        if (buscarProducto(IDproducto)){
            InterfazUsuario.mostrarTituloCaracteristicas();
            System.out.println(productos.get(IDproducto).getCaracteristicas());
        } else{
            InterfazUsuario.mostrarIdIngresadoIncorrecto();
        }
    }
    
    //método estático void para recorrer el Map y mostrar una marca en
    //específico
    public static void mostrarProductoPorMarca(String marcaElegida){
        
        for (Map.Entry<Integer, Producto> producto : productos.entrySet()){
            
            if(producto.getValue().getMarca() == marcaElegida){
                int clave = producto.getKey();
                String marca = producto.getValue().getMarca();
                String modelo = producto.getValue().getModelo();
                double precio = producto.getValue().getPrecio(); 
                System.out.println(clave+" : "+ "Marca = "+marca+
                    " / Modelo = "+modelo+" / Precio = $"+precio);
            }  
        }
    }
    
    //método estático double para obtener el precio de un producto en específico
    public static double obtenerPrecioProducto(int idproducto){
        return productos.get(idproducto).getPrecio();
    }
    
    
  
}
