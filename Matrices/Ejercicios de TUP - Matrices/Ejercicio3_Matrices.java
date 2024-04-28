/*
Escribir un programa que solicite las dimensiones de 2 matrices y luego sus valores
correspondientes para cada posición dentro de la matriz. Posteriormente implementar:
a) Una función que reciba dos matrices y devuelva la suma.
b) Una función que reciba dos matrices y devuelva el producto.

*/
package matrices;

import java.util.Scanner;

public class Ejercicio3_Matrices {
    
    static int[][] obtenerSumaDeMatriz(int matrizA[][], int matrizB[][]){
        
        int filas = matrizA.length;
        int columnas = matrizA[0].length;
        
        int resultado[][] = new int[filas][columnas];
        
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                resultado[i][j] = matrizA[i][j] + matrizB[i][j]; 
            }
        }
        
        return resultado;
        
    }
    
    static int[][] obtenerProductoDeMatriz(int matrizA[][], int matrizB[][]){
        
        int filasA = matrizA.length;
        int columnasB = matrizB[0].length;
        
        int resultado [][] = new int [filasA][columnasB];
        
        for(int i=0; i<filasA; i++){
            for(int j=0; j<columnasB; j++){
                for(int k=0; k<matrizA[0].length; k++){
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }
        
        return resultado;
    }
    
    // Metodo adicional para imprimir las matrices
    static void imprimirMatriz(int resultado[][]){
        
        for(int i=0; i<resultado.length; i++){
            for(int j=0; j<resultado[i].length; j++){
                System.out.print("|" + resultado[i][j] + "|");
            }
            System.out.println("");
        }
        
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de filas y columnas de la matriz A:");
        System.out.print("Filas de la matriz A: ");
        int filasA = sc.nextInt();
        System.out.print("Columas de la matriz A: ");
        int columnasA = sc.nextInt();
        
        int matrizA[][] = new int[filasA][columnasA];
        
        System.out.println("Ingrese el numero de filas y columnas de la matriz B:");
        System.out.print("Filas de la matriz B: ");
        int filasB = sc.nextInt();
        System.out.print("Columnas de la matriz B: ");
        int columnasB = sc.nextInt();
        
        int matrizB[][] = new int[filasB][columnasB];
        
        System.out.println("¿Qué desea realizar?: ");
        System.out.println("1) Suma de A + B \n2) Producto de A * B");
        int decision = sc.nextInt();
        
        boolean esPosible = false;
        
        if(decision == 1){
            
            if(filasA == filasB & columnasA == columnasB){
                esPosible = true;
            }else{
                System.out.println("No es posible realizar la suma de matrices porque las dimensiones de la matriz");
            }
            
        }else if(decision == 2){
            
            if(columnasA == filasB){
                esPosible = true;
            }else{
                System.out.println("No es posible realizar el producto de matrices porque el numero de columna \nde la matriz A es distinto del numero de filas de la matriz B ");
            }
            
        }else{
            System.out.println("Opcion incorrecta");
        }
        
        if(esPosible){
            
            System.out.println("Cargue los elementos de la matriz A:");
                
                for(int i=0; i<matrizA.length; i++){
                    for(int j=0; j<matrizA[i].length; j++){
                        System.out.print("Posicion: A[" + (i+1) + "][" + (j+1) + "]: ");
                        matrizA[i][j] = sc.nextInt();
                    }
                }
                
                System.out.println("Ahora los elementos de la matriz B:");
                
                for(int i=0; i<matrizB.length; i++){
                    for(int j=0; j<matrizB[i].length; j++){
                        System.out.print("Posicion: B[" + (i+1) + "][" + (j+1) + "]: ");
                        matrizB[i][j] = sc.nextInt();
                    }
                }
                
                if(decision == 1){
                    System.out.println("La suma de la matriz A + B es igual a:");
                
                    int resultadoSuma[][] = obtenerSumaDeMatriz(matrizA, matrizB);
                
                    imprimirMatriz(resultadoSuma);
                }else{
                    System.out.println("El producto de la matriz A * B es igual a:");
                
                    int resultadoProducto[][] = obtenerProductoDeMatriz(matrizA, matrizB);
                
                    imprimirMatriz(resultadoProducto);
                }

        }
   
    }
    
}
