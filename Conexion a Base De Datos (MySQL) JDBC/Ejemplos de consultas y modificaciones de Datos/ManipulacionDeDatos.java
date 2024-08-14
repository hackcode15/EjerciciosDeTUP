package jdbc.usodeljdbc;

import java.sql.*;

import static jdbc.usodeljdbc.ConectaDB.*;

/*
 create table clientes (
	dni int not null, -- No acepta valores nulos
    nombre varchar(100) not null, -- No acepta valores nulos
    apellido varchar(100),
    fecha_nac date,
    telefono varchar(15),
    primary key(dni) -- Definimos el 'dni' como la clave primaria
);
 */

public class App {
	
    public static void main( String[] args ){
        
    	Connection conexion = null;
    	Statement consulta = null;
    	
    	try {
    		
    		//1. Crear conexion
    		conexion = DriverManager.getConnection(DB_URL, USER, PASS);
    		
    		//2. Crear objeto 'Statement'
    		consulta = conexion.createStatement();
    		
    		//String sql = "INSERT INTO clientes(dni, nombre, apellido, fecha_nac, telefono) VALUES(987564654, 'Diego Leo', 'Qatar', '2024-09-25', '36251587546')";
    		//String sql = "INSERT INTO clientes(dni, nombre) VALUES(64876423, 'Diego Mesico')";
    		
    		//String sql = "UPDATE clientes SET nombre='Messi Nuevo' WHERE dni = 64876423";
    		
    		String sql = "DELETE FROM clientes WHERE dni = 64876423";
    		
    		consulta.executeUpdate(sql);
    		
    		//System.out.println("Datos insertados correctamente");
    		//System.out.println("Datos actualizados correctamente");
    		System.out.println("Dato eliminado correctamente");
    		
    	}catch(SQLException e) {
    		System.out.println("No conecta");
    		e.printStackTrace();
    	}finally {
    		try {
    			if(conexion != null) {
    				conexion.close();
    			}
    		}catch(SQLException e) {
    			e.printStackTrace();
    		}
    		try {
    			if(consulta != null) {
    				consulta.close();
    			}
    		}catch(SQLException e) {
    			e.printStackTrace();
    		}
    	}
    	
    
    }
    
}
