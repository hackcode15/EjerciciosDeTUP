/*
    2) Obtener un algoritmo que imprima por pantalla todos los números pares del 2 al 300.
*/
package ejerciciosDeTUP.estructuras_repetitivas;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        System.out.println("Numero pares del 2 al 300");
        int orden = 0;
        for(int i = 2; i <= 300; i++){
            if(i % 2 == 0){
                orden++;
                System.out.println(orden + ") " + i);
            }
        }
        
    }
    
}
