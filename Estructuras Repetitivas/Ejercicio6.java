/*
6) Dado un número ingresado por el usuario determinar si es primo o no
*/
package ejerciciosDeTUP.estructuras_repetitivas;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ïngrese un numero: ");
        int numeroIngresado = teclado.nextInt();
        
        if(numeroIngresado > 0){
        
            int aux = numeroIngresado;
            int contadorDivisores = 0;
            int divisorActual = 1;

            while(divisorActual <= numeroIngresado){

                if(numeroIngresado % divisorActual == 0){
                    contadorDivisores++;
                }

                divisorActual++;

            }

            if(contadorDivisores == 2){
                System.out.println("El numero \"" + aux + "\" si es primo");
            }else{
                System.out.println("No es primo");
            }
        
        }else{
        
            System.out.println("No existen numeros primos negativos");
            
        }
        
        
        
    }
    
}
