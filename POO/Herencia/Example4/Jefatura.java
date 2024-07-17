package POO_Java.Herencia.Example4;

// Con 'final' estamos cancelando a cadena de la herencia
// Esta clase no puede tener subclases
public class Jefatura extends Empleado {

    private double incentivo;

    public Jefatura(String nombre, double sueldo, int anio, int mes, int dia){
        super(nombre, sueldo, anio, mes, dia);
    }

    public void setIncentivo(double incentivo){
        this.incentivo = incentivo;
    }

    public double getIncentivo(){
        return incentivo;
    }

    @Override
    public double getSueldo(){
        double sueldoJefe = super.getSueldo(); // metodo getSueldo() de la clase padre
        return sueldoJefe + incentivo;
    }

    @Override
    public void subeSueldo(double porcentaje){
        double sueldoBase = super.getSueldo();
        double aumento = sueldoBase * porcentaje / 100;
        super.setSueldo(sueldoBase + aumento);
    }
    
    @Override
    public String toString() {
        return "Empleado [nombre=" + getNombre() + ", sueldo=" + getSueldo() + ", altaContrato=" + getAltaContrato() + "]";
    }
    
}
