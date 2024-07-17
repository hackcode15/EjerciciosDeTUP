package POO_Java.Herencia.Example2;

public class Furgoneta extends Vehiculo{

    private int capacidad_carga;
    private int plazas_extra;

    public Furgoneta(int plazas_extra, int capacidad_carga){
        super(); // llama al constructor de la clase padre
        this.plazas_extra = plazas_extra;
        this.capacidad_carga = capacidad_carga;
    }

    public String dimeDatosFurgoneta(){
        return "La capacidad de carga es: " + capacidad_carga + " Y las plazas son: " + plazas_extra;
    }
    
}
