# Proyecto Integrador Grupo Omega - Java

Sistema de Venta de Celulares aplicando fundamentos del lenguaje Java y paradigma POO.

Descripción del Sistema.

El sistema cuenta con las siguientes clases:
1- Producto.
2- Celular.
3- BaseDatosProductos.
4- SistemaCreacionProductos.
5- MetodoDePago.
6- InterfazUsuario.
7- Sistema.
8- Main.

1) Clase abstracta Producto es la clase padre de los productos que se quieran ingresar al sistema.  
2) Clase Celular hereda atributos y métodos de la clase Producto.  
3) Clase abstracta BaseDatosProductos gestiona una base de datos que utiliza la interface Map para almacenar datos en clave/valor.  
La clave es un dato de tipo int y el valor es un objeto de tipo Celular.  
4) Clase abstracta SistemaCreacionProductos gestiona la llamada al método que ingresa productos de la clase BaseDatosProductos.  
5) Clase abstracta MetodoDePago gestiona los medios de pago.  
6) Clase abstracta InterfazUsuario gestiona la salida de datos por consola. Esta clase cuenta con métodos que imprimirán por consola los diferentes datos que requiere el sistema.  
7) Clase abstracta Sistema gestiona la lógica del funcionamiento principal del sistema.  
Esta clase realizará llamadas a diferentes métodos de las clases que componen el sistema en su conjunto.  
8) Clase abstracta Main contiene el método public static void main que ejecutará el programa. En el se realiza  
la llamada al método inicializador del sistema de la clase Sistema.  


Integrantes:

Julieta Gutierrez.  
Nicolas Abete.  
Belen Rabel Zarate.  
Leonel Real.  
Gaston Riveros.  
Gustavo De Llac.  
Dario Tamini.
