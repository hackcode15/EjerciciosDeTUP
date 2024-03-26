package ejerciciosDeTUP.desarroladosEnClase;

import java.util.Locale;
import java.util.Scanner;

public class Codigo2 {

    public static void main(String[] args) {
        
        // Ejercicio 4 - Estructuras Secuenciales
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingresar sueldo por hr: ");
        teclado.useLocale(Locale.US);
        double sueldoXhora = teclado.nextDouble();
        
        System.out.print("Ingresar cantidad de horas normales: ");
        int hrsNormales = teclado.nextInt();
        
        System.out.print("Ingresar total hs de trabajo: ");
        int hrsTrabajo = teclado.nextInt();
        
        int hsExtras = hrsTrabajo - hrsNormales;

        // Estructura Condicional
        
        double totalApagar = 0;
        
        if(hsExtras > 0){
            
            totalApagar = hrsNormales*sueldoXhora + (hsExtras * (sueldoXhora*2));
            
        }else{
        
            totalApagar = hrsTrabajo*sueldoXhora;
            
        }
        
        System.out.println("Sueldo a pagar: " + totalApagar);      
        
    }
    
}
