package practicaparcial.stacks;

import java.util.*;

public class UsoDeStackAPI {

    public static void main(String[] args) {
        
        // Usando la clase Stack de la API de JAVA
        
        Stack<Integer> miPila = new Stack<>();
        
        // Añadir elementos (push)
        miPila.push(13);
        miPila.push(24);
        miPila.push(355);
        miPila.push(42);
        miPila.push(53);
        
        // Mostrar el elemento de la cima sin borrarlo
        System.out.println("Elemento en la cima: " + miPila.peek());
        
        // Verificar si la pila esta vacia
        System.out.println("Pila vacia?: " + miPila.empty());
        
        // Mostrar el elemento de la cima y borrarlo
        //System.out.println("Elemento de la cima borrado: " + miPila.pop());

        // Mostrar la posicion de un elemento
        System.out.println("Posicion del 53: " + miPila.search(53));
        
    }
    
}
