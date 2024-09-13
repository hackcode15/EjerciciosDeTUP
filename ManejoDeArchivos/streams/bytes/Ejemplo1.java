package streams.bytes;

import java.io.*;

public class Ejemplo1 {
 
    public static void main(String[] args) {
        
        // Leer un archivo en bytes
        // ejemplo foto
        
        String ruta_foto = "D:/Desktop/Java - Pildoras Informaticas/Curso Archivos y Ficheros - Pildoras Informaticas/foto.png";
        
        String ruta_txt = "D:/Desktop/Java - Pildoras Informaticas/Curso Archivos y Ficheros - Pildoras Informaticas/txt_ej.txt";
        
        int contador = 0;
        
        // Guardar los bytes para crear una copia del archivo
        int datos_entrada[] = new int[18];
        
        // uso del try - catch - resources
        // para el cierre automatico de recursos
        try(FileInputStream archivo_lectura = new FileInputStream(ruta_txt)){
            
            boolean final_ar = false;
            
            while(!final_ar){
                
                int byte_entrada = archivo_lectura.read(); // leer cada byte
                
                if(byte_entrada != -1){
                    datos_entrada[contador] = byte_entrada;
                } else {
                    final_ar = true;
                }
                
                //System.out.println(byte_entrada);
                System.out.println(datos_entrada[contador]);
                
                contador++;
                
            }
            
        }catch(IOException e){
            System.out.println("Error al leer el archivo");
            e.printStackTrace();
        }
        
        System.out.println("Cantidad de bytes = " + contador);
        
        crea_fichero(datos_entrada);
        
    }
    
    // Metodo para excribir un nuevo archivo
    static void crea_fichero(int array[]){
        
        String ruta = "D:/Desktop/Java - Pildoras Informaticas/Curso Archivos y Ficheros - Pildoras Informaticas/txt_ej_copia.txt";
        
        // Uso del try - catch - resources
        try(FileOutputStream fichero_nuevo = new FileOutputStream(ruta)){
            
            for(int i=0; i<array.length; i++){
                
                fichero_nuevo.write(array[i]);
                
            }
            
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
    
}
