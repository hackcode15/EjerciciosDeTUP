package ejerciciosDeTUP.desarroladosEnClase;

import java.util.Scanner;

public class Codigo6 {

    public static void main(String[] args) {
        
        /*
        int hermano1 = 10;
        int hermano2 = 30;
        
        boolean esMayorOMenor = hermano1 > hermano2;
        
        System.out.println(esMayorOMenor);
        
        
        if(esMayorOMenor){
            System.out.println("El hermano1 es el mayor");
        }else{
            System.out.println("El hermano2 es el mayor");
        }
        */
        
        // Uno forma de saber el mayor de tres numeros
        /*
        int a = 15;
        int b = 5;
        int c = 3;
        
        if(a>b && a>c){
            System.out.println("El mayor es A");
        }else if(b>c){
            System.out.println("El mayor es B");
        }else{
            System.out.println("El mayor es C");
        }
        */
        
        
        // Otra forma
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite el 1° numero: ");
        int num1 = teclado.nextInt();
        
        System.out.print("Digite el 2° numero: ");
        int num2 = teclado.nextInt();
        
        System.out.print("Digite el 3° numero: ");
        int num3 = teclado.nextInt();
        
        int mayor = num1;
        
        if(num1 == num2 && num2 == num3){
            System.out.println("Hay tres numeros iguales");
        }else if(num1 == num2 || num1 == num3 || num2 == num3){
            System.out.println("Hay dos numeros iguales");
        }
        
        if(num2 > mayor){
            mayor = num2;
        }
        if(num3 > mayor){
            mayor = num3;
        }
        
        System.out.println("El numero mayor ingresado es: " + mayor);
        
        
        
    }
    
}
