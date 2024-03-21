/*
8) Elabore un programa que realice la conversión de cm. a pulgadas.
   Donde 1cm = 0.39737 pulgadas.

*/

package ejerciciosDeTUP;

import java.util.*;

public class Ejercicio8 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Conversion de centimetros a pulgadas");
        System.out.print("cm: ");
        
        double cm = sc.nextDouble();
        
        final double pulgadas = 0.39737;
        
        System.out.println(cm + " centimetros es igual a " + (cm*pulgadas) + " pulgadas");
        
    }
    
}
