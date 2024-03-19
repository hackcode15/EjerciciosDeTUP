package ejerciciosDeTUP;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        
        try{
        
            System.out.print("Ingrese el monto presupuestal: $");
            double monto = read.nextInt();
            
            if(monto <= 0){
            
                throw new IllegalArgumentException("El monto presupuestal debe ser un valor entero positivo");
                
            }

            double urgencias = (monto*37)/100;
            double pediatra = (monto*42)/100;
            double traumatologia = (monto*21)/100;

            System.out.println("Cantidad de dinero que recibira cada area.");
            System.out.println("Urgencias: $" + urgencias);
            System.out.println("Pediatra: $" + pediatra);
            System.out.println("Traumatologia: $" + traumatologia);
        
        }catch(InputMismatchException e){
        
            System.out.println("Error: Por favor, ingrese un valor numerico valido.");
            
        }catch(IllegalArgumentException e){
        
            System.out.println("Error: " + e.getMessage());
            
        } finally {
        
            read.close();
            
        }

    }
    
}
