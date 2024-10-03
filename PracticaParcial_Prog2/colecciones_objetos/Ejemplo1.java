package practicaparcial.colecciones_objetos;

import java.util.*;

// Ejemplo de crud
public class Ejemplo1 {
    
    static Scanner sc = new Scanner(System.in);

    // Metodos para agregar
    // CREATE
    static void agregar(ArrayList<Persona> lista, Persona persona){
        
        lista.add(persona);
        
    }
    
    static void agregar(ArrayList<Persona> lista, int id, String nombre, int edad){
        
        lista.add(new Persona(id, nombre, edad));
        
    }
    
    // Metodo para listar
    // READ
    static void mostrarPersonas(ArrayList<Persona> lista){
        
        if(!lista.isEmpty()){
            for (Persona persona : lista) {
                System.out.println(persona);
            }
        }else{
            System.out.println("Error: lista vacia");
        }
        
    }
    
    // Metodo para actualizar
    // UPDATE
    static void actualizar(ArrayList<Persona> lista, int id){
        
        boolean estado = false;
        
        if(!lista.isEmpty()){
            
            for (Persona persona : lista) {
                
                if(persona.getId() == id){
                    
                    System.out.print("Ingrese el nuevo nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese la nueva edad: ");
                    int edad = sc.nextInt();
                    
                    persona.setNombre(nombre);
                    persona.setEdad(edad);
                    
                    estado = true;
                    System.out.println("Persona actualizada correctamente");
                    break;
                }
                
            }
            
        }else{
            System.out.println("Error: lista vacia");
        }
        
        if(!estado){
            System.out.println("Error: persona no encontrada");
        }
        
    }
    
    // Metodo para eliminar
    // DELETE
    static void eliminar(ArrayList<Persona> lista, int id){
        
        boolean estado = false;
        
        if(!lista.isEmpty()){
            
            for (Persona persona : lista) {
                
                if(persona.getId() == id){
                    lista.remove(persona);
                    System.out.println("Persona eliminado correctamente");
                    estado = true;
                    break;
                }
                
            }
            
        }else{
            System.out.println("Error: lista vacia");
        }
        
        if(!estado){
            System.out.println("Error: persona no encontrada");
        }
        
    }
    
    // Metodo para buscar una persona
    static Persona buscar(ArrayList<Persona> lista, int id){
        
        if(!lista.isEmpty()){
            
            for (Persona persona : lista) {
                if(persona.getId() == id){
                    return persona;
                }
            }
            
        }else{
            System.out.println("Error: lista vacia");
        }
        
        return null;
        
    }
    
    public static void main(String[] args) {
        
        // Lista
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        
        // Instancias de personas
        Persona p1 = new Persona(1, "Juan", 18);
        Persona p2 = new Persona(2, "Carlos", 19);
        Persona p3 = new Persona(3, "Tiago", 14);
        
        // --------------------------CRUD-------------------------------------
        
        // CREATE
        // Agregado de personas - Forma 1
        listaPersonas.add(p1);
        listaPersonas.add(p2);
        listaPersonas.add(p3);
        
        // Agregado de personas - Forma 2 - Instancias de personas
        listaPersonas.add(new Persona(4, "Diego", 20));
        listaPersonas.add(new Persona(5, "Junior", 22));
        listaPersonas.add(new Persona(6, "Valentina", 7));
        listaPersonas.add(new Persona(7, "Lidia", 40));
        
        // READ
        // Mostrar personas
        mostrarPersonas(listaPersonas);
        
        // UPDATE
        // Actualizar persona
        //actualizar(listaPersonas, 4);
        
        // DELETE
        // Eliminar persona
        //eliminar(listaPersonas, 5);
        
        // Mostrar personas
        //mostrarPersonas(listaPersonas);
        
        // --------------------------CRUD-------------------------------------
        
        // Buscar persona
        Persona personaEncontrada = buscar(listaPersonas, 4);
        
        if(personaEncontrada != null){
            System.out.println("Persona encontrada");
            System.out.println(personaEncontrada);
        }else{
            System.out.println("Error: persona no encontrada");
        }
        
    }
    
}

class Persona {
    
    private int id;
    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + '}';
    }
    
}
