package POO_Java.Herencia.Example1;

// Subclase
public class Perro extends Animal{
    
    // Constructor
    public Perro(String nombre){
        super(nombre); // Llama al constructor de la clase base
    }

    // Sobreescribe el metodo de la clase base
    @Override
    public void hacerSonido(){
        System.out.println("El perro ladra");
    }

    // Metodo personalizado de la clase Perro
    public void moverCola(){
        System.out.println("El perro mueve la cola");
    }

}
