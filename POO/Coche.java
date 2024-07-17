package POO_Java.Example1.poo6;

public class Coche {
    
    private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;

    private String color;
    private int peso_total;
    private boolean asientosDeCuero;
    private boolean aireAcondicionado;
	
	// Metodo Constructor
	public Coche() {
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500;
	}
    
     // Method Getter
    public int getRuedas(){
        return ruedas;
    }

    public int getLargo(){
        return largo;
    }

    public int getAncho(){
        return ancho;
    }

    public int getMotor(){
        return motor;
    }

    public int getPesoPlataforma(){
        return peso_plataforma;
    }

    // Metodo Setters y Getter
    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public String dime_datos_generales(){
        return "La plataforma del vehiculo tiene " + ruedas +
         " ruedas. Mide " + largo/1000 + " metros con un ancho de " +
          ancho + " cm y un peso de plataforma de " + peso_plataforma +
           " kg.";
    }

    public void configuraAsientos(String asientosDeCuero){ // Setter
        if(asientosDeCuero.equalsIgnoreCase("si")){
            this.asientosDeCuero = true;
        }else{
            this.asientosDeCuero = false;
        }
    }

    public String dime_asientos(){ // Getter
        if(asientosDeCuero == true) return "El coche tiene asientos de cuero";
        else return "El coche tiene asientos de serie";
    }

    public void cofiguraAire(String climatizador){
        if(climatizador.equalsIgnoreCase("si")){
            this.aireAcondicionado = true;
        }else{
            this.aireAcondicionado = false;
        }
    }

    public String dimeSiTieneAire(){
        if(aireAcondicionado == true){
            return "El coche lleva aire acondicionado";
        }else{
            return "No tiene aire acondicionado";
        }
    }

    // Setter y Getter juntos (no recomendado)
    public String dimePesoCoche(){
        
        int peso_carroceria = 500;
        peso_total = peso_plataforma + peso_carroceria;
        if(asientosDeCuero == true){
            peso_total += 50;
        }
        if(aireAcondicionado == true){
            peso_total += 20;
        }

        return "El peso del coche es " + peso_total;

    }

    // Getter
    public int precio_coche(){
        int precio_final = 10000;
        if(asientosDeCuero == true){
            precio_final += 2000;
        }
        if(aireAcondicionado == true){
            precio_final += 1500;
        }
        return precio_final;
    }

}
