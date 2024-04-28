package algoritmosDeOrdamientoYBusqueda;

import java.util.Arrays;

public class Quicksort_Ejemplo3 {
    
    static void quicksort(int array[], int izq, int der){
        
        // Tomamos el primer elemento como pivote
        int pivote = array[izq];
        // i realiza la busqueda de izquierda a derecha
        int i = izq;
        // j realiza la busqueda de derecha a izquierda
        int j = der;
        
        int aux;
        
        // Mientras no se cruzen las busquedas
        while(i < j){
        
            // Busca el elemento mayor que pivote
            while(array[i] <= pivote && i < j){
                i++;
            }
            
            // Busca elemento menor que pivote
            while(array[j] > pivote){
                j--;
            }
            
            // Si no se han cruzado
            if(i < j){
                // Intercambia array[i] con array[j]
                aux = array[i];
                array[i] = array[j];
                array[j] = aux;
            }

        }
        
        // Colocamos el pivote en su lugar
        array[izq] = array[j];
        array[j] = pivote;
        
        // Ordenamos los subarrays izquierdo y derecho recursivamente
        
        // Ordenamos subarray izquierdo
        if(izq < j - 1){
            quicksort(array, izq, j - 1);
        }
        
        // Ordenamos subarray derecho
        if(j + 1 < der){
            quicksort(array, j + 1, der);
        }
        
    }

    public static void main(String[] args) {
        
        int numeros[] = {99,102,5,2,16,9,1,5,6,172,99};
        
        System.out.println("Arreglo original: " + Arrays.toString(numeros));

        quicksort(numeros, 0, numeros.length - 1);
        
        System.out.println("Arreglo ordenado: " + Arrays.toString(numeros));
        
    }
    
}
