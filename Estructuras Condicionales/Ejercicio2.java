/*
2) En un almacén se hace un 20% de descuento a los clientes cuya compra supere los $1000.
   Mostrar por pantalla cuál será la cantidad que pagará una persona por su compra.
*/

package ejerciciosDeTUP.estructuras_condicionales;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese el monto de la compra: ");
        int monto = teclado.nextInt();
        
        double cant_pagar;
        
        if(monto > 1000){
            double descuento = 0.20 * monto;
            cant_pagar = monto - descuento;
            System.out.println("Se le aplico un descuento del 20% por superar los $1.000");
        }else{
            cant_pagar = monto;
        }
        
        System.out.println("La persona debe pagar un total de: $" + cant_pagar);
        
        teclado.close();
        
    }
    
}
