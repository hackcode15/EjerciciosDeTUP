/*
1)  En un experimento se obtuvieron un conjunto de pares de valores (S, V) y se requiere que
    desarrolle un algoritmo que determine e imprima:
       a. En cuántos pares el primer valor S es mayor que el segundo V
       b. En cuantos pares (S, V) se cumple que S es el doble de V
    Nota: Tener en cuenta que el proceso finaliza cuando el usuario ingresa 0 en los dos
    valores del conjunto.
*/
package ejerciciosDeTUP.estructuras_repetitivas;

import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        boolean terminar = true;
        int cantidadDeParesDoble = 0;
        boolean esPar = true;
        
        
        while(terminar){
        
            System.out.println("-Ingrese solo numeros pares \n-El 1° numero mayor que el 2° numero \n-Ingrese 0 y 0 para terminar\n");
            
            System.out.print("1° numero: ");
            int num1 = teclado.nextInt();
            
            System.out.print("2° numero: ");
            int num2 = teclado.nextInt();
            
            if((num1 % 2 == 0) & (num2 % 2 == 0)){
                esPar = true;
            }else{
                esPar = false;
            }
            
            if(esPar & (num1 > num2)){
                int diferenciaDePares = 0;
                for(int i = num2; i <= num1; i++){
                    if(i % 2 == 0){
                        diferenciaDePares++;
                    }
                }

                System.out.println("hay una diferencia de " + diferenciaDePares + " pares desde el " + num2 + " hasta " + num1 + "\n");
            
            }else if(esPar & (num1 != 0 & num2 != 0)){
                
                System.out.println("El 1° numero es menor que el 2° numero, intente nuevamente o termine\n");
                
            }else if(num1 != 0 & num2 != 0){
                
                System.out.println("Has ingresado numeros impares. Intentelo nuevamento o termine\n");
                
            }
            
            if(num1 != 0 & num2 != 0 & num1 == (2*num2)){
                cantidadDeParesDoble++;
            }
            
            if(num1 == 0 && num2 == 0){
                terminar = false;
            }
        
        }
        
        if(cantidadDeParesDoble > 0){
            System.out.println("\nNumero de veces donde el 1° numero es el doble que el 2° numero: " + cantidadDeParesDoble);
        }else{
            System.out.println("\nNo hubo ocaciones donde el 1° numero es el doble que el 2° numero");
        }
        
        teclado.close();
        
    }
    
}
