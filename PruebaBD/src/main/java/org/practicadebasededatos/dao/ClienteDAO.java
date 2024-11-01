package org.practicadebasededatos.dao;

import org.practicadebasededatos.entidad.Cliente;
import java.util.*;
import java.sql.*;
import org.practicadebasededatos.bbdd.ConexionMySQL;

public class ClienteDAO {
    
    // paquete para todas las entidades
    // paquete para todas las DAOs
    // paquete para todas las controladores
    // paquete main
    // configuraciones base de datos
    
    // 1 - Entidad - Modelo
    // 2 - DAO - Data Access Object - Acceso de datos de objeto - (interactua)
    // 3 - Controladores - (logica)

    // CREATE
    public boolean create(Cliente cliente){
        
        // Uso de PreparedStatement - Consultas Preparadas 
        // Consulta - Codigo SQL
        String sql = "INSERT INTO cliente(nombre, apellido, edad, telefono) VALUES (?, ?, ?, ?)";
        
        // Uso del try - catch - resources para el cierre automatico de recursos
        try(Connection miConexion = ConexionMySQL.dameConexion();
                PreparedStatement miConsulta = miConexion.prepareStatement(sql)){
            
            // cargo los parametros ?, ?, ?, ? de la consulta preparada
            
            // Campo obligatorio. (es decir no puede ser nulo)
            // Columna: nombre
            miConsulta.setString(1, cliente.getNombre());
            
            // Campo opcional
            // Columna: apellido
            // Si el apellido existe y no esta vacio
            if(cliente.getApellido() != null && !cliente.getApellido().isEmpty()){
                miConsulta.setString(2, cliente.getApellido());
            }else{ // de lo contrario
                miConsulta.setNull(2, java.sql.Types.VARCHAR);
            }
            
            // Campo obligatorio
            // Columna: edad
            miConsulta.setInt(3, cliente.getEdad());
            
            //Campo opcional
            // Columna: telefono
            // Si el telefono existe y no esta vacio
            if(cliente.getTelefono() != null && !cliente.getTelefono().isEmpty()){
                miConsulta.setString(4, cliente.getTelefono());
            }else{ // de lo contrario
                miConsulta.setNull(4, java.sql.Types.VARCHAR);
            }
            
            // Ejecutamos
            int filasAfectadas = miConsulta.executeUpdate();
            
            // Verificamos si la insersion fue correcta
            return filasAfectadas > 0; // true o false
            
        }catch(SQLException e){ // Capturamos el tipo de excepcion
            // O simplemente la excepcion general: "Exception"
            System.out.println("Error: " + e.getMessage());
            // En caso de error returna falso
            return false;
        }
        
    }
    
    
    // READ
    public List<Cliente> read (){
        
        // Consulta - Codigo SQL
        String sql = "SELECT * FROM cliente";
        
        // try - catch - resources // cierre automatico de recursos
        try(Connection miConexion = ConexionMySQL.dameConexion();
                Statement miSentencia = miConexion.createStatement();
                ResultSet rs = miSentencia.executeQuery(sql)){
            
            List<Cliente> lista = new ArrayList<>();
            
            while(rs.next()){
                
                Cliente cliente = new Cliente(
                        rs.getInt("id_cliente"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getInt("edad"),
                        rs.getString("telefono")
                );
                
                lista.add(cliente);
                
            }
            
            return lista;
            
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            return null;
        }
        
    }
    
    // UPDATE
    public boolean update(Cliente cliente){
        
        // Uso de PreparedStatement - Consultas Preparadas 
        // Consulta - Codigo SQL
        String sql = "UPDATE cliente SET edad = ?, telefono = ? WHERE id_cliente = ?";
        
        // try - catch - resources // cierre automatico de recursos
        try(Connection miConexion = ConexionMySQL.dameConexion();
                PreparedStatement miConsulta = miConexion.prepareStatement(sql)){
            
            // cargo los parametros ?, ?, ? de la consulta preparada
            
            // Campo obligatorio
            miConsulta.setInt(1, cliente.getEdad());
            
            // Campo opcional
            if(cliente.getTelefono() != null && !cliente.getTelefono().isEmpty()){
                miConsulta.setString(2, cliente.getTelefono());
            }else{
                miConsulta.setNull(2, java.sql.Types.VARCHAR);
            }
            
            // Campo obligatorio
            miConsulta.setInt(3, cliente.getId());
            
            int filasAfectadas = miConsulta.executeUpdate();
            
            return filasAfectadas > 0;
            
        }catch(SQLException e){
            System.out.println("Error: " + e.getMessage());
            return false;
        }
        
    }
    
    // DELETE
    public boolean delete(Cliente cliente){
        
        // Uso de PreparedStatement - Consultas Preparadas 
        // Consulta - Codigo SQL
        String sql = "DELETE FROM cliente WHERE id_cliente = ?";
        
        // try - catch - resources // cierre automatico de recursos
        try(Connection miConexion = ConexionMySQL.dameConexion();
                PreparedStatement miConsulta = miConexion.prepareStatement(sql)){
            
            // cargo el parametro ? de la consulta preparada
            miConsulta.setInt(1, cliente.getId());
            
            int filasAfectadas = miConsulta.executeUpdate();
            
            return filasAfectadas > 0;
            
        }catch(SQLException e){
            System.out.println("Error: " + e.getMessage());
            return false;
        }
        
    }
    
    // BUSCAR POR ID
    /*Se usa normalmente en los metodos de actualizar y borrar de los CONTROLADORES para verificar que el cliente exista
    y no haya ningun tipo de error a la hora de manipular la base de datos*/
    public Cliente search(int id){
        
        // Uso de PreparedStatement - Consultas Preparadas 
        // Consulta - Codigo SQL
        String sql = "SELECT * FROM cliente WHERE id_cliente = ?";
        
        // try - catch - resources // cierre automatico de recursos
        try(Connection miConexion = ConexionMySQL.dameConexion();
                PreparedStatement miConsulta = miConexion.prepareStatement(sql)){
            
            // cargo el parametro ? de la consulta preparada
            miConsulta.setInt(1, id);
            
            // try - catch - resources // cierre automatico de recursos
            try(ResultSet rs = miConsulta.executeQuery()){
                
                // Si hay una fila con ese ID retornara true
                if(rs.next()){
                
                    // Creamos un objeto de tipo cliente y almacenamos los datos de la fila de la tabla
                    Cliente clienteEncontrado = new Cliente(
                            rs.getInt("id_cliente"),
                            rs.getString("nombre"),
                            rs.getString("apellido"),
                            rs.getInt("edad"),
                            rs.getString("telefono")
                    );

                    return clienteEncontrado;

                } else {
                    return null;
                }
                
            }

        }catch(SQLException e){
            System.out.println("Error: " + e.getMessage());
            return null;
        }
        
    }
    
}
