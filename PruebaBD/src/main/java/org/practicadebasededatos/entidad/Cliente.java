package org.practicadebasededatos.entidad;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter @ToString
public class Cliente {
 
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private String telefono;

    // --
    public Cliente(String nombre, String apellido, int edad, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
    }
    
}
