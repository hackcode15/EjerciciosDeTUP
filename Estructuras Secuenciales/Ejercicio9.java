/*
9) Se desea conocer el promedio y porcentaje de hombres y mujeres cursando el
   Programación I en UTN FRRe, teniendo como dato la cantidad de hombres y mujeres de 3
   comisiones.
*/

package ejerciciosDeTUP;

public class Ejercicio9 {

    public static void main(String[] args) {
        
        // Cantidad de hombres y mujeres en la COM 1
        int mujeresCom1 = 23;
        int hombresCom1 = 53;
        
        // Cantidad de hombres y mujeres en la COM 2
        int mujeresCom2 = 56;
        int hombresCom2 = 42;
        
        // Cantidad de hombres y mujeres en la COM 3
        int mujeresCom3 = 29;
        int hombresCom3 = 35;
        
        // Total de hombres y mujeres
        int totalMujeres = mujeresCom1 + mujeresCom2 + mujeresCom3;
        int totalHombres = hombresCom1 + hombresCom2 + hombresCom3;
        
        int totalAlumnos = totalMujeres + totalHombres;
        
        double porcentajeMujeres = (double) totalMujeres / totalAlumnos * 100;
        double porcentajeHombres = (double) totalHombres / totalAlumnos * 100;
        
        System.out.println("Comision 1 \nHombres: " + hombresCom1 + "\nMujeres: " + mujeresCom1);
        System.out.println("\nComision 2 \nHombres: " + hombresCom2 + "\nMujeres: " + mujeresCom2);
        System.out.println("\nComision 3 \nHombres: " + hombresCom3 + "\nMujeres: " + mujeresCom3);
        
        System.out.println("-----------------------------------------------------");
        System.out.println("Total de alumnos en las 3 comisiones: " + totalAlumnos);
        System.out.println("Total de mujeres en las 3 comisiones: " + totalMujeres);
        System.out.println("Total de hombres en las 3 comisiones: " + totalHombres);
        
        System.out.println("Porcentaje de mujeres: " + Math.ceil(porcentajeMujeres) + "%");
        System.out.println("Porcentaje de hombres: " + Math.ceil(porcentajeHombres) + "%");
        
    }
    
}
