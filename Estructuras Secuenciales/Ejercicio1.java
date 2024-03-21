package ejerciciosDeTUP;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        final int precioxKM = 45;
        
        System.out.print("Digite los kilometros a recorrer: ");
        int km = teclado.nextInt();
        
        int precio_boleto = 0;
        
        for(int i=0; i<km; i++){
            
            precio_boleto += precioxKM;
        
        }
        
        System.out.println("El precio del boleto de " + km + " kilometros es de: $" + precio_boleto);
        
    }

}
