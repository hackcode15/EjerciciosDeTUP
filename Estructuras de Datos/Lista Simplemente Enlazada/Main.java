package listaEnlazadaSimple;

public class Main {

	public static void main(String[] args) {
		
		/*
		ListaEnlazada<Integer> miLista = new ListaEnlazada<>();
		
		System.out.println("Lista vacia: " + miLista.estaVacia());
		
		miLista.insertarAlInicio(22);
		miLista.insertarAlFinal(4);
		miLista.insertarAlFinal(74);
		miLista.insertarAlFinal(32);
		miLista.insertarAlInicio(11);
		
		System.out.println("\nLista cargada");
		
		System.out.println("Lista vacia: " + miLista.estaVacia());
		
		System.out.println("\nValores de la lista actual");
		miLista.imprimirLista();
		
		miLista.eliminarElemento(22);
		System.out.println("\nValores de la lista despues de eliminar el dato 22");
		miLista.imprimirLista();
		*/
		
		ListaEnlazada<String> miLista = new ListaEnlazada<>();
		
		System.out.println("Lista aun no cargada");
		System.out.println("Lista vacia: " + miLista.estaVacia());
		
		miLista.insertarAlInicio("Diego");
		miLista.insertarAlFinal("Esteban");
		miLista.insertarAlFinal("Lidia");
		miLista.insertarAlFinal("Ramon");
		miLista.insertarAlInicio("Valentina");
		
		System.out.println("\nLista cargada");
		System.out.println("Lista vacia: " + miLista.estaVacia());
		
		System.out.println("\nValores de la lista actual");
		miLista.imprimirLista();
		
		System.out.println("Tamaño de la lista actual: " + miLista.getTamano());
		
		miLista.eliminarElemento("Esteban");
		System.out.println("\nValores de la lista despues de eliminar el dato \"Esteban\"");
		miLista.imprimirLista();
		
		System.out.println("Tamaño de la lista despues de elminar un elemento: " + miLista.getTamano());
		
		miLista.revertir();
		
		System.out.println("\nLista revertida");
		miLista.imprimirLista();
		
		/*
		System.out.println("\nLista ordenada");
		miLista.ordenarPorInsercion();
		miLista.imprimirLista();
		*/
	}

}
