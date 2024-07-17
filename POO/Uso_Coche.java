package POO_Java.Example1.poo6;

import javax.swing.*;

public class Uso_Coche {
    
    public static void main(String[] args) {
        
        Coche micoche = new Coche();

        System.out.println(micoche.dime_datos_generales());

        //micoche.setColor("Rojo");
        micoche.setColor(JOptionPane.showInputDialog("Introduce color"));
        System.out.println("El color del coche es: " + micoche.getColor());

        //micoche.configuraAsientos("si");
        micoche.configuraAsientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
        System.out.println(micoche.dime_asientos());

        //micoche.cofiguraAire("si");
        micoche.cofiguraAire(JOptionPane.showInputDialog("¿Tiene aire acondicionado?"));
        System.out.println(micoche.dimeSiTieneAire());

        System.out.println(micoche.dimePesoCoche());

        System.out.println("El precio final del coche es: $" + micoche.precio_coche());

    }

}