/*
Un arreglo de números se llama partidario si todo número que está en una casilla par (0,2,4,…)
es mayor que cualquiera de los números que están en las casillas impares (1,3,5,…). Escriba
un algoritmo que lea un arreglo de números enteros y luego, diga si es partidario o no. Por
ejemplo, si el arreglo es el siguiente: 100 5 200 1 1000 0 600 50 300 4 El programa debe
escribir: es partidario.
*/
package arreglos;

public class Ejercicio11_Arreglos {

    static boolean verificarSiEsPartidario(int arreglo[]){
    
        // Supongo que es partidario hasta encontrar lo contrario
        boolean esPartidario = true;
        
        // Recorro el arreglo desde la primera posicion par (0, 2, 4, ...)
        for (int i = 0; i < arreglo.length; i+=2) {
            
            // Comparo el elemento en posicion par (indice i) con el elemento en posicion impar (indice i+1)
            // ej. 0 <= 1; 2 <= 3; etc...
            if(arreglo[i] <= arreglo[i+1]){
                esPartidario = false; // Si la condicion se cumple, el arreglo no es partidario
                break; // salgo del bucle ya que no es necesario seguir verificando
            }
            
        }
        
        return esPartidario;
        
    }
    
    public static void main(String[] args) {
        
        int numeros[] = {100, 5, 200, 1, 1000, 0, 600, 50, 300, 4};
        
        if(verificarSiEsPartidario(numeros)){
            System.out.println("Si es partidario");
        }else{
            System.out.println("No es partidario");
        }
        
    }
    
}
