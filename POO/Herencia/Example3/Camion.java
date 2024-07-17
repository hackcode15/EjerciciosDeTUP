package POO_Java.Herencia.Example3;

public class Camion extends Vehiculo{
    
    private boolean acoplado;
    private int capacidadCarga;

    public Camion(String nombre, int modelo, String color, int n_ruedas, int capacidadCarga){
        super(nombre, modelo, color, n_ruedas);
        this.capacidadCarga = capacidadCarga;
    }

    public int getCapacidadCarga(){
        return capacidadCarga;
    }

    public void tieneAcoplado(String acoplado){
        if(acoplado.equalsIgnoreCase("si")){
            this.acoplado = true;
        }else{
            this.acoplado = false;
        }
    }

    public String info_acoplado(){
        if(acoplado){
            return "El camion tiene acoplado";
        }else{
            return "El camion esta sin acoplado";
        }
    }

    @Override
    public void acelerar() {
        System.out.println("El camion esta acelerando");
    }

    @Override
    public void arrancar() {
        System.out.println("El camion esta arrancando");
    }

    @Override
    public void detener() {
        System.out.println("El camion esta detenido");
    }

    @Override
    public String toString(){
        return "Vehiculo Camion(" + super.toString() + ". \nCapacida de Carga: " 
        + capacidadCarga + ". \nTiene acoplado: " + info_acoplado();
    }

}
