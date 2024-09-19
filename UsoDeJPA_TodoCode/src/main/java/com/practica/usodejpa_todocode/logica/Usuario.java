package com.practica.usodejpa_todocode.logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.*;

// Anotaciones Lombok
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter @ToString
// Anotaciones JPA
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_USUARIO")
    private Long id_usuario;
    
    @Basic
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "APELLIDO")
    private String apellido;
    @Column(name = "EDAD")
    private int edad;
    @Column(name = "TELEFONO")
    private String telefono;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_NAC")
    private Date fecha_nac;
    
}
