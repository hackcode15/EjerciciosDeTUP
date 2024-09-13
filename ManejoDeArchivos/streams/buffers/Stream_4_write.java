package streams.buffers;
import java.io.*;

public class Stream_4_write {
    
    static void nuevo_archivo_txt(String fileName, String newText){
        
        FileWriter escritura = null;
        
        BufferedWriter miBuffer = null;
        
        String ubicacion = "D:/Desktop/Java - Pildoras Informaticas/Curso Archivos y Ficheros - Pildoras Informaticas/Streams/" + fileName + ".txt";
        
        try{
            
            /*System.out.print("Escriba su texto: ");
            
            String frase = sc.nextLine();*/
            
            escritura = new FileWriter(ubicacion);
            
            miBuffer = new BufferedWriter(escritura);
            
            //miBuffer.write(frase);
            
            miBuffer.write(newText);
            
            System.out.println("Archivo creado y escrito correctamente");
            
        }catch(IOException e){
            System.out.println("Error al crear el archivo");
        }finally {
            
            try{
                
                if(miBuffer != null){
                    miBuffer.close();
                }
                if(escritura != null){
                    escritura.close();
                }
                
            }catch(IOException e){
                System.out.println("Error al cerrar recursos");
            }
            
        }
        
    }
    
    public static void main(String[] args) {
        
        /*Escritura_Buffer e = new Escritura_Buffer();
        
        e.escritura();*/
        
        nuevo_archivo_txt("NuevoArchivoN2", "Hola estoy escribiendo en un archivo");
        
    
    }
    
}

/*class Escritura_Buffer {
    
    public void escritura() {
        
        String frase = "Hola estamos programando en jaaaava\n";
        
        String rutaArchivo = "D:/Desktop/Java - Pildoras Informaticas/Curso Archivos y Ficheros - Pildoras Informaticas/Streams/fichero_nuevo.txt";
        
        FileWriter escritura = null;
        
        BufferedWriter esc = null;
        
        try {
            
            escritura = new FileWriter(rutaArchivo, true);
            
            esc = new BufferedWriter(escritura);
            
            esc.append(frase);
            System.out.println("Se ha escrito en el archivo correctamente.");
            
        } catch (IOException e) {
            System.out.println("Error en el archivo: " + e.getMessage());
            e.printStackTrace();
        }finally {
            
            try{
                
                if(esc != null){
                    esc.close();
                }
                if(escritura != null){
                    escritura.close();
                }
                
            }catch(IOException e){
                System.out.println("Ha ocurrido un error");
            }
            
        }
        
        
    }
}*/
