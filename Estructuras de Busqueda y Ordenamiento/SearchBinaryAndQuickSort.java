package algoritmosDeOrdamientoYBusqueda;

import java.util.Arrays;
import java.util.Scanner;

public class SearchBinaryAndQuickSort {
    
    public static void quicksort(int array[], int primero, int ultimo){
    
        if(primero <= ultimo){
        
            int i = primero;
            int j = ultimo;
            int pivote = array[(primero+ultimo)/2];
            
            while(i<=j){
            
                while(array[i] < pivote){
                    i++;
                }
                
                while(array[j] > pivote){
                    j--;
                }
                
                if(i <= j){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    i++;
                    j--;
                }
            
                
                
            }
            
            if(primero < j){
                quicksort(array, primero, j);
            }
                
            if(i < ultimo){
                quicksort(array, i, ultimo);
            }
        
        }
        
        
    }
    
    public static int busquedaBinaria(int array[], int elemento){
        
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
        
        int numeros[] = new int[10];
        boolean existe;
        
        System.out.println("Digite 10 numeros aleatorios para el array. (NO deben ser iguales)");
        
        for(int i=0; i<numeros.length; i++){
            
            System.out.print("Posicion [" + (i+1) + "]: ");
            
            int num = sc.nextInt();
            
            existe = false;
            
            for(int j=0; j<i; j++){
                if(numeros[j] == num){
                    existe = true;
                    break;
                }
            }
            
            if(!existe){ // Si existe es distinto de f
                numeros[i] = num;
            }else{
                System.out.println("Has ingresado un numero repetido. Intente nuevamente");
                i--;
            }
            
        }
        
        System.out.println("Array original: " + Arrays.toString(numeros));
        
        quicksort(numeros, 0, numeros.length - 1);
        
        System.out.println("Arreglo ordenado: " + Arrays.toString(numeros));
        
        System.out.print("Digite el valor a buscar en el arreglo ordenado: ");
        int valor = sc.nextInt();
        
        int posicion = busquedaBinaria(numeros, valor);
        
        if(posicion != -1){
            System.out.println("El valor " + valor + " se encuentra en la posicion " + (posicion + 1) + " del arreglo ordenado");
        }else{
            System.out.println("No encontrado");
        }
        
    }
    
}

