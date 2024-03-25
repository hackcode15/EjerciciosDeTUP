/*
4) Escriba un algoritmo que dado el número de horas trabajadas por un empleado y el sueldo
   por hora, calcule el sueldo total de ese empleado. Tenga en cuenta que las horas extras se
   pagan el doble.
*/
package ejerciciosDeTUP.estructuras_secuenciales;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.print("Digite las horas trabajadas del empleado: ");
        int horasTrabajadas = read.nextInt();

        double sueldoPorHora = 1500;
        
        double sueldoTotal;
        
        // Supongo que las horas normales son 8 o menor
        int horasNormales = 8;
        int horasExtras = 0;
        
        if(horasTrabajadas > 8){
        
            horasExtras = horasTrabajadas - horasNormales;
            
            sueldoTotal = (sueldoPorHora * horasNormales) + ((sueldoPorHora * horasExtras)*2);
        
        }else{
        
            sueldoTotal = sueldoPorHora*horasTrabajadas;
        
        }
        
        if(horasTrabajadas > 0 && horasTrabajadas > 8){
        
            System.out.println("El sueldo del empleado que trabajo " + horasTrabajadas + " horas. Considerado " + horasExtras + " horas extras.");
            System.out.println("Es de: $" + sueldoTotal + " con un sueldo por hora de: $" + sueldoPorHora);
            
        }else if(horasTrabajadas > 0 && horasTrabajadas <= 8){
        
            System.out.println("El sueldo del empleado que trabajo " + horasTrabajadas + " horas. Considerado horas normales");
            System.out.println("Es de: $" + sueldoTotal + " con un sueldo por hora de: $" + sueldoPorHora);
            
        }else{
        
            System.out.println("Error: Debes ingresar numeros enteros positivos");
        
        }
        
        
    }
    
}}
