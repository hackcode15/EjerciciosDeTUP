package ejerciciosDeTUP.desarroladosEnClase;

import java.util.Arrays;
import java.util.Scanner;

public class arreglos5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
     
        int arregloOriginal[] = {2, 8, 6, 8, 10, 12, 14, 16, 8, 20};
        
        System.out.println("Arreglo original: " + Arrays.toString(arregloOriginal));
        
        System.out.print("Ingrese un valor a eliminar: ");
        int valorAEliminar = sc.nextInt();
        
        // Contador para llevar un registro de cuántos elementos se eliminaron
        int eliminados = 0;
        
        // Recorrer el arreglo original y contar cuántos elementos se eliminarán
        for(int i = 0; i < arregloOriginal.length; i++){
            if(valorAEliminar == arregloOriginal[i]){
                eliminados++;
            }
        }
        
        // Si hay elementos para eliminar
        if(eliminados > 0){
            int nuevoArreglo[] = new int[arregloOriginal.length - eliminados];
            int newIndex = 0;
            
            // Recorrer el arreglo original y copiar solo los elementos que no se van a eliminar
            for(int i = 0; i < arregloOriginal.length; i++){
                if(arregloOriginal[i] != valorAEliminar){
                    nuevoArreglo[newIndex] = arregloOriginal[i];
                    newIndex++;
                }
            }

            System.out.println("Elemento eliminado: " + valorAEliminar);
            System.out.println("Arreglo actualizado: " + Arrays.toString(nuevoArreglo));
        
        }else{
            System.out.println("El elemento a eliminar no se encontró");
        }        
    }
}

