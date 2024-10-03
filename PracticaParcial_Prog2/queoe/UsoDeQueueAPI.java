package practicaparcial.queoe;

import java.util.*;

public class UsoDeQueueAPI {
    
    public static void main(String[] args) {
        
        // FIFO primero en entrar, primero en salir
        
        Queue<Integer> cola = new LinkedList<>();
        
        cola.offer(22);
        cola.offer(44);
        cola.offer(55);
        cola.offer(43);
        
        for (Integer num : cola) {
            System.out.println(num);
        }
        
        System.out.println("Primero en la cola: " + cola.peek());
        
        System.out.println("Eliminar el primero de la cola: " + cola.poll());
        
        for (Integer num : cola) {
            System.out.println(num);
        }
        
    }
    
}
