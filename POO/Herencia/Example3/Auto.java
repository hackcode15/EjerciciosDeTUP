package POO_Java.Herencia.Example3;

public class Auto extends Vehiculo {
    
    private int n_puertas;

    public Auto(String nombre, int modelo, String color, int n_ruedas, int n_puertas){
        super(nombre, modelo, color, n_ruedas);
        this.n_puertas = n_puertas;
    }

    public int getN_puertas() {
        return n_puertas;
    }

    @Override
    public void arrancar(){
        System.out.println("El auto esta arrancando");
    }

    @Override
    public void detener(){
        System.out.println("El auto esta detenido");
    }

    @Override
    public void acelerar(){
        System.out.println("El auto esta acelerando");
    }

    @Override
    public String toString(){
        return "Vehiculo Auto (" + super.toString() + ". \nN° Puertas: " + n_puertas + "\n)";
    }

}
