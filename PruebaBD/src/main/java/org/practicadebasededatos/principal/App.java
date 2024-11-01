package org.practicadebasededatos.principal;

import org.practicadebasededatos.controlador.ClienteControlador;

public class App {

    public static void main(String[] args) {
        
        // Solo hacemos uso de los metodos de los CONTROLADORES
        
        // logica de menu ....
        // ...
        
        // Ejemplo de uso
        ClienteControlador control = new ClienteControlador();
        
        // Imprimo toda la tabla clientes
        control.listarClientes();
        
        // Agrego un cliente
        //control.agregarCliente();
        
        // Actualizo un cliente
        //control.actualizarCliente();
        
        // Eliminar un cliente
        //control.eliminarCliento();
        
    }
    
}
