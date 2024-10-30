package com.practica.pizzeria.controladores;

import com.practica.pizzeria.dao.PizzaDAO;
import com.practica.pizzeria.entidades.Pizza;
import java.util.*;

public class PizzaControlador {

    private PizzaDAO pizzaDAO;
    private Scanner sc;
    
    public PizzaControlador(){
        pizzaDAO = new PizzaDAO();
        sc = new Scanner(System.in);
    }
    
    public void agregarPizza(){
        
        
        System.out.println("== AGREGAR PIZZA ==");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Precio: $");
        double precio = sc.nextDouble();
        System.out.print("Stock: ");
        int stock = sc.nextInt();
        
        Pizza pizza = new Pizza(nombre, precio, stock);
        
        if(pizzaDAO.create(pizza)){
            System.out.println("Pizza cargada con exito");
        }else{
            System.out.println("Error");
        }
        
    }
    
    public void listarPizzas(){
        
        List<Pizza> lista = pizzaDAO.read();
        
        if(!lista.isEmpty()){
        
            System.out.printf("%-16s %-16s %-16s %-16s%n", "ID_PIZZA", "NOMBRE", "PRECIO", "STOCK");

            lista.stream()
                    .map(p -> String.format("%-16s %-16s %-16s %-16s", p.getId_pizza(), p.getNombre(), p.getPrecio(), p.getStock()))
                    .forEach(System.out::println);
            System.out.println("");
            
        }else{
            System.out.println("Error lista vacia");
        }
    }
    
    public void actualizarPizza(){
        
        System.out.println("== ACTUALIZAR PIZZA ==");
        System.out.print("Digite el ID: ");
        int id = sc.nextInt();
        
        Pizza pizza = pizzaDAO.buscarPorId(id);
        
        if(pizza != null){
            
            System.out.println("Actualiza el precio de la pizza \"" + pizza.getNombre() + "\"");
            
            System.out.print("Nuevo precio: $");
            double nuevoPrecio = sc.nextDouble();
            
            pizza.setPrecio(nuevoPrecio);
            
            pizzaDAO.update(pizza);
            
            System.out.println("Precio de pizza actualizado");
            
        }else{
            System.out.println("No existe");
        }
        
    }
    
    public void eliminarPizza(){
        
        System.out.println("== ELIMINAR PIZZA ==");
        System.out.print("Digite el ID: ");
        int id = sc.nextInt();
        
        Pizza pizza = pizzaDAO.buscarPorId(id);
        
        if(pizza != null){
            
            pizzaDAO.delete(pizza);
            
            System.out.println("Pizza \"" + pizza.getNombre() + "\" eliminado correctamente");
            
        }else{
            System.out.println("No existe");
        }
        
    }
    
    public void buscarPizzaPorId(){
        
        System.out.println("== BUSCAR PIZZA POR ID ==");
        System.out.print("Digite el ID: ");
        int id = sc.nextInt();
        
        Pizza pizza = pizzaDAO.buscarPorId(id);
        
        if(pizza != null){
            System.out.println(pizza);
        }else{
            System.out.println("Error: la pizza no existe");
        }
        
    }
    
    
    
}
