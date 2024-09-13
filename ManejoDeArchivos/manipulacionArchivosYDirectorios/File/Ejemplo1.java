package manipulacionArchivosYDirectorios.File;

import java.io.*;

public class Ejemplo1 {

    public static void main(String[] args) {
        
        
        //String ruta_archivo = "D:/Desktop/Java - Pildoras Informaticas/Curso Archivos y Ficheros - Pildoras Informaticas/TextoDeEjemplo.txt";
        
        //File archivo = new File(ruta_archivo);

        // Ruta absoluta de un directorio
        //System.out.println(archivo.getAbsolutePath());
        
        // Ruta absoluta de un archivo
        //System.out.println(archivo.getAbsoluteFile());
        
        // Si existe o no el archivo
        //System.out.println("Existe: " + archivo.exists());
        
        
        
        String ruta_directorio = "D:/Desktop/Java - Pildoras Informaticas/Curso Archivos y Ficheros - Pildoras Informaticas";
        
        File archivo = new File(ruta_directorio);
        
        String nombres_archivos[] = archivo.list();
        
        for (String nom : nombres_archivos) {
            
            System.out.println(nom);
            
            File f = new File(archivo.getAbsolutePath(), nom);
            
            if(f.isDirectory()){
                String archivo_subcarpeta[] = f.list();
                
                for (String arc : archivo_subcarpeta) {
                    System.out.println(arc);
                }
                
            }
            
        }
        
    }
    
}
