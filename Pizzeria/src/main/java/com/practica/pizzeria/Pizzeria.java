package com.practica.pizzeria;

import com.practica.pizzeria.controladores.IngredienteControlador;
import com.practica.pizzeria.controladores.IngredientePizzaControlador;
import com.practica.pizzeria.controladores.PizzaControlador;
import java.util.Scanner;

public class Pizzeria {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        int opcion;

        do {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Gestionar Pizzas");
            System.out.println("2. Gestionar Ingredientes");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    gestionarPizzas();
                    break;
                case 2:
                    gestionarIngredientes();
                    break;
                case 0:
                    System.out.println("¡Programa finalizado!");
                    return;
                default:
                    System.out.println("Opción incorrecta. Intentalo nuevamente");
                    break;
            }

        } while (true);

    }

    static void gestionarPizzas() {

        PizzaControlador pizzaCon = new PizzaControlador();
        IngredientePizzaControlador ipc = new IngredientePizzaControlador();
        
        int opcion;
        
        do{
            
            System.out.println("\n=== GESTIÓN DE PIZZAS ===");
            System.out.println("1. Ver todas las pizzas");
            System.out.println("2. Buscar pizza por ID");
            System.out.println("3. Añadir nueva pizza");
            System.out.println("4. Modificar pizza");
            System.out.println("5. Eliminar pizza");
            System.out.println("6. Añadir ingrediente a pizza");
            System.out.println("7. Eliminar ingrediente de pizza");
            System.out.println("8. Ver los ingredientes de la pizza");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            
            opcion = sc.nextInt();
            sc.nextLine();
            
            switch(opcion){
                case 1:
                    pizzaCon.listarPizzas();
                    break;
                case 2:
                    pizzaCon.buscarPizzaPorId();
                    break;
                case 3:
                    pizzaCon.agregarPizza();
                    break;
                case 4:
                    pizzaCon.actualizarPizza();
                    break;
                case 5:
                    pizzaCon.eliminarPizza();
                    break;
                case 6:
                    ipc.añadirIngredienteAPizza();
                    break;
                case 7:
                    ipc.sacarIngredienteAPizza();
                    break;
                case 8:
                    ipc.listarIngredientesDeUnaPizza();
                    break;
                case 0:
                    System.out.println("Volviendo...");
                    return;
                default:
                    System.out.println("Opcion incorrecta. intentelo nuevamente");
                    break;
            }
            
        }while(true);

    }

    static void gestionarIngredientes() {

        IngredienteControlador ingCon = new IngredienteControlador();

        int opcion;
        
        do{
            
            System.out.println("\n=== GESTIÓN DE INGREDIENTES ===");
            System.out.println("1. Ver todos los ingredientes");
            System.out.println("2. Buscar ingrediente por ID");
            System.out.println("3. Añadir nuevo ingrediente");
            System.out.println("4. Modificar ingrediente");
            System.out.println("5. Eliminar ingrediente");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            
            opcion = sc.nextInt();
            sc.nextLine();
            
            switch(opcion){
                case 1:
                    ingCon.listarIngredientes();
                    break;
                case 2:
                    ingCon.buscarIngredientePorId();
                    break;
                case 3:
                    ingCon.agregarIngrediente();
                    break;
                case 4:
                    ingCon.actualizarIngrediente();
                    break;
                case 5:
                    ingCon.eliminarIngrediente();
                    break;
                case 0:
                    System.out.println("Volviendo...");
                    return;
                default:
                    System.out.println("Opcion incorrecta. Intentelo nuevamente");
                    break;
            }
            
        }while(true);
        
    }

}
