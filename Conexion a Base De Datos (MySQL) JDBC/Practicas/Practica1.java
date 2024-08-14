package jdbc.usodeljdbc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame mimarco=new Marco_Aplicacion();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}

class Marco_Aplicacion extends JFrame{
	
	private JComboBox categorias;
	
	private JComboBox paises;
	
	private JTextArea resultado;
	
	private PreparedStatement enviaConsultaCategoria;
	
	private PreparedStatement enviaConsultaPais;
	
	private PreparedStatement enviaConsultaTodos;
	
	private Connection conexion;
	
	private final String consultaCategoria = "SELECT titulo, autor, categoria, pais, fecha_creacion FROM libro WHERE categoria = ?";
	
	private final String consultaPais = "SELECT titulo, autor, categoria, pais, fecha_creacion FROM libro WHERE pais = ?";
	
	private final String consultaTodos = "SELECT titulo, autor, categoria, pais, fecha_creacion FROM libro WHERE categoria = ? AND pais = ?";
	
	public Marco_Aplicacion(){
		
		setTitle ("Consulta BBDD");
		
		setBounds(500,300,400,400);
		
		setLayout(new BorderLayout());
		
		JPanel menus=new JPanel();
		
		menus.setLayout(new FlowLayout());
		
		categorias=new JComboBox();
		
		categorias.setEditable(false);
		
		categorias.addItem("Todos");
		
		paises=new JComboBox();
		
		paises.setEditable(false);
		
		paises.addItem("Todos");
		
		resultado= new JTextArea(4,50);
		
		resultado.setEditable(false);
		
		add(resultado);
		
		menus.add(categorias);
		
		menus.add(paises);	
		
		add(menus, BorderLayout.NORTH);
		
		add(resultado, BorderLayout.CENTER);
		
		JButton botonConsulta=new JButton("Consulta");	
		
		botonConsulta.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				ejecutaConsulta();
				
			}
			
		});
		
		add(botonConsulta, BorderLayout.SOUTH);
		
		
		// ---------------- Conexion con BBDD
		try {
			
			conexion = DriverManager.getConnection(DB_URL, USER, PASS);
			
			Statement sentencia = conexion.createStatement();
			
			// ------ CARGA JCOMBOBOX CATEGORIAS
			String consulta = "SELECT DISTINCTROW categoria FROM libro";
			
			ResultSet rs = sentencia.executeQuery(consulta);
			
			while(rs.next()) {
				
				categorias.addItem(rs.getString("categoria"));
				
			}
			
			rs.close();
			
			// ----- CARGA JCOMBOBOX PAISES
			consulta = "SELECT DISTINCTROW pais FROM libro";
			
			rs = sentencia.executeQuery(consulta);
			
			while(rs.next()) {
				
				paises.addItem(rs.getString("pais"));
				
			}
			
			rs.close();
			
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		// --------------------------------
		
	}
	
	private void ejecutaConsulta() {
		
		ResultSet rs = null;
		
		try {
			
			resultado.setText("");
			
			String categoria = (String) categorias.getSelectedItem();
			
			String pais = (String) paises.getSelectedItem();
			
			if(!categoria.equals("Todos") && pais.equals("Todos")) {
				
				enviaConsultaCategoria = conexion.prepareStatement(consultaCategoria);
				
				enviaConsultaCategoria.setString(1, categoria);
				
				rs = enviaConsultaCategoria.executeQuery();
			
			}else if(!pais.equals("Todos") && categoria.equals("Todos")) {
				
				enviaConsultaPais = conexion.prepareStatement(consultaPais);
				
				enviaConsultaPais.setString(1, pais);
				
				rs = enviaConsultaPais.executeQuery();
				
			}else if(!categoria.equals("todos") && !pais.equals("Todos")) {
				
				enviaConsultaTodos = conexion.prepareStatement(consultaTodos);
				
				enviaConsultaTodos.setString(1, categoria);
				enviaConsultaTodos.setString(2, pais);
				
				rs = enviaConsultaTodos.executeQuery();
				
			}
			
			
			
			while(rs.next()) {
				
				resultado.append(rs.getString("titulo"));
				resultado.append(", ");
				resultado.append(rs.getString("autor"));
				resultado.append(", ");
				resultado.append(rs.getString("categoria"));
				resultado.append(", ");
				resultado.append(rs.getString("pais"));
				resultado.append(", ");
				resultado.append(String.valueOf(rs.getDate("fecha_creacion")));
				resultado.append("\n");
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
		
	
}









