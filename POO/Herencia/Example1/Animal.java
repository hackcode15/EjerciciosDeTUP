package POO_Java.Herencia.Example1;

// Clase Base
public class Animal {
    
    // Atributo
    private String nombre;

    // metodo Constructor
    public Animal(String nombre){
        this.nombre = nombre;
    }

    // Getter y Setter
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    // Metodo personalizado
    public void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }

}
