/*
Escriba un programa que solicite al usuario el ingreso por teclado de 2 dimensiones para una
matriz numérica. Posteriormente, solicite al usuario que ingrese por teclado todos los valores
necesarios para cargar dicha matriz. Finalmente imprima la matriz cargada manteniendo el
orden de sus valores ordenados por filas y columnas. Ejemplo
1 2 3
4 5 6
7 8 9
*/

package matrices;

import java.util.Scanner;

public class Ejercicio1_Matrices {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Crea una matriz");
        System.out.print("Filas: ");
        int filasA = sc.nextInt();
        System.out.print("Columnas: ");
        int columnasA = sc.nextInt();
        
        int matrizA [][] = new int[filasA][columnasA];
        
        System.out.println("Rellene el array con datos numericos");
        
        for(int i=0; i<matrizA.length; i++){
            
            for(int j=0; j<matrizA[i].length; j++){
                
                System.out.print("Posicion [" + (i+1) + "][" + (j+1) + "]: ");
                matrizA[i][j] = sc.nextInt();

            }
        }
        
        System.out.println("Matriz cargada");
        
        for(int i=0; i<matrizA.length; i++){
            
            for(int j=0; j<matrizA[i].length; j++){
                
                System.out.print("|" + matrizA[i][j] + "|");

            }
            System.out.println("");
        }
        
    }
    
}
