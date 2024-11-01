package org.practicadebasededatos.bbdd;

import java.sql.*;

public class ConexionMySQL {
    
    // Opcional (usalo por si ocurre un error)
    //public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; 
    
    // jdbc:mysql://localhost:3306/nombre_basededato
    public static final String DB_URL = "jdbc:mysql://localhost:3306/pruebaBD";
    public static final String USER = "root"; // usuario por defecto
    public static final String PASS = "Esteban7"; // tu contraseña
    
    public static Connection dameConexion() throws SQLException {
        
        return DriverManager.getConnection(DB_URL, USER, PASS);
        
    }
    
}
