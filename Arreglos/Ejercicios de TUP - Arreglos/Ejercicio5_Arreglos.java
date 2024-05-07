/*
Escriba un programa para calcular el promedio de 20 valores almacenados en un arreglo. Los
valores deben ser ingresados por teclado. Además, determinar cuántos valores son mayores
que el promedio. Imprima:
a) El promedio
b) La cantidad de valores mayores al promedio y la lista de valores.
*/

package arreglos;

import java.util.Scanner;

public class Ejercicio5_Arreglos {
    
    static int cantidad;
    
    static void cargarArreglo(int arr[]){
        
        Scanner teclado = new Scanner(System.in);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Posicion " + (i+1) + ": ");
            arr[i] = teclado.nextInt();
        }
    
    }
    
    static void imprimirArreglo(int arr[]){
        
        for(int arreglo : arr){
            System.out.print(arreglo + " ");
        }
        
    }

    static double obtenerPromedio(int arr[]){
        
        double promedio;
        
        double sumaTotal = 0;
        
        for(int i=0; i<arr.length; i++){
            sumaTotal += arr[i];
        }
        
        promedio = sumaTotal / arr.length;
        
        return promedio;
        
    }
    
    static void mayoresAlPromedio(int arr[], double promedio){
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] > promedio){
                cantidad++;
                System.out.print(arr[i] + " ");
            }
        }
        
    }
    
    public static void main(String[] args) {
        
        //int numeros[] = {5,9,1,351,46,7,2,3,16,6,46};
        
        int numeros[] = new int[20];

        cargarArreglo(numeros);
        
        System.out.print("Arreglo original: ");
        
        imprimirArreglo(numeros);
        
        double promedio = obtenerPromedio(numeros);
        
        System.out.println("\nPromedio: " + promedio);
        
        System.out.print("Numeros mayores al promedio: ");
        mayoresAlPromedio(numeros, promedio);
        
        System.out.println("\nCantidad de numeros mayores al promedio: " + cantidad);
        
    }
    
}
