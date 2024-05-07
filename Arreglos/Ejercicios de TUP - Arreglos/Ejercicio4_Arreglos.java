/*
Escriba un programa para realizar otra función que invierta una lista, similar al ejercicio anterior,
pero en lugar de devolver una nueva, modifique la lista dada para invertirla, sin usar listas
auxiliares.
*/
package arreglos;

public class Ejercicio4_Arreglos {
   
    static void imprimirArregloInvertido(int arr[]){
    
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }

    }
    
    static void imprimirArregloOriginal(int arr[]){
        
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }
    
    public static void main(String[] args) {
        
        int numeros[] = {2,4,6,8,1};
        
        System.out.println("Arreglo original: ");
        imprimirArregloOriginal(numeros);
        
        System.out.println("\nArreglo invertido: ");
        imprimirArregloInvertido(numeros);
        
        System.out.println("");
    }
    
}
