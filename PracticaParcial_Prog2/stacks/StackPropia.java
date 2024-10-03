package practicaparcial.stacks;

public class StackPropia {

    public static void main(String[] args) {
        
        // LIFO, ultima en entrar, primero en salir
        
        MiPila<Integer> pila = new MiPila<>();
        
        pila.push(22);
        pila.push(11);
        pila.push(39);
        
        pila.imprimir();
        
        System.out.println("Elemento de la cima: " + pila.peek());
        
        //System.out.println("Elemento de la cima: " + pila.pop() + " eliminado");
        
        //pila.imprimir();
        
        System.out.println("Posicion: " + pila.buscar(39));
        
    }
    
}

// Clases Genericas
class Nodo <T> {
    
    T dato;
    Nodo<T> siguiente;
    
    public Nodo(T dato){
        this.dato = dato;
        this.siguiente = null;
    }
    
}

class MiPila <T> {
    
    private Nodo<T> cima;
    private int tamano;
    
    public MiPila(){
        cima = null;
        tamano = 0;
    }
    
    public void push(T elemento){
        
        Nodo<T> nuevoNodo = new Nodo<>(elemento);
        nuevoNodo.siguiente = cima;
        cima = nuevoNodo;
        tamano++;
        
    }
    
    public T pop(){
        
        if(!estaVacio()){
            T elemento = cima.dato;
            cima = cima.siguiente;
            tamano--;
            return elemento;
        }
        
        return null;
        
    }
    
    public T peek(){
        
        if(!estaVacio()){
            return cima.dato;
        }
        
        return null;
        
    }
    
    public int buscar(T elemento){
        
        if(!estaVacio()){
            
            Nodo<T> iterador = cima;
            int posicion = 1;
            
            while(iterador != null){
                
                if(iterador.dato == elemento){ // elemento.equals(iterador.dato)
                    return posicion;
                }
                
                iterador = iterador.siguiente;
                posicion++;
                
            }
            
        }
        
        return -1; // si no existe el elemento
        
    }
    
    public void imprimir(){
        
        if(estaVacio()){
            System.out.println("Pila vacia");
            return;
        }
        
        System.out.println("Elementos de la pila");
        
        Nodo<T> iterador = cima;
        
        while(iterador != null){
            System.out.println(iterador.dato);
            iterador = iterador.siguiente;
        }
        
    }
    
    public boolean estaVacio(){
       return cima == null;
    }
    
    public int tamano(){
        return tamano;
    }
    
}
