package com.practica.usodejpa_todocode.logica;

import com.practica.usodejpa_todocode.persistencia.ControladoraPersistencia;
import java.util.ArrayList;

public class Controladora {

    private ControladoraPersistencia controlPersis;
    
    public Controladora(){
        controlPersis = new ControladoraPersistencia();
    }
    
    public void crearUsuario(Usuario usuario){
    
        controlPersis.crearUsuario(usuario);
    
    }
    
    public void eliminarUsuario(Long id_usuario){
        
        controlPersis.eliminarUsuario(id_usuario);
        
    }
    
    public void editarUsuario(Usuario usuario){
        
        controlPersis.editarUsuario(usuario);
        
    }
    
    public Usuario traerUsuario(Long id){
        
        return controlPersis.traerUsuario(id);
        
    }
    
    public ArrayList<Usuario> traerListaUsuarios(){
        
        return controlPersis.traerListaUsuarios();
        
    }
    
    public void imprimir(Usuario usu){

        if (usu != null) {

            System.out.println("Usuario \"" + usu.getNombre() + "\" encontrado");

            System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s", "ID", "NOMBRE", "APELLIDO", "EDAD", "TELEFONO", "FECHA");
            System.out.println("");

            System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s", usu.getId_usuario(), usu.getNombre(), usu.getApellido(), usu.getEdad(), usu.getTelefono(), usu.getFecha_nac());

        } else {
            System.out.println("Error: no encontrado");
        }
        
    }
    
    public void imprimir(ArrayList<Usuario> listaUsuarios){
        
        if(!listaUsuarios.isEmpty()){
            System.out.println("Lista de Usuarios");

            System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s", "ID", "NOMBRE", "APELLIDO", "EDAD", "TELEFONO", "FECHA");
            System.out.println("");
            listaUsuarios.stream().map(p -> String.format("%-20s %-20s %-20s %-20s %-20s %-20s", p.getId_usuario(), p.getNombre(), p.getApellido(), p.getEdad(), p.getTelefono(), p.getFecha_nac()))
                    .forEach(System.out::println);
        }else{
            System.out.println("Error: lista vacia");
        }
        
    }
    
}
