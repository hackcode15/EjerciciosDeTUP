package manipulacionArchivosYDirectorios.File;

import java.io.*;

public class Ejemplo3 {
    
    public static void main(String[] args) {
        
        String str_ruta = "D:" + File.separator + "Desktop" + File.separator + "Java - Pildoras Informaticas" + File.separator + "Curso Archivos y Ficheros - Pildoras Informaticas" + File.separator + "NuevaCarpetaCreada" + File.separator + "Prueba.txt";
        
        File ruta = new File(str_ruta);
        
        // eliminar
        ruta.delete();
        
    }
    
}
