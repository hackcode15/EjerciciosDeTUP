package practicaparcial.clasesAbstractas;

public class Ejemplo1 {

    public static void main(String[] args) {
        
        Circulo circulo = new Circulo("Rojo", 5);
        
        Rectangulo rectangulo = new Rectangulo("Azul", 4, 6);
        
        circulo.mostrarColor();
        System.out.println("Area del circulo: " + circulo.calcularArea());
        
        rectangulo.mostrarColor();
        System.out.println("Area del rectangulo: " + rectangulo.calcularArea());
        
    }
    
}

abstract class Forma {
    
    private String color;
    
    public Forma(String color){
        this.color = color;
    }
    
    public abstract double calcularArea();
    
    public void mostrarColor(){
        System.out.println("El color de la forma es: " + color);
    }
    
}

// Subclase
class Circulo extends Forma { // Heredamos de la clase abstracta superclase
    
    private double radio;
    
    public Circulo(String color, double radio){
        super(color); // llamamos al constructor de la superclase
        this.radio = radio;
    }
    
    // Sobreescribimos el metodo abstracto
    @Override
    public double calcularArea(){
        return Math.PI * radio * radio;
    }
    
}

// Subclase
class Rectangulo extends Forma { // Heredamos de la clase abstracta superclase
    
    private double longitud;
    private double ancho;
    
    public Rectangulo(String color, double longitud, double ancho){
        super(color); // llamamos al constructor de la superclase
        this.longitud = longitud;
        this.ancho = ancho;
    }
    
    // Sobreescribimos el metodo abstracto
    @Override
    public double calcularArea(){
        return longitud*ancho;
    }
    
}