package matrices;

import java.util.Scanner;

public class CargarMatrizSinRepetidos2 {
    
    // Método para verificar si un valor ya existe en la matriz hasta la posición actual
    public static boolean verificarValorRepetido(int[][] matriz, int filaActual, int columnaActual, int valor) {
        for(int i = 0; i <= filaActual; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                if(i == filaActual && j >= columnaActual) {
                    break; // No verificar más allá de la posición actual
                }
                if(matriz[i][j] == valor) {
                    return true; // Valor encontrado, es repetido
                }
            }
        }
        return false; // Valor no encontrado, no es repetido
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite el numero de filas de la matriz: ");
        int filas = sc.nextInt();
        
        System.out.print("Digite el numero de columnas de la matriz: ");
        int columnas = sc.nextInt();
        
        int[][] matriz = new int[filas][columnas];

        System.out.println("Cargue la matriz con valores no repetidos");
        
        for(int i = 0; i < filas; i++) {
            
            for(int j = 0; j < columnas; j++) {
                
                int valor;
                boolean existe;
                
                do {
                    
                    System.out.print("Posicion [" + (i+1) + "][" + (j+1) + "]: ");
                    valor = sc.nextInt();
                    
                    existe = verificarValorRepetido(matriz, i, j, valor); // verdadero o falso
                    
                    if(existe) { // en caso de ser verdadero
                        System.out.println("Has ingresado un valor repetido, intentelo de nuevo");
                    }
                    
                } while(existe); // Repetir mientras el valor ingresado esté repetido
                
                matriz[i][j] = valor; // asigna el valor en la posicion correspondiente
                
            }
        }
        
        
    }
    
}
