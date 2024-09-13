package streams.escribiendo;

import java.io.FileWriter;
import java.io.IOException;

public class Stream_2 {
 
    public static void main(String[] args) {
        
        // Poco eficiente
        
        Escribiendo accede_es = new Escribiendo();
        
        accede_es.escribir();
        
    }
    
}

class Escribiendo {
    
    public void escribir(){
        
        FileWriter escritura = null;
        
        String frase = "Esto es una prueba de escritura";
        
        try {
            
            // Crear y Escribir en un fichero
            //escritura = new FileWriter("D:/Desktop/Java - Pildoras Informaticas/Curso Archivos y Ficheros - Pildoras Informaticas/Streams/fichero_nuevo.txt");
            
            // Escribir en un fichero existente
            escritura = new FileWriter("D:/Desktop/Java - Pildoras Informaticas/Curso Archivos y Ficheros - Pildoras Informaticas/Streams/fichero_ejemplo.txt", true);
            
            for(int i=0; i<frase.length(); i++){
                
                escritura.write(frase.charAt(i));
                
            }
            
            
        } catch (IOException ex) {
            System.out.println("No se encuentra el archivo");
        } finally {
            try {
                escritura.close();
            } catch (IOException ex) {
                System.out.println("Ha ocurrido un error");
            }
        }
        
        
    }
    
}
