package streams.leyendo;

import java.io.*;

public class Stream_1 {

    public static void main(String[] args) {
        
        String ruta = "D:/Desktop/Java - Pildoras Informaticas/Curso Archivos y Ficheros - Pildoras Informaticas/info_db.txt";
        
        String datos[] = new String[3];
        
        try(FileReader archivo = new FileReader(ruta);
                BufferedReader miBuffer = new BufferedReader(archivo)){
            
            String linea;
            
            for(int i=0; i<datos.length; i++){
                
                linea = miBuffer.readLine();
                
                if(linea != null){
                    datos[i] = linea;
                }else{
                    break;
                }
                
            }
            
        }catch(IOException e){
            e.printStackTrace();
        }
        
        String db_url = datos[0];
        String user = datos[1];
        String pass = datos[2];
        
        System.out.println("URL: " + db_url);
        System.out.println("USER: " + user);
        System.out.println("PASS: " + pass);
        
        /*Leer_Fichero accediendo = new Leer_Fichero();
        
        accediendo.lee(ruta);
        
        System.out.println("");*/
        
    }
    
}

/*class Leer_Fichero {
    
    FileReader entrada;
    
    public void lee() {
        
        try{
            
            entrada = new FileReader("D:/Desktop/Java - Pildoras Informaticas/Curso Archivos y Ficheros - Pildoras Informaticas/Streams/fichero_ejemplo.txt");
        
            int c = 0;
            
            while(c != -1){ // mientras no halla llegado al final de los datos de los caracteres del fichero
                
                c = entrada.read();
                
                char letra = (char) c;
                
                System.out.print(letra);
                
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
    
}*/

class Leer_Fichero {
    
    public void lee(String ruta_archivo){
        
        try(BufferedReader br = new BufferedReader(new FileReader(ruta_archivo))){
            
            while(true){
                
                String linea = br.readLine();
                
                if(linea != null){
                    System.out.println(linea);
                }else{
                    break;
                }

            }
            
        }catch(IOException e){
            //e.printStackTrace();
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        
        
    }
    
    
}
