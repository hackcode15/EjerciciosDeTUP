package streams.buffers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Stream_3_read {

    public static void main(String[] args) {
        
        Leer_Fichero_Buffer leyendo = new Leer_Fichero_Buffer();
        
        leyendo.lee();
        
    }
    
}

class Leer_Fichero_Buffer{
    
    FileReader entrada;
    
    public void lee() {
        
        try{
            
            entrada = new FileReader("D:/Desktop/Java - Pildoras Informaticas/Curso Archivos y Ficheros - Pildoras Informaticas/Streams/fichero_ejemplo.txt");
        
            BufferedReader mibuffer = new BufferedReader(entrada);
            
            String linea = "";
            
            while(linea != null){
                
                linea = mibuffer.readLine();
                
                if(linea != null){
                    System.out.println(linea);
                }
                
            }
            
            //entrada.close();
            
        }catch(IOException e){ // excepcion comprobada - IOException
            //e.printStackTrace();
            System.out.println("No se ha encontrado el archivo");
        }finally {
            
            try {
                entrada.close();
            } catch (IOException ex) {
                System.out.println("Ha ocurrido un error");
            }
            
        }
        
        
    }
    
}
