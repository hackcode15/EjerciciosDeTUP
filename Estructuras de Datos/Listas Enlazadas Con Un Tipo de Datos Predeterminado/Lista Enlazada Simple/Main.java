package listaEnlazadaSimple;

public class Main {

	public static void main(String[] args) {
		
		ListaSimple miLista = new ListaSimple();
		
		System.out.println("Lista vacia?: " + miLista.estaVacia());
		
		miLista.insertarAlInicio(22);
		
		miLista.insertarAlFinal(12);
		miLista.insertarAlFinal(44); 
		miLista.insertarAlFinal(54); 
		
		miLista.insertarAlInicio(99);
		
		System.out.print("Lista: ");
		miLista.imprimir();
		
		System.out.println("Tamaño de la lista: " + miLista.obtenerTamano());
		
		miLista.eliminarElemento(44);
		miLista.eliminarElemento(22);
		
		System.out.print("\nLista actualizada: ");
		miLista.imprimir();
		
		System.out.println("Lista vacia?: " + miLista.estaVacia());
		
		System.out.println("Tamaño de la lista: " + miLista.obtenerTamano());
		
		System.out.println("");
		
		int num = 54;
		int posicion = miLista.buscar(num);
		
		if(posicion != -1) {
			System.out.println("El valor " + num + " si se encuentra en la lista en la posicion " + (posicion + 1));
		}else {
			System.out.println("NO esta en la lista");
		}
		
		
		
	}
	
}
