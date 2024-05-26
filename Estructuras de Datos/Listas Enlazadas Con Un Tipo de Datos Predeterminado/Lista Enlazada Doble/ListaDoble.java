package listaEnlazadaDoble;

public class ListaDoble {

	private Nodo cabeza, cola;
	
	public ListaDoble() {
		this.cabeza = null;
		this.cola = null;
	}
	
	public boolean estaVacia() {
		return cabeza == null;
	}
	
	public void insertarAlInicio(int valor) {
		
		if(estaVacia()) {
			cabeza = cola = new Nodo(valor);
		}else {
			
			Nodo nuevoNodo = new Nodo(valor);
			
			nuevoNodo.siguiente = cabeza;
			cabeza.anterior = nuevoNodo;
			cabeza = nuevoNodo;
			
		}
		
	}
	
	public void insertarAlFinal(int valor) {
		
		if(estaVacia()) {
			cabeza = cola = new Nodo(valor);
		}else {
			
			Nodo nuevoNodo = new Nodo(valor);
			
			cola.siguiente = nuevoNodo;
			nuevoNodo.anterior = cola;
			cola = nuevoNodo;
			
		}
		
		
		
	}
	
	public void eliminarElemento(int valor) {
		
		if(estaVacia()) {
			System.out.println("Lista vacia");
			return;
		}
		
		if(cabeza == cola) {
			cabeza = null;
			cola = null;
			return;
		}
		
		if(cabeza.valor == valor) {
			cabeza = cabeza.siguiente;
			cabeza.anterior = null;
			return;
		}
		
		if(cola.valor == valor) {
			cola = cola.anterior;
			cola.siguiente = null;
			return;
		}
		
		Nodo nodoIterador = cabeza;
		
		while(nodoIterador != null) {
			
			if(nodoIterador.valor == valor) {
				
				nodoIterador.anterior.siguiente = nodoIterador.siguiente;
				nodoIterador.siguiente.anterior = nodoIterador.anterior;
				
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
		
		Nodo nodoIterador = cabeza;
		
		while(nodoIterador != null) {
			System.out.print(nodoIterador.valor + " ");
			nodoIterador = nodoIterador.siguiente;
		}
		
		System.out.println();
		
	}
	
	public void imprimirListaInvertida() {
		
		if(estaVacia()) {
			System.out.println("Esta vacia");
			return;
		}
		
		Nodo nodoIterador = cola;
		
		while(nodoIterador != null) {
			
			System.out.print(nodoIterador.valor + " ");
			nodoIterador = nodoIterador.anterior;
			
		}
		
		System.out.println();
		
	}
	
	public int getTamano() {
		
		int tamano = 0;
		
		Nodo nodoIterador = cabeza;
		
		while(nodoIterador != null) {
			tamano++;
			nodoIterador = nodoIterador.siguiente;
		}
		
		return tamano;
		
	}
	
	public int getCabeza() {
		return cabeza.valor;
	}
	
	public int getCola() {
		return cola.valor;
	}
	
	
}
