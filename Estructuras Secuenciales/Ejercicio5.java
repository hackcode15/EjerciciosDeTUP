/*
5) Leer dos números y encontrar:
    a. La suma del doble del primero más el cuadrado del segundo.
    b. El promedio de sus cubos
*/

package ejerciciosDeTUP;

import java.util.*;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el primer numero: ");
        double num1 = sc.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        double num2 = sc.nextDouble();
        
        double resultadoA = (2*num1) + (Math.pow(num2, 2));
        System.out.println("La suma del doble del primero más el cuadrado del segundo es de: " + resultadoA);
        
        double resultadoB = (Math.pow(num1, 3) + Math.pow(num2, 3)) / 2;
        System.out.println("El promedio de sus cubos es de: " + resultadoB);

    }
    
}
