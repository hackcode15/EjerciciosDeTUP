package listaEnlazadaSimple;

public class ListaEnlazada<T> {

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
		
}
