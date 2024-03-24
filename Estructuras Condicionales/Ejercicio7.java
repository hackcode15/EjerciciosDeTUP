/*
7) Hacer un algoritmo que imprima el nombre de un artículo, clave, precio original y su
   precio con descuento. El descuento lo hace en base a la clave, si la clave es 01 el
   descuento es del 10% y si la clave es 02 el descuento en del 20% (solo existen dos claves).
*/

package ejerciciosDeTUP.estructuras_condicionales;

public class Ejercicio7 {

    public static void main(String[] args) {

        String nombreArticulo = "Notebook";
        String clave = "01";
        int precioOriginal = 150000;
        double precioConDescuento = 0;
        
        if(clave.equals("01")){
            precioConDescuento = precioOriginal - (precioOriginal * 0.10);
        }else if(clave.equals("02")){
            precioConDescuento = precioOriginal - (precioOriginal * 0.20);
        }else{
            System.out.println("clave incorrecta");
        }
        
        System.out.println("Nombre del Articulo: " + nombreArticulo + "\nClave: " + clave + "\nPrecio original: $" + precioOriginal
        + "\nPrecio con descuento: $" + precioConDescuento);
        
    }
    
}
