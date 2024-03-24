/*
8) Leer 2 números; si son iguales que los multiplique, si el primero es mayor que el segundo
   que los reste y si no que los sume.
*/

package ejerciciosDeTUP.estructuras_condicionales;

import java.util.Scanner;

public class Ejercicio8 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Si son iguales, multiplica.\nSi el 1° es mayor que el 2°, resta.\nDe lo contrario, suma\n");
        
        System.out.print("Ingrese el primer numero: ");
        int num1 = teclado.nextInt();
        
        System.out.print("Ingrese el segundo numero: ");
        int num2 = teclado.nextInt();
        
        int resultado;
        
        if(num1 == num2){
            resultado = num1 * num2;
        }else if(num1 > num2){
            resultado = num1 - num2;
        }else{
            resultado = num1 + num2;
        }
        
        System.out.println("Resultado: " + resultado);
        
        teclado.close();
        
    }
 
}
