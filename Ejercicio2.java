package ejerciciosDeTUP;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        final double precioxKM = 10.50;
        
        System.out.print("Digite los kilometros a recorrer: ");
        double km = teclado.nextInt();
        
        double precio_boleto = 0;
        
        for(int i=0; i<km; i++){
            
            precio_boleto += precioxKM;
        
        }
        
        System.out.println("El precio del boleto de " + km + " kilometros es de: $" + precio_boleto);
        
    }

}
