package org.practicadebasededatos.controlador;

import org.practicadebasededatos.entidad.Cliente;
import java.util.*;
import org.practicadebasededatos.dao.ClienteDAO;

public class ClienteControlador {
    
    private ClienteDAO clienteDAO;
    private Scanner sc;
    
    public ClienteControlador(){
        clienteDAO = new ClienteDAO();
        sc = new Scanner(System.in);
    }
    
    // uso del metodo: CREATE
    public void agregarCliente(){
        
        System.out.println("== AGREGAR CLIENTE ==");
        
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        
        System.out.print("Apellido (enter para omitir): ");
        String apellido = sc.nextLine();
        
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        
        // consumir buffer
        sc.nextLine();
        System.out.print("Telefono (enter para omitir): ");
        String telefono = sc.nextLine();
        
        Cliente clienteNuevo = new Cliente(nombre, apellido, edad, telefono);
        
        if(clienteDAO.create(clienteNuevo)){
            System.out.println("Cliente \"" + clienteNuevo.getNombre() + "\" agregado correctamente");
        }else{
            System.out.println("Error al agregar cliente");
        }
        
    }
    
    // uso del metodo: READ
    public void listarClientes(){
        
        List<Cliente> lista = clienteDAO.read();
        
        // Imprimimos la lista con un bucle for each
        /*for (Cliente cliente : lista) {
            System.out.println(cliente);
        }*/
        
        // Uso de formatos de impresion y expresiones lambda (Avanzado)
        System.out.printf("%-16s %-16s %-16s %-16s %-16s%n", "ID_CLIENTE", "NOMBRE", "APELLIDO", "EDAD", "TELEFONO");
        //System.out.println("");
        lista.stream()
                .map(cliente -> String.format("%-16s %-16s %-16s %-16s %-16s", cliente.getId(), cliente.getNombre(), cliente.getApellido(), cliente.getEdad(), cliente.getTelefono()))
                .forEach(System.out::println);
        System.out.println("");
        
    }
    
    // uso del metodo: UPDATE
    public void actualizarCliente(){
        
        System.out.println("== ACTUALIZAR CLIENTE ==");
        
        System.out.print("Digite el ID del cliente: ");
        int id = sc.nextInt();
        
        Cliente clienteAModificar = clienteDAO.search(id);
        
        if(clienteAModificar != null){
            
            System.out.print("Nueva edad: ");
            int edadNueva = sc.nextInt();
            
            sc.nextLine(); // consumit el buffer
            System.out.print("Nuevo telefono (enter para omitir): ");
            String telefonoNuevo = sc.nextLine();
            
            clienteAModificar.setEdad(edadNueva);
            clienteAModificar.setTelefono(telefonoNuevo);
            
            if(clienteDAO.update(clienteAModificar)){
                System.out.println("Cliente \"" + clienteAModificar.getNombre() + "\" actualizado correctamente");
            }else{
                System.out.println("Error al actualizar");
            }
            
        }else{
            System.out.println("Error: el cliente no existe");
        }
        
    }
    
    // uso del metodo: DELETE
    public void eliminarCliento(){
        
        System.out.println("== ELIMINAR CLIENTE ==");
        
        System.out.print("Digite el ID del cliente: ");
        int id = sc.nextInt();
        
        Cliente clienteAEliminar = clienteDAO.search(id);
        
        if(clienteAEliminar != null){
            
            if(clienteDAO.delete(clienteAEliminar)){
                System.out.println("Cliente \"" + clienteAEliminar.getNombre() + "\" eliminado correctamente");
            }else{
                System.out.println("Error al eliminar");
            }
            
        }else{
            System.out.println("Error: el cliente no existe");
        }
        
    }
    
}
