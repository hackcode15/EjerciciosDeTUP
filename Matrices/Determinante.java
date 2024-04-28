package matrices;

import java.util.Scanner;

public class Determinante {

    public static void obtenerCofactor(int matriz[][], int temp[][], int p, int q, int n){
    
        int i = 0, j = 0;
        
        for(int fila = 0; fila < n; fila++){
        
            for(int columna = 0; columna < n; columna++){
                if(fila != p && columna != q){
                    temp[i][j++] = matriz[fila][columna];
                    if(j == n - 1){
                        j = 0;
                        i++;
                    }
                }
            }
            
        }
        
    } // Termina cofactor
    
    public static int determinanteMatriz(int matriz[][], int n){
        
        int determinante = 0;
        
        if(n == 1){
            return matriz[0][0];
        }
        
        int temp[][] = new int[n][n];
        int multiplicador = 1;
        
        for(int f = 0; f < n; f++){
            obtenerCofactor(matriz, temp, 0, f, n);
            determinante += multiplicador * matriz[0][f] * determinanteMatriz(temp, n-1);
            multiplicador = -multiplicador;
        }
        return determinante;
    }
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño de la matriz: ");
        int n = sc.nextInt();
        
        int matriz[][] = new int[n][n];
        
        System.out.println("Comienze a ingresar los valores");
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("Posicion [" + (i+1) + "][" + (j+1) + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("La determinante de la matriz es: " + determinanteMatriz(matriz, n));
        
        sc.close();
        
    }
    
}
