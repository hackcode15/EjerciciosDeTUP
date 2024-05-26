package listaEnlazadaDoble;
/*
	<E> representa un tipo generico en java
	significa que la clase pueden trabajar con cualquier tipo de objeto / dato
	Integer, String, Double, etc...
	
	La letra 'E' es sola una convencion y podria ser reemplazada por cualquier otra letra o incluso
	una palabra significativa
	
*/

public class NodoDoble<E> {

	protected E dato;
	protected NodoDoble<E> siguiente;
	protected NodoDoble<E> anterior;
	
	public NodoDoble(E dato) {
		this.dato = dato;
		this.siguiente = null;
		this.anterior = null;
	}
	
}
