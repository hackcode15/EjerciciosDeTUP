package POO_Java.Herencia.Example4;

import java.util.Date;
import java.util.GregorianCalendar;

class Empleado {

    // Atributos
    private String nombre;
    private double sueldo;
    private Date altaContrato;
    private int id;
    private static int idSiguiente;
    
    // Metodo Constructor
    public Empleado(String nombre, double sueldo, int anio, int mes, int dia){
        this.nombre = nombre;
        this.sueldo = sueldo;
        // ver en la api de java sobre la clase 'GregorianCalendar' sobre este constructor
        GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia);
        // ver en la api de java sobre el metodo 'getTime()' de la clase 'Calendar'
        this.altaContrato = calendario.getTime();
        idSiguiente++;
        id = idSiguiente;
    }

    public Empleado(String nombre){
        this(nombre, 30000, 2000, 01, 01);
    }

    // Getter y Setters
    public String getNombre() {
        return nombre + " Id: " + id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Si declaras un metodo con 'final' no se podra
    // sobreescribir en subclases
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Date getAltaContrato() {
        return altaContrato;
    }

    public void setAltaContrato(Date altaContrato) {
        this.altaContrato = altaContrato;
    }

    // Metodo para subir el sueldo del empleado
    public void subeSueldo(double porcentaje){
        double aumento = sueldo*porcentaje/100;
        sueldo += aumento;
    }

    // Metodo 'ToString' sobreescrito para mostrar todos los datos del objeto 'Empleado'
    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + " ID: " + id + ", sueldo=" + sueldo + ", altaContrato=" + altaContrato + "]";
    }

}