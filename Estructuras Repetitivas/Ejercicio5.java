/*
5) Escriba un algoritmo que permita ingresar un Número N positivo y muestre por pantalla la
   suma de sus dígitos.
*/
package ejerciciosDeTUP.estructuras_repetitivas;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        int numeroIngresado = teclado.nextInt();
        
        String numerosString = String.valueOf(numeroIngresado); // Convierto a String el numero ingresado
        
        String[] digitosStr = numerosString.split(""); // Separo sus digitos y los almaceno en un array de String
        
        int sumaDeDigitos = 0;
        
        for(String digito : digitosStr){
            
            int num = Integer.parseInt(digito); // Por cada iteracion convierto cada digito a int
            
            sumaDeDigitos += num;
            
        }
        
        System.out.println("La suma de todos los digitos del numero \"" + numeroIngresado + "\" es de: " + sumaDeDigitos);
        
    }
    
}
