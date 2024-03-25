/*
8) Crea un algoritmo que pida al usuario su código de usuario (un número entero) y su
   contraseña numérica (otro número entero), y no le permita seguir hasta que introduzca
   como código 1024 y como contraseña 4567.

*/

package ejerciciosDeTUP.estructuras_repetitivas;

import java.util.Scanner;

public class Ejercicio8 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int usuario, contrasena;
        
        do{
        
            System.out.print("Ingrese su usuario numerico: ");
            usuario = teclado.nextInt();
            System.out.print("Ingrese su contraseña numerica: ");
            contrasena = teclado.nextInt();
            
            if(usuario != 1024 || contrasena != 4567){
                System.out.println("Usuario o contraseña incorrectos");
                System.out.println("Intentelo nuevamente");
            }
            
        }while(usuario != 1024 || contrasena != 4567);
        
        System.out.println("Ingreso correcto !!");
        
        
    }
    
}
