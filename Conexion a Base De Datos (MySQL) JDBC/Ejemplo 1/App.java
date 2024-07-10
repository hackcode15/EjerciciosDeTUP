package org.ejemplosDeConexionDB.ejemplosdeconexiondb;

import java.sql.*;

public class App {

	static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/gimnasioDB";
	
	// Credenciales
	static final String USER = "root";
	static final String PASS = "Esteban7";
	
    public static void main( String[] args ){
    	
        Connection conexion = null;
        Statement consulta = null;
        
        try {
        	
        	conexion = DriverManager.getConnection(DB_URL, USER, PASS);
        	
        	consulta = conexion.createStatement();
        	
        	String sql = "SELECT * FROM alumnos";
        	
        	ResultSet rs = consulta.executeQuery(sql);
        	
        	while(rs.next()) {
        		// Pueden ir los nombres o el numero de columnas
        		int id = rs.getInt("id");
        		String nombre = rs.getString("nombre");
        		String apellido = rs.getString("apellido");
        		Date fecha_inicio = rs.getDate("fecha_inicio");
        		String telefono = rs.getString("telefono");
        		
        		System.out.println("ID: " + id + ", Nombre: " + nombre + ", Apellido: " + apellido + ", Fecha Inicio: " + fecha_inicio + ", Telefono: " + telefono);
        		
        	}
        	
        	rs.close();
        	consulta.close();
        	conexion.close();
        	
        }catch(SQLException e) {
        	e.printStackTrace();
        }finally {
        	
        	try {
        		if(consulta != null) {
        			consulta.close();
        		}
        	}catch(SQLException e) {
        		e.printStackTrace();
        	}
        	
        	try {
        		if(conexion != null) {
        			conexion.close();
        		}
        	}catch(SQLException e) {
        		e.printStackTrace();
        	}
        	
        }
        
        
        
    }

}
