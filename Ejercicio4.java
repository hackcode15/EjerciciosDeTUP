package ejerciciosDeTUP;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.print("Digite las horas trabajadas del empleado: ");
        int horas = read.nextInt();
        
        System.out.print("Digite el sueldo por hora: $");
        double sueldoPorHora = read.nextDouble();
        
        System.out.println("¿Ha trabajado horas extras? SI / NO");
        String horasExtras = read.next();
        
        double sueldoTotal = 0;
        boolean trabajoHorasExtras = false;
        
        
        if(horasExtras.equalsIgnoreCase("si")){
        
            trabajoHorasExtras = true;
            sueldoTotal = (sueldoPorHora*horas)*2;
        
        }else{
        
            sueldoTotal = sueldoPorHora*horas;
        
        }
        
        if(trabajoHorasExtras){
        
            System.out.println("El sueldo del empleado que trabajo " + horas + " horas. Considerado horas extras.");
            System.out.println("Es de: $" + sueldoTotal + " con un sueldo por hora de: $" + sueldoPorHora);
            
        }else{
        
            System.out.println("El sueldo del empleado que trabajo " + horas + " horas");
            System.out.println("Es de: $" + sueldoTotal + " con un sueldo por hora de: $" + sueldoPorHora);
            
        }
        
        
    }
    
}
