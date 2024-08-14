package jdbc.usodeljdbc;

import java.time.LocalDate;
import java.util.*;

public class App {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ejemplo de consultas y modificacion de Datos");
		
		do {
			System.out.println("Seleccione una opcion "
					+ "\n1. Listar clientes. "
					+ "\n2. Buscar clientes. "
					+ "\n3. Agregar nuevo cliente. "
					+ "\n4. Actualizar cliente. "
					+ "\n5. Eliminar cliente."
					+ "\n6. Finalizar.");
			
			System.out.print("Su opcion aqui: ");
			int opcion = sc.nextInt();
			
			int dni;
			String nombre, apellido, fecha_nac, telefono;
			Cliente cliente = null;
			
			switch(opcion) {
			
				case 1:
					System.out.println("##################################################");
					ManipularDB.mostrarTodosLosClientes();
					System.out.println("##################################################");
					break;
				case 2:
					System.out.print("Digite el dni del cliente: ");
					dni = sc.nextInt();
					
					//Cliente cliente = new Cliente();
					//cliente = ManipularDB.buscarCliente(dni);
					System.out.println("##################################################");
					cliente = ManipularDB.buscarCliente(dni);
					
					if(cliente != null) {
						System.out.println("Cliente \"" + cliente.getNombre() + "\" encontrado");
						System.out.println(cliente);
					}else {
						System.out.println("No hay cliente con ese dni: " + dni);
					}
					System.out.println("##################################################");
					
					break;
				case 3:
					System.out.println("##################################################");
					System.out.print("Digite el dni del cliente: ");
					dni = sc.nextInt();
					
					sc.nextLine();
					
					System.out.print("Ingrese el nombre del cliente: ");
					nombre = sc.nextLine();
					System.out.print("Ingrese el apellido del cliente: ");
					apellido = sc.nextLine();
					System.out.print("Ingrese la fecha de nacimiento del cliente en formato(yyyy-mm-dd): ");
					fecha_nac = sc.nextLine();
					System.out.print("Ingrese el numero de telefono del cliente: ");
					telefono = sc.nextLine();
					
					LocalDate fecha = LocalDate.parse(fecha_nac);
					
					ManipularDB.agregarCliente(dni, nombre, apellido, fecha, telefono);
					System.out.println("##################################################");
					break;
				case 4:
					System.out.println("##################################################");
					System.out.print("Digite el dni del cliente a actualizar: ");
					dni = sc.nextInt();
					
					cliente = ManipularDB.actualizarCliente(dni);
					
					if(cliente != null) {
						System.out.println("Cliente \"" + cliente.getNombre() + "\" actualizado correctamente");
						System.out.println(cliente);
					}else {
						System.out.println("Error al actualizar un registro");
					}
					System.out.println("##################################################");
					break;
				case 5:
					System.out.println("##################################################");
					System.out.print("Digite el dni del cliente a eliminar: ");
					dni = sc.nextInt();
					
					ManipularDB.eliminarCliente(dni);
					System.out.println("##################################################");
					break;
				case 6:
					System.out.println("##################################################");
					System.out.println("Programa finalizado");
					sc.close();
					System.exit(0);
					break;
				default:
					System.out.println("##################################################");
					System.out.println("Opcion incorrecta");
					System.out.println("##################################################");
					break;
					
			}
		}while(true);
		
	}
	

}










