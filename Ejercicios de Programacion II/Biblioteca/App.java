package org.repasodelcursojavabasico.desarroladorJavaBasico;

public class App {
    public static void main( String[] args ){
    	
    	Biblioteca libros = new Biblioteca();
    	
    	// Agrego algunos libros
    	libros.agregarLibro("Harry Potter", "Michael", 123);
    	libros.agregarLibro("Compas", "Jhony", 4812);
    	libros.agregarLibro("Metas", "Brian Tracy", 246);
    	libros.agregarLibro("Poder", "Brian Tracy", 369);
    	
    	libros.menu();
    	
    }
}
