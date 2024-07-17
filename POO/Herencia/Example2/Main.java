package POO_Java.Herencia.Example2;

public class Main {
    
    public static void main(String[] args) {
        
        Vehiculo mivehiculo1 = new Vehiculo();

        mivehiculo1.setColor("Verde");

        Furgoneta mifurgoneta1 = new Furgoneta(7, 580);

        Vehiculo mifurgoneta2 = new Furgoneta(5, 400);

        mifurgoneta2.setColor("Celeste");

        // Metodos heredados de la clase Vehiculo
        mifurgoneta1.setColor("Azul");
        mifurgoneta1.configuraAsientos("si");
        mifurgoneta1.cofiguraAire("si");

        System.out.println(mivehiculo1.dime_datos_generales() +  " El color es " + mivehiculo1.getColor());
        
        System.out.println("");
        System.out.println(mifurgoneta1.dime_datos_generales() + " " +  mifurgoneta1.dimeDatosFurgoneta());
        

    }

}
