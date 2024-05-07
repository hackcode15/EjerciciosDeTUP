/*
Escriba un programa que permita cargar 2 arreglos A y B de 10 elementos cada uno, sumar el
elemento en la posición 1 del arreglo A con el elemento en la misma posición del arreglo B y
así sucesivamente. Almacenar el resultado en un arreglo C e imprima el resultado final.
*/
package arreglos;

import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio6_Arreglos {
    
    static void cargarArreglo(int arreglo[]){
        
        Scanner teclado = new Scanner(System.in);
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Posicion " + (i+1) + ": ");
            arreglo[i] = teclado.nextInt();
        }
    
    }

    static int[] sumarDosArreglos(int arregloA[], int arregloB[]){
        
        int arregloC[] = new int[arregloA.length];
        
        int indice = 0;
        for(int i=0; i<arregloA.length; i++){
            arregloC[indice] = arregloA[i] + arregloB[i];
            indice++;
        }
        
        return arregloC;
    
    }
    
    
    
    public static void main(String[] args) {
        
        //int a[] = {2,4,6,8};
        //int b[] = {1,3,5,7};
        
        // Adicional: podriamos incluir el manejo de errores si los arreglos tienen diferentes longitudes
        
        int a[] = new int[10];
        int b[] = new int[10];
        
        System.out.println("Carga el arreglo A");
        cargarArreglo(a);
        
        System.out.println("Carga el arreglo B");
        cargarArreglo(b);
        
        int c[] = sumarDosArreglos(a, b);
        
        System.out.println("Arreglo A: " + Arrays.toString(a));
        System.out.println("Arreglo B: " + Arrays.toString(b));
        System.out.println("Suma de A+B");
        System.out.println("Arreglo C: " + Arrays.toString(c));
        
    }
    
}
