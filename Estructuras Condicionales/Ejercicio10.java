/*
10) Una compañía de seguros está abriendo un depto. de finanzas y estableció un programa
    para captar clientes, que consiste en lo siguiente: Si el monto por el que se efectúa la
    fianza es menor que $50 000 la cuota a pagar será por el 3% del monto, y si el monto es
    mayor que $50 000 la cuota a pagar será el 2% del monto. La compañía desea determinar
    cuál será la cuota que debe pagar un cliente. 
*/

package ejerciciosDeTUP.estructuras_condicionales;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese el monto de la fianza: $");
        double monto = teclado.nextDouble();
        
        double cuota;
        
        if(monto > 0){
            
            if(monto < 50000){
            cuota = 0.03*monto;
            }else{
                cuota = 0.02*monto;
            }
            
            System.out.print("El monto a pagar es de: $" + cuota);
        
        }else{
            
            System.out.println("Error: Debes ingresar un valor entero positivo");
            
        }
        
        teclado.close();
      
    }
    
}
