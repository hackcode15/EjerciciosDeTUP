package ejerciciosDeTup.desarroladosEnClase;

import java.util.*;

public class arreglos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] arregloOriginal = {3, 7, 9, 10, 15, 32};
        
        System.out.println("Matriz actual: " + Arrays.toString(arregloOriginal));
        
        System.out.print("Ingrese un nuevo valor para cargar en el arreglo: ");
        int nuevoValor = sc.nextInt();

        int posicion = 0;
        while (posicion < arregloOriginal.length && arregloOriginal[posicion] < nuevoValor) {
            posicion++;
        }

        int[] nuevoArreglo = new int[arregloOriginal.length + 1];
        
        for (int i = 0, j = 0; i < nuevoArreglo.length; i++) {
            if (i == posicion) {
                nuevoArreglo[i] = nuevoValor;
            } else {
                nuevoArreglo[i] = arregloOriginal[j++];
            }
        }
        
        
        arregloOriginal = nuevoArreglo;
        
        System.out.println("Nuevo valor cargado y ordenado: " + Arrays.toString(arregloOriginal));
    }
}

