package POO.Ejercicios;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        Libro libro1 = new Libro("978-3-16-148646-0", "Effective Java", "Joshua Bloch", 600);
        Libro libro2 = new Libro("978-84-72456-456-0", "Head First Java", "Kathy Sierra", 900);
        
        System.out.println(libro1);
        System.out.println(libro2);
        
        if(libro1.getNumDePag() > libro2.getNumDePag()){
            System.out.println("El libro \"" + libro1.getTitulo() + "\" tiene mas paginas");
        }else{
            System.out.println("El libro \"" + libro2.getTitulo() + "\" tiene mas paginas");
        }
        
    }
    
}

class Libro {
    
    private String ISBN;
    private String titulo;
    private String autor;
    private int numDePag;

    public Libro(String ISBN, String titulo, String autor, int numDePag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numDePag = numDePag;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumDePag() {
        return numDePag;
    }

    public void setNumDePag(int numDePag) {
        this.numDePag = numDePag;
    }
    
    @Override
    public String toString(){
        return "Libro(ISBN=" + ISBN +
                ", Titulo=" + titulo +
                ", Autor=" + autor +
                ", Paginas=" + numDePag + ")";
    }
    
}
