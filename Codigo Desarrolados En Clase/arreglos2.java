package ejerciciosDeTUP.desarroladosEnClase;

import java.util.Arrays;
import java.util.Scanner;

public class arreglos2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
     
        int arregloOriginal[] = {2,4,6,8,10,12,14,16,18,20};
        
        System.out.println("Arreglo original: " + Arrays.toString(arregloOriginal));
        
        
        System.out.print("Ingrese un valor a eliminar: ");
        int valorAEliminar = sc.nextInt();
        
        int posicion = -1;
        
        for(int i = 0; i < arregloOriginal.length; i++){
        
            if(valorAEliminar == arregloOriginal[i]){
                posicion = i;
                break;
            }
        
        }
        
        if(posicion != -1){
        
            int nuevoArreglo[] = new int[arregloOriginal.length - 1];
            
            for(int i=0, j=0; i<arregloOriginal.length; i++){
                
                if(i != posicion){
                    nuevoArreglo[j++] = arregloOriginal[i];
                }
                
            }

            System.out.println("Elemento eliminado: " + valorAEliminar);
            System.out.println("Arreglo actualizado: " + Arrays.toString(nuevoArreglo));
        
        }else{
            
            System.out.println("El elemento a eliminar no se encontro");
            
        }
        
        
    }
}

