import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.CsvBindByName;
import lombok.*;
import java.io.*;
import java.util.*;

/*
Tabla csv
NOMBRE;EDAD;DIRECCION EMAIL
Diego;20;miemail1122@gmail.com
Valentina;7;vale2233assd@gmail.com
Esteban;22;esteban11122mm@gmail.com
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter @ToString
class Persona {

    // Mapeo las columnas del archivo CSV a los campos de clase
    @CsvBindByName
    private String nombre;
    
    @CsvBindByName
    private int edad;
    
    /*Si el nombre de la columna en el CSV es diferente al nombre del campo
    Lo especificamos de esta manera*/
    @CsvBindByName(column ="DIRECCION EMAIL")
    private String gmail; 

}

public class MapeoDeObjetos {
    
    public static void main(String[] args) {
        
        String ruta = "D:/Desktop/Java - Pildoras Informaticas/OpenCSV/prueba_mapeo.csv";
        
        // Uso del try - catch - resources para el cierre automatico de recursos
        try(FileReader archivo = new FileReader(ruta)){

            List<Persona> personas = new ArrayList<>();
            
            /*Uso el 'CsvToBeanBuilder' para leer el archivo y convertirlo en
            una lista de objetos 'Persona'*/
            personas = new CsvToBeanBuilder<Persona>(archivo)
                    .withType(Persona.class) // Especifico el tipo de objeto que quiero crear
                    .withSeparator(';') // Especificamos el delimitador
                    .build()
                    .parse();
                    // Llamo al 'build().parse()' para procesar el archivo
                    // y crear la lista de objetos


            // Manejo de errores
            if(!personas.isEmpty()){
                
                System.out.println("Lista de personas");
            
                // Imprimimos la lista usando expresiones lambda
                personas.stream()
                        .map(p -> "Nombre: " + p.getNombre() + ", Edad: " + p.getEdad() + ", Gmail: " + p.getGmail())
                        .forEach(System.out::println);
                
                System.out.println("\nNombres");
                personas.stream()
                        .map(p -> "Nombre: " + p.getNombre())
                        .forEach(System.out::println);
                
                System.out.println("\nMayores de edad: ");
                personas.stream()
                        .filter(p -> p.getEdad() >= 18)
                        .map(p -> "Nombre: " + p.getNombre() + ", Edad: " + p.getEdad())
                        .forEach(System.out::println);

            }else{
                System.out.println("No se encontraron datos en el archivo CSV");
            }
 
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
    }
    
}



