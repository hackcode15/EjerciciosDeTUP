package estructurasDeRegistro;

import java.util.Scanner;

class Amigos {

    private String dni;
    private String nombre;
    private String apellido;
    private int edad;
    private double promedio;
    
    public Amigos(String dni, String apellido, String nombre, int edad, double promedio){
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }
    
    public String getDni(){
        return dni;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public double getPromedio(){
        return promedio;
    }
    
}

public class Registro {
    
    static void cargarRegistro(Amigos registro[]){
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < registro.length; i++) {
            System.out.println("Ingrese los datos del amigo N°" + (i+1));
            System.out.print("DNI: ");
            String dni = sc.nextLine();
            System.out.print("Apellido: ");
            String apellido = sc.nextLine();
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Edad: ");
            int edad = sc.nextInt();
            System.out.print("Promedio: ");
            double promedio = sc.nextDouble();
            
            sc.nextLine();
            
            registro[i] = new Amigos(dni, apellido, nombre, edad, promedio);
            
        }
        
        sc.close();
        
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Indique la cantidad de amigos que desea agregar: ");
        int cantidad = sc.nextInt();
        sc.nextLine();
        
        Amigos amigo[] = new Amigos[cantidad];
        
        /*
        Amigos amigo[] = new Amigos[5];
        amigo[0] = new Amigos("4692", "Gomez", "Diego", 19, 9.5);
        amigo[1] = new Amigos("4692", "Cheriezo", "Juan", 14, 2);
        amigo[2] = new Amigos("4692", "Coronel", "Carlos", 18, 6);
        amigo[3] = new Amigos("4692", "Gomez", "Valentina", 7, 10);
        amigo[4] = new Amigos("4692", "Salinas", "Lidia", 40, 8);
        */
        
        cargarRegistro(amigo);
        
        // Imprimir encabezados
        System.out.printf("%-5s %-15s %-15s %-15s %-15s\n", "DNI", "Apellido", "Nombre", "Edad", "Promedio");
        System.out.println("--------------------------------------------------------------------");

        // Imprimir cada persona en forma de planilla
        for (Amigos amigos : amigo) {
            System.out.printf("%-5s %-15s %-15s %-15s %-15s\n", amigos.getDni(), amigos.getApellido(), amigos.getNombre(), amigos.getEdad(), amigos.getPromedio());
        }
        
        System.out.println("\nTotal de alumnos: " + amigo.length);
        
        int sumaDeEdad = 0;
        for (Amigos amigos : amigo) {
            sumaDeEdad += amigos.getEdad();
        }
        
        double promedioDeEdad = sumaDeEdad/amigo.length;
        
        System.out.println("Promedio de edad de los alumnos: " + promedioDeEdad);
        
        int mayorEdad = amigo[0].getEdad();
        
        for (int i = 0; i < amigo.length; i++) {

            if(amigo[i].getEdad() > mayorEdad){
                mayorEdad = amigo[i].getEdad();
            }
            
        }
        
        System.out.println("Mayor edad: " + mayorEdad);
        
        int menorEdad = amigo[0].getEdad();
        
        for (int i = 0; i < amigo.length; i++) {

            if(amigo[i].getEdad() < menorEdad){
                menorEdad = amigo[i].getEdad();
            }
            
        }
        
        System.out.println("Menor Edad: " + menorEdad);
        
        int cantMayor = 0;
        for (int i = 0; i < amigo.length; i++) {
            if(amigo[i].getPromedio() > 7){
                cantMayor++;
            }
        }
        
        System.out.println("Cantidad de alumnos con promedio mayor que 7: " + cantMayor);
        
        int cantMenor = 0;
        for (int i = 0; i < amigo.length; i++) {
            if(amigo[i].getPromedio() < 7){
                cantMenor++;
            }
        }
        
        System.out.println("Cantidad de alumnos con promedio menor que 7: " + cantMenor);
        
        int porcentaje = (cantMayor * 100) / amigo.length;
        System.out.println("Porcentaje de alumnos con promedio mayor o igual a 7: " + porcentaje + "%");
        
        double sumaPromedioMenorA7 = 0;
        
        for (Amigos amigos : amigo) {
            if(amigos.getPromedio() < 7){
                sumaPromedioMenorA7 += amigos.getPromedio();
            }
        }
        
        double promedioAlumnosMenorA7 = sumaPromedioMenorA7 / cantMenor;
        
        System.out.println("Promedio de alumnos con promedio menor a 7: " + promedioAlumnosMenorA7);
        
    }
    
}
