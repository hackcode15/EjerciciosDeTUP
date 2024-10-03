package practicaparcial.colecciones_objetos;

import java.util.*;

public class Ejemplo2 {
    
    public static void main(String[] args) {
        
        OperacionesCRUD operacion = new OperacionesCRUD();
        
        Producto p1 = new Producto(1, "Celular", 15000);
        Producto p2 = new Producto(2, "Notebook", 100000);
        Producto p3 = new Producto(3, "SmartTV", 150000);
        
        // --------------------------CRUD--------------------------------------------
        
        // CREATE
        operacion.agregar(p1);
        operacion.agregar(p2);
        operacion.agregar(p3);
        
        operacion.agregar(4, "Heladera", 800000);
        operacion.agregar(5, "Lavarropas", 500000);
        operacion.agregar(6, "Equipo de Musica", 150000);
        operacion.agregar(7, "Horno Electrico", 75000);
        
        // READ
        operacion.mostrarProductos();
        
        // UPDATE
        //operacion.actualizar(p3);
        //operacion.actualizar(6);
        
        // DELETE
        //operacion.eliminar(p2);
        //operacion.eliminar(4);
        
        // READ
        //operacion.mostrarProductos();
        
        // --------------------------CRUD--------------------------------------------
        
        // Buscar producto
        /*Producto productoEncontrado = operacion.buscar(6);
        
        if(productoEncontrado != null){
            System.out.println("Producto encontrado");
            System.out.println(productoEncontrado);
        }else{
            System.out.println("Error: producto no encontrado");
        }*/
        
    }
    
}

class OperacionesCRUD {
    
    private Producto producto;
    private ArrayList<Producto> listaProductos;
    
    private Scanner sc = new Scanner(System.in);
    
    public OperacionesCRUD(){
        listaProductos = new ArrayList<>();
    }
    
    // Metodo para agregar
    // CREATE
    public void agregar(Producto producto){
        listaProductos.add(producto);
    }
    
    public void agregar(int id_producto, String nombre, double precio){
        listaProductos.add(new Producto(id_producto, nombre, precio));
    }
    
    // Metodo para mostrar
    // READ
    public void mostrarProductos(){
        if(!listaProductos.isEmpty()){
            for (Producto producto : listaProductos) {
                System.out.println(producto);
            }
        }else{
            System.out.println("Error: lista vacia");
        }
    }
    
    // Metodo para actualizar
    public void actualizar(Producto producto){
        
        if(!listaProductos.isEmpty()){
            
            if(listaProductos.contains(producto)){
                
                System.out.print("Ingrese el nuevo nombre: ");
                String nombre = sc.nextLine();
                System.out.print("Ingrese el nuevo precio: $");
                double precio = sc.nextDouble();

                producto.setNombre(nombre);
                producto.setPrecio(precio);
                
                System.out.println("Producto actualizado correctamente");
                
            }else{
                System.out.println("Error: producto no encontrado");
            }

        }else{
            System.out.println("Error: lista vacia");
        }
        
        sc.close();
        
    }
    
    public void actualizar(int id_producto){
        
        boolean estado = false;
        
        if(!listaProductos.isEmpty()){
            
            for (Producto producto : listaProductos) {
                
                if(producto.getId_producto() == id_producto){
                    
                    System.out.print("Ingrese el nuevo nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese el nuevo precio: $");
                    double precio = sc.nextDouble();

                    producto.setNombre(nombre);
                    producto.setPrecio(precio);

                    System.out.println("Producto actualizado correctamente");
                    
                    estado = true;
                    break;
                    
                }
                
            }
            
        }else{
            System.out.println("Error: lista vacia");
        }
        
        if(!estado){
            System.out.println("Error: producto no encontrado");
        }
        
        sc.close();
        
    }
    
    // Metodo para eliminar
    // DELETE
    public void eliminar(Producto producto){
        
        if(!listaProductos.isEmpty()){
            
            if(listaProductos.contains(producto)){
                
                listaProductos.remove(producto);
                System.out.println("Producto eliminado correctamente");
                
            }else{
                System.out.println("Error: producto no encontrado");
            }
            
        }else{
            System.out.println("Error: lista vacia");
        }
        
    }
    
    public void eliminar(int id_producto){
        
        boolean estado = false;
        
        if(!listaProductos.isEmpty()){
            
            for (Producto producto : listaProductos) {
                
                if(producto.getId_producto() == id_producto){
                    
                    listaProductos.remove(producto);
                    System.out.println("Persona eliminado correctamente");
                    
                    estado = true;
                    break;
                    
                }
                
            }
            
        }else{
            System.out.println("Error: lista vacia");
        }
        
        if(!estado){
            System.out.println("Error: producto no encontrado");
        }
        
    }
    
    // Metodo para buscar un producto
    public Producto buscar(int id_producto){
        
        if(!listaProductos.isEmpty()){
            
            for (Producto producto : listaProductos) {
                
                if(producto.getId_producto() == id_producto){
                    return producto;
                }
                
            }
            
        }else{
            System.out.println("Error: lista vacia");
        }
        
        return null;
        
    }
    
    
}

class Producto {
    
    private int id_producto;
    private String nombre;
    private double precio;

    public Producto() {
    }

    public Producto(int id_producto, String nombre, double precio) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "id_producto=" + id_producto + ", nombre=" + nombre + ", precio=$" + precio + '}';
    }
    
}
