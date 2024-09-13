package manipulacionArchivosYDirectorios.File;

import java.io.*;

public class Ejemplo2 {
    
    public static void main(String[] args) {
        
        // Si queremos asegurarnos la compatibilidad en las rutas
        String str_ruta = "D:" + File.separator + "Desktop" + File.separator + "Java - Pildoras Informaticas" + File.separator + "Curso Archivos y Ficheros - Pildoras Informaticas" + File.separator + "NuevaCarpetaCreada" + File.separator + "Prueba.txt";
        
        File ruta = new File(str_ruta);
        
        // Crear directorio
        //ruta.mkdir();
        
        String archivo_destino = ruta.getAbsolutePath();
        
        // Crear nuevo archivo solo si no existe
        try {
            
            ruta.createNewFile();
            
        }catch(IOException e){
            e.printStackTrace();
        }
        
        Escribiendo accede_es = new Escribiendo();
        
        accede_es.escribir(archivo_destino);
        
    }
    
}

class Escribiendo {
    
    public void escribir(String ruta_archivo){
        
        String frase = "Esto es un ejemplo. Espero que salga";
        
        // Escribiendo en el archivo
        try(FileWriter escritura = new FileWriter(ruta_archivo)){ // Uso del try - catch - resources
            
            for(int i=0; i<frase.length(); i++){
                
                escritura.write(frase.charAt(i));
                
            }
            
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
    
}
