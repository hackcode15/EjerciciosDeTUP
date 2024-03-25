/*
10) Se pide representar el algoritmo que nos calcule la suma de los N primeros números
    impares. Es decir, si ingresamos un 5, nos haga la suma de 1+3+5+7+9.
*/
package ejerciciosDeTUP.estructuras_repetitivas;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        
       Scanner teclado = new Scanner(System.in);
       
       System.out.print("¿Cuantos numeros impares quiere sumar?: ");
       int cantidadImpares = teclado.nextInt();
       
       int num = 0;
       int aux = 0;
       int orden = 0;
       int suma = 0;
       
       while(aux < cantidadImpares){
       
           num++;
           
           if(num % 2 != 0){
               orden++;
               aux++;
               System.out.println(orden + ") " + num);
               suma += num;
           }
       
       }
       
        System.out.println("La suma de los primeros '" + cantidadImpares + "' numeros impares es de: " + suma);
        
    }
    
}
