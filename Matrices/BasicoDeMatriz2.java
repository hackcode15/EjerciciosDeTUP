package matrices;

import java.util.Scanner;

public class BasicoDeMatriz2 {
    
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
        
        // Otra forma de hacerlo
        
        /*
        //-------------------------------------------------
        int num_filas = matrizA.length;
        int num_columnas = matrizA[0].length;
        
        if(num_filas == num_columnas){
            System.out.println("Es una matriz cuadrada de " + num_filas + "x" + num_columnas);            
        }else{
            System.out.println("Es una matriz rectangular de " + num_filas + "x" + num_columnas);
        }
        //--------------------------------------------------
        // O simplemente usar las variables de filas y columnas
        cuando le pidamos al usuario
        
        if(filasA ==columnasA){
            System.out.println("Es una matriz cuadrada de " + filasA + "x" + columnasA);            
        }else{
            System.out.println("Es una matriz rectangular de " + filasA + "x" + columnasA);
        }
        //---------------------------------------------------
        */
        
        
        System.out.println("informacion sobre tu matriz");

        if(matrizA.length == matrizA[0].length){
            System.out.println("Es una matriz cuadrada de " + matrizA.length + "x" + matrizA[0].length);
        }else{
            System.out.println("Es una matriz rectangular de " + matrizA.length + "x" + matrizA[0].length);
        }
        
        
        for(int i=0; i<matrizA.length; i++){
            
            for(int j=0; j<matrizA[i].length; j++){
                
                System.out.print("|" + matrizA[i][j] + "|");

            }
            System.out.println("");
        }
        
    }
    
}
