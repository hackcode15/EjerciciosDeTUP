package practicaparcial.interfaces;

public class Ejemplo1 {

    public static void main(String[] args) {
        
        Dibujable cuadrado = new Cuadrado(5);
        
        Dibujable triangulo = new Triangulo(4, 3);
        
        cuadrado.dibujar();
        cuadrado.describir();
        
        triangulo.dibujar();
        triangulo.describir();
        
    }
    
}

// Interfaz
interface Dibujable {
    
    void dibujar();
    
    default void describir(){
        System.out.println("Este es un objeto dibujable");
    }
    
}

// implementacion
class Cuadrado implements Dibujable {
    
    private int lado;
    
    public Cuadrado(int lado){
        this.lado = lado;
    }
    
    @Override
    public void dibujar(){
        System.out.println("Dibujando un cuadrado de lado " + lado);
    }
    
}

class Triangulo implements Dibujable {
    
    private int base;
    private int altura;
    
    public Triangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public void dibujar(){
        System.out.println("Dibujando un triangulo de base " + base + " y altura " + altura);
    }
    
    @Override
    public void describir(){
        System.out.println("Este es un triangulo dibujable");
    }
    
}