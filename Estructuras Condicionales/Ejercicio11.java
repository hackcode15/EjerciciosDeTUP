/*
11) Se desea escribir un algoritmo que pida la altura de una persona, si la altura es menor o
    igual a 150 cm envíe el mensaje: “Persona de altura baja”; si la altura está entre 151 y 170
    escriba el mensaje: “Persona de altura media” y si la altura es mayor al 171 escriba el
    mensaje: “Persona alta”
*/

package ejerciciosDeTUP.estructuras_condicionales;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese su altura en cm: ");
        int altura = teclado.nextInt();
        
        if(altura <= 150){
            System.out.println("Persona de altura baja");
        }else if(altura >= 151 & altura <= 170){
            System.out.println("Persona de altura media");
        }else{
            System.out.println("Persona de altura alta");
        }
        
        teclado.close();
        
    }
    
}
