package com.practica.usodejpa_todocode.persistencia;

import com.practica.usodejpa_todocode.logica.Usuario;
import com.practica.usodejpa_todocode.persistencia.exceptions.NonexistentEntityException;
import java.util.*;

public class ControladoraPersistencia {

    UsuarioJpaController usuJpa = new UsuarioJpaController();

    public void crearUsuario(Usuario usuario) {
    
        usuJpa.create(usuario);
        
    }

    public void eliminarUsuario(Long id_usuario) {
        
        try {
            usuJpa.destroy(id_usuario);
        } catch (NonexistentEntityException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    
    }

    public void editarUsuario(Usuario usuario) {
        
        try {
            usuJpa.edit(usuario);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        
    }

    public Usuario traerUsuario(Long id) {
        
        return usuJpa.findUsuario(id);
    
    }

    public ArrayList<Usuario> traerListaUsuarios() {
        
        List<Usuario> lista = usuJpa.findUsuarioEntities();
        
        ArrayList<Usuario> listaUsuario = new ArrayList<>(lista);
        
        return listaUsuario;
    
    }
    
    
    
}
