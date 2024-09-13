import com.opencsv.CSVWriter;
import java.io.*;

public class CSVWriter {

    public static void main(String[] args) {
        
        try {
            
            // Escribir en un archivo csv usando opencsv
            
            String ruta = "D:/Desktop/Java - Pildoras Informaticas/OpenCSV/csv_prueba.csv";
            
            String nuevo[] = {"Lionel", "Messi", "37", "Argentina"};
            
            escribir(ruta, nuevo, true);
            
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        
    }
    
    // Metodo para escribir
    static void escribir(String ruta_archivo, String[] datos, boolean existe) throws Exception {
        
        try(CSVWriter lector = new CSVWriter(new FileWriter(ruta_archivo, existe))){
            
            lector.writeNext(datos);
            
            System.out.println("Archivo escrito con exito");
            
        }
        
    }
    
}