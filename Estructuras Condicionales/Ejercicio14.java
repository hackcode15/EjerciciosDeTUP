/*
14) Se desea leer un número de dos cifras, y que se muestre por pantalla sus dígitos. Luego
    informe si la suma de sus dígitos es múltiplo de 3 o no.
*/
package ejerciciosDeTUP.estructuras_condicionales;

import java.util.Scanner;

public class Ejercicio14 {
    
    public static void main(String[] args) {
        
        // Instancia una variable objeto de tipo 'Scanner'
        Scanner teclado = new Scanner(System.in);
        
        // Pido el numero
        System.out.print("Ingrese un numero: ");
        int numero = teclado.nextInt(); // Lo almaceno en una variable de tipo entero
        
        String numeroString = String.valueOf(numero); // Convierto la variable de tipo entero a una de tipo String
        
        String[] digitos = numeroString.split(""); // Separo los digitos de la cadena y los almaceno en un array
        
        int suma = 0; // variable acumuladora
        
        for(String digito : digitos){ // bucle for each
            suma += Integer.parseInt(digito); // Convierto los digitos separados nuevamente a tipo entero y realizo la suma
        }
        
        System.out.println("La suma de los digitos del numero ingresado es de: " + suma);
        
        if(suma % 3 == 0){
            System.out.println("El \"" + suma + "\" SI es multiplo de 3");
        }else{
            System.out.println("El \"" + suma + "\" NO es multiplo de 3");
        }
  
    }
    
}
