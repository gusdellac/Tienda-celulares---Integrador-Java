
package main;

import java.util.Map;
import java.util.TreeMap;

public class BaseDatosProductos {
    
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
            System.out.println("\t\t***La opción elegida es inexistente***\n");
            return false;
        }
    }
    
    public static void mostrarCaracteristicas(int IDproducto){
        if (buscarProducto(IDproducto)){
            System.out.println("\n<<<Características>>> \n"
                +productos.get(IDproducto).getCaracteristicas());
        } else{
            System.out.println("El id ingresado no existe!!");
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
  
}
