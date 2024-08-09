package org.repasodelcursojavabasico.desarroladorJavaBasico;

import java.util.*;

public class Biblioteca {
    
	private static Scanner sc = new Scanner(System.in);
	private ArrayList<Libro> biblioteca;
	
	// Inicializo la lista al llamar al contructor
	public Biblioteca() {
		biblioteca = new ArrayList<Libro>();
	}
	
	// Metodo para agregar un libro
	public void agregarLibro(String nombre, String autor, int isbn) {
		biblioteca.add(new Libro(nombre, autor, isbn));
	}
	
	// Metodo para eliminar un libro
	public void eliminarLibro(String nombre) {
		
		// Verifico si la lista esta vacia
		if(biblioteca.isEmpty()) {
			System.out.println("No hay libros para eliminar");
			return;
		}
		
		boolean encontro = false;
		// Itero sobre la lista
		/*Ver sobre la interfaz 'Iterator' en la API de Java
		 *Y sus metodos 'hasNext()', 'next()' y 'remove()' */
		Iterator<Libro> iterador = biblioteca.iterator();
		while(iterador.hasNext()) {
			Libro libro = iterador.next();
			if(libro.getNombre().equalsIgnoreCase(nombre)) {
				iterador.remove();
				System.out.println("Libro eliminado: " + nombre);
				encontro = true;
				break;
			}
		}
		
		if(!encontro) {
			System.out.println("No hay libro con ese nombre");
		}
		
	}
	
	public Libro buscarLibro(String nombre) {
		
		if(biblioteca.isEmpty()) {
			System.out.println("No hay libros para eliminar");
			return null;
		}

		for (Libro libro : biblioteca) {
			if(libro.getNombre().equalsIgnoreCase(nombre)) {
				return libro;
			}
		}
		
		return null;
		
	}
	
	public void mostrarLibros() { // Expresion Lambda
		
		// Uso de expresiones lambda. Dos variantes
		biblioteca.stream().forEach(System.out::println);
		//biblioteca.stream().forEach(p -> System.out.println(p));
		
	}
	
	public void editarLibro(int isbn) {
		
		if(biblioteca.isEmpty()) {
			System.out.println("No hay libros para eliminar");
			return;
		}
		
		boolean encontro = false;
		Iterator<Libro> iterator = biblioteca.iterator();
		while(iterator.hasNext()) {
			Libro libro = iterator.next();
			
			if(libro.getIsbn() == isbn) {
				sc.nextLine();
				System.out.print("Ingrese el nuevo nombre: ");
				String nombre = sc.nextLine();
				libro.setNombre(nombre);
				System.out.print("Ingrese el nuevo autor: ");
				String autor = sc.nextLine();
				libro.setAutor(autor);
				encontro = true;
				break;
			}
			
		}
		
		if(!encontro) {
			System.out.println("Libro no encontrado");
		}else {
			System.out.println("Libro editado con exito");
		}
		
		
	}
	
	public void ordenarPorNombre() {
		
		// Uso del metodo 'sort()' de la clase 'ArrayList'.
		// Uso del metodo 'comparing()' de la interfaz 'Comparator'
		// Ver en la API
		biblioteca.sort(Comparator.comparing(Libro::getNombre));
		
	}
	
	public void menu(){
		
		do {
	        System.out.println("===================================");
	        System.out.println("==|BIBLIOTECA - MENU DE OPCIONES|==");
	        System.out.println("===================================");
	        System.out.println("1. Agregar Libro");
	        System.out.println("2. Buscar Libro");
	        System.out.println("3. Eliminar Libro");
	        System.out.println("4. Listar libros");
	        System.out.println("5. Ordenar libros alfabeticamente");
	        System.out.println("6. Editar libro indicando el isbn");
	        System.out.println("7. Salir");
	        System.out.println("==================================");
	        
	        System.out.print("\nDigite una opcion: ");
	        //int opcion = sc.nextInt();
	        int opcion = obtenerEntero();
	        
	        String nombre, autor;
	        int isbn;
	        sc.nextLine();
	        switch(opcion) {
	        	case 1: 
	        		System.out.print("Ingrese el nombre del libro: ");
	        		nombre = sc.nextLine();
	        		System.out.print("Ingrese el autor del libro: ");
	        		autor = sc.nextLine();
	        		System.out.print("Ingrese el isbn del libro: ");
	        		//isbn = sc.nextInt();
	        		isbn = obtenerEntero();
	        		agregarLibro(nombre, autor, isbn);
	        		System.out.println("Libro agregado exitosamente");
	        		break;
	        	case 2:
	        		System.out.print("Ingrese el nombre del libro a buscar: ");
	        		nombre = sc.nextLine();
	        		
	        		Libro libroBuscado = buscarLibro(nombre);
	        		
	        		if(libroBuscado != null) {
	        			System.out.println("Libro \"" + nombre + "\" encontrado");
	        			System.out.println(libroBuscado);
	        		}else {
	        			System.out.println("Libro \"" + nombre + "\" NO existe");
	        		}
	        		
	        		//buscarLibro(nombre);
	        		break;
	        	case 3:
	        		System.out.print("Ingrese el nombre del libro a eliminar: ");
	        		nombre = sc.nextLine();
	        		eliminarLibro(nombre);
	        		break;
	        	case 4:
	        		mostrarLibros();
	        		break;
	        	case 5:
	        		ordenarPorNombre();
	        		mostrarLibros();
	        		break;
	        	case 6:
	        		System.out.print("Digite la isbn del libro a editar: ");
	        		//isbn = sc.nextInt();
	        		isbn = obtenerEntero();
	        		editarLibro(isbn);
	        		break;
	        	case 7:
	        		System.out.println("Progama finalizado");
	        		sc.close();
	        		System.exit(0);
	        		break;
	        	default:
	        		System.out.println("Opcion incorrecta");
	        		break;
	        }
        
		}while(true);
        
        
    }
	
	/*Manejo los posibles errores de entrada de diferente tipo de datos, por ejemplo
	 *si se inserta una string, double, etc.
	 *Ya que nos lanzaria una excepcion de tipo 'InputMismatchException' que es
	 *un tipo de excepcion NO COMPROBADA ya que hereda de 'RuntimeException'.
	 *Esto nos dice que el codigo se puede mejorar y no llegar a capturar la excepcion
	 *ya que seria una mala practica*/
	static int obtenerEntero() {
		
		int entero;
		
		do {
			if(sc.hasNextInt()) {
				entero = sc.nextInt();
				return entero;
			}else {
				System.out.println("Error: Debes ingresar un numero entero positivo");
				System.out.print("Intentelo nuevamente: ");
				sc.nextLine();
			}
		}while(true);
		
	}
	
	
}










