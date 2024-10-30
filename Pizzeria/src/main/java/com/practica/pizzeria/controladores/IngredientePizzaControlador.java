package com.practica.pizzeria.controladores;

import com.practica.pizzeria.dao.IngredienteDAO;
import com.practica.pizzeria.dao.IngredientePizzaDAO;
import com.practica.pizzeria.dao.PizzaDAO;
import com.practica.pizzeria.entidades.Ingrediente;
import com.practica.pizzeria.entidades.Pizza;
import java.util.*;

public class IngredientePizzaControlador {
    
    private IngredientePizzaDAO ingPizDAO;
    private IngredienteDAO ingredienteDAO;
    private PizzaDAO pizzaDAO;
    private Scanner sc;
    
    public IngredientePizzaControlador(){
        ingPizDAO = new IngredientePizzaDAO();
        pizzaDAO = new PizzaDAO();
        ingredienteDAO = new IngredienteDAO();
        sc = new Scanner(System.in);
    }
    
    public void listarIngredientesDeUnaPizza(){
        
        System.out.println("== VER LOS INGREDIENTES DE LA PIZZA ==");
        System.out.print("Digite el id de la pizza: ");
        int id = sc.nextInt();
        
        Pizza pizza = pizzaDAO.buscarPorId(id);
        
        if(pizza != null){
            
            List<String> ingredientes = ingPizDAO.listarLosIngredientesDeUnaPizza(pizza);
            
            System.out.println("Todos los ingredientes de la pizza \"" + pizza.getNombre() + "\" son: ");
            
            ingredientes.stream()
                    .forEach(System.out::println);
            
            System.out.println("");
            
        }else{
            System.out.println("Error: no existe la pizza");
        }
        
    }
    
    public void añadirIngredienteAPizza(){
        
        System.out.println("== AÑADIR INGREDIENTE A LA PIZZA ==");
        
        System.out.println("-----------------------------------------------------------------------");
        List<Pizza> listaPizza = pizzaDAO.read();
        System.out.println("Lista de Pizzas");
        System.out.printf("%-16s %-16s%n", "ID_PIZZA", "NOMBRE_PIZZA");
        listaPizza.stream()
                .map(p -> String.format("%-16s %-16s", p.getId_pizza(), p.getNombre()))
                .forEach(System.out::println);
        System.out.println("-----------------------------------------------------------------------");
        List<Ingrediente> listaIngrediente = ingredienteDAO.read();
        System.out.println("Lista de Ingredientes");
        System.out.printf("%-16s %-16s%n", "ID_INGREDIENTE", "NOMBRE_INGREDIENTE");
        listaIngrediente.stream()
                .map(p -> String.format("%-16s %-16s", p.getId_ingrediente(), p.getNombre()))
                .forEach(System.out::println);
        System.out.println("-----------------------------------------------------------------------");
        
        System.out.print("Seleccione su pizza ingresando su ID: ");
        int id_pizza = sc.nextInt();
        System.out.print("Seleccione el ingrediente ingresando su ID: ");
        int id_ingrediente = sc.nextInt();
        
        Pizza pizza = pizzaDAO.buscarPorId(id_pizza);
        Ingrediente ingrediente = ingredienteDAO.buscarPorId(id_ingrediente);
        
        if(pizza != null){
            if(ingrediente != null){
                
                ingPizDAO.añadir_ingrediente_a_pizza(pizza, ingrediente);
                
                System.out.println("Ingrediente \"" + ingrediente.getNombre() + "\" se ha agregado correctamente a la pizza \"" + pizza.getNombre() + "\"");
                
            }else{
                System.out.println("Error: el ingrediente no existe");
            } 
        }else{
            System.out.println("Error: la pizza no existe");
        }
        
    }
    
    public void sacarIngredienteAPizza(){
        
        System.out.println("== SACAR INGREDIENTE A LA PIZZA ==");
        
        System.out.println("-----------------------------------------------------------------------");
        List<Pizza> listaPizza = pizzaDAO.read();
        System.out.println("Lista de Pizzas");
        System.out.printf("%-16s %-16s%n", "ID_PIZZA", "NOMBRE_PIZZA");
        listaPizza.stream()
                .map(p -> String.format("%-16s %-16s", p.getId_pizza(), p.getNombre()))
                .forEach(System.out::println);
        System.out.println("-----------------------------------------------------------------------");
        List<Ingrediente> listaIngrediente = ingredienteDAO.read();
        System.out.println("Lista de Ingredientes");
        System.out.printf("%-16s %-16s%n", "ID_INGREDIENTE", "NOMBRE_INGREDIENTE");
        listaIngrediente.stream()
                .map(p -> String.format("%-16s %-16s", p.getId_ingrediente(), p.getNombre()))
                .forEach(System.out::println);
        System.out.println("-----------------------------------------------------------------------");
        
        System.out.print("Seleccione su pizza ingresando su ID: ");
        int id_pizza = sc.nextInt();
        System.out.print("Seleccione el ingrediente ingresando su ID: ");
        int id_ingrediente = sc.nextInt();
        
        Pizza pizza = pizzaDAO.buscarPorId(id_pizza);
        Ingrediente ingrediente = ingredienteDAO.buscarPorId(id_ingrediente);
        
        if(pizza != null){
            if(ingrediente != null){
                
                ingPizDAO.sacar_ingrediente_a_pizza(pizza, ingrediente);
                
                System.out.println("Ingrediente \"" + ingrediente.getNombre() + "\" se ha retirado correctamente a la pizza \"" + pizza.getNombre() + "\"");
                
            }else{
                System.out.println("Error: el ingrediente no existe");
            } 
        }else{
            System.out.println("Error: la pizza no existe");
        }
        
    }
    
}
