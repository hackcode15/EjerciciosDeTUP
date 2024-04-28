/*
Escriba un programa que dada una lista de números enteros y una constante positiva K,
escribir una función que:
a) Devuelva tres listas, una con los menores, otra con los mayores y otra con los iguales a K.
b) Devuelva una lista con aquellos que son múltiplos de K.
*/
package matrices;

public class Ejercicio4_Matrices {
    
    static void funcion(int matriz[], int constante){
        
        System.out.println("Menores que " + constante);
        for(int i=0; i<matriz.length; i++){
            if(matriz[i] < constante){
                System.out.println(matriz[i]);
            }
        }
        
        System.out.println("Mayores que " + constante);
        for(int i=0; i<matriz.length; i++){
            if(matriz[i] > constante){
                System.out.println(matriz[i]);
            }
        }
        
        System.out.println("Iguales que " + constante);
        for(int i=0; i<matriz.length; i++){
            if(matriz[i] == constante){
                System.out.println(matriz[i]);
            }
        }
        
        System.out.println("Multiplos que " + constante);
        for(int i=0; i<matriz.length; i++){
            if(matriz[i] % constante == 0){
                System.out.println(matriz[i]);
            }
        }
        
    }

    public static void main(String[] args) {
        
        int k = 10;
        
        int numeros[] = {5,6,8,50,3,12,10,15,66,10,20,15,2,30,4,9};
        
        funcion(numeros, k);

    }
    
}
