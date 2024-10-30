package com.practica.pizzeria.entidades;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter @ToString
public class Ingrediente {

    private int id_ingrediente;
    private String nombre;
    private int stock;

    public Ingrediente(String nombre, int stock) {
        this.nombre = nombre;
        this.stock = stock;
    }
    
}
