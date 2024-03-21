package ejerciciosDeTUP;

import java.util.*;

public class BusquedaBinaria {
    
    static void ordenarArray(int array[]){
        
        // 1° paso: Ordenamos el array, lo podemos hacer con el metodo 'sort()' de la clase 'Arrays'
        // Tambien se puede hacer con el algoritmo de ordenamiento 'Burbuja'
        
        
        // Algoritmo de ordenamiento 'Burbuja'
        for(int i=0; i<array.length-1; i++){
            for(int j=0; j<array.length-1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        
        // Metodo 'sort()' de la clase 'Arrays'
        //Arrays.sort(array);
        
        System.out.println("Numeros ordenados");
        for(int i=0; i<array.length; i++){
            System.out.println((i+1) + ") " + array[i]);
        }
        
    }
    
    
    static int busquedaBinaria(int array[], int elemento){
    
        int inicio = 0;
        int fin = array.length - 1;
        
        while(inicio <= fin){
        
            int medio = inicio + (fin - inicio) / 2;
            
            if(array[medio] == elemento){
                return medio;
            }else if(array[medio] < elemento){
                inicio = medio + 1;
            }else{
                fin = medio - 1;
            }
            
        }
        
        return -1;
    
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Buscar un elemento de un array con el algoritmo de "Busqueda Binaria"
        
        int numeros[] = {12,6,4,2,33,5,54,8};
        
        System.out.println("Numeros ordenados");
        ordenarArray(numeros);
        
        System.out.print("\nIngrese el numero que desea encontrar: ");
        int numeroBuscado = sc.nextInt();
        
        int posicion = busquedaBinaria(numeros, numeroBuscado);
        
        if(posicion != -1){
            System.out.println("Numero " + numeroBuscado + " encontrado en la posicion " + (posicion+1) + " del array");
        }else{
            System.out.println("Numero no encontrado");
        }
 
    }
    
}
