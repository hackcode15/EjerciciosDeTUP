package POO.Ejercicios;

import java.util.*;

public class Ejercicio8 {

    public static void main(String[] args) {
     
        /*Scanner sc = new Scanner(System.in);
        
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        
        System.out.print("Sexo (M/F): ");
        char sexo = sc.next().charAt(0);
        
        System.out.print("Peso: ");
        double peso = sc.nextDouble();
        
        System.out.print("Altura: ");
        double altura = sc.nextDouble();
        
        Persona p1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona p2 = new Persona(nombre, edad, sexo);
        
        Persona p3 = new Persona();
        p3.setNombre(nombre);
        p3.setEdad(edad);
        p3.setSexo(sexo);
        p3.setPeso(peso);
        p3.setAltura(altura);
        
        //int imcDep1 = p1.calcularIMC();
        //p1.imprimirEstadoImc(p1.calcularIMC());
        p1.calcularIMC();*/
        
        Persona p1 = new Persona("Diego", 19, 'M', 80, 1.68);
        
        Persona p2 = new Persona("Junior", 22, 'N');
        p2.setPeso(70);
        p2.setAltura(1.67);
        
        Persona p3 = new Persona();
        p3.setNombre("Valentina");
        p3.setEdad(7);
        p3.setSexo('F');
        p3.setPeso(30);
        p3.setAltura(1.30);
        
        p1.comprobarSexo(p1.getSexo());
        p2.comprobarSexo(p2.getSexo());
        p3.comprobarSexo(p3.getSexo());
        
        p1.generarDNI();
        p2.generarDNI();
        p3.generarDNI();
        
        System.out.println(p1);
        p1.calcularIMC();
        
        System.out.println("\n" + p2);
        p2.calcularIMC();
        
        System.out.println("\n" + p3);
        p3.calcularIMC();
        
    }
    
}

class Persona {
    
    private String nombre;
    private int edad;
    private int DNI;
    private char sexo;
    private int peso;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, char sexo, int peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    
    public void calcularIMC(){
        
        double valor = peso/(Math.pow(altura, 2));
        
        if(valor < 20) {
            System.out.println("La persona: '" + nombre + "' esta es su peso ideal");
        }else if(valor >= 20 && valor <= 25){
            System.out.println("La persona: '" + nombre + "' esta por debajo de su peso ideal");
        }else{ // valor > 25
            System.out.println("La persona: '" + nombre + "' esta en sobrepeso");
        }
        
    }
    
    public boolean esMayorDeEdad(){
        return edad >= 18;
    }
    
    public void comprobarSexo(char sexo){
        if(sexo != 'M' && sexo != 'F') this.sexo = 'H';
    }
    
    public void generarDNI(){
    
        Random rand = new Random();
        DNI = 10000000 + rand.nextInt(90000000);
        
    }
    
    @Override
    public String toString(){
        return "Persona(nombre=" + nombre +
                ", edad=" + edad +
                ", DNI=" + DNI +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura + ")";
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public char getSexo() {
        return sexo;
    }
    
}