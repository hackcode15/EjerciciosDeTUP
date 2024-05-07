/*
Escriba un programa para realizar una función que, dada una lista, devuelva una nueva lista
cuyo contenido sea igual a la original pero invertida.
Así, dada la lista [“Di”, “buen”, “día”, “a”, “papa”],
deberá devolver [“papa”, “a”, “día”, “buen”, “Di”].
*/

package arreglos;

import java.util.Arrays;

public class Ejercicio3_Arreglos {

    static String[] invertirLista(String frase[]){
        
        String nuevaLista[] = new String[frase.length];
        
        for(int i=0; i<frase.length; i++){
            nuevaLista[i] = frase[frase.length - 1 - i];
        }
        
        return nuevaLista;
        
    }
    
    public static void main(String[] args) {
        
        String frases[] = {"Di", "buen", "dia", "a", "papa"};
        
        String listaInvertida[] = invertirLista(frases);
        
        System.out.println("Lista original: " + Arrays.toString(frases));
        
        System.out.println("Lista invertida: " + Arrays.toString(listaInvertida));
        
    }
    
}
