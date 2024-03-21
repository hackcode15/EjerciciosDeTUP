/*
1) Determinar si un alumno aprueba o desaprueba un curso, sabiendo que aprueba si su
   promedio de tres calificaciones es mayor o igual a 60; desaprueba en caso contrario.
*/

package ejerciciosDeTUP.estructuras_condicionales;

import java.util.*;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la nota N°1 del alumno: " );
        int nota1 = sc.nextInt();
        System.out.print("Ingrese la nota N°2 del alumno: ");
        int nota2 = sc.nextInt();
        System.out.print("Ingrese la nota N°3 del alumno: ");
        int nota3 = sc.nextInt();
        
        double promedio = (nota1 + nota2 + nota3)/3;
        
        System.out.println("Promedio: " + promedio);
        
        if(promedio >= 6){
            System.out.println("Alumno aprobado");
        }else{
            System.out.println("Alumno desaprobado");
        }
        
    }
    
}
