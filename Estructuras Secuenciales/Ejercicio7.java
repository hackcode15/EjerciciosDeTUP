/*
7) Un profesor desea saber qué porcentaje de hombres y qué porcentaje de mujeres hay en
un grupo de estudiantes.
*/
package ejerciciosDeTUP;

import java.util.*;

public class Ejercicio7 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("indique cuantas mujeres hay: ");
        int mujeres = sc.nextInt();
        System.out.print("Indique cuantas hombres hay: ");
        int hombres = sc.nextInt();
        
        int totalAlumnos = mujeres + hombres;
        System.out.println("Total de alumnos: " + totalAlumnos);
        
        // Convertimos las variables int a double antes de la division
        double porcentajeMujeres = (double) mujeres/totalAlumnos*100;
        double porcentajeHombres = (double) hombres/totalAlumnos*100;
        
        System.out.println("Porcentaje de mujeres: " + Math.ceil(porcentajeMujeres) + "%");
        System.out.println("Porcentaje de hombres: " + Math.ceil(porcentajeHombres) + "%");
        
    }
    
}
