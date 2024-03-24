/*
9) Determinar la cantidad de dinero que recibirá un trabajador por concepto de las horas
   extras trabajadas en una empresa, sabiendo que cuando las horas de trabajo exceden de
   40, el resto se consideran horas extras y que estas se pagan al doble de una hora normal
   cuando no exceden de 8; si las horas extras exceden de 8 se pagan las primeras 8 al doble
   de lo que se pagan las horas normales y el resto al triple.
*/

package ejerciciosDeTUP.estructuras_condicionales;

import java.util.Scanner;

public class Ejercicio9 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese las horas trabajadas: ");
        int horasTrabajadas = teclado.nextInt();
        
        // Supongamos que el pago por hora es de $500
        final int pagoPorHora = 500;
        final int horasNormales = 40;
        
        int horasExtras;
        int pagoTotal;
        int pagoExtraDoble = pagoPorHora*2;
        int pagoExtraTriple = pagoPorHora*3;
        
        if(horasTrabajadas > 40){

            horasExtras = horasTrabajadas - horasNormales;
            
            if(horasExtras <= 8){
                
                pagoTotal = (horasNormales * pagoPorHora) + (horasExtras * pagoExtraDoble);
                
            }else{

                int horasExtrasTriples = horasExtras - 8;
                pagoTotal = (horasNormales * pagoPorHora) + (8 * pagoExtraDoble) + (horasExtrasTriples * pagoExtraTriple);

            }
        
        }else{
        
            pagoTotal = pagoPorHora * horasTrabajadas;
            
        }
        
        System.out.println("El pago total es de: $" + pagoTotal);

    }
    
}
