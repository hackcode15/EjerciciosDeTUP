package ejerciciosDeTUP.desarroladosEnClase;

import java.util.Scanner;

public class Codigo5 {

    public static void main(String[] args) {
        
        /*
        double totalApagar = 56000;
        
        int cant = 2;
        
        // evaluacion con int
        switch(cant){
            case 1:
                totalApagar = totalApagar*0.2;
                System.out.println("es 1");
                break;
            case 2:
                System.out.println("es 2");
                break;
            default:
                System.out.println("ninguno de los valores definidos");
                break;   
        }
        */
        
        // evalucion con char
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite el primer numero: ");
        int num1 = teclado.nextInt();
       
        System.out.print("Digite el segundo numero: ");
        int num2 = teclado.nextInt();
        
        System.out.println("Seleccione una operacion: \n'+' SUMA \n'-' RESTA \n'*' MULTIPLICACION \n'/' DIVISION");
        
        System.out.print("Digite el operador numero: ");
        char operador = teclado.next().charAt(0);
        
        double resultado = 0;
        
        switch(operador){
        
            //case '+':
            //case 's':
            //case 'S':
                
            case '+', 's', 'S':
                
                resultado = num1 + num2;
                break;
                
            case '-':
                
                resultado = num1 - num2;
                break;
                
            case '*':
                
                resultado = num1 * num2;
                break;
                
            case '/':
                
                if(num2 == 0){
                    System.out.println("No se puede dividir por cero");
                }else{
                    resultado = num1 / num2;
                }
                break;
            
            default:
                
                System.out.println("Opcion incorrecta");
                break;
            
        }
        
        System.out.println("Resultado: " + resultado);
        
        
    }
    
}
