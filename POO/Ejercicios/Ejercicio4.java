package POO.Ejercicios;

import java.util.*;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        Vector v1 = new Vector(Arrays.asList(1,2,3));
        Vector v2 = new Vector(Arrays.asList(3,6,7));
        Vector v3 = new Vector(Arrays.asList(8,9));
        
        System.out.println("Vector 1: " + v1);
        System.out.println("Vector 2: " + v2);
        System.out.println("Vector 3: " + v3);
        
        Vector vectorMultiplicado = v1.multiplicar(2);
        System.out.println("\nVector 1 multiplicado por 2: " + vectorMultiplicado);
        
        Vector sumaDeV1yV2 = v1.sumar(v2);
        System.out.println("\nSuma del vector 1 con el vector 2: " + sumaDeV1yV2);
        
        System.out.println();
        Vector sumaError = v1.sumar(v3);
        System.out.println("Intento de sumar el vector 1 con el vector 3: " + sumaError);
        
        
        
    }
    
}

class Vector {
    
    private List<Integer> elementos;
    
    public Vector(List<Integer> elementos){
        this.elementos = elementos;
    }
    
    @Override
    public String toString(){
        return elementos.toString();
    }
    
    public Vector multiplicar(int numero){
        
        List<Integer> productoElementos = new ArrayList<>();
        for (int i = 0; i < elementos.size(); i++) {
            productoElementos.add(elementos.get(i) * numero);
        }
        
        Vector vectorNuevo = new Vector(productoElementos);
        
        return vectorNuevo;
        
    }
    
    public Vector sumar(Vector otro){
        
        if(this.elementos.size() != otro.elementos.size()){
            System.out.println("Error: los vectores no tienen la misma longitud");
            return otro;
        }
        
        List<Integer> sumaElementos = new ArrayList<>();
        for (int i = 0; i < this.elementos.size(); i++) {
            sumaElementos.add(this.elementos.get(i) + otro.elementos.get(i));
        }
        
        Vector nuevoVector = new Vector(sumaElementos);
        
        return nuevoVector;
        
    }
    

}
