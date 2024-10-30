package com.practica.pizzeria.dao;

import com.practica.pizzeria.configBBDD.CRUD;
import com.practica.pizzeria.configBBDD.ConexionBD;
import com.practica.pizzeria.entidades.Pizza;
import java.sql.*;
import java.util.*;

public class PizzaDAO extends CRUD<Pizza>{

    private ConexionBD con;
    
    public PizzaDAO(){
        con = new ConexionBD();
    }
    
    @Override
    public boolean create(Pizza pizza) {
        
        String sql = "{CALL agregar_pizza(?, ?, ?)}";
        
        try(Connection miConexion = con.dameConexion();
                CallableStatement miSentencia = miConexion.prepareCall(sql)){
            
            miSentencia.setString(1, pizza.getNombre());
            miSentencia.setDouble(2, pizza.getPrecio());
            miSentencia.setInt(3, pizza.getStock());
            
            int filasAfectadas = miSentencia.executeUpdate();
            
            return filasAfectadas > 0;
            
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            return false;
        }
        
    }

    @Override
    public List<Pizza> read() {
       
        String sql = "SELECT * FROM pizza";
        
        try(Connection miConexion = con.dameConexion();
                Statement miSentencia = miConexion.createStatement();
                ResultSet rs = miSentencia.executeQuery(sql)){
            
            List<Pizza> lista = new ArrayList<>();
            
            while(rs.next()){
                Pizza pizza = new Pizza(
                        rs.getInt("id_pizza"),
                        rs.getString("nombre"),
                        rs.getDouble("precio"),
                        rs.getInt("stock")
                );
                lista.add(pizza);
            }
            
            return lista;
            
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            return null;
        }
        
    }

    @Override
    public boolean update(Pizza pizza) {
        
        String sql = "{CALL actualizar_pizza(?, ?)}";
        
        try(Connection miConexion = con.dameConexion();
                CallableStatement miSentencia = miConexion.prepareCall(sql)){
            
            miSentencia.setInt(1, pizza.getId_pizza());
            miSentencia.setDouble(2, pizza.getPrecio());
            
            int filasAfectadas = miSentencia.executeUpdate();
            
            return filasAfectadas > 0;
            
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            return false;
        }
        
    }

    @Override
    public boolean delete(Pizza pizza) {
        
        String sql = "DELETE FROM pizza WHERE id_pizza = ?";
        
        try(Connection miConexion = con.dameConexion();
                PreparedStatement miSentencia = miConexion.prepareStatement(sql)){
            
            miSentencia.setInt(1, pizza.getId_pizza());
            
            int filasAfectadas = miSentencia.executeUpdate();
            
            return filasAfectadas > 0;
            
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            return false;
        }
                      
    }
    
    @Override
    public Pizza buscarPorId(int id){
        
        String sql = "SELECT * FROM pizza WHERE id_pizza = ?";
        
        try(Connection miConexion = con.dameConexion();
                PreparedStatement miSentencia = miConexion.prepareStatement(sql)){
            
            miSentencia.setInt(1, id);
            
            ResultSet rs = miSentencia.executeQuery();
            
            if(rs.next()){
                Pizza pizza = new Pizza(
                        rs.getInt("id_pizza"),
                        rs.getString("nombre"),
                        rs.getDouble("precio"),
                        rs.getInt("stock")
                );
                return pizza;
            }
            
            rs.close();
            
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            return null;
        }
        
        return null;
        
    }
    
}
