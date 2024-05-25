package listaEnlazadaDoble;

public class Principal {

	public static void main(String[] args) {
		
		ListaEnlazadaDoble<Integer> miLista = new ListaEnlazadaDoble<>();
		
		// aun no he cargado la lista
		System.out.println("La lista esta vacia?: " + miLista.estaVacia());
		
		// cargo la lista
		miLista.insertarAlInicio(20);
		
		miLista.insertarAlFinal(54);
		miLista.insertarAlFinal(25); // eliminado
		miLista.insertarAlFinal(23);
		miLista.insertarAlFinal(9); // eliminado
		
		miLista.insertarAlInicio(99); // eliminado
		
		// elimino elementos
		miLista.eliminarElemento(99); // eliminamos la cabeza
		miLista.eliminarElemento(9); // eliminamos la cola
		miLista.eliminarElemento(25); // eliminamos un elemento distinto de la cabeza y la cola
		
		// salida esperada 20 54 23
		
		// imprimo la lista en el orden en el que se ingreso
		System.out.print("Lista: ");
		miLista.mostrarLista();
		
		// imprimo la lista en orden invertida al que se ingreso
		System.out.print("Lista Invertida: ");
		miLista.mostrarListaInvertida();
		
		// una vez cargado
		System.out.println("Esta vacia la lista?: " + miLista.estaVacia());

	}

}
