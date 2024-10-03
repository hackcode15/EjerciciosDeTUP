package practicaparcial.colecciones_objetos_avanzado;

import java.util.*;

public class Ejemplo1 {

    public static void main(String[] args) {

        OperacionesCrud operacion = new OperacionesCrud();

        Empleado emp1 = new Empleado(1, "Diego", 120000);
        Empleado emp2 = new Empleado(2, "Ramon", 20000);
        Empleado emp3 = new Empleado(1, "Junior", 56000);
        Empleado emp4 = new Empleado(10, "Lopez", 90000);
        
        // CREATE
        operacion.agregar(emp1);
        operacion.agregar(emp2);
        operacion.agregar(emp3);
        operacion.agregar(emp4);

        operacion.agregar(3, "Valentina", 150000);
        operacion.agregar(4, "Lidia", 250000);
        operacion.agregar(2, "Jose", 32000);

        // READ
        operacion.mostrarEmpleados();

        // BUSQUEDA
        /*Empleado empleadoBuscado = operacion.buscar(40);
        
        if(empleadoBuscado != null){
            System.out.println("Empleado encontrado");
            System.out.println(empleadoBuscado);
        }else{
            System.out.println("Error: empleado no encontrado");
        }*/
        
        // UPDATE
        //operacion.actualizar(46);
        
        // DELETE
        //operacion.eliminar(10);

        // READ
        operacion.mostrarEmpleados();

        //operacion.listar_por_sueldo_mayorA(100000);
        
    }

}

class OperacionesCrud {

    private Empleado empleado;
    private Set<Empleado> listaEmpleados;

    private Scanner sc = new Scanner(System.in);

    public OperacionesCrud() {
        listaEmpleados = new HashSet<>();
    }

    // CREATE
    public void agregar(Empleado empleado) {

        boolean estado = listaEmpleados.add(empleado);

        if (!estado) {
            System.out.println("Error al agregar el empleado: " + empleado);
            System.out.println("Ya existe un empleado con ID: " + empleado.getId_empleado() + " en la lista\n");
        }

    }

    public void agregar(int id_empleado, String nombre, double sueldo) {

        Empleado empleado = new Empleado(id_empleado, nombre, sueldo);

        boolean estado = listaEmpleados.add(empleado);

        if (!estado) {
            System.out.println("Error al agregar el empleado: " + empleado);
            System.out.println("Ya existe un empleado con ID: " + empleado.getId_empleado() + " en la lista\n");
        }

    }

    // READ
    public void mostrarEmpleados() {

        System.out.printf("%-15s %-15s %-15s", "ID_EMPLEADO", "NOMBRE", "SUELDO");
        System.out.println("");
        listaEmpleados
                .stream()
                .map(p -> String.format("%-15s %-15s %-15s", p.getId_empleado(), p.getNombre(), p.getSueldo()))
                .forEach(System.out::println);
        System.out.println("");

    }
    
    // UPDATE
    public void actualizar(int id_emp) {

        Empleado empleado = buscar(id_emp);
        
        if(empleado != null){
            
            System.out.print("Ingrese el nuevo nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese el nuevo sueldo: $");
            double sueldo = sc.nextDouble();
            
            empleado.setNombre(nombre);
            empleado.setSueldo(sueldo);
            
            System.out.println("Empleado actualizado correctamente");
            System.out.println("Cambios realizados: " + empleado + "\n");
            
        }else{
            System.out.println("no existe en la lista\n");
        }

    }
    
    // DELETE
    public void eliminar(int id_emp){
        
        Empleado empleado = buscar(id_emp);
        
        if(empleado != null){
            System.out.println(empleado);
            System.out.println("Eliminado correctamente\n");
            listaEmpleados.remove(empleado);
        }else{
            System.out.println("Error: el empleado con ID: " + id_emp + " no existe\n");
        }
        
    }
    
    // Buscar empleado
    public Empleado buscar(int id_empleado) {

        if (!listaEmpleados.isEmpty()) {

            Optional<Empleado> empleado = listaEmpleados
                    .stream()
                    .filter(p -> p.getId_empleado() == id_empleado)
                    .findFirst();

            if (empleado.isPresent()) {
                return empleado.get();
            }

        } else {
            System.out.println("Error: lista vacia\n");
        }

        return null;

    }
    
    /*public Empleado buscar(int id_emp){
        
        return listaEmpleados
                .stream()
                .filter(p -> p.getId_empleado() == id_emp)
                .findFirst()
                .orElse(null);
        
    }*/
    
    
    
    // Filtrar empleados por sueldo
    public void listar_por_sueldo_mayorA(double sueldo){
        
        System.out.println("Empleados con un sueldo mayor igual a: $" + sueldo);
        System.out.printf("%-15s %-15s %-15s", "ID_EMPLEADO", "NOMBRE", "SUELDO");
        System.out.println("");
        listaEmpleados
                .stream()
                .filter(p -> p.getSueldo() >= sueldo)
                .map(p -> String.format("%-15s %-15s %-15s", p.getId_empleado(), p.getNombre(), p.getSueldo()))
                .forEach(System.out::println);
        
        System.out.println("");
    }

}

class Empleado {

    private int id_empleado;
    private String nombre;
    private double sueldo;

    public Empleado() {
    }

    public Empleado(int id_empleado, String nombre, double sueldo) {
        this.id_empleado = id_empleado;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

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

    @Override
    public int hashCode() {
        return Integer.hashCode(id_empleado);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Empleado empleado = (Empleado) obj;

        return this.id_empleado == empleado.id_empleado;

    }

    @Override
    public String toString() {
        return "Empleado{" + "id_empleado=" + id_empleado + ", nombre=" + nombre + ", sueldo=$" + sueldo + '}';
    }

}
