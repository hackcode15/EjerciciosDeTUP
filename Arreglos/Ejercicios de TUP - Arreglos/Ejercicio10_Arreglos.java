/*
Escriba un algoritmo que lea un arreglo de números enteros, y un número x, y escriba en la
pantalla todos los índices de las posiciones del arreglo donde está x. Por ejemplo, si el arreglo
es el que aparece enseguida y x es 2: 1 2 3 100 23 2 2 1 El programa debe escribir: 1 5 6.
*/
package arreglos;

public class Ejercicio10_Arreglos {

    static void imprimirIndicesDondeEstaX(int arreglo[], int numero){
        
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i] == numero){
                System.out.print(i + " "); // tengo en cuenta que el arreglo comienza con indice 0
            }
        }
        
        System.out.println("");
        
    }
    
    public static void main(String[] args) {
        
        int numeros[] = {1,2,3,100,23,2,2,1};
        
        int x = 2;
        
        imprimirIndicesDondeEstaX(numeros, x);
        
    }
    
}
