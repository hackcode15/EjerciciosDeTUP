package POO.Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la fraccion");
        System.out.print("Ingrese el numerador: ");
        int numf1 = sc.nextInt();
        System.out.print("Ingrese el denominador: ");
        int denf1 = sc.nextInt();
        
        Fraccion fraccion1 = new Fraccion(numf1, denf1);
        
        System.out.print("Quieres cargar otra fraccion? (SI / NO): ");
        String decision = sc.next();
        
        if(decision.equalsIgnoreCase("si")){
            System.out.println("Ingrese la otra fraccion");
            System.out.print("Ingrese el numerador: ");
            int numf2 = sc.nextInt();
            System.out.print("Ingrese el denominador: ");
            int denf2 = sc.nextInt();
            
            System.out.print("Seleccione la operacion a realizar (+ *): ");
            String operacion = sc.next();
            
            String resultado;
            
            switch(operacion){
                case "+":
                    resultado = fraccion1.sumar(numf2, denf2);
                    System.out.println("Suma de: " + fraccion1 + " + " + numf2 + "/" + denf2 + " = " + resultado);
                    break;
                case "*":
                    resultado = fraccion1.multiplicar(numf2, denf2);
                    System.out.println("Producto de: " + fraccion1 + " * " + numf2 + "/" + denf2 + " = " + resultado);
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
            
        }else{
            System.out.println("Fraccion ingresada: " + fraccion1);
        }
        
        
        
    }
    
}

class Fraccion {
    
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

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

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }
    
    public String sumar(int numerador, int denominador){
        
        int numeradorResultado, denominadorResultado;
        
        if(this.numerador == numerador){
            numeradorResultado = this.numerador + numerador;
            denominadorResultado = this.denominador;
        }else{
            numeradorResultado = (this.numerador*denominador) + (numerador*this.denominador);
            denominadorResultado = this.denominador * denominador;
        }
        
        return numeradorResultado + "/" + denominadorResultado;
        
    }
    
    public String multiplicar(int numerador, int denominador){
        
        int numeradorResultado = this.numerador * numerador;
        int denominadorResultado = this.denominador * denominador;
        
        return numeradorResultado + "/" + denominadorResultado;
        
    }
    
}
