package com.practica.pizzeria.entidades;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class IngredientePizza {

    private int id_ingredientePizza;
    private Pizza pizza;
    private Ingrediente ingrediente;
    
}
