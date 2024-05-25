package listaEnlazadaSimple;

public class ListaSimple {

	private Nodo cabeza;
	
	public ListaSimple() {
		this.cabeza = null;
	}
	
	public boolean estaVacia() {
		return cabeza == null;
	}
	
	public void insertarAlInicio(int valor) {
		
		if(estaVacia()) {
			cabeza = new Nodo(valor);
		}else {
			
			Nodo nuevoNodo = new Nodo(valor);
			
			nuevoNodo.siguiente = cabeza;
			cabeza = nuevoNodo;
			
		}
		
	}
	
	public void insertarAlFinal(int valor) {
		
		if(estaVacia()) {
			cabeza = new Nodo(valor);
		}else {
			
			Nodo nodoIterador = cabeza;
			
			while(nodoIterador.siguiente != null) {
				nodoIterador = nodoIterador.siguiente;
			}
			
			nodoIterador.siguiente = new Nodo(valor);
			
		}
		
	}
	
	public void eliminarElemento(int valor) {
		
		if(estaVacia()) {
			System.out.println("Lista vacia");
			return;
		}
		
		if(cabeza.valor == valor) {
			cabeza = cabeza.siguiente;
			return;
		}
		
		Nodo nodoIterador = cabeza;
		
		while(nodoIterador.siguiente != null) {
			
			if(nodoIterador.siguiente.valor == valor) {
				
				nodoIterador.siguiente = nodoIterador.siguiente.siguiente;
				return;
			}
			
			nodoIterador = nodoIterador.siguiente;
			
		}
		
		
		
	}
	
	public void imprimir() {
		
		if(estaVacia()) {
			return;
		}
		
		Nodo nodoIterador = cabeza;
		
		while(nodoIterador != null) {
			System.out.print(nodoIterador.valor + " ");
			nodoIterador = nodoIterador.siguiente;
		}
		
		System.out.println();
		
	}
	
	public int obtenerTamano() {
		
		int tamano = 0;
		
		Nodo nodoIterador = cabeza;
		
		while(nodoIterador != null) {
			tamano++;
			nodoIterador = nodoIterador.siguiente;
		}
		
		return tamano;
		
	}
	
	public int buscar(int valor) {
		
		int posicion = 0;
		
		Nodo nodoIterador = cabeza;
		
		while(nodoIterador != null) {
			
			if(nodoIterador.valor == valor) {
				return posicion;
			}
			nodoIterador = nodoIterador.siguiente;
			posicion++;
			
		}
		
		
		return -1;
		
	}
	
	
	
	
	
}
