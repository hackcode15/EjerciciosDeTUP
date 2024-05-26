package listaEnlazadaDoble;

public class Nodo {

	protected int valor;
	protected Nodo siguiente, anterior;
	
	public Nodo(int valor) {
		this.valor = valor;
		this.siguiente = null;
		this.anterior = null;
	}
	
}
