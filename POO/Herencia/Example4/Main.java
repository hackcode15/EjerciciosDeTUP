package POO_Java.Herencia.Example4;

public class Main {
    
    public static void main(String[] args) {
        
        /*Empleado emp1 = new Empleado("Diego Gomez", 150000, 2025, 8, 25);
        Empleado emp2 = new Empleado("Valentina Gomez", 120000, 2026, 10, 23);
        Empleado emp3 = new Empleado("Esteban Gomez", 130000, 2028, 11, 21);

        emp1.subeSueldo(40);
        System.out.println(emp1);

        emp2.subeSueldo(30);
        System.out.println(emp2);

        emp3.subeSueldo(20);
        System.out.println(emp3);*/

        Jefatura jefe_RRHH = new Jefatura("Ramon", 55000, 1982, 9, 22);

        jefe_RRHH.setIncentivo(2570);

        Empleado misEmpleados[] = new Empleado[6];

        misEmpleados[0] = new Empleado("Diego", 9000, 2004, 8, 17);
        misEmpleados[1] = new Empleado("Junior", 8000, 2001, 12, 27);
        misEmpleados[2] = new Empleado("Valentina", 10000, 2016, 10, 20);
        misEmpleados[3] = new Empleado("Lidia", 6000, 1984, 7, 4);
        misEmpleados[4] = jefe_RRHH; // Polimorfismo. Principio de sustitucion
        misEmpleados[5] = new Jefatura("Messi", 95000, 1999, 5, 26);

        // Ejemplo de casting
        /*double num1 = 7.5;
        int num2 = (int) num1;*/

        // Casting de objeto
        Jefatura jefa_finanzas = (Jefatura) misEmpleados[5];
        jefa_finanzas.setIncentivo(5000);

        for (Empleado empleado : misEmpleados) {
            empleado.subeSueldo(5);
        }

        for (Empleado empleado : misEmpleados) {
            System.out.println(empleado);
        }

    }

}
