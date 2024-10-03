package practicaparcial.recursividad;

public class Recursividad_Ejemplo1 {
    
    public static void main(String[] args) {
        
        System.out.println("Factorial de 5: " + factorial(5));
        
        int numeros[] = {1,2,3,4,5};
        
        System.out.println("Suma del array: " + sumaArray(numeros, 0));
        
        int num = 10;
        
        System.out.println("Es par: " + esPar(num));
        System.out.println("Es impar: " + esImpar(num));
        
    }
    
    // Recursividad directa
    static int factorial(int n){
        
        // Condicion Base: Condicion de parada para la recursividad
        if(n == 0 || n == 1){
            return 1;
        }
        
        // Recursividad
        return n * factorial(n - 1);
        
    }
    
    static int sumaArray(int array[], int indice){
        
        // Condicion Base: Condicion de parada para la recursividad
        if(indice == array.length){
            return 0;
        }
        
        // Recursividad
        return array[indice] + sumaArray(array, indice + 1);
        
    }
    
    // Recursividad indirecta
    static boolean esPar(int n){
        
        if(n == 0){
            return true;
        }
        
        return esImpar(n - 1);
        
    }
    
    static boolean esImpar(int n){
        
        if(n == 0){
            return false;
        }
        
        return esPar(n - 1);
        
    }
    
    // Recursividad en cola
    // Recursividad multiple
    
}
