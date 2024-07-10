package org.ejemplosDeConexionDB.ejemplosdeconexiondb;

import java.sql.*;

public class App {
	
    public static void main( String[] args) throws Exception {
    	
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/gimnasioDB", "root", "Esteban7");
        
        Statement consulta = conexion.createStatement();
        
        ResultSet rs = consulta.executeQuery("SELECT * FROM alumnos");
        
        while(rs.next()) {
        	System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(5));
        }
        
        rs.close();
        consulta.close();
        conexion.close();
    	
    	
    }

}