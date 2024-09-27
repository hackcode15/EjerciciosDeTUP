package POO.Ejercicios;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        Cuenta cuenta1 = new Cuenta("Junior");
        cuenta1.ingresar(1500);
        cuenta1.retirar(1000);
        System.out.println(cuenta1);
        
        System.out.println();
        
        Cuenta cuenta2 = new Cuenta("Diego", 5000);
        cuenta2.ingresar(3000);
        cuenta2.retirar(7000);
        System.out.println(cuenta2);

    }
    
}

class Cuenta {

    private String titular;
    private double cantidad;
    
    public Cuenta(String titular, double cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }
    
    public Cuenta(String titular){
        this.titular = titular;
        this.cantidad = 0;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    public void ingresar(double cantidad){
        if(cantidad > 0) {
            System.out.println("Ingreso de dinero exitoso");
            this.cantidad += cantidad;
        }else{
            System.out.println("Error: No puedes ingresar valores negativos");
        }
    }
    
    public void retirar(double cantidad){
        if(cantidad == this.cantidad || cantidad < this.cantidad){
            System.out.println("Retiro de dinero exitoso");
            this.cantidad -= cantidad;
        }else{
            System.out.println("Error: saldo insuficiente");
        }
    }
    
    @Override
    public String toString(){
        return "Cuenta(titular=" + titular +
                ", cantidad=" + cantidad + ")";
    }

}
