package com.practica.usodejpa_todocode;

import com.practica.usodejpa_todocode.logica.Controladora;
import com.practica.usodejpa_todocode.logica.Usuario;
import java.util.*;

public class App {

    public static void main(String[] args) {

        Controladora control = new Controladora();

        // Create
        //Usuario usu = new Usuario(3L, "Estaban Sebastian", "Gomez", 22, "3625281272", new Date());
        //control.crearUsuario(usu);
        
        // Delete
        //control.eliminarUsuario(2L);
        
        // Uptate
        //usu.setApellido("Salinas");
        //control.editarUsuario(usu);
        
        
        // Buscar un usuario
        Usuario usuario_encontrado = control.traerUsuario(1L);
        control.imprimir(usuario_encontrado);

        
        System.out.println("\n");
        
        // Listando todos los usuarios
        ArrayList<Usuario> listaDeUsuarios = control.traerListaUsuarios();
        control.imprimir(listaDeUsuarios);

    }
}
