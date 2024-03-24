/*
3) Solicitar la edad de dos hermanos, mostrando un mensaje que informe la edad del mayor
   y cuántos años de diferencia tiene con el menor.
*/

package ejerciciosDeTUP.estructuras_condicionales;

// importamos la clase 'Scanner' del paquete 'java.util'
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        // Instancio un objeto de tipo 'Scanner' y lo asigno a la variable 'teclado'
        Scanner teclado = new Scanner(System.in);
        
        // Pido y almaceno las edades de los dos hermanos
        System.out.print("Ingrese la edad de la 1° persona: ");
        int edad1 = teclado.nextInt();
        
        System.out.print("Ingrese la edad de la 2° persona: ");
        int edad2 = teclado.nextInt();
        
        // Defino las variables mayor y menor
        int mayor, menor;
        
        // Realizo la busqueda de la edad mayor y menor
        if(edad1 > edad2){ // si edad1 es mayor que edad2
            mayor = edad1;
            menor = edad2;
        }else{ // de lo contrario, edad2 es mayor que edad1
            mayor = edad2;
            menor = edad1;
        }
        
        // Realizo la diferencia
        int diferencia = mayor - menor;
        
        // Muestro el mensaje por pantalla
        System.out.println("El hermano mayor tiene una edad de " + mayor + " años");
        System.out.println("Tiene una diferencia de edad de " + diferencia + " años con el hermano menor");
        
        // Cierro el objeto 'Scanner' para liberar recursos
        teclado.close();
        
    }
    
}
