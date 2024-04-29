package matrices;

import java.util.Scanner;

public class CargarMatrizSinRepetidos1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite el numero de filas de la matriz: ");
        int filas = sc.nextInt();
        
        System.out.print("Digite el numero de columnas de la matriz: ");
        int columnas = sc.nextInt();
        
        int[][] matriz = new int[filas][columnas];

        System.out.println("Cargue la matriz con valores no repetidos");
        
        boolean existe;
        
        for(int i = 0; i < filas; i++) {
            
            for(int j = 0; j < columnas; j++) {
                
                do {
                    
                    System.out.print("Posicion [" + (i+1) + "][" + (j+1) + "]: ");
                    int valor = sc.nextInt();
                    
                    existe = false;
                    
                    // Verificar si el valor ya existe en la matriz
                    for(int k = 0; k < filas; k++) {
                        
                        for(int p = 0; p < columnas; p++) {
                            
                            if(matriz[k][p] == valor) {
                                existe = true;
                                break; // Salir del bucle interno si se encuentra el valor repetido
                            }
                            
                        }
                        
                        if(existe) {
                            break; // Salir del bucle externo si se encuentra el valor repetido
                        }
                        
                    }
                    
                    if(!existe) {
                        matriz[i][j] = valor; // Asignar el valor a la matriz si no está repetido
                    } else {
                        System.out.println("Has ingresado un valor repetido, intentelo de nuevo");
                    }
                    
                } while(existe); // Repetir mientras el valor ingresado esté repetido
                
            }
        }

        // Mostrar la matriz final
        System.out.println("Matriz final:");
        for(int i = 0; i < filas; i++) {
            for(int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}

