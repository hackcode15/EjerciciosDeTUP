/*
12) En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y $500, realizar un
    Algoritmo que lea los sueldos que cobra cada empleado e informe cuántos empleados
    cobran entre $100 y $300 y cuántos cobran más de $300. Además el programa deberá
    informar el importe que gasta la empresa en sueldos al personal.
*/

package ejerciciosDeTUP.estructuras_repetitivas;

import java.util.Scanner;

public class Ejercicio12 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int sueldoBajo = 0;
        int sueldoAlto = 0;
        
        int sueldo;
        
        int importeTotal = 0;
        
        System.out.println("Ingrese los sueldos de empleados que quiera. (0 para dejar de ingresar y terminar)\n");
        
        do{
            
            System.out.print("Sueldo: $");
            sueldo = teclado.nextInt();
            
            if(sueldo != 0 && sueldo >= 100){
                importeTotal += sueldo;
            }
            
            if(sueldo != 0 && sueldo >= 100 && sueldo <= 300){            
                sueldoBajo++;
            }else if(sueldo != 0 && sueldo > 300){
                sueldoAlto++;
            }else if(sueldo != 0){
                System.out.println("Has ingrese un sueldo menor que $100 \nIngrese nuevamente");
            }

        }while(sueldo != 0);
        
        if(sueldoBajo > 0 || sueldoAlto > 0){
            System.out.println("En total hay [" + sueldoBajo + "] empleados que cobran un sueldo entre $100 a $300");
            System.out.println("En total hay [" + sueldoAlto + "] empleados que cobran mas de $300");
            System.out.println("La empresa ha gastado $" + importeTotal);
        }else{
            System.out.println("Programa finalizado");
        }
        
    }
    
}
