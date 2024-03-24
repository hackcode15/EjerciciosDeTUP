/*
4) Diseñar una solución que permita ingresar tres números enteros, e informe cuál es el mayor.
*/

package ejerciciosDeTUP.estructuras_condicionales;

import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese el 1° numero: ");
        int num1 = teclado.nextInt();
        
        System.out.print("Ingrese el 2° numero: ");
        int num2 = teclado.nextInt();
        
        System.out.print("Ingrese el 3° numero: ");
        int num3 = teclado.nextInt();
        
        if(num1 == num2 & num2 == num3){
            System.out.println("\nHay tres numeros iguales");
        }else if(num1 == num2 | num1 == num3 | num2 == num3){
            System.out.println("\nHay dos numeros iguales");
        }
        
        int mayor = num1;
        
        if(num2 > mayor){
            mayor = num2;
        }
        if(num3 > mayor){
            mayor = num3;
        }
        
        System.out.println("El mayor de los tres numeros es: " + mayor);
        
        teclado.close();
        
    }
    
}
