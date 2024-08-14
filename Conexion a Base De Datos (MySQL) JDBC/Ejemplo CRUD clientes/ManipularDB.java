package jdbc.usodeljdbc;

import java.sql.*;
import java.util.*;
import java.sql.Date;
import java.time.LocalDate;

public class ManipularDB {
	
	private static Connection conexion = null;
	private static Statement consulta = null;
	private static PreparedStatement sentencia = null;
	private static ResultSet rs = null;
	private static Scanner sc = null;
	
	// Metodo para mostrar todos los clientes
	public static void mostrarTodosLosClientes() {
		
		try {
			
			conexion = ConectaDB.getConnection();
			
			consulta = conexion.createStatement();
			
			String sql = "SELECT * FROM clientes";
			
			rs = consulta.executeQuery(sql);
			
			Cliente cliente = null;
			
			while(rs.next()) {
				
				cliente = new Cliente();
				cliente.setDni(rs.getInt("dni"));
				cliente.setNombre(rs.getString("nombre"));
				cliente.setApellido(rs.getString("apellido"));
				cliente.setFecha_nac(rs.getDate("fecha_nac"));
				cliente.setTelefono(rs.getString("telefono"));
				
				System.out.println(cliente);
				
			}
			
			rs.close();
			
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
	
	// Metodo para buscar clientes
	public static Cliente buscarCliente(int dni) {
				
		String sql = "SELECT * FROM clientes WHERE dni = ?";
			
		Cliente cliente = null;
			
		try {
				
			conexion = ConectaDB.getConnection();
				
			sentencia = conexion.prepareStatement(sql);
				
			sentencia.setInt(1, dni);
				
			rs = sentencia.executeQuery();
				
			if(rs.next()) {	
				cliente = new Cliente();
				cliente.setDni(rs.getInt("dni"));
				cliente.setNombre(rs.getString("nombre"));
				cliente.setApellido(rs.getString("apellido"));
				cliente.setFecha_nac(rs.getDate("fecha_nac"));
				cliente.setTelefono(rs.getString("telefono"));
			}
				
			rs.close();
				
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(sentencia != null) {
					sentencia.close();
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
			
		return cliente;
			
	}
	
	// ------------------------------------------------------------------------
	// Metodo para agregar un cliente
	public static void agregarCliente(int dni, String nombre, String apellido, LocalDate fecha_nac, String telefono) {
		
		try {
			
			conexion = ConectaDB.getConnection();
			
			String sql = "INSERT INTO clientes(dni, nombre, apellido, fecha_nac, telefono) VALUES(?, ?, ?, ?, ?)";
			
			sentencia = conexion.prepareStatement(sql);
			
			Date sqlDate = Date.valueOf(fecha_nac);
			
			sentencia.setInt(1, dni);
			sentencia.setString(2, nombre);
			sentencia.setString(3, apellido);
			sentencia.setDate(4, sqlDate);
			sentencia.setString(5, telefono);
			
			int filasAfectadas = sentencia.executeUpdate();
			
			if(filasAfectadas > 0) {
				System.out.println("Cliente \"" + nombre + "\" agregado exitosamente");
			}else {
				System.out.println("Error al agregar un cliente");
			}
			
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
				if(sentencia != null) {
					sentencia.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	// ------------------------------------------------------------------------
	// Metodo para actualizar un cliente
	public static Cliente actualizarCliente(int dni) {
		
		sc = new Scanner(System.in);
		
		Cliente cliente = new Cliente();
		
		cliente = buscarCliente(dni);
		
		if(cliente == null) {
			System.out.println("No hay cliente con ese dni: " + dni);
			return null;
		}
		
		try {
			
			conexion = ConectaDB.getConnection();
			
			String sql = "UPDATE clientes SET nombre = ?, apellido = ?, telefono = ? WHERE dni = ?";
			
			sentencia = conexion.prepareStatement(sql);
			
			System.out.print("Ingrese el nuevo nombre: ");
			String nombre = sc.nextLine();
			cliente.setNombre(nombre);
			
			System.out.print("Ingrese el nuevo apellido: ");
			String apellido = sc.nextLine();
			cliente.setApellido(apellido);
			
			System.out.print("Ingrese el nuevo telefono: ");
			String telefono = sc.nextLine();
			cliente.setTelefono(telefono);
			
			sentencia.setString(1, nombre);
			sentencia.setString(2, apellido);
			sentencia.setString(3, telefono);
			sentencia.setInt(4, dni);
			
			int filasAfectadas = sentencia.executeUpdate();
			
			if(filasAfectadas > 0) {
				return cliente;
			}else {
				return null;
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}finally {
			try {
				if(sentencia != null) {
					sentencia.close();
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
	
	// ----------------------------------------------------------------
	// Metodo para eliminar un cliente
	public static void eliminarCliente(int dni) {
		
		String sql = "DELETE FROM clientes WHERE dni = ?";
		
		Cliente cliente = new Cliente();
		
		cliente = buscarCliente(dni);
		
		if(cliente == null) {
			System.out.println("No hay ningun cliente con ese dni: " + dni);
			return;
		}
		
		try {
			
			conexion = ConectaDB.getConnection();
			
			sentencia = conexion.prepareStatement(sql);
			sentencia.setInt(1, dni);
			
			int filasAfectadas = sentencia.executeUpdate();
			
			if(filasAfectadas > 0) {
				System.out.println("Cliente: \"" + cliente.getNombre() + "\" borrado exitosamente");
			}else {
				System.out.println("Error");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(sentencia != null) {
					sentencia.close();
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

	// ----------------------------------------------------------------------
	
}
