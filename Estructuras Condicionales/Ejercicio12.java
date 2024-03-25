/*
12) Dado un numero entre 1 y 7 escriba su correspondiente día de la semana así:
    1- Lunes 2- Martes 3- Miércoles 4- Jueves 5- Viernes 6- Sábado 7- Domingo
*/

package ejerciciosDeTUP.estructuras_condicionales;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        // 1 forma de hacerlo

        System.out.print("Ingrese un dia de la semana entre 1 y 7: ");
        int numDia = teclado.nextInt();
        
        String dia;
        
        switch(numDia){
        
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miercoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sabado";
                break;
            default:
                dia = "Domingo";
                break;
        
        }
        
        if(numDia >= 1 & numDia <= 7){
            System.out.println("El dia '" + numDia + "' es \"" + dia + "\"");
        }else{
            System.out.println("Error: Has ingresado un numero incorrecto;");
        }

        
        // Otra forma mas simplificada usando arrays
        /*
        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        
        System.out.print("Ingrese un dia de la semana entre 1 y 7: ");
        int numDia = teclado.nextInt();
        
        if(numDia >= 1 & numDia <= 7){
            // Al numero ingresado restamos -1, ya que los arrays comienzan desde 0 "dias[numDia-1]"
            System.out.println("El dia '" + numDia + "' es \"" + dias[numDia-1] + "\"");
        }else{
            System.out.println("Error: Has ingresado un numero incorrecto;");
        }
        */
        
        teclado.close();
    
    }
    
}
