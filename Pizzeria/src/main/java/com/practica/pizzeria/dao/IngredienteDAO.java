package com.practica.pizzeria.dao;

import com.practica.pizzeria.configBBDD.*;
import com.practica.pizzeria.entidades.Ingrediente;
import java.sql.*;
import java.util.*;

public class IngredienteDAO extends CRUD<Ingrediente> {

    private ConexionBD con;
    
    public IngredienteDAO(){
        con = new ConexionBD();
    }
    
    @Override
    public boolean create(Ingrediente ingrediente) {
    
        String sql = "{CALL agregar_ingrediente(?, ?)}";
    
        try(Connection miConexion = con.dameConexion();
                CallableStatement miSentencia = miConexion.prepareCall(sql)){
            
            miSentencia.setString(1, ingrediente.getNombre());
            miSentencia.setInt(2, ingrediente.getStock());
            
            int filasAfectadas = miSentencia.executeUpdate();
            
            return filasAfectadas > 0;
            
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            return false;
        }
        
    }

    @Override
    public List<Ingrediente> read() {
        
        String sql = "SELECT * FROM ingrediente";
        
        try(Connection miConexion = con.dameConexion();
                Statement miSentencia = miConexion.createStatement();
                ResultSet rs = miSentencia.executeQuery(sql)){
            
            List<Ingrediente> lista = new ArrayList<>();
            
            while(rs.next()){
                Ingrediente ingrediente = new Ingrediente(
                        rs.getInt("id_ingrediente"),
                        rs.getString("nombre"),
                        rs.getInt("stock")
                );
                lista.add(ingrediente);
            }
            
            return lista;
            
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            return null;
        }
        
    }

    @Override
    public boolean update(Ingrediente ingrediente) {
    
        String sql = "{CALL actualizar_ingrediente(?, ?)}";
    
        try(Connection miConexion = con.dameConexion();
                CallableStatement miSentencia = miConexion.prepareCall(sql)){
            
            miSentencia.setInt(1, ingrediente.getId_ingrediente());
            miSentencia.setString(2, ingrediente.getNombre());
            
            int filasAfectadas = miSentencia.executeUpdate();
            
            return filasAfectadas > 0;
            
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            return false;
        }
        
    }

    @Override
    public boolean delete(Ingrediente ingrediente) {
    
        String sql = "DELETE FROM ingrediente WHERE id_ingrediente = ?";
    
        try(Connection miConexion = con.dameConexion();
                PreparedStatement miSentencia = miConexion.prepareStatement(sql)){
            
            miSentencia.setInt(1, ingrediente.getId_ingrediente());
            
            int filasAfectadas = miSentencia.executeUpdate();
            
            return filasAfectadas > 0;
            
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            return false;
        }
        
    }

    @Override
    public Ingrediente buscarPorId(int id) {
        
        String sql = "SELECT * FROM ingrediente WHERE id_ingrediente = ?";
        
        try(Connection miConexion = con.dameConexion();
                PreparedStatement miSentencia = miConexion.prepareStatement(sql)){
            
            miSentencia.setInt(1, id);
            
            ResultSet rs = miSentencia.executeQuery();
            
            if(rs.next()){
                Ingrediente ingrediente = new Ingrediente(
                        rs.getInt("id_ingrediente"),
                        rs.getString("nombre"),
                        rs.getInt("stock")
                );
                return ingrediente;
            }
            
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            return null;
        }
        
        return null;
        
    }


    
}
