package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CargarNumerosSinRepeticionEnArray {
    
    public static boolean busqueda(int array[], int n, int i){
        
        for(int j=0; j<i; j++){
            if(n == array[j]){
                return true;
            }
        }
        
        return false;
        
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numeros[] = new int[10];
        int i = 0;
        boolean existe;
        
        System.out.println("Digite 10 numeros aleatorios. (NO repetidos)");
        
        while(i < numeros.length){

            System.out.print("Digite el " + (i+1) + "° valor: ");
            int num = sc.nextInt();
            
            existe = busqueda(numeros, num, i);

            if(!existe){
                numeros[i] = num;
                i++;
            }else{
                System.out.println("Has ingresa un numero repetido. Intente nuevamente");
            }
            
            
        }
        
        System.out.println("Arreglo: " + Arrays.toString(numeros));
        
    }
    
    

}
