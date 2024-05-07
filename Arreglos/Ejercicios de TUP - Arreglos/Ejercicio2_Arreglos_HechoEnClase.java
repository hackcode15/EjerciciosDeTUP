/*
Escribir un programa que dada una lista de números enteros, escribir una función que:
a) Devuelva una lista con todos los que sean primos.
b) Devuelva la sumatoria de los valores
c) Devuelva el promedio de los valores.
*/

package arreglos;

import java.util.Scanner;

public class Ejercicio2_Arreglos_HechoEnClase {

    static void cargarArreglo(int arr[]){
        
        Scanner teclado = new Scanner(System.in);
        
        for(int i=0; i<arr.length; i++){
            System.out.print("Posicion " + (i+1) + ": ");
            arr[i] = teclado.nextInt();
        }
    
    }
    
    static boolean esPrimo(int nro){
        
        if(nro <= 1){
            return false;
        }
        
        for(int i = 2; i <= nro/2; i++){
            if(nro % i == 0){
                return false;
            }
        }
        
        return true;
        
    }
    
    static int cantPrimos(int arr[]){
    
        int cantidad = 0;
        
        for(int i=0; i<arr.length; i++){
            
            if(esPrimo(arr[i])){
                cantidad++;
            }
            
        }
        
        return cantidad;
    
    }
    
    static void imprimirPrimos(int arr[]){
    
        int primos[] = new int[cantPrimos(arr)];
        
        int indice = 0;
        
        for(int i=0; i<arr.length; i++){
            
            if(esPrimo(arr[i])){
                primos[indice] = arr[i];
                indice++;
            }
            
        }
        
        for(int primo : primos){
            System.out.print(primo + " ");
        }
        
    }
    
    static void imprimirArreglo(int arr[]){
        
        for(int arreglo : arr){
            System.out.print(arreglo + " ");
        }
        
    }
    
    // b)
    static int obtenerSumatoria(int arr[]){
        
        int suma = 0;
        
        for(int i=0; i<arr.length; i++){
            suma += arr[i];
        }
        
        return suma;
    
    }
    
    // c)
    static double obtenerPromedio(int arr[], double sumatoria){
    
        return sumatoria / arr.length;
        
    }
    
    public static void main(String[] args) {
        
        //int numeros[] = {1,2,3,4,5,6,7,8,9,10};
        
        int numeros[] = new int[10]; // n numeros
        
        cargarArreglo(numeros);
        
        System.out.println("Arreglo original: ");
        imprimirArreglo(numeros);
        
        System.out.print("\ntotal de numeros primos: " + cantPrimos(numeros) + " numeros");
        
        System.out.print("\nNumeros primos: ");
        imprimirPrimos(numeros);
        
        int suma = obtenerSumatoria(numeros);
        System.out.println("\nSumatoria de todos los valores del arreglo original: " + suma);
        System.out.println("Promedio: " + obtenerPromedio(numeros, suma));
        
        
    }
    
}
