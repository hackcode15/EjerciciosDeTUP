package ejerciciosDeTUP.desarroladosEnClase;

import java.util.Scanner;

public class arreglos4 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numeros[] = {1,2,3,4,5,6,7,8,9,10};
        
        for(int numero : numeros){
            if(numero % 2 == 0){
                System.out.println(numero + " es par");
            }else{
                System.out.println(numero + " es impar");
            }
        }
        
        
    }
    
}
