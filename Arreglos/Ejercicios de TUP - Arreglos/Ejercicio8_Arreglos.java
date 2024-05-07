/*
Diseñe un algoritmo que lea un número cualquiera y lo busque en un arreglo X, el cual tiene
almacenado 10 elementos numéricos. Escriba la posición donde se encuentra almacenado el
número en el arreglo o el mensaje “NO” si no lo encuentra.
*/
package arreglos;

public class Ejercicio8_Arreglos {
    
    // Busqueda Lineal
    /*
    static int busqueda_lineal(int arreglo[], int elemento){
        
        int posicion = -1;
        
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i] == elemento){
                posicion = i;
            }
        }
        
        return posicion;
        
    }
    */
    
    // Busqueda Binaria
    static int busqueda_binaria(int arreglo[], int elemento){
    
        int inicio = 0;
        int fin = arreglo.length - 1;
        
        while(inicio <= fin){
            
            int medio = inicio + (fin - inicio) / 2;
            
            if(arreglo[medio] == elemento){
                return medio;
            }else if(arreglo[medio] < elemento){
                inicio = medio + 1;
            }else{
                fin = medio - 1;
            }
        
        }
        
        return -1;
        
    }
    
    public static void main(String[] args) {
        
        int numeros[] = {4,8,12,16,20,24,28,32,36,40};
        
        int elemento = 32;
        
        // Busqueda Lineal
        /*
        int posicion = busqueda_lineal(numeros, elemento);
        
        if(posicion != -1){
            System.out.println("Elemento " + elemento + " encontrado en la posicion " + (posicion+1));
        }else{
            System.out.println("NO");
        }
        */
        
        // Busqueda Binaria
        int posicion = busqueda_binaria(numeros, elemento);
        
        if(posicion != -1){
            System.out.println("Elemento " + elemento + " encontrado en la posicion " + (posicion+1));
        }else{
            System.out.println("NO");
        }
        
        
    }
    
}
