package ejerciciosDeTUP;

import java.util.*;

public class Ejercicio6 {
   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Ingresamos los tres numeros
        System.out.print("Ingrese el primer numero: ");
        String num1 = sc.next();
        System.out.print("Ingrese el segundo numero: ");
        String num2 = sc.next();
        System.out.print("Ingrese el tercer numero numero: ");
        String num3 = sc.next();
        
        // Convierto las variables de tipo String a una variable de tipo int
        int num4 = Integer.parseInt(num1+num2+num3);
        
        System.out.println("El numero concatenado es: " + num4);
        
    }
    
}
