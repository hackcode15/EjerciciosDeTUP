package jdbc.usodeljdbc;

import java.sql.*;

import static jdbc.usodeljdbc.ConectaDB.*;

public class App {
	
    public static void main( String[] args ){
        
    	Connection conexion = null;
    	Statement consulta = null;
    	ResultSet rs = null;
    	
    	try {
    		
    		//1. Crear conexion
    		conexion = DriverManager.getConnection(DB_URL, USER, PASS);
    		
    		//2. Crear objeto 'Statement'
    		consulta = conexion.createStatement();
    		
    		// Consulta SQL
    		String sql = "SELECT * FROM clientes"; // Obtener todos los campos
    		
    		//3. Ejecutar consulta SQL
    		rs = consulta.executeQuery(sql);
    		
    		//4. Recorrer el resultset
    		while(rs.next()) {
    			
    			//int dni = rs.getInt(1); // Numero de columno
    			int dni = rs.getInt("dni"); // Nombre de la columna
    			String nombre = rs.getString("nombre");
    			String apellido = rs.getString("apellido");
    			Date fecha_nac = rs.getDate("fecha_nac");
    			String telefono = rs.getString("telefono");
    			
    			System.out.println("Cliente(DNI: " + dni + ", Nombre: " + nombre + ", Apelldo: " + apellido + ", Fecha Nacimiento: " + fecha_nac + ", Telefono: " + telefono);
    			
    		}
    		
    		rs.close();
    		
    	}catch(SQLException e) {
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
