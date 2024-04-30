package algoritmosDeOrdamientoYBusqueda;

import java.util.Arrays;

public class QuickSort_Ejemplo2 {

    private static int vec[] = {20,12,28,24,8,4,16};
    
    public static void quickSort(int vec[], int inicio, int fin){
    
        if(inicio >= fin) return;
        
        int pivote = vec[inicio];
        int elemIzq = inicio+1;
        int elemDer = fin;
        
        while(elemIzq <= elemDer){
            
            while(elemIzq <= fin && vec[elemIzq] >= pivote){
                elemIzq++;
            }
            
            while(elemDer > inicio && vec[elemDer] >= pivote){
                elemDer--;
            }
            
            if(elemIzq < elemDer){
                int temp = vec[elemIzq];
                vec[elemIzq] = vec[elemDer];
                vec[elemDer] = temp;
            }
            
        }
        
        if(elemDer > inicio){
            int temp = vec[inicio];
            vec[inicio] = vec[elemDer];
            vec[elemDer] = temp;
        }
        
        quickSort(vec, inicio, elemDer-1);
        quickSort(vec, elemDer+1, fin);
        
    }
    
    public static void ordenacionRapida(int vec[]){
        final int N = vec.length;
        quickSort(vec, 0, N-1);
    }
    
    public static void imprimirVector(int vec[]){
        System.out.println(Arrays.toString(vec));
    }
    
    public static void main(String[] args) {
        
        System.out.println("Vector original: ");
        imprimirVector(vec);
        ordenacionRapida(vec);
        System.out.println("\nVector ordenado: ");
        imprimirVector(vec);
        
        
    }
    
}
