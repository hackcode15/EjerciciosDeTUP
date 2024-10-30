package com.practica.pizzeria.controladores;

import com.practica.pizzeria.dao.IngredienteDAO;
import com.practica.pizzeria.entidades.Ingrediente;
import java.util.*;

public class IngredienteControlador {

    private IngredienteDAO ingredienteDAO;
    private Scanner sc;
    
    public IngredienteControlador(){
        ingredienteDAO = new IngredienteDAO();
        sc = new Scanner(System.in);
    }
    
    public void agregarIngrediente(){
        
        System.out.println("== AGREGAR INGREDIENTE ==");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        
        System.out.print("Stock: ");
        int stock = sc.nextInt();
        
        Ingrediente ingrediente = new Ingrediente(nombre, stock);
        
        if(ingredienteDAO.create(ingrediente)){
            System.out.println("Ingrediente agregado con exito");
        }else{
            System.out.println("Error al agregar");
        }
        
    }
    
    public void listarIngredientes(){
        
        List<Ingrediente> lista = ingredienteDAO.read();
        
        if(!lista.isEmpty()){
            
            System.out.printf("%-16s %-16s %-16s%n", "ID_INGREDIENTE", "NOMBRE", "STOCK");
            
            lista.stream()
                    .map(p -> String.format("%-16s %-16s %-16s", p.getId_ingrediente(), p.getNombre(), p.getStock()))
                    .forEach(System.out::println);
            
            System.out.println("");
            
        }else{
            System.out.println("Error: lista vacia");
        }
        
    }
    
    public void actualizarIngrediente(){
        
        System.out.println("== ACTUALIZAR INGREDIENTE ==");
        System.out.print("Digite el ID: ");
        int id = sc.nextInt();
        
        Ingrediente ingrediente = ingredienteDAO.buscarPorId(id);
        
        if(ingrediente != null){
            
            sc.nextLine();
            System.out.print("Nuevo nombre: ");
            String nombre = sc.nextLine();
            
            ingrediente.setNombre(nombre);
            
            ingredienteDAO.update(ingrediente);
            
            System.out.println("Ingrediente actualizado correctamente");
            
        }else{
            System.out.println("No existe");
        }
        
    }
    
    public void eliminarIngrediente(){
        
        System.out.println("== ELIMINAR INGREDIENTE ==");
        System.out.print("Digite el ID: ");
        int id = sc.nextInt();
        
        Ingrediente ingrediente = ingredienteDAO.buscarPorId(id);
        
        if(ingrediente != null){
            
            ingredienteDAO.delete(ingrediente);
            
            System.out.println("Ingrediente eliminado correctamente");
            
        }else{
            System.out.println("No existe");
        }
        
    }
    
    public void buscarIngredientePorId(){
        
        System.out.println("== BUSCAR INGREDIENTE POR ID ==");
        System.out.print("Digite el ID: ");
        int id = sc.nextInt();
        
        Ingrediente ingrediente = ingredienteDAO.buscarPorId(id);
        
        if(ingrediente != null){
            System.out.println(ingrediente);
        }else{
            System.out.println("Error: la pizza no existe");
        }
        
    }
    
}
