package matrices;

public class BasicoDeMatriz1 {

    public static void main(String[] args) {
        
        int matriz [][] = new int [3][4];

        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 6;
        matriz[1][0] = 3;
        matriz[1][1] = 5;
        matriz[2][2] = 4;
        matriz[1][3] = 6;

        // Sintaxis valida solo para matrices cuadradas
        //int matriz[][] = {{1,2,3}, {4,5,6}, {7,8,9}};

        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print("|" + matriz[i][j] + "| ");
            }
            System.out.println("");
        }
        
        int filas = matriz.length;
        int columnas = matriz[0].length;
        
        System.out.println("\nFilas: " + filas);
        System.out.println("Columnas: " + columnas);
        
        System.out.println("\nMatriz de " + filas + "x" + columnas);
        
        
    }
    
}
