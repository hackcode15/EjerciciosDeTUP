package matrices;

public class ProductoDeMatrices {
    public static void main(String[] args) {
        
        // caso 1
        /*
        int[][] matrizA = {
            {1, 2, 3}, 
            {4, 5, 6}, 
            {1, 15, 9}
        };
        
        int[][] matrizB = {
            {7, 8, 5}, 
            {8, 9, 10},
            {1, 11, 5}
        };
        */
        
        //caso 2
        /*
        int[][] matrizA = {
            {1, 2, 3}, 
            {4, 5, 6}
        };
        
        int[][] matrizB = {
            {7, 8}, 
            {8, 9},
            {1, 11}
        };
        */
        
        // caso 3
        int[][] matrizA = {
            {1, 2, 3}, 
            {4, 5, 6}, 
            {1, 15, 9}
        };
        
        int[][] matrizB = {
            {7, 8}, 
            {8, 9},
            {1, 11}
        };
        
        int columnasA = matrizA[0].length;
        int filasB = matrizB.length;
        
        if (filasB == columnasA) {
            
            int filas = matrizA.length;
            int columnas = matrizB[0].length;
            
            int[][] resultado = new int[filas][columnas];
        
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    for (int k = 0; k < matrizA[0].length; k++) {
                        resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                    }
                }
            }
            
            System.out.println("Resultado de la multiplicación de matrices:");
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    System.out.print(resultado[i][j] + " ");
                }
                System.out.println();
            }
            
        }else{
            System.out.println("No se pueden multiplicar las matrices debido a dimensiones incorrectas.");
        }

    }
}

