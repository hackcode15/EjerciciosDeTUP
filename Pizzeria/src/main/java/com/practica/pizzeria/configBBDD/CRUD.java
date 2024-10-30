package com.practica.pizzeria.configBBDD;

import java.util.*;

public abstract class CRUD<T> {

    public abstract boolean create(T entidad);
    public abstract List<T> read();
    public abstract boolean update(T entidad);
    public abstract boolean delete(T entidad);
    public abstract T buscarPorId(int id);
    
}
