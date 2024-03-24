/*
    5) Dados los lados de un triángulo, informar qué tipo es: isósceles, escaleno o equilátero.
    Equilatero, tiene 3 lados iguales
    Isosceles, tiene 2 lados iguales
    Escaleno, tiene 3 lados desiguales
*/

package ejerciciosDeTUP.estructuras_condicionales;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese los tres lados del triangulo");
        
        System.out.print("Lado 1: ");
        int lado1 = teclado.nextInt();
        
        System.out.print("Lado 2: ");
        int lado2 = teclado.nextInt();
        
        System.out.print("Lado 3: ");
        int lado3 = teclado.nextInt();
        
        String tipoTriangulo;
        
        if(lado1 == lado2 & lado2 == lado3){
            tipoTriangulo = "Equilatero";
        }else if(lado1 == lado2 | lado1 == lado3 | lado2 == lado3){
            tipoTriangulo = "Isosceles";
        }else{
            tipoTriangulo = "Escaleno";
        }
        
        // valido con switch
        switch(tipoTriangulo){
        
            case "Equilatero":
                System.out.println("Es un triangulo \"" + tipoTriangulo + "\" porque tiene 3 lados iguales");
                break;
            case "Isosceles":
                System.out.println("Es un triangulo \"" + tipoTriangulo + "\" porque tiene 2 lados iguales");
                break;
            default:
                System.out.println("Es un triangulo \"" + tipoTriangulo + "\" porque tiene 3 lados desiguales");
                break;
        }
        
        
        /*
        // otra forma de validar con if anidados
        if(tipoTriangulo.equals("Equilatero")){
            System.out.println("Es un triangulo \"" + tipoTriangulo + "\" porque tiene 3 lados iguales");
        }else if(tipoTriangulo.equals("Isosceles")){
            System.out.println("Es un triangulo \"" + tipoTriangulo + "\" porque tiene 2 lados iguales");
        }else{
            System.out.println("Es un triangulo \"" + tipoTriangulo + "\" porque tiene 3 lados desiguales");
        }
        */
    }
    
}
