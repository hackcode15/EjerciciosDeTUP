package ejerciciosDeTUP;

import java.util.*;

class Persona{

    private final String nombre;
    private final int documento;
    private final String telefono;
    
    public Persona(int documento, String nombre, String telefono){
        this.documento = documento;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    public int getDocumento(){
        return documento;
    }
    public String getNombre(){
        return nombre;
    }
    public String getTelefono(){
        return telefono;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + nombre + "\nDNI: " + documento + "\nTelefono: " + telefono;
    }

}

public class BusquedaBinaria2{
   
    static int busquedaBinaria(List<Persona> persona, int elemento){
        
        int inicio = 0;
        int fin = persona.size() - 1;
        
        while(inicio<=fin){
        
            int medio = inicio + (fin - inicio) / 2;
            
            if(persona.get(medio).getDocumento() == elemento){
                return medio;
            }else if(persona.get(medio).getDocumento() < elemento){
                inicio = medio + 1;
            }else{
                fin = medio - 1;
            }
        
        }
        
        return -1;
        
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        List<Persona> personas = new ArrayList<>();
        
        personas.add(new Persona(46548976, "Juan", "3548654212"));
        personas.add(new Persona(26489862, "Pedro", "1534612325"));
        personas.add(new Persona(98754621, "Carlos", "2897564213"));
        personas.add(new Persona(35974622, "Junior", "1987664832"));
        
        
        /*
        // Ordenar la lista de personas
        for(int i=0; i<personas.size()-1; i++){
            for(int j=0; j<personas.size()-1; j++){
                if(personas.get(j).getDocumento() > personas.get(j+1).getDocumento()){
                    Persona temp = personas.get(j);
                    personas.set(j, personas.get(j+1));
                    personas.set(j + 1, temp);
                }
            }
        }
        */
        
        // Ordenar la lista personas
        Collections.sort(personas, Comparator.comparingInt(Persona::getDocumento));

        
        try{
            
            System.out.print("Ingrese el documento de la persona a buscar: ");
            int documentoBuscado = sc.nextInt();

            int posicion = busquedaBinaria(personas, documentoBuscado);

            if(posicion != -1){
                System.out.println("Persona encontrada correctamente");
                System.out.println(personas.get(posicion));
            }else{
                System.out.println("Persona no encontrada");
            }
            
        }catch(InputMismatchException e){
            System.out.println("Error: Ingrese un dato de tipo entero");
            System.exit(1);
        }
         
    }
    
}