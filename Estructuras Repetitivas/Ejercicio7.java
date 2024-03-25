/*
7) Escribir un algoritmo que permita ingresar para los N alumnos de una universidad:
   a. SEXO ( ‘M’ o ‘F’ ) , edad y carrera ( ‘A’,’B’,’C’ ) .
   Imprimir por pantalla la carrera con menor promedio de edad de sus alumnos que son
   varones
*/

package ejerciciosDeTUP.estructuras_repetitivas;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese el cantidad de estudiantes: ");
        int cantAlumnos = teclado.nextInt();
        
        int sumaEdadesA = 0;
        int sumaEdadesB = 0;
        int sumaEdadesC = 0;
        
        int contadorA = 0;
        int contadorB = 0;
        int contadorC = 0;
        
        teclado.nextLine();
        
        for(int i=1; i<=cantAlumnos; i++){
            
            System.out.print("Ingrese el sexo del estudiante N°" + i + " (M o F): ");
            String sexo = teclado.next();
            System.out.print("Ingrese la edad del estudiante N° " + i + ": ");
            int edad = teclado.nextInt();
            teclado.nextLine();
            System.out.print("Ingrese la carrera del estudiante N°" + i + ": ");
            String carrera = teclado.next();
            
            if(sexo.equalsIgnoreCase("M") && carrera.equalsIgnoreCase("A")){
                sumaEdadesA += edad;
                contadorA++;
            }else if(sexo.equalsIgnoreCase("M") && carrera.equalsIgnoreCase("B")){
                sumaEdadesB += edad;
                contadorB++;
            }else if(sexo.equalsIgnoreCase("M") && carrera.equalsIgnoreCase("C")){
                sumaEdadesC += edad;
                contadorC++;
            }

        }
        
        double promedioA = 0;
        double promedioB = 0;
        double promedioC = 0;
        
        if(contadorA > 0){
            promedioA = (double) sumaEdadesA / contadorA;
        }
        if(contadorB > 0){
            promedioB = (double) sumaEdadesB / contadorB;
        }
        if(contadorC > 0){
            promedioC = (double) sumaEdadesC / contadorC;
        }
        
        if(promedioA <= promedioB && promedioA <= promedioC){
            System.out.println("La carrera 'A' tiene el menor promedio de edad entre los varones. Promedio: " + promedioA);
        }else if(promedioB <= promedioA && promedioB <= promedioC){
            System.out.println("La carrera 'B' tiene el menor promedio de edad entre los varones. Promedio: " + promedioB);
        }else{
            System.out.println("La carrera 'C' tiene el menor promedio de edad entre los varones. Promedio: " + promedioC);
        }
        
        
    }
    
}
