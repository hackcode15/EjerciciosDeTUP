package com.practica.pruebaopencsv;

import com.opencsv.CSVReader;
import java.io.*;
import java.util.*;

public class CSVReader {

    public static void main(String[] args) {
        
        String ruta = "D:/Desktop/Java - Pildoras Informaticas/OpenCSV/csv_prueba.csv";
            
        /*try(FileReader archivo = new FileReader(ruta);
                CSVReader lector = new CSVReader(archivo)){
            // resto de codigo
        }catch(Exception e){
            // Manejo de errores
        }*/

        // Uso del try - catch - resources para el cierre automatico de recursos
        try(CSVReader lector = new CSVReader(new FileReader(ruta))){

            // Leo y almaceno la primera fila del CSV (encabezados)
            String encabezados[] = lector.readNext();
            
            // Imprimo los encabezados
            if(encabezados != null){
            
                System.out.println("Encabezados");

                // Bucle forEach
                for (String encabezado : encabezados) {
                    // Aplico un formato a la impresion
                    // Cada encabezado ocupa 15 caracteres de ancho
                    System.out.printf("%-15s", encabezado);
                }

                System.out.println("");
            
            }

            // Formas de leer las siguientes lineas
            
            // Forma 1
            // Definimos un array para almacenar cada linea del archivo CSV
            String siguienteLinea[];
            
            // Leemos linea por linea y lo almacenos en el array
            // Hasta que ya no haya lineas que leer
            // En cada vuelta del bucle crea un nuevo array con los datos de la siguiente linea del CSV
            while((siguienteLinea = lector.readNext()) != null){
            
                // Imprimimos usando el mismo formato de los encabezados
                for (String linea : siguienteLinea) { // Bucle forEach
                    System.out.printf("%-15s", linea);
                }
            
                System.out.println("");
            
            }
            

            // Forma 2
            /*List<String[]> siguientesLineas = lector.readAll();
            
            for (String[] siguienteLinea : siguientesLineas) {
                for (String campo : siguienteLinea) {
                    System.out.printf("%-15s", campo);
                }
                System.out.println("");
            }*/
            
            // Forma 3
            /*siguientesLineas.stream()
                    .forEach(p -> {
                        for (String campo : p) {
                            System.out.printf("%-15s", campo);
                        }
                        System.out.println("");
                    });*/
            
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
            
    }
    
}