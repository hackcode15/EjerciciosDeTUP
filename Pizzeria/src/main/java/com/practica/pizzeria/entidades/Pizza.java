package com.practica.pizzeria.entidades;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter @ToString
public class Pizza {

    private int id_pizza;
    private String nombre;
    private double precio;
    private int stock;

    public Pizza(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    
}
