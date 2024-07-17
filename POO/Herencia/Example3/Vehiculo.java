package POO_Java.Herencia.Example3;

public class Vehiculo {
    
    private String nombre;
    private int modelo;
    private String color;
    private int n_ruedas;
    private boolean aire_acondicionado;
    private boolean asientos_de_cuero;

    public Vehiculo(String nombre, int modelo, String color, int n_ruedas){
        this.nombre = nombre;
        this.modelo = modelo;
        this.color = color;
        this.n_ruedas = n_ruedas;
    }

    public void arrancar(){
        System.out.println("El vehiculo arranco");
    }

    public void detener(){
        System.out.println("El vehiculo se detuvo");
    }

    public void acelerar(){
        System.out.println("El vehiculo acelero");
    }

    public String getNombre() {
        return nombre;
    }

    public int getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public int getN_ruedas(){
        return n_ruedas;
    }

    public void setAireAcondicionado(boolean aire_acondicionado){
        this.aire_acondicionado = aire_acondicionado;
    }

    public void tieneAireAcondicionado(String aire){
        if(aire.equalsIgnoreCase("si")){
            aire_acondicionado = true;
        }else{
            aire_acondicionado = false;
        }
    }

    public void tieneAsientosDeCuero(String asientos){
        if(asientos.equalsIgnoreCase("si")){
            asientos_de_cuero = true;
        }else{
            asientos_de_cuero = false;
        }
    }

    public String info_aire_acondicionado(){
        if(aire_acondicionado){
            return "Tiene aire acondicionado";
        }else{
            return "No tiene aire acondicionado";
        }
    }

    public String info_asientos_cuero(){
        if(asientos_de_cuero){
            return "Tiene asientos de cuero";
        }else{
            return "Tiene asientos normales";
        }
    }
    

    @Override
    public String toString(){
        return "\nNombre: " + nombre + ". \nModelo: " + modelo 
        + ". \nColor: " + color + "\nN° de ruedas: " + n_ruedas + ". \nAire Acondicionado: " 
        + info_aire_acondicionado() + ". \nAsientos de Cuero: " 
        + info_asientos_cuero();
    }

}
