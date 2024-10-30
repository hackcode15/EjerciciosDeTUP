package com.practica.pizzeria.configBBDD;

import java.io.*;
import java.sql.*;
import java.util.*;

public class ConexionBD {

    private static final String SERVER_NAME = "localhost";
    private static final String DATABASE_NAME = "pizzaTOT";
    private static final String USERNAME = "sa";
    private static final String PASSWORD = "1234";
    
    public static Connection dameConexion() throws SQLException {
        
        try{
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            Properties propiedadesDeConexion = new Properties();
            propiedadesDeConexion.setProperty("user", USERNAME);
            propiedadesDeConexion.setProperty("password", PASSWORD);
            propiedadesDeConexion.setProperty("encrypt", "true");
            propiedadesDeConexion.setProperty("trustServerCertificate", "true");
            
            return DriverManager.getConnection("jdbc:sqlserver://" + SERVER_NAME + ";databaseName=" + DATABASE_NAME, propiedadesDeConexion);
            
        }catch(ClassNotFoundException e){
            throw new SQLException("Error al cargar el controlador JDBC: " + e.getMessage());
        }
        
    }
    
}
