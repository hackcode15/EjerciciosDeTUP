package POO_Java.Herencia.Example3;

public class Furgoneta extends Vehiculo{

    private int capacidadCarga;

    public Furgoneta(String nombre, int modelo, String color, int n_ruedas, int capacidadCarga){
        super(nombre, modelo, color, n_ruedas);
        this.capacidadCarga = capacidadCarga;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    @Override
    public void acelerar() {
        System.out.println("La furgoneta esta acelerando.");
    }

    @Override
    public void arrancar() {
        System.out.println("La furgoneta esta arrancando.");
    }

    @Override
    public void detener() {
        System.out.println("La furgoneta esta detenida.");
    }

    @Override
    public String toString() {
        return "Vehiculo Furgoneta (" + super.toString() + ". \nCapacidad de Carga: " + capacidadCarga + "\n)";
    }

    
    
}
