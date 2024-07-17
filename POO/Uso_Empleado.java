package POO_Java.Example2.poo7;

import java.util.*;
import java.util.stream.*;

public class Uso_Empleado {

    public static void main(String[] args) {
        
        /*Empleado emp1 = new Empleado("Diego Gomez", 150000, 2025, 8, 25);
        Empleado emp2 = new Empleado("Valentina Gomez", 120000, 2026, 10, 23);
        Empleado emp3 = new Empleado("Esteban Gomez", 130000, 2028, 11, 21);

        emp1.subeSueldo(40);
        System.out.println(emp1);

        emp2.subeSueldo(30);
        System.out.println(emp2);

        emp3.subeSueldo(20);
        System.out.println(emp3);*/

        List<Empleado> listaEmpleados = new ArrayList<Empleado>();

        listaEmpleados.add(new Empleado("Diego Gomez", 150000, 2025, 8, 25));
        listaEmpleados.add(new Empleado("Valentina Gomez", 120000, 2026, 10, 23));
        listaEmpleados.add(new Empleado("Esteban Gomez", 130000, 2028, 11, 21));

        // Subirle el sueldo a todos los empleados con un 40% por ejemplo
        /*for (Empleado empleado : listaEmpleados) {
            empleado.subeSueldo(40);
        }*/

        // Subirle el sueldo a un empleado en especifico
        /*for (Empleado empleado : listaEmpleados) {
            if(empleado.getNombre().equalsIgnoreCase("Diego Gomez")){
                empleado.subeSueldo(30);
                break; // Cuando lo encuentra sale del bucle
            }
        }*/

        // Mostrar todos los empleados
        /*for (Empleado empleado : listaEmpleados) {
            System.out.println(empleado); // Lo mismo que empleado.toString();
        }*/

        List<String> nombresDeLosEmpleados = new ArrayList<>();

        nombresDeLosEmpleados = listaEmpleados.stream().map(p -> p.getNombre()).collect(Collectors.toList());

        nombresDeLosEmpleados.stream().forEach(System.out::println);

        // Imprimir con expresiones lambda
        //listaEmpleados.stream().forEach(p -> System.out.println(p));
        //listaEmpleados.stream().forEach(System.out::println);


    }
    
}

class Empleado {

    // Atributos
    private String nombre;
    private double sueldo;
    private Date altaContrato;
    
    // Metodo Constructor
    public Empleado(String nombre, double sueldo, int anio, int mes, int dia){
        this.nombre = nombre;
        this.sueldo = sueldo;
        // ver en la api de java sobre la clase 'GregorianCalendar' sobre este constructor
        GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia);
        // ver en la api de java sobre el metodo 'getTime()' de la clase 'Calendar'
        this.altaContrato = calendario.getTime();
    }

    // Getter y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

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
        return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + ", altaContrato=" + altaContrato + "]";
    }

}