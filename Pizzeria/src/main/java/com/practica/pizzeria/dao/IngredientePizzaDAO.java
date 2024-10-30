package com.practica.pizzeria.dao;

import com.practica.pizzeria.configBBDD.ConexionBD;
import com.practica.pizzeria.entidades.Ingrediente;
import com.practica.pizzeria.entidades.Pizza;
import java.sql.*;
import java.util.*;

public class IngredientePizzaDAO{

    /*private ConexionBD con;
    
    public IngredientePizzaDAO(){
        con = new ConexionBD();
    }*/
    
    public List<String> listarLosIngredientesDeUnaPizza(Pizza pizza){
        
        String sql = "{CALL ver_ingredientes_de_una_pizza(?)}";
        
        try(Connection miConexion = ConexionBD.dameConexion();
                CallableStatement miSentencia = miConexion.prepareCall(sql)){
            
            miSentencia.setInt(1, pizza.getId_pizza());
            
            ResultSet rs = miSentencia.executeQuery();
            
            List<String> ingredientes = new ArrayList<>();
            
            while(rs.next()){
                
                ingredientes.add(rs.getString("NOMBRE_INGREDIENTE"));
                
            }
            
            return ingredientes;
            
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            return null;
        }
        
    }
    
    // agregar ingrediente a pizza
    public boolean añadir_ingrediente_a_pizza(Pizza pizza, Ingrediente ingrediente){
        
        String sql = "{CALL añadir_ingrediente_a_pizza(?, ?)}";
        
        try(Connection miConexion = ConexionBD.dameConexion();
                CallableStatement miSentencia = miConexion.prepareCall(sql)){
            
            miSentencia.setInt(1, pizza.getId_pizza());
            miSentencia.setInt(2, ingrediente.getId_ingrediente());
            
            int filasAfectadas = miSentencia.executeUpdate();
            
            return filasAfectadas > 0;
            
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            return false;
        }
        
    }
    
    public boolean sacar_ingrediente_a_pizza(Pizza pizza, Ingrediente ingrediente){
        
        String sql = "{CALL eliminar_ingrediente_de_pizza(?, ?)}";
        
        try(Connection miConexion = ConexionBD.dameConexion();
                CallableStatement miSentencia = miConexion.prepareCall(sql)){
            
            miSentencia.setInt(1, pizza.getId_pizza());
            miSentencia.setInt(2, ingrediente.getId_ingrediente());
            
            int filasAfectadas = miSentencia.executeUpdate();
            
            return filasAfectadas > 0;
            
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            return false;
        }
        
    }
    
    
}
