package matrices;

import java.util.Scanner;

public class Transpuesta {

    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
    
        int matriz[][] = new int [3][3];
        
        System.out.println("Cargue todos los elementos de la matriz");
        
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print("Posicion [" + (i+1) + "][" + (j+1) + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("\nMatriz original: ");
        
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print("|" + matriz[i][j] + "|");
            }
            System.out.println("");
        }
        
        // transponiendo la matriz
        int aux;
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<i; j++){
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }
        
        System.out.println("\nLa matriz transpuesta es: ");
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print("|" + matriz[i][j] + "|");
            }
            System.out.println("");
        }
        
        
    }

}
