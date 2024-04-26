package ejerciciosDeTUP.desarroladosEnClase;

import java.util.Scanner;

public class EjercicioDeTeoria {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        /*
        System.out.print("Ingrese una vocal: ");
        String vocal = sc.next().toLowerCase();
        
        int calificacion = 0;
        
        switch(vocal){
            
            case "a":
                calificacion = 1;
                break;
            case "e":
                calificacion = 2;
                break;
            case "i":
                calificacion = 3;
                break;
            case "o":
                calificacion = 4;
                break;
            case "u":
                calificacion = 5;
                break;
            default:
                System.out.println("Error");
                break;
                
        }
        
        if(calificacion != 0){
            System.out.println(calificacion);
        }
        */
        
        System.out.print("Ingrese la cantidad: ");
        int cantidad = sc.nextInt();
        
        int cont = 1;
        int orden = 0;
        int num = 0;
        
        System.out.println("Primeros " + cantidad + " numeros pares");
        
        while(cont <= cantidad){
        
            num++;
            
            if(num % 2 == 0){
                cont++;
                orden++;
                System.out.println(orden + ") " + num);
            }
            
        }
        
        
    }
    
}
