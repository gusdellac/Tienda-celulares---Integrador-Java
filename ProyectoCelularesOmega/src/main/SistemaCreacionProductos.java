
package main;

public class SistemaCreacionProductos {

    public static void creacionProductos(){
        
        //SAMSUNG
        BaseDatosProductos.ingresarProductosLista("Samsung", "A12 128GB/4GB", 
                "Pantalla: 6.5 pulgadas, 720 x 1600 pixels.\n"
              + "Procesador: Octa-core 2.3GHz, RAM: 4GB.\n"
              + "Almacenamiento: 128GB, Expansión: microSD.\n"
              + "Cámara: Cuádruple 48MP+5MP +2MP+2MP.\n"
              + "Batería: 5000 mAh, OS: Android 10.\n"
              + "Perfil: 8.9 mm, Peso: 205 g", 
                42990.90);
        BaseDatosProductos.ingresarProductosLista("Samsung", "A22 128GB/4GB", 
                "Pantalla: 6.5 pulgadas, 720 x 1600 pixels Super AMOLED.\n"
               + "Procesador: Octa-core 2 GHz.\n"
               + "RAM: 4GB.\n"
               + "Almacenamiento: 128GB.\n"
               + "Expansión: microSD.\n"
               + "Cámara: Cuádruple 48MP+8MP +2MP+2MP.\n"
               + "Batería: 5000 mAh, OS: Android 11, Perfil: 9.7 mm.\n"
               + "Peso: 186 g", 48990.90);
        BaseDatosProductos.ingresarProductosLista("Samsung", "S9 Plus", 
                "Pantalla: 6.2 pulgadas, 1440 x 2960 pixels Super AMOLED.\n"
                + "Procesador: Exynos 9810 2.8GHz, RAM: 6GB.\n"
                + "Almacenamiento: 64GB, Expansión: microSD.\n"
                + "Cámara: Dual 12MP+12MP, Batería: 3500 mAh.\n"
                + "OS: Android 8 Oreo", 
                59990.90);
        BaseDatosProductos.ingresarProductosLista("Samsung", "S20 FE 128GB/6GB",
                "Pantalla: 6.5 pulgadas, 1080 x 2400 pixels.\n"
                + "Procesador: Exynos 2.7 GHz, RAM: 4GB.\n"
                + "Almacenamiento: 128GB, Expansión: microSD.\n"
                + "Cámara: Triple 12MP+8MP+12MP, Batería: 4500 mAh.\n"
                + "OS: Android 10, Perfil:8.4 mm, Peso: 190 g", 
                105990.90);
        
        //MOTOROLA
        BaseDatosProductos.ingresarProductosLista("Motorola", "G20SE 128GB/4GB", 
                "Pantalla: 6.5 pulgadas, Procesador: Octa-core 1.8Ghz.\n"
                + "RAM: 4GB, Almacenamiento: 128GB, Expansión: microSD.\n"
                + "Cámara: Cuádruple 48MP+8MP+2MP+2MP, Batería: 5000 mAh.\n"
                + "OS: Android 11, Perfil 9.19 mm, Peso 200g", 
                42990.90);
        BaseDatosProductos.ingresarProductosLista("Motorola", "G60S 128GB/6GB", 
                "Pantalla: 6.8 pulgadas, Procesador: Octa-core 1.8Ghz.\n"
                + "RAM: 6GB, Almacenamiento: 128GB.\n"
                + "Expansión: microSD, Cámara: Cuádruple 64MP+8MP+5MP+2MP.\n"
                + "Batería: 5000 mAh, OS: Android 11, Perfil 9.60 mm.\n"
                + "Peso 200g", 
                61990.90);
        BaseDatosProductos.ingresarProductosLista("Motorola", "G200 128GB/8GB", 
                "Pantalla: 6.7 pulgadas.\n"
                + "Procesador:  Qualcomm Snapdragon 888+ 3Ghz.\n"
                + "RAM: 8GB, Almacenamiento: 128GB, Expansión: microSD.\n"
                + "Cámara: Triple 108MP+13MP+2MP, Batería: 5000 mAh.\n"
                + "OS: Android 11, Perfil 8.8 mm, Peso 202g", 
                110990.90);
        BaseDatosProductos.ingresarProductosLista("Motorola", "Edge 20 "
                + "Pro 256GB/12GB",
                "Pantalla: 6.67 pulgadas.\n"
                + "Procesador: Qualcomm Snapdragon 870 3.2 Ghz.\n"
                + "RAM: 12GB, Almacenamiento: 256GB.\n"
                + "Expansión: microSD, Cámara: Triple 108MP+16MP+8MP.\n"
                + "Batería: 4500 mAh, OS: Android 11.\n"
                + "Perfil 7.99 mm, Peso 188g", 
                129990.90);
        
        //APPLE
        BaseDatosProductos.ingresarProductosLista("Apple", 
                "iPhone XR 128GB/3GB", 
                "Pantalla: 6.1 pulgadas 828 x 1792 pixels.\n"
                + "Procesador: A12 Bionic Hexa-core.\n"
                + "RAM:3GB, Almacenamiento: 128GB.\n"
                + "Expansión: microSD, Cámara: 12MP gran angular f/1.8.\n"
                + "Batería: 2942 mAh, OS: iOS12.\n"
                + "Perfil 8.3 mm, Peso 194g",
                184990);
        BaseDatosProductos.ingresarProductosLista("Apple", 
                "iPhone 11 128GB/4GB", 
                "Pantalla: 6.1 pulgadas 828 x 1792 pixels.\n"
                + "Procesador: A13 Bionic Hexa-core.\n"
                + "RAM: 4GB, Almacenamiento: 128GB.\n"
                + "Expansión: microSD.\n"
                + "Cámara: Doble 12MP+12MP.\n"
                + "Batería: 3110 mAh, OS: iOS13.\n"
                + "Perfil 8.3 mm, Peso 194g", 193990);
        BaseDatosProductos.ingresarProductosLista("Apple", 
                "iPhone 12 Pro 128GB/6GB", 
                "Pantalla: 6.1 pulgadas 1170x 2532 pixels.\n"
                + "Procesador: A14 Bionic Hexa-core.\n"
                + "RAM: 6GB, Almacenamiento: 256GB.\n"
                + "Expansión: microSD.\n"
                + "Cámara: Triple 12MP+12MP+12MP.\n"
                + "Batería: 3687 mAh, OS: iOS14.\n"
                + "Perfil 7.4 mm, Peso 189g", 299990);
        BaseDatosProductos.ingresarProductosLista("Apple", 
                "iPhone 13 Pro 256GB/6GB", 
                "Pantalla: 6.1 pulgadas 1170x 2532 pixels.\n"
                + "Procesador: A15 Bionic Hexa-core.\n"
                + "RAM: 6GB, Almacenamiento: 256GB.\n"
                + "Expansión: microSD.\n"
                + "Cámara: Triple 12MP+12MP+12MP.\n"
                + "Batería:4352 mAh, OS: iOS15.\n"
                + "Perfil 7.65 mm, Peso 204g", 379990);
        //XIAOMI
        BaseDatosProductos.ingresarProductosLista("Xiaomi", 
                "Note 10 128GB / 4GB", 
                "Pantalla: 6.5 pulgadas 1080 x 2400 pixels.\n"
                + "Procesador: Mediatek Dimensity 700 2.2GHz.\n"
                + "RAM: 4GB, Almacenamiento: 128GB.\n"
                + "Expansión: microSD.\n"
                + "Cámara: Triple 48MP+2MP+2MP.\n"
                + "Batería: 5000 mAh, OS: Android 11.\n"
                + "Perfil 8.9 mm, Peso 190g", 70990);
        BaseDatosProductos.ingresarProductosLista("Xiaomi", 
                "Poco X3 128GB / 6GB", 
                "Pantalla: 6.67 pulgadas 1080 x 2400 pixels.\n"
                + "Procesador:  Snapdragon 732G 2.3GHz, RAM: 6GB.\n"
                + "Almacenamiento: 128GB.\n"
                + "Expansión: microSD.\n"
                + "Cámara: Cuádruple 64MP+13MP+2MP+2MP.\n"
                + "Batería: 5160 mAh, OS: Android 10.\n"
                + "Perfil 9.4 mm, Peso 215g", 84990);
        BaseDatosProductos.ingresarProductosLista("Xiaomi", 
                "Poco X3 Pro 256GB / 8GB", 
                "Pantalla: 6.67 pulgadas 1080 x 2400 pixels.\n"
                + "Procesador: Snapdragon 860 2.96GHz.\n"
                + "RAM: 8GB, Almacenamiento: 256GB.\n"
                + "Expansión: microSD.\n"
                + "Cámara: Cuádruple 48MP+8+2MP+2MP.\n"
                + "Batería: 5160 mAh, OS: Android 11.\n"
                + "Perfil 9.4 mm, Peso 215g", 96990);
        BaseDatosProductos.ingresarProductosLista("Xiaomi", 
                "Poco X3 GT 256GB / 8GB", 
                "Pantalla: 6.6 pulgadas 1080 x 2400 pixels.\n"
                + "Procesador: Mediatek Dimensity 1100 2.6GHz.\n"
                + "RAM: 8GB, Almacenamiento: 256GB.\n"
                + "Expansión: microSD.\n"
                + "Cámara: Triple 64MP+8MP+2MP.\n"
                + "Batería: 5000 mAh, OS: Android 11.\n"
                + "Perfil 8.9 mm, Peso 193g", 104990);
    }
    
}
