/*
11) Teniendo en cuenta que la clave es “111MIL”, escribir un algoritmo que nos pida una
    clave. Solo tenemos 3 intentos para acertar, si fallamos los 3 intentos nos mostrara un
    mensaje indicándonos que hemos agotado esos 3 intentos. Si acertamos la clave,
    saldremos del proceso.
*/

package ejerciciosDeTUP.estructuras_repetitivas;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int intentos = 3;
        
        System.out.println("Adivine la clave, tiene solo 3 intentos");
        
        while(intentos > 0){
            
            System.out.print("Digite la clave: ");
            String clave = teclado.nextLine();
            
            if(clave.equals("111MIL")){
                System.out.println("Acertaste!!!");
                break;
            }else{
                intentos--;
                if(intentos > 0){
                    System.out.println("Fallaste, te quedan solo " + intentos + " intentos");
                }else if(intentos == 0){
                    System.out.println("Lo siento, ya no te quedan intentos");
                }
                
            }
            
        }
        
        
    }
    
}
