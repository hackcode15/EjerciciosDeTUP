/*
Escriba un programa que solicite al usuario un valor entero para establecer el tamaño de un
arreglo de números enteros. Luego utilice ese valor para crear el arreglo y posteriormente
solicitar al usuario que ingrese cada uno de los valores para completar el arreglo.
Finalmente, imprima por pantalla la lista de valores ingresados por el usuario en:
a) El mismo orden en que fueron leídos por el teclado.
b) En orden inverso al que fueron cargados.
c) Una lista de todos los números pares.
d) Un lista de todos los valores que se encuentran ubicados en posiciones impares en el
arreglo.

*/

package arreglos;

import java.util.Scanner;

public class Ejercicio1_Arreglos {
    
    // a)
    static void imprimeArreglo(int a[]){
        
        for(int i=0; i<a.length; i++){
            System.out.println(i + ") " + a[i]); // (i+1)
        }
        
    }
    
    // b)
    static void imprimeArregloInverso(int a[]){
        
        for(int i=a.length-1; i>=0; i--){
            System.out.println(i + ") " + a[i]); // (i+1)
        }
        
    }
    
    // c)
    static void imprimePares(int a[]){
    
        for(int i=0; i<a.length; i++){
            if(a[i] % 2 == 0){
                System.out.println(a[i]);
            }
        }
    
    }
    
    static void imprimirPosicionesImpares(int a[]){
        
        for(int i=0; i<a.length; i++){
            if(i % 2 != 0){
                System.out.println(i + ") " + a[i]); // (i+1)
            }
        }
        
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño del arreglo: ");
        int tam = sc.nextInt();
        
        int arreglo[] = new int[tam];
        
        System.out.println("carge los " + tam + " valores del arreglo");
        
        for(int i=0; i<arreglo.length; i++){
            System.out.print("Posicion " + i + ": "); // (i+1)
            arreglo[i] = sc.nextInt();
        }
        
        System.out.println("\na)");
        imprimeArreglo(arreglo);
        
        System.out.println("\nb)");
        imprimeArregloInverso(arreglo);
        
        System.out.println("\nc)");
        imprimePares(arreglo);
        
        System.out.println("\nd)");
        imprimirPosicionesImpares(arreglo);
        
    }
    
}
