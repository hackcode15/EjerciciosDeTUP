package ejerciciosDeTUP;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicioMatrizTeoria {

    // Metodo para cargar la matriz con valores comprendidos entre 1 y 12
    static void cargarMatriz(int matriz[][]){
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Posicion A[" + (i+1) + "][" + (j+1) + "] = ");
                int valor = sc.nextInt();
                if(valor >= 1 && valor <= 12){
                    matriz[i][j] = valor;
                }else{
                    System.out.println("Error: Debes ingresar valores entre 1 y 12");
                    j--;
                }
            }
        }
        
    }
    
    // Metodo para imprimir la matriz
    static void imprimirMatriz(int matriz[][]){
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "|");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    // Metodo para transponer una matriz
    static void trasponerMatriz(int matriz[][]){
    
        int aux;
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<i; j++){
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }
        
    }
    
    // Metodo para obtener la diferencia entre dos matrices
    static int[][] obtenerDiferenciaDeMatriz(int matrizA[][], int matrizB[][]){
        
        int filas = matrizA.length;
        int columnas = matrizA[0].length;
        
        int resultado[][] = new int[filas][columnas];
        
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                resultado[i][j] = matrizA[i][j] - matrizB[i][j]; 
            }
        }
        
        return resultado;
        
    }
    
    // Metodo de ordenamiento quicksort para arreglos
    static void quicksort(int arr[], int primero, int ultimo){
    
        if(primero <= ultimo){
        
            int i = primero;
            int j = ultimo;
            int pivote = arr[(primero+ultimo)/2];
            while(i<=j){
                
                while(arr[i] < pivote){
                    i++;
                }
                
                while(arr[j] > pivote){
                    j--;
                }
                
                if(i<=j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
                
            }
        
            if(primero < j){
                quicksort(arr, primero, j);
            }
            
            if(i < ultimo){
                quicksort(arr, i, ultimo);
            }
        
        }
    
    }
    
    // Metodo de busqueda binaria
    static int busqueda_binaria(int arr[], int elemento){
    
        int inicio = 0;
        int fin = arr.length - 1;
        
        while(inicio <= fin){
        
            int medio = inicio + (fin - inicio) / 2;
            
            if(arr[medio] == elemento){
                return medio;
            }else if(arr[medio] < elemento){
                inicio = medio + 1;
            }else{
                fin = medio - 1;
            }
        
        }
        
        
        return -1;
        
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int matrizA[][] = new int[4][4];
        /*
        int matrizA[][] = {
            {1,1,3,4},
            {6,6,8,8},
            {7,1,3,14},
            {2,22,44,99}
        };
        */
        cargarMatriz(matrizA);
        
        int matrizB[][] = new int[4][4];
        
        System.out.println("Matriz A");
        
        // Mostrar por pantalla la matriz en forma de cuadro.
        imprimirMatriz(matrizA);
        
        // La primera fila corresponde a la diagonal principal de la matriz A.
        for (int i = 0; i < 4; i++) {
            matrizB[0][i] = matrizA[i][i]; // La diagonal principal esta en A[i][i]
        }
        
        // La segunda fila corresponde a la diagonal principal de la matriz A en sentido inverso.
        for (int i = 0; i < 4; i++) {
            matrizB[1][i] = matrizA[3-i][3-i]; // Diagonal principal en sentido inverso
        }
        
        // La tercera fila es la suma de la primera fila y la segunda fila
        for (int i = 0; i < 4; i++) {
            matrizB[2][i] += matrizA[0][i] + matrizA[1][i]; 
        }
        
        // La cuarta fila es la diferencia entre la tercera fila y la segunda fila.
        for (int i = 0; i < 4; i++) {
            matrizB[3][i] += matrizA[2][i] - matrizA[1][i]; 
        }
        
        // Mostrar la matriz B por pantalla en forma de cuadro
        System.out.println("Matriz B generada por:");
        System.out.println("La primera fila corresponde a la diagonal principal de la matriz A.");
        System.out.println("La segunda fila corresponde a la diagonal principal de la matriz A en sentido inverso.");
        System.out.println("La tercera fila es la suma de la primera fila y la segunda fila");
        System.out.println("La cuarta fila es la diferencia entre la tercera fila y la segunda fila.");
        imprimirMatriz(matrizB);
        
        // Trasponiendo la matriz B
        trasponerMatriz(matrizB);
        
        System.out.println("Matriz B transpuesta");
        imprimirMatriz(matrizB);
        
        // Diferencia entre matrices
        
        int matrizC[][] = obtenerDiferenciaDeMatriz(matrizA, matrizB);
        
        System.out.println("Matriz C (diferencia de la matriz A y de la transpuesta de B)");
        imprimirMatriz(matrizC);
        
        
        // Convierto la matriz A en un arreglo
        int vectorTemp[] = new int[matrizA.length*matrizA[0].length];
        int indice = 0;
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                vectorTemp[indice++] = matrizA[i][j];
            }
        }
        
        int[] arregloTemporal = new int[vectorTemp.length];
        int contadorUnicos = 0;

        // Recorro el arreglo original y agrego los elementos únicos al arreglo temporal
        for (int i = 0; i < vectorTemp.length; i++) {
            boolean esUnico = true;
            for (int j = 0; j < contadorUnicos; j++) {
                if (vectorTemp[i] == arregloTemporal[j]) {
                    esUnico = false;
                    break;
                }
            }
            if (esUnico && contadorUnicos < 8) {
                arregloTemporal[contadorUnicos++] = vectorTemp[i];
            }
        }

        // Creo el arreglo final y hago una copia del arreglo temporal
        int[] vectorD = Arrays.copyOf(arregloTemporal, contadorUnicos);
        
        System.out.println("Matriz A convertido en vector: " + Arrays.toString(vectorTemp));
        System.out.println("Vector D con valores únicos de la matriz A(maximo 8): " + Arrays.toString(vectorD));
        
        // Ordeno el arreglo D
        quicksort(vectorD, 0, vectorD.length - 1);
        
        System.out.println("Vector D ordenado: " + Arrays.toString(vectorD));
        
        // Busco un elemento en el vector D ordenado con la buscqueda binaria
        System.out.print("Ingresa un elemento a buscar en el vector D ordenado: ");
        int elemento = sc.nextInt();
        
        int posicion = busqueda_binaria(vectorD, elemento);
        
        if(posicion != -1){
            System.out.println("Elemento " + elemento + " encontrado en la posicion " + (posicion+1) + " del vector D ordenado");
        }else{
            System.out.println("No encontrado");
        }
        
        // Genero la cadena
        String cadena = "";
        
        for (int i = 0; i < vectorD.length; i++) {
            
            switch(vectorD[i]){
                
                case 1:
                    cadena = cadena + "a";
                    break;
                case 2:
                    cadena = cadena + "e";
                    break;
                case 3:
                    cadena = cadena + "i";
                    break;
                case 4:
                    cadena = cadena + "o";
                    break;
                case 5:
                    cadena = cadena + "u";
                    break;
                case 6,7,8,9,10:
                    cadena = cadena + "t";
                    break;
                default:
                    cadena = cadena + "p";
                    break;
            }
            
        }
        
        System.out.println("Genero una cadena E a partir del arreglo D, considerando:");
        System.out.println("Si el número del arreglo es 1 en la cadena corresponde 'a'");
        System.out.println("Si el número del arreglo es 2 en la cadena corresponde 'e'");
        System.out.println("Si el número del arreglo es 3 en la cadena corresponde 'i'");
        System.out.println("Si el número del arreglo es 4 en la cadena corresponde 'o'");
        System.out.println("Si el número del arreglo es 5 en la cadena corresponde 'u'");
        System.out.println("Si el numero esta comprendido entre 6 y 10 colocar la letra 't'");
        System.out.println("Y en otro caso colocar la letra 'p'");
        System.out.println("Cadena: " + cadena);
        
        // Verifico si contiene diptongo
        boolean contieneDiptongo = false;
        
        for (int i = 0; i < cadena.length() - 1; i++) {
            char actual = cadena.charAt(i);
            char siguiente = cadena.charAt(i + 1);
            
            if ((actual == 'a' || actual == 'e' || actual == 'o') && (siguiente == 'i' || siguiente == 'u')) {
                contieneDiptongo = true;
                break;
            } else if ((actual == 'i' || actual == 'u') && (siguiente == 'a' || siguiente == 'e' || siguiente == 'o')) {
                contieneDiptongo = true;
                break;
            }
        }

        if (contieneDiptongo) {
            System.out.println("La palabra \"" + cadena + "\" contiene diptongo.");
        } else {
            System.out.println("La palabra \"" + cadena + "\" no contiene ningún diptongo.");
        }
        
    }
    
}
