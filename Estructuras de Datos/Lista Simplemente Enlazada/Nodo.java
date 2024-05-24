package listaEnlazadaSimple;

public class Nodo<T> { // T de tipo de dato

	protected T dato;
	protected Nodo<T> siguiente;
	
	public Nodo(T dato) {
		this.dato = dato;
		this.siguiente = null;
	}
	
}
