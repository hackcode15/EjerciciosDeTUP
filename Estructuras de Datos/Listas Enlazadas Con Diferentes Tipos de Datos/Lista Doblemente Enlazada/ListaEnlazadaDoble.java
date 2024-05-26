package listaEnlazadaDoble;

public class ListaEnlazadaDoble<E> {

	private NodoDoble<E> cabeza, cola;
	
	// Metodo constructor: inicializo los nodos
	public ListaEnlazadaDoble() {
		this.cabeza = null;
		this.cola = null;
	}
	
	// Metodo para verificar si la lista esta vacia
	public boolean estaVacia() {
		return cabeza == null; // true o false
	}
	
	// Metodo para insertar un nuevo nodo al inicio de la lista
	public void insertarAlInicio(E dato) {
		
		// Creo un nuevo nodo con el valor proporcionado
		NodoDoble<E> nodoNuevo = new NodoDoble<>(dato);
		
		if(estaVacia()) { // si esta vacia
			
			cabeza = cola = nodoNuevo; // El nuevo nodo sera la cabeza y la cola ya que solo habra un elemento
			
		}else { // si no esta vacia
			
			nodoNuevo.siguiente = cabeza; // El nuevo nodo creado apunta a la cabeza actual
			cabeza.anterior = nodoNuevo; // la cabeza apunta con su puntero anterior al nuevo nodo
			cabeza = nodoNuevo; // actualizo la cabeza de la lista asignandolo al nuevo nodo creado
			
		}
		
	}
	
	// Metodo para insertar un nodo al final de la lista
	public void insertarAlFinal(E dato) {
		
		// Creo un nuevo nodo con el valor proporcionado
		NodoDoble<E> nodoNuevo = new NodoDoble<>(dato);
		
		if(estaVacia()) { // si esta vacia
			
			cabeza = cola = nodoNuevo; // El nuevo nodo sera la cabeza y la cola ya que solo habra un elemento
		
		}else { // si no esta vacia
			
			cola.siguiente = nodoNuevo; // el puntero siguiente de la cola actual apuntara hacia el nuevo nodo
			nodoNuevo.anterior = cola; // El puntero anterior del nuevo nodo creado apuntara hacia la cola actual
			cola = nodoNuevo; // actualizo la cola de la lista asignandolo al nuevo nodo creado
			
		}
		
		
	}
	
	// Metodo para eliminar un elemento / nodo de la lista
	public void eliminarElemento(E dato) {
			
		if(estaVacia()) { // Si esta vacia, no hay nada que eliminar
			return; // terminamos y salimos
		}
		
		if(cabeza == cola) { // Si hay un solo elemento en la lista
			// inicializamos en null la cabeza y la cola
			cabeza = null;
			cola = null;
			return;
		}
		
		// Si el nodo a eliminar es la cabeza
		if(cabeza.dato == dato) {
			cabeza = cabeza.siguiente; // la cabeza ahora apunta al siguiente nodo
			cabeza.anterior = null; // el anterior de la cabeza se convierte en null
			return;
		}
		
		// si el nodo a eliminar es la cola
		if(cola.dato == dato) {
			
			cola = cola.anterior; // la cola ahora apunta al nodo anterior
			cola.siguiente = null; // el siguiente de la cola se convierte en null
			
			return; // terminamos y salimos
			
		}
		
		// si el elemento / nodo a elimar es distinto a la cabeza y la cola
		// creamos un metodo para iterar hasta encontrar el elemento que queremos eliminar
		NodoDoble<E> nodoIterador = cabeza;
		
		while(nodoIterador != null) {
			
			if(nodoIterador.dato == dato) { // Si encuentra el nodo con el mismo dato del que buscamos
				
				/*
				nodoIterador esta posiciona en el nodo que se eliminara
				1.
				con nodoIterador.anterior no posicionamos en el nodo anterior del nodo que se eliminara
				y con el .siguiente estamos conectando ese nodo anterior con el siguiente nodo del que sera eliminado
				que es el nodoIterador.siguiente
				2.
				con nodoIterador.siguiente nos posicionamos en el siguiente nodo del nodo que se eliminara
				y con el .anterior estamos conectactando ese nodo siguiente con el nodo anterior del que sera eliminado
				que el el nodoIterador.anterior
				*/
				
				nodoIterador.anterior.siguiente = nodoIterador.siguiente; // 1.
				nodoIterador.siguiente.anterior = nodoIterador.anterior; // 2.
				
				return; // terminanos y salimos, no hace falta iterar mas
				
			}
			
			// Si no encuentra el nodo con el dato que estamos buscando, iteramos.
			nodoIterador = nodoIterador.siguiente;
			
		}
		
	}
	
	// Metodo para imprimir la lista en orden que se ingresa
	public void mostrarLista() {
		
		if(estaVacia()) { // si esta vacia
			System.out.println("Lista vacia");
			return; // no hay nada que imprimir
		}
		
		// Creamos un nodoIterador, y lo inicializamos con la cabeza de la lista
		NodoDoble<E> nodoIterador = cabeza;
		
		// recorremos toda la lista hasta que sea distinto de null
		while(nodoIterador != null) {
			
			System.out.print(nodoIterador.dato + " ");
			nodoIterador = nodoIterador.siguiente; // nos desplazomos entre los nodos siguientes de la cabeza
			
		}
		
		System.out.println();
		
	}
	
	// Metodo para imprimir la lista
	public void mostrarListaInvertida() {
		
		if(estaVacia()) { // si esta vacia
			System.out.println("Lista vacia");
			return; // no hay nada que imprimir
		}
		
		// Creamos un nodo iterador, y lo inicializamos con la cola de la lista
		NodoDoble<E> nodoIterador = cola;
		
		// recorremos todo la lista hasta que sea distinto de null
		while(nodoIterador != null) {
			
			System.out.print(nodoIterador.dato + " "); // mostramos el valor del nodo
			nodoIterador = nodoIterador.anterior; // nos desplazamos entre los nodos anteriores de la cola
			
		}
		
		System.out.println();
		
	}
	
}
