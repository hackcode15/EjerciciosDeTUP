/*
4) Calcular la suma y el promedio de números ingresados. La cantidad de números a ingresar
   no se conoce, pero se sabe que deben pertenecer al rango [0,100]. La carga finaliza
   cuando el usuario ingresa un valor fuera del rango
*/
package ejerciciosDeTUP.estructuras_repetitivas;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int suma = 0;
        int cantidad = 0;
        double promedio;
        
        int num;
        
        System.out.println("Ingrese numeros en un rango de [0-100] \nDigite un numero fuera de ese rango para dejar de ingresar");

        do{
            
            System.out.print("Numero: ");
            num = teclado.nextInt();
            
            if(num >= 0 & num <= 100){
                suma += num;
                cantidad++;
            }
            
        }while(num >= 0 & num <= 100);
        
        promedio = suma/cantidad;
        
        if(cantidad > 1){
            System.out.println("La suma de todos los numeros ingresados es de: " + suma);
            System.out.println("El promedio es de: " + promedio);
        }else if(cantidad == 1){
            System.out.println("Se ha ingresado solo un numero dentro de ese rango");
        }else{
            System.out.println("No se han ingresado numeros dentro de ese rango");
        }
        
        teclado.close();

    }
    
}
