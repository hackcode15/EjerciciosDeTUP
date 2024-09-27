package POO.Ejercicios;

import java.util.Scanner;

public class Ejercicio3_V2 {

    public static void main(String[] args) {
        
        // Fracciones creadas
        Fraccion fraccion1 = new Fraccion(10, 5);
        Fraccion fraccion2 = new Fraccion(8, 2);
        
        // Operaciones
        // Suma de Fracciones
        Fraccion resultadoSuma = fraccion1.sumar(fraccion2);
        System.out.println("Resultado de la suma: " + resultadoSuma);
        
        // Multiplicacion de Fracciones
        Fraccion resultadoMultiplicacion = fraccion1.multiplicar(fraccion2);
        System.out.println("Resultado de la multiplicacion: " + resultadoMultiplicacion);
        
    }
    
}

class Fraccion {
    
    // Atributos
    private int numerador;
    private int denominador;
    
    // Constructores
    public Fraccion(){
        
    }

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion sumar(Fraccion otra_fraccion){
        
        // Intancio un objeto fraccion con su constructor sin parametro
        Fraccion fraccionResultado = new Fraccion();
        
        // Creo variables y realizo las operaciones
        int numeradorResultado, denominadorResultado;
        
        // Operaciones basada en suma de fracciones, dos posibilidades
        if(this.numerador == otra_fraccion.numerador){
            numeradorResultado = this.numerador + otra_fraccion.numerador;
            denominadorResultado = this.numerador;
        }else{
            numeradorResultado = (this.numerador * otra_fraccion.denominador) + (otra_fraccion.numerador * this.denominador);
            denominadorResultado = this.denominador * otra_fraccion.denominador;
        }
        
        // Inicializo los atributos del objeto fraccionResultado con los metodos SETTER
        fraccionResultado.setNumerador(numeradorResultado);
        fraccionResultado.setDenominador(denominadorResultado);
        
        // Retorno la fraccion resultado
        return fraccionResultado;
        
    }
    
    public Fraccion multiplicar(Fraccion otra_fraccion){
        
        // Intancio un objeto fraccion con su constructor sin parametro
        Fraccion fraccionResultado = new Fraccion();
        
        // Creo variables y realizo las operaciones
        int numeradorResultado = this.numerador * otra_fraccion.numerador;
        int denominadorResultado = this.denominador * otra_fraccion.denominador;
        
        // Inicializo los atributos del objeto fraccionResultado con los metodos SETTER
        fraccionResultado.setNumerador(numeradorResultado);
        fraccionResultado.setDenominador(denominadorResultado);
        
        // Retorno la fraccion resultado
        return fraccionResultado;
        
    }
    
    // Metodos Getter y Setter
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    // Metodo ToString para devolver el resultado
    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }
    
}

