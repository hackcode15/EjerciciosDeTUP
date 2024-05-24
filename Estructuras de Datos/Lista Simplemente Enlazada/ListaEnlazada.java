package listaEnlazadaSimple;

public class ListaEnlazada<T extends Comparable<T>> {

	private Nodo<T> cabeza;
	private int tamano;
	
	public ListaEnlazada() {
		cabeza = null;
		tamano = 0;
	}
	
	public boolean estaVacia() {
		return cabeza == null;
	}
	
	public void insertarAlFinal(T dato) {
		
		// Verifico si la lista esta vacia
		if(estaVacia()) {
			
			cabeza = new Nodo<>(dato); // Si esta vacia, el nuevo nodo se convierte en la cabeza;
			
		}else {
			// Si no esta vacia, encontrar el ultimp nodo y agregar el nuevo nodo despues de el
			Nodo<T> nodoIterador = cabeza;
			while(nodoIterador.siguiente != null) {
				nodoIterador = nodoIterador.siguiente;
			}
			
			nodoIterador.siguiente = new Nodo<>(dato);		
		
		}
		
		// Incrementa el tamaño de la lista
		tamano++;
		
	}
	
	public void insertarAlInicio(T dato) {
		
		// Verifico si la lista vacia
		if(estaVacia()) {
			cabeza = new Nodo<>(dato);
		}else { // Si no esta vacia
			// Creamos el nuevo nodo con el dato
			Nodo<T> nodoNuevo = new Nodo<>(dato);
			
			nodoNuevo.siguiente = cabeza; // El nuevo nodo lo apuntamos a la cabeza actual
			
			cabeza = nodoNuevo; // Aqui asignamos al nodoNuevo que sea la cabeza
		}
		
		tamano++;
		
	}
	
	public void eliminarElemento(T dato) {
		
		// Verifico si la lista esta vacia
		if(estaVacia()) {
			return; // Si esta vacia no hay nada que borrar
		}
		
		// Si la cabeza es el nodo que queremos eliminar
		if(cabeza.dato == dato) {
			cabeza = cabeza.siguiente; // apuntara al siguiente nodo
			return;
		}
		
		// Iterar hasta encontrar el nodo que queremos eliminar
		Nodo<T> nodoIterador = cabeza;
		
		while(nodoIterador.siguiente != null) {
			if(nodoIterador.siguiente.dato == dato) {
				nodoIterador.siguiente = nodoIterador.siguiente.siguiente;
				tamano--;
				return;
			}
			nodoIterador = nodoIterador.siguiente;
		}
		
	}
	
	public void imprimirLista() {
		
		if(estaVacia()) {
			System.out.println("Lista vacia");
			return;
		}
		
		Nodo<T> nodoIterador = cabeza;
		
		while(nodoIterador != null) {
			
			System.out.print(nodoIterador.dato + " | ");
			nodoIterador = nodoIterador.siguiente;
			
		}
		
		System.out.println();
		
	}
	
	public int getTamano() {
		return tamano;
	}
	
	public void revertir() {
	    Nodo<T> previo = null;
	    Nodo<T> actual = cabeza;
	    Nodo<T> siguiente = null;
	    while (actual != null) {
	        siguiente = actual.siguiente;
	        actual.siguiente = previo;
	        previo = actual;
	        actual = siguiente;
	    }
	    cabeza = previo;
	}
	
	// -----------
	
	/*
	public void ordenarPorInsercion() {
	    if (cabeza == null || cabeza.siguiente == null) {
	        // La lista está vacía o tiene solo un elemento, ya está ordenada
	        return;
	    }
	    
	    // Creamos una lista enlazada temporal para almacenar los elementos ordenados
	    ListaEnlazada<T> listaOrdenada = new ListaEnlazada<>();
	    
	    // Recorremos los nodos de la lista original y los insertamos en la lista ordenada
	    Nodo<T> actual = cabeza;
	    while (actual != null) {
	        Nodo<T> siguiente = actual.siguiente;
	        insertarEnOrden(listaOrdenada, actual);
	        actual = siguiente;
	    }
	    
	    // Reemplazamos la lista original con la lista ordenada
	    cabeza = listaOrdenada.cabeza;
	}

	// Método para insertar un nodo en una lista enlazada de manera ordenada
	private void insertarEnOrden(ListaEnlazada<T> lista, Nodo<T> nuevoNodo) {
	    if (lista.cabeza == null || lista.cabeza.dato.compareTo(nuevoNodo.dato) >= 0) {
	        // El nuevo nodo debe ir al principio de la lista
	        nuevoNodo.siguiente = lista.cabeza;
	        lista.cabeza = nuevoNodo;
	    } else {
	        // Buscamos la posición adecuada para insertar el nuevo nodo
	        Nodo<T> actual = lista.cabeza;
	        while (actual.siguiente != null && actual.siguiente.dato.compareTo(nuevoNodo.dato) < 0) {
	            actual = actual.siguiente;
	        }
	        // Insertamos el nuevo nodo después del nodo actual
	        nuevoNodo.siguiente = actual.siguiente;
	        actual.siguiente = nuevoNodo;
	    }
	}
	 */
	
	// -------------
	
}
