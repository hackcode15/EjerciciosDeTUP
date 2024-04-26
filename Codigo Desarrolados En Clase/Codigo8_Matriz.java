package ejerciciosDeTUP.desarroladosEnClase;

import java.util.Scanner;

public class Codigo8_Matriz {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        final int filas = 3;
        final int cols = 3;
        
        int matriz[][] = new int[filas][cols];
        
        for(int i=0; i<filas; i++){
            for(int j=0; j<cols; j++){
                System.out.print("Posicion [" + (i+1) + "][" + (j+1) + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print("|" + matriz[i][j] + "|");
            }
            System.out.println("");
        }
        
        
    }
    
}
