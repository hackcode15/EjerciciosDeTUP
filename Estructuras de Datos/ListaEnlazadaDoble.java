package estructurasdedatos;

class NodoDoble{
    
    int valor;
    NodoDoble siguiente;
    NodoDoble anterior;
    
    public NodoDoble(int valor){
        this.valor = valor;
        this.siguiente = null;
        this.anterior = null;
    }
    
}

public class ListaEnlazadaDoble {

    NodoDoble cabeza;
    NodoDoble cola;
    
    public ListaEnlazadaDoble(){
        this.cabeza = null;
        this.cola = null;
    }
    
    public void agregarAlPrincipio(int valor){
        NodoDoble nuevoNodo = new NodoDoble(valor);
        if(cabeza == null){
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        }else{
            nuevoNodo.siguiente = cabeza;
            cabeza.anterior = nuevoNodo;
            cabeza = nuevoNodo;
        }
    }
    
    public void agregarAlFinal(int valor){
        NodoDoble nuevoNodo = new NodoDoble(valor);
        if(cabeza == null){
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        }else{
            nuevoNodo.anterior = cola;
            cola.siguiente = nuevoNodo;
            cola = nuevoNodo;
        }
    }
    
    public void imprimirDesdeInicio(){
        NodoDoble actual = cabeza;
        while(actual != null){
            System.out.print(actual.valor + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
    
    public void imprimirDesdeFinal(){
        NodoDoble actual = cola;
        while(actual != null){
            System.out.print(actual.valor + " ");
            actual = actual.anterior;
        }
        System.out.println();
    }
    
    public void eliminar(int valor){
    
        // Caso especial: lista vacia
        if(cabeza == null){
            return;
        }
        
        // Caso especial: nodo a eliminar es la cabeza
        if(cabeza.valor == valor){
            cabeza = cabeza.siguiente;
            if(cabeza != null){
                cabeza.anterior = null;
            }
            return;
        }
        
        // Buscar el nodo a eliminar
        NodoDoble actual = cabeza;
        while(actual != null && actual.valor != valor){
            actual = actual.siguiente;
        }
        
        // Si el nodo no se encontro
        if(actual == null){
            return;
        }
        
        // Caso especial: nodo a eliminar es la cola
        if(actual == cola){
            cola = cola.anterior;
            cola.siguiente = null;
            return;
        }
        
        // El nodo a eliminar esta en medio de la lista
        if(actual.anterior != null){
            actual.anterior.siguiente = actual.siguiente;
        }
        
        if(actual.siguiente != null){
            actual.siguiente.anterior = actual.anterior;
        }
        
    }
    
    public NodoDoble buscar(int valor){
        
        NodoDoble actual = cabeza;
        while(actual != null){
            if(actual.valor == valor){
                return actual; // Devuelve el nodo encontrado
            }
            actual = actual.siguiente;
        }
        return null; // Devuelve null si el elemento no se encuentra
    }
    
    public static void main(String[] args) {
        
        ListaEnlazadaDoble lista = new ListaEnlazadaDoble();
        
        lista.agregarAlPrincipio(1);
        lista.agregarAlPrincipio(2);
        lista.agregarAlPrincipio(3);
        lista.agregarAlPrincipio(4);
        lista.agregarAlFinal(5);
        lista.agregarAlFinal(6);
        lista.agregarAlFinal(7);
        
        lista.imprimirDesdeFinal();
        System.out.println("---------------------------");
        //lista.eliminar(2);
        lista.imprimirDesdeInicio();
        
        int elementoABuscar = 3;
        
        NodoDoble nodoEncontrado = lista.buscar(elementoABuscar);
        
        if(nodoEncontrado != null){
            System.out.println("Valor " + elementoABuscar + " encontrado.");
            System.out.println("El valor es: " + nodoEncontrado.valor);
        }
        
        
        
        
    }
    
}
