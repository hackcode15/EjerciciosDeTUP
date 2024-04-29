package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CargarNumerosSinRepeticionEnArray2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numeros[] = new int[5];
        
        boolean existe;
        
        System.out.println("Digite 5 numeros para el arreglo, sin repetidos");
        
        for(int i=0; i<numeros.length; i++){
            
            System.out.print("Digite el " + (i+1) + "° valor: ");
            int valor = sc.nextInt();
            
            existe = false;
            
            for(int j=0; j<i; j++){
                if(numeros[j] == valor){
                    existe = true;
                }
            }
            
            if(!existe){
                numeros[i] = valor;
            }else{
                System.out.println("Has ingresado un numero repetido, digite otro distinto.");
                i--;
            }
            
        }
        
        System.out.println("\nArray cargado: " + Arrays.toString(numeros));
        
        
    }
    
}
