package listaEnlazadaDoble;

public class Main {

	public static void main(String[] args) {

		ListaDoble miLista = new ListaDoble();
		
		System.out.println("Lista vacia?: " + miLista.estaVacia());
		
		miLista.insertarAlInicio(22);
		miLista.insertarAlInicio(37);//
		miLista.insertarAlFinal(999); //
		miLista.insertarAlInicio(25);
		miLista.insertarAlInicio(33); //
		
		System.out.print("Lista con todos los elementos cargados: ");
		miLista.imprimirLista();
		
		System.out.println("Tamaño de la lista: " + miLista.getTamano());
		
		System.out.println("Cabeza: " + miLista.getCabeza() + "\nCola: " + miLista.getCola());
		
		System.out.print("Lista Invertida: ");
		miLista.imprimirListaInvertida();
		
		
		
		miLista.eliminarElemento(999);
		miLista.eliminarElemento(33);
		miLista.eliminarElemento(37);
		
		
		System.out.print("\nLista con elementos eliminados: ");
		miLista.imprimirLista();
		
		System.out.println("Tamaño de la lista: " + miLista.getTamano());
		
		System.out.println("Cabeza: " + miLista.getCabeza() + "\nCola: " + miLista.getCola());
		
		System.out.print("Lista Invertida: ");
		miLista.imprimirListaInvertida();
		
	}

}
