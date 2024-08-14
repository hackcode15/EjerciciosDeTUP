package jdbc.usodeljdbc;

import java.sql.*;

public class ConectaDB {
	
	public static String DB_URL = "jdbc:mysql://localhost:3306/ejercicioelectro";
	public static String USER = "root";
	public static String PASS = "Esteban7";
	
	public static Connection getConnection() throws SQLException {
		
		return DriverManager.getConnection(DB_URL, USER, PASS);
		
	}
	
}
