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
    	
    	try {
    		
    		//1. Crear conexion
    		conexion = DriverManager.getConnection(DB_URL, USER, PASS);
    		
    		//2. Preparar la consulta
    		PreparedStatement sentencia = conexion.prepareStatement("SELECT nombre, fecha_nac, telefono FROM clientes WHERE fecha_nac = ? AND telefono = ?");
    		
    		//3. Establecer parametros de consulta
    		sentencia.setDate(1, Date.valueOf("2004-08-17"));
    		sentencia.setString(2, "3624105888");
    		
    		//4. Ejecutar y recorrer consulta
    		ResultSet rs = sentencia.executeQuery();
    		
    		while(rs.next()) {
    			
    			System.out.println(rs.getString(1) + " " + rs.getDate(2) + " " + rs.getString(3));
    			
    		}
    		
    		// Reutilizacion de consulta sql
    		System.out.println("EJECUCION SEGUNDA CONSULTA");
    		System.out.println();
    		
    		//2. Preparar la consulta
    		sentencia = conexion.prepareStatement("SELECT nombre, fecha_nac, telefono FROM clientes WHERE fecha_nac = ? AND telefono = ?");
    		
    		//3. Establecer parametros de consulta
    		sentencia.setDate(1, Date.valueOf("2001-12-27"));
    		sentencia.setString(2, "3625281272");
    		
    		//4. Ejecutar y recorrer consulta
    		rs = sentencia.executeQuery();
    		
    		while(rs.next()) {
    			
    			System.out.println(rs.getString(1) + " " + rs.getDate(2) + " " + rs.getString(3));
    			
    		}
    		
    		rs.close();
    		
    		
    		
    		
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
    		/*try {
    			if(consulta != null) {
    				consulta.close();
    			}
    		}catch(SQLException e) {
    			e.printStackTrace();
    		}*/
    	}
    	
    
    }
    
}
