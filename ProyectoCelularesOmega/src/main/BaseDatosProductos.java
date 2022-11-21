
package main;

import java.util.Map;
import java.util.TreeMap;

public abstract class BaseDatosProductos {
    
    private static final Map <Integer, Producto> productos = new TreeMap<>();
    private static int idProducto;
    
    public static void ingresarProductosLista(String marca, String modelo,
            String caracteristicas, double precio){
        idProducto++;
      productos.put(idProducto, new Celular(marca,modelo,caracteristicas,precio));
    }
    
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
    
    public static boolean buscarProducto(int opcionModelo){
        return productos.containsKey(opcionModelo);
    }
    
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
    
    
    public static void mostrarCaracteristicas(int IDproducto){
        if (buscarProducto(IDproducto)){
            InterfazUsuario.mostrarTituloCaracteristicas();
            System.out.println(productos.get(IDproducto).getCaracteristicas());
        } else{
            InterfazUsuario.mostrarIdIngresadoIncorrecto();
        }
    }
    
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
    
    public static double obtenerPrecioProducto(int idproducto){
        return productos.get(idproducto).getPrecio();
    }
    
    
  
}
