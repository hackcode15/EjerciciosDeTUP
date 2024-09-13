package serializacion;

import java.io.*;
import java.util.Date;
import java.util.GregorianCalendar;

public class Ejemplo1 {

    public static void main(String[] args) {
        
        Administrador jefe = new Administrador("Juan", 800, 2017, 03, 8);
        jefe.setIncentivo(5000);
        
        Empleado[] personal = new Empleado[3];
        personal[0] = jefe;
        personal[1] = new Empleado("Ana", 25000,2008,10,1);
        personal[2] = new Empleado("Luis", 18000,2012,9,15);
        
        String ruta_archivo = "D:/Desktop/Java - Pildoras Informaticas/Curso Archivos y Ficheros - Pildoras Informaticas/empleado.dat";
        
        // Como emisor
        /*try(ObjectOutputStream escribiendo_fichero = new ObjectOutputStream(new FileOutputStream(ruta_archivo))){
            
            escribiendo_fichero.writeObject(personal);
            
        }catch(Exception e){
            System.out.println("Error");
        }*/
        
        // Como receptor
        try(ObjectInputStream recuperando_fichero = new ObjectInputStream(new FileInputStream(ruta_archivo))){
            
            Empleado personal_recuperado[] = (Empleado[]) recuperando_fichero.readObject();
            
            for (Empleado empleado : personal_recuperado) {
                System.out.println(empleado);
            }

        }catch(Exception e){
            System.out.println("Error no se encuentra el archivo");
        }
        
        
        
    }

}

class Empleado implements Serializable {
    
    // Por si cambiamos la version del programa
    private static final long serialVersionUID = 1L;
    
    String nombre;
    //double sueldo;
    double sueldos; // cambiamos el nombre por ejemplo
    Date fechaContrato;
    
    public Empleado(String n, double s, int agno, int mes, int dia){
        nombre = n;
        sueldos = s;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
        fechaContrato = calendario.getTime();
    }
    
    public String getNombre() {
     return nombre;
    }
    
    public void setNombre(String nombre) {
     this.nombre = nombre;
    }
    
    public double getSueldo() {
     return sueldos;
    }
    
    public void setSueldo(double sueldo) {
     this.sueldos = sueldo;
    }
    
    public Date getFechaContrato() {
     return fechaContrato;
    }
    
    public void setFechaContrato(Date fechaContrato) {
     this.fechaContrato = fechaContrato;
    }
    
    public void SubirSueldo(double porcentaje){
        double aumento = sueldos*porcentaje/100;
        sueldos+=aumento;
    }
    
    @Override
    public String toString(){
     return "Noombre = " + nombre + " ,sueldo = " + sueldos + " , fecha de contrato: " + fechaContrato;
    }
 
}

class Administrador extends Empleado{
    
    // Por si cambiamos la version del programa
    private static final long serialVersionUID = 1L;
    
    private double incentivo;
    
    public Administrador(String n, double s, int agno, int mes, int dia){
        super(n,s,agno,mes,dia);
        incentivo = 0;
    }
    
    @Override
    public double getSueldo() {
     double sueldoBase = super.getSueldo();
     return sueldoBase+incentivo;
    }
    
    public void setIncentivo(double incentivo) {
     this.incentivo = incentivo;
    }
    
    @Override
    public String toString(){
     return super.toString()+ " Incentivo = " + incentivo;
    }

}