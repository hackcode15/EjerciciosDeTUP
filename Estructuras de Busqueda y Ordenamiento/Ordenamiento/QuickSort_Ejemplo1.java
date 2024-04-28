package algoritmosDeOrdamientoYBusqueda;

public class QuickSort_Ejemplo1 {
    
    public static void quicksort(double[] a, int primero, int ultimo){
        
        if(primero < ultimo){
            
            int i = primero;
            int j = ultimo;

            // Selecciono el pivote como el valor medio del array
            double pivote = a[(primero + ultimo) / 2];


            // Particionamiento
            while(i <= j){

                while(a[i] < pivote){
                    i++;
                }

                while(a[j] > pivote){
                    j--;
                }

                if(i <= j){
                    // Intercambio de elementos
                    double tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                    i++;
                    j--;
                }

            }
            
            if(primero < j){
                quicksort(a, primero, j);
            }
            if(i < ultimo){
                quicksort(a, i, ultimo);
            }
            
        }
        
        
        
        
    }

    public static void main(String[] args) {
        
        double array[] = {5.2, 3.7, 8.1, 9, 1.9, 6.6, 6};
        
        int n = array.length;
        
        System.out.println("Array original: ");
        for(double num : array){
            System.out.print(num + " ");
        }
        System.out.println();
        
        quicksort(array, 0, n - 1);
        
        System.out.println("Array ordenado: ");
        for(double num : array){
            System.out.print(num + " ");
        }
        System.out.println();
        
    }
    
}
