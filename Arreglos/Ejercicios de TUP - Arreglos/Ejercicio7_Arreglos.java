/*
Diseñe un algoritmo que lea dos arreglos A y B de 20 elementos cada uno y multiplique el
primer elemento de A con el último elemento de B y luego el segundo elemento de A por el
décimo noveno elemento de B y así sucesivamente hasta llegar al veinteavo elemento de A por
el primer elemento de B. Almancer el resultado de las multiplicaciones en un arreglo C.
*/
package arreglos;

import java.util.Arrays;

public class Ejercicio7_Arreglos {

    static int[] multiplicarDosArreglos(int arregloA[], int arregloB[]){
        
        int arregloC[] = new int[arregloA.length];
        
        //int indice = 0;
        
        for (int i = 0; i < arregloA.length; i++) {
            //arregloC[indice] = arregloA[i] * arregloB[arregloB.length - 1 - i];
            arregloC[i] = arregloA[i] * arregloB[arregloB.length - 1 - i];
            //indice++;
        }
        
        return arregloC;
    
    }
    
    // utilizo arregloB.length - 1 - i para obtener el índice inverso de B
    
    public static void main(String[] args) {
        
        int a[] = {2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40};
        int b[] = {1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35,37,39};
        
        int c[] = multiplicarDosArreglos(a, b);
        
        System.out.println("Arreglo A: " + Arrays.toString(a));
        System.out.println("Arreglo B: " + Arrays.toString(b));
        System.out.println("Multiplicacion de A*B");
        System.out.println("Arreglo C: " + Arrays.toString(c));
        
    }
    
}
