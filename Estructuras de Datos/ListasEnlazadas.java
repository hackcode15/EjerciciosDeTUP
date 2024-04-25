package estructurasdedatos;

// Definicion de la clase del nodo
class Nodo {
    
    int valor;
    Nodo siguiente;
    
    // Constructor
    public Nodo (int valor){
        this.valor = valor;
        this.siguiente = null;
    }
    
}

// Definicion de la clase de la lista enlazada
class ListaEnlazada {

    Nodo cabeza;
    
    // Constructor
    public ListaEnlazada(){
        this.cabeza = null;
    }
    
    // Metodo para agregar un nodo al final de la lista
    public void agregar(int valor){
        
        Nodo nuevoNodo = new Nodo(valor);
        
        if(cabeza == null){
            cabeza = nuevoNodo;
        }else{
            Nodo actual = cabeza;
            while(actual.siguiente != null){
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
        
    }
    
    // Metodo para eliminar un nodo con un valor especifico de la lista
    public void eliminar(int valor){
        
        // Caso especial: si la lista esta vacia
        if(cabeza == null){
            return;
        }
        
        // Caso especial: si el nodo a eliminar es la cabeza
        if(cabeza.valor == valor){
            cabeza = cabeza.siguiente;
            return;
        }
        
        // Buscar el nodo a eliminar
        Nodo actual = cabeza;
        while(actual.siguiente != null){
            
            if(actual.siguiente.valor == valor){
                
                // Encontramos el nodo a eliminar
                actual.siguiente = actual.siguiente.siguiente;
                return;
                
            }
            
            actual = actual.siguiente;
            
        }
        
    }
    
    // Metodo para buscar un elemento 
    public Nodo buscar(int valor){
        
        Nodo actual = cabeza;
        while(actual != null){
            if(actual.valor == valor){
                return actual; // Devuelve el nodo encontrado
            }
            actual = actual.siguiente;
        }
        
        return null; // Devuelve null si el elemento no se encuentra
        
    }
    
    // Metodo para obtener el tamaño
    public int obtenerTamano(){
        
        int tamano = 0;
        Nodo actual = cabeza;
        
        while(actual != null){
            tamano++;
            actual = actual.siguiente;
        }
        
        return tamano;
        
    }
    
    // Metodo para imprimir la lista enlazada
    public void imprimir(){
        
        int orden = 0;
        Nodo actual = cabeza;
        while(actual != null){
            orden++;
            System.out.println(orden + ") " + actual.valor);
            //System.out.print(actual.valor + " ");
            actual = actual.siguiente;
        }
        System.out.println();
        
    }
    
}

// Ejemplo de uso
public class ListasEnlazadas {

    public static void main(String[] args) {
        
        ListaEnlazada lista = new ListaEnlazada();
        
        // Agregando datos manualmente
        /*
        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);
        lista.agregar(4);
        lista.agregar(5);
        */
        
        // Automatizando el agregado de datos utilizando un bucle
        
        int datos[] = {112,22,322,4,51,6,7,831,9,1230};
        for(int dato : datos){
            lista.agregar(dato);
        }
        
        // Elimino un elemento
        lista.eliminar(51);
        
        // Imprimir todos los elementos
        lista.imprimir();
        
        // Obteniendo el tamaño de la lista
        //int tamano = lista.obtenerTamano();
        //System.out.println(tamano);
        System.out.println("Tamaño: " + lista.obtenerTamano());
        
        // Buscando un elemento en la lista
        /*
        int valorBuscado = 2;
        Nodo nodoEncontrado = lista.buscar(valorBuscado);
        
        if(nodoEncontrado != null){
            System.out.println("El valor " + valorBuscado + " se encuentra en la lista.");
            System.out.println("El nodo encontrado contiene el valor: " + nodoEncontrado.valor);
        }else{
            System.out.println("El valor " + valorBuscado + " no se encuentra en la lista");
        }
        */
        
    }
    
}
