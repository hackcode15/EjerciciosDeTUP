/*
15) En una Granja existen N conejos, N1 blancos y N2 negros. Suponiendo que P1 es el precio
    de venta de los conejos blancos y P2 es el precio de venta de los conejos negros, imprima
    el monto total de la venta. Informe al final el color de los conejos que se más se vendieron.
*/
package ejerciciosDeTUP.estructuras_condicionales;

import java.util.Scanner;

public class Ejercicio15 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite el total de conejos blancos vendidos: ");
        int conejosB = teclado.nextInt();
        
        System.out.print("Digite el total de conejos negros vendidos: ");
        int conejosN = teclado.nextInt();

        int totalConejos = conejosB + conejosN;
        int precioCN = 500;
        int precioCB = 800;
        
        int totalVenta = (conejosB * precioCB) + (conejosN + precioCN);

        System.out.println("Se vendieron un total de " + totalConejos + " conejos");
        System.out.println("El total de venta fue de: $" + totalVenta);
        
        if(conejosB > conejosN){
            System.out.println("Se vendieron mas conejos blancos");
        }else if(conejosN > conejosB){
            System.out.println("Se vendieron mas conejos negros");
        }else{
            System.out.println("Se han vendido la misma cantidad de conejos blancos y negros");
        }
        
        
    }
    
}
