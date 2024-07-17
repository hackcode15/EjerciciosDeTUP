package POO_Java.Herencia.Example3;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.*;

public class Main {
    
    // Interfaces funcionales personalizadas
    interface VehiculoConfiguracion extends Consumer<Vehiculo>{};
    interface CamionConfiguracion extends Consumer<Camion>{};

    public static void main(String[] args) {
        // Auto
        /*Auto miAuto = new Auto("Renault Logan", 2010, "Negro", 4, 4);

        miAuto.tieneAireAcondicionado("si");
        miAuto.tieneAsientosDeCuero("no");

        System.out.println(miAuto);

        miAuto.arrancar();
        miAuto.acelerar();
        miAuto.detener();*/

        // Furgoneta
        /*Furgoneta miFurgoneta = new Furgoneta("Renault Kangoo", 2018, "Blanco", 4, 5500);

        miFurgoneta.tieneAireAcondicionado("si");
        miFurgoneta.tieneAsientosDeCuero("si");

        System.out.println(miFurgoneta);

        miFurgoneta.arrancar();
        miFurgoneta.acelerar();
        miFurgoneta.detener();*/
        
        // Camion
        /*Camion miCamion = new Camion("Iveco", 2022, "Rojo", 12, 24000);

        miCamion.tieneAireAcondicionado("si");
        miCamion.tieneAsientosDeCuero("si");

        miCamion.tieneAcoplado("si");

        System.out.println(miCamion);

        miCamion.arrancar();
        miCamion.acelerar();
        miCamion.detener();*/

        // Moto
        /*Moto miMoto = new Moto("Honda Tornado", 2018, "Roja", 2, "250cc");
        
        miMoto.setAireAcondicionado(false);
        miMoto.tieneAsientosDeCuero("si");

        System.out.println(miMoto);

        miMoto.arrancar();
        miMoto.acelerar();
        miMoto.detener();*/
        
        // Usando Colecciones
        List<Vehiculo> listaVehiculos = new ArrayList<>();

        listaVehiculos.add(new Auto("Toyota Corolla", 2023, "Rojo", 4, 4));
        listaVehiculos.add(new Furgoneta("Peugeot Partner", 2018, "Gris", 4, 6000));
        listaVehiculos.add(new Camion("Mercedes", 2024, "Blanco", 12, 38000));
        listaVehiculos.add(new Moto("Honda Titan", 2022, "Azul", 2, "250cc"));

        /*for (Vehiculo vehiculo : listaVehiculos) {
            System.out.println(vehiculo);
            System.out.println();
        }*/

        // Configurar aire acondicionado y asientos de cuero usando lambda
        VehiculoConfiguracion configuradorAire = p -> {
            if(p instanceof Moto){ // Ejemplo de condicion para no configurar el aire acondicionado a las motos
                p.tieneAireAcondicionado("no"); 
            }else{
                p.tieneAireAcondicionado("si");
            }
        };

        // Configurar los asientos de cuero para todos los vehiculos
        VehiculoConfiguracion configuraAsientos = p -> p.tieneAsientosDeCuero("si");

        // Configurar el acoplado para los camiones
        CamionConfiguracion configuraAcoplado = p -> p.tieneAcoplado("si");

        // Aplicar los configuraciones a la lista de vehiculos
        listaVehiculos.stream()
            .forEach(p -> {
            configuradorAire.accept(p);
            configuraAsientos.accept(p);
            if(p instanceof Camion){
                configuraAcoplado.accept((Camion) p);
            }
        });

        // Iterar y imprimir los detalles de cada vehiculo
        /*listaVehiculos.stream()
            .forEach(p -> {
            System.out.println(p);
            System.out.println();
        });*/

        // Lista de solo los nombres de los vehiculos
        List<String> nombresDeVehiculos = listaVehiculos.stream()
        .map(p -> p.getNombre()).collect(Collectors.toList());

        // Imprimimos la lista de los nombres de los vehiculos
        System.out.println("Nombres de los vehiculos");
        nombresDeVehiculos.stream().forEach(System.out::println);

        // Vehiculos de modelo 2022 o superior
        System.out.println("Vehiculos modelo 2022 o superior");
        listaVehiculos.stream().filter(p -> p.getModelo() >= 2022).forEach(p -> System.out.println(p));

    }

}
