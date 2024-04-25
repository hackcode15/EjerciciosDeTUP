/*
Escribir una programa que solicite al usuario el ingreso por teclado de una dimensión N para
crear una matriz cuadrada. Imprima la matriz identidad correspondiente a esa dimensión.
Ejemplo:
1 0 0
0 1 0
0 0 1
*/
package matrices;

import java.util.Scanner;

public class Ejercicio2_Matrices {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Solicito la dimension de la matriz
        System.out.print("Ingrese una dimension N: ");
        int n = sc.nextInt();
        
        // Defino la matriz con la dimension ingresada
        int matriz[][] = new int [n][n];
        
        // Creo la matriz identidad
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++){
                // Donde i sea igual j pongo el valor 1, ej: [1][1] = 1; [2][2] = 1; ... etc;
                if(i == j){
                    matriz[i][j] = 1;
                }
                // de lo contrario se mostrara con ceros
            }
        }
        
        System.out.println("Matriz identidad de dimension " + n);
        
        // Imprimo la matriz identidad
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++){
                System.out.print("|" + matriz[i][j] + "|");
            }
            System.out.println("");
        }
        
        
    }
    
}
