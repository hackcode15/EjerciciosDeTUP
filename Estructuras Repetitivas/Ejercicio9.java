/*
    9) Elabore un algoritmo que permita mostrar por pantalla los números pares hasta el 18
*/

package ejerciciosDeTUP.estructuras_repetitivas;

public class Ejercicio9 {
    
    public static void main(String[] args) {
        
        int orden = 0;
        
        for(int i = 1; i <= 18; i++){
            if(i % 2 == 0){
                orden++;
                System.out.println(orden + ") " + i);   
            }  
        }
        
    }
    
}
