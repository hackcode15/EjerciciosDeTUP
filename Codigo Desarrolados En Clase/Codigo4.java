package ejerciciosDeTUP.desarroladosEnClase;



public class Codigo4 {

    public static void main(String[] args) {
        
        double totalApagar = 56000;
        
        if(totalApagar >= 20000){
            totalApagar = totalApagar * 0.8; // descuento 20%
        }else if(totalApagar >= 50000){
            totalApagar = totalApagar * 0.75; // descuento 25%
        }else{
            totalApagar = totalApagar * 0.70; // descuento 30%
        }
        
        System.out.println(totalApagar);
        
    }
    
}
