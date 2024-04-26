package ejerciciosDeTUP.desarroladosEnClase;

import java.util.Arrays;
import java.util.Scanner;

public class arreglos3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int valores[] = {4,2,8,19,14};
        
        System.out.println("Numeros: " + Arrays.toString(valores));
        
        for(int i=0; i<valores.length-1; i++){
            for(int j=0; j<valores.length-1; j++){
                if(valores[j] > valores[j+1]){
                    int temp = valores[j];
                    valores[j] = valores[j+1];
                    valores[j+1] = temp;
                }
            }
        }
        
        System.out.println("Numeros ordenados: " + Arrays.toString(valores));
        
        int inicio = 0;
        int fin = valores.length;
        int posicion = -1;
        
        System.out.print("Digite el numero a buscar: ");
        int numeroABuscar = sc.nextInt();
        
        while(inicio <= fin){
        
            int medio = inicio + (fin - inicio) / 2;
            
            if(valores[medio] == numeroABuscar){
                posicion = medio;
                break;
            }else if(valores[medio] < numeroABuscar){
                inicio = medio + 1;
            }else{
                fin = medio - 1;
            }
            
        }
        
        if(posicion != -1){
            System.out.println("Numero " + numeroABuscar + " encontrado en la posicion " + (posicion+1));
        }else{
            System.out.println("Numero no encontrado");
        }
        
        
    }
    
}
