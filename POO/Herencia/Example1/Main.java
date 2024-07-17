package POO_Java.Herencia.Example1;

public class Main {
    
    public static void main(String[] args) {
        
        Animal miAnimal = new Animal("Animal generico");
        miAnimal.hacerSonido(); // El animal hace un sonido

        Perro miPerro = new Perro("Max");
        miPerro.hacerSonido(); // El perro ladra
        miPerro.moverCola(); // El perro mueve la cola

        System.out.println(miPerro.getNombre()); // Max


    }

}
