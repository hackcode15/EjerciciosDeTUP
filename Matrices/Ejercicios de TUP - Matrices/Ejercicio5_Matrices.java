/*
Escriba un programa que dada una constante positiva N y una matriz mat de dimensión N x N,
se implementen lo siguiente:
a) Una función que ponga cero en ambas diagonales de la matriz.
b) Una función que ponga cero en la primera y la última fila, y en la primera y la última columna de la matriz.
c) Una función que llene de números la matriz de tal forma que mat[i][j] sea igual a i+j.
d) Una función llene la diagonal principal de la matriz con los números 1,2,3,...N. (La
diagonal principal de una matriz está formada por las casillas en las cuales el índice de
fila y de columna son iguales).
e) Una función que llene todas las filas pares con los números 1,2,3,...N, y las filas impares
con los números N,N-1,N-2,...1.

*/
package matrices;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5_Matrices {
    
    static void rellenarMatrizConNumerosAleatorios(int matriz[][]){
        
        // Creo un objeto Random
        Random random = new Random();
        
        // Relleno toda la matriz con numeros aleatorios del 1 al 9
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                matriz[i][j] = random.nextInt(9) + 1;
            }  
        }
        
    }
    
    static void imprimirMatriz(int matriz[][]){
        
        // Imprimo la matriz
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print("|" + matriz[i][j] + "|");
            }
            System.out.println("");
        }
        
    }
    
    static void ponerCerosEnAmbasDiagonales(int matriz[][]){
        
        // Relleno la matriz con ceros en ambas diagonales
        for(int i=0; i<matriz.length; i++){
            matriz[i][i] = 0; // Diagonal principal
            matriz[i][matriz.length - i - 1] = 0; // Diagonal secundaria
        }
        
    }
    
    static void ponerCerosEnLosBordes(int matriz[][]){
    
        // Poner ceros en la primera y la última fila
        for (int j = 0; j < matriz.length; j++) {
            matriz[0][j] = 0; // Primera fila
            matriz[matriz.length - 1][j] = 0; // Última fila
        }

        // Poner ceros en la primera y la última columna
        for (int i = 1; i < matriz.length; i++) {
            matriz[i][0] = 0; // Primera columna
            matriz[i][matriz.length - 1] = 0; // Última columna
        }
    
    }
    
    static void cargarMatrizConLaSumaDeIyJ(int matriz[][]){
    
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                matriz[i][j] = i+j+1;
            }
        }
    
    }
    
    static void rellenarDiagonalPrincipalCon1hastaN(int matriz[][]){
    
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                if(i == j){
                    matriz[i][j] = i+1;
                }
            }
        }
    
    }
    
    static void rellenarFilasParesEImpares(int matriz[][]){
       
        for(int i=0; i<matriz.length; i++){
            if(i % 2 == 0){
                for(int j=0; j<matriz.length; j++){
                    matriz[i][j] = j + 1;
                }
            }else{
                for(int j=0; j<matriz.length; j++){
                    matriz[i][j] = -1 * (matriz.length - j);
                }
            }
        }
        
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Solicito la dimension de la matriz
        System.out.print("Digite la dimension N de la matriz: ");
        int n = sc.nextInt();
        
        // Creo una matriz de dimension nxn
        int matrizA[][] = new int[n][n];
        
        //rellenarMatrizConNumerosAleatorios(matrizA);
        
        //ponerCerosEnAmbasDiagonales(matrizA);
        
        //ponerCerosEnLosBordes(matrizA);
        
        //cargarMatrizConLaSumaDeIyJ(matrizA);

        //rellenarDiagonalPrincipalCon1hastaN(matrizA);
        
        rellenarFilasParesEImpares(matrizA);
        
        imprimirMatriz(matrizA);
        
    }
    
}
