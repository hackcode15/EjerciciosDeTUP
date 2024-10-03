package practicaparcial.queoe;

public class ColaPropia {

    public static void main(String[] args) {
        
        MiCola<Integer> cola = new MiCola<>();
        
        cola.enCola(12);
        cola.enCola(33);
        cola.enCola(55);
        cola.enCola(43);
        
        cola.mostrarElementos();
        
        System.out.println("Primero en la cola: " + cola.peek());
        
        System.out.println("Eliminamos el primero de cola: " + cola.desColar());
        
        cola.mostrarElementos();
        
    }
    
}

class NodoCola<T> {
    
    T dato;
    NodoCola<T> siguiente;
    
    NodoCola(T dato){
        this.dato = dato;
        this.siguiente = null;
    }
    
}

class MiCola<T> {
    
    private NodoCola<T> primero;
    private NodoCola<T> ultimo;
    private int tamano;
    
    public MiCola(){
        primero = null;
        ultimo = null;
        tamano = 0;
    }
    
    public boolean estaVacio(){
        return primero == null;
    }
    
    // Metodo offer - boolean
    public void enCola(T elemento){
        
        NodoCola<T> nuevoNodo = new NodoCola<>(elemento);
        
        if(!estaVacio()){ // Si la cola NO esta vacia
            ultimo.siguiente = nuevoNodo;
            ultimo = nuevoNodo;
        }else{ // Si esta vacia
            primero = nuevoNodo;
            ultimo = nuevoNodo;
        }
        
        tamano++;
        
    }
    
    // Metodo poll elimina y retorna el primer elemento
    public T desColar(){
        
        T dato = primero.dato; // Obtengo el dato del primer elemento
        primero = primero.siguiente; // Muevo la referencia del primero al siguiente nodo
        
        if(primero == null){
            ultimo = null;
        }
        
        tamano--;
        return dato;
        
    }
    
    // Metodo peek retorna el primer elemento
    public T peek(){
        
        return primero.dato;
        
    }
    
    // Muestra todos los elementos de la cola
    public void mostrarElementos() {
        if (estaVacio()) {
            System.out.println("La cola está vacía");
            return;
        }
        System.out.println("Elementos en la cola (desde el frente):");
        NodoCola<T> actual = primero;
        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }
    
    
}
