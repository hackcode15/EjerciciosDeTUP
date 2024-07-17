package POO_Java.Herencia.Example3;

public class Moto extends Vehiculo{
    
    private String cilindrada;

    public Moto(String nombre, int modelo, String color, int n_ruedas, String cilindrada){
        super(nombre, modelo, color, n_ruedas);
        this.cilindrada = cilindrada;
    }

    public String getCilindrada(){
        return cilindrada;
    }

    @Override
    public void acelerar() {
        System.out.println("La moto esta acelerando");
    }

    @Override
    public void arrancar() {
        System.out.println("La moto esta arrancando");
    }

    @Override
    public void detener() {
        System.out.println("La moto esta detenida");
    }

    @Override
    public String toString(){
        return "Vehiculo Moto(" + super.toString() + ". \nCilindrada: " + cilindrada;
    }

}
