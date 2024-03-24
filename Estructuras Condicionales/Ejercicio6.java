/*
6) Elaborar una solución que permita ingresar un número entero del 1 al 10 y muestre su
   equivalente en números romanos.
*/
package ejerciciosDeTUP.estructuras_condicionales;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int num;
        
        // Uso un bucle 'do while' para aseguar que ingrese un numero en un rango del 1 al 10
        do{
            
            System.out.print("Ingrese un numero entero entre 1 y 10: ");
            num = teclado.nextInt();
            
            if(num < 1 | num > 10){
                System.out.println("Error: has ingresado un numero fuera de los limites.\nIntentelo nuevamente");
            }
            
            
        }while(num < 1 | num > 10);
        
        // Uso un array de Strings para guardar los numeros romanos del 1 al 10
        String[] num_romano = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
        
        // Le resto 1 al numero ingresado, ya que el indice del array comienza en 0
        int numAconvertir = num - 1;
        
        // Muestro el elemento del array
        System.out.println("El equivalente del numero \"" + num + "\" en romano es el: " + num_romano[numAconvertir]);
        
        teclado.close();

    }
    
}
