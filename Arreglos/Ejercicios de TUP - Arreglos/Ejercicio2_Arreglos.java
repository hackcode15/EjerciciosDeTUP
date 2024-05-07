/*
Escribir un programa que dada una lista de números enteros, escribir una función que:
a) Devuelva una lista con todos los que sean primos.
b) Devuelva la sumatoria de los valores
c) Devuelva el promedio de los valores.

*/

package arreglos;

public class Ejercicio2_Arreglos {
    
    static void imprimirArreglo(int a[]){
        
        for(int numero : a){
            System.out.print(numero + " ");
        }
        
    }

    // a)
    static void imprimirPrimos(int a[]){
        
        int indice = 0;
        int limite = a.length;
        
        while(indice < limite){
            
            int numeroActual = a[indice];
            int contadorDivisores = 0;
            int divisorActual = 1;
            
            while(divisorActual <= numeroActual){
                
                if(numeroActual % divisorActual == 0){
                    contadorDivisores++;
                }
                divisorActual++;
            }
            
            if(contadorDivisores == 2){
                System.out.print(numeroActual + " ");
            }
        
            indice++;
            
        }
    
    }
    
    // b)
    static int obtenerSumatoria(int a[]){
        
        int suma = 0;
        
        for(int i=0; i<a.length; i++){
            suma += a[i];
        }
        
        return suma;
    
    }
    
    // c) 
    static double obtenerPromedio(int a[]){
        
        double sumatoria = obtenerSumatoria(a);
        
        double promedio = sumatoria / a.length;
        
        return promedio;
        
    }
    
    public static void main(String[] args) {
        
        int numeros[] = {2,5,8,6,4,7,22,11};
        
        System.out.print("Arreglo original: ");
        imprimirArreglo(numeros);
        
        System.out.print("\nNumeros primos en el arreglo: ");
        imprimirPrimos(numeros);
        
        System.out.print("\nSumatoria de todos los valores: " + obtenerSumatoria(numeros));
        
        System.out.println("\nPromedio de todos los valores: " + obtenerPromedio(numeros));
        
    }
    
}
