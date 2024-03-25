/*
    13) Elabore una solución que solicite el ingreso de un número entero distinto de 0 y se
    informe si es par o no
*/

package ejerciciosDeTUP.estructuras_condicionales;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese un numero distinto de 0: ");
        int numero = teclado.nextInt();
        
        if(numero % 2 == 0){
            System.out.println("El numero " + numero + " SI es PAR");
        }else{
            System.out.println("El numero " + numero + " NO es par");
        }
        
        teclado.close();
        
    }
    
}
