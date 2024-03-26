package ejerciciosDeTUP.desarroladosEnClase;

import java.util.Locale;
import java.util.Scanner;

public class Codigo1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        sc.useLocale(Locale.US); // Metodo para escribir con el punto decimal
        
        System.out.print("Ingrese un numero con decimal usando '.': ");
        double num = sc.nextDouble();
        
        System.out.println(num);
        
        
    }
    
}
