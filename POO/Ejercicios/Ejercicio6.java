package POO.Ejercicios;

class Botella {
    
    private Corcho corcho;
    
    public Botella(Corcho corcho){
        this.corcho = corcho;
    }
    
    public Corcho getCorcho(){
        return corcho;
    }
    
    public void setCorcho(Corcho corcho){
        this.corcho = corcho;
    }
    
}

class Corcho {
    
    private String bodega;
    private boolean enBotella;
    
    public Corcho(String bodega, boolean enBotella){
        this.bodega = bodega;
        this.enBotella = enBotella;
    }

    public String getBodega() {
        return bodega;
    }

    public void setBodega(String bodega) {
        this.bodega = bodega;
    }

    public boolean isEnBotella() {
        return enBotella;
    }

    public void setEnBotella(boolean enBotella) {
        this.enBotella = enBotella;
    }
    
}

class Sacacorcho {
    
    private boolean tieneCorcho;
    
    public Sacacorcho(){
        tieneCorcho = false;
    }
    
    public void destapar(Botella botella){
        
        if(!tieneCorcho){
            
            if(botella.getCorcho().isEnBotella()){
                botella.getCorcho().setEnBotella(false);
                tieneCorcho = true;
                System.out.println("Corcho sacado\n");
            }else{
                System.out.println("Error: la botella no tiene corcho\n");
            }
            
        }else{
            System.out.println("Error: el Sacacorchos no esta limpio\n");
        }
        
    }
    
    public void limpiar(){
        
        if(tieneCorcho){
            tieneCorcho = false;
            System.out.println("Sacacorcho limpiado\n");
        }else{
            System.out.println("Error: el sacacorchos ya esta limpio\n");
        }
        
    }
    
    public boolean isTieneCorcho(){
        return tieneCorcho;
    }
    
    public void setTieneCorcho(boolean tieneCorcho){
        this.tieneCorcho = tieneCorcho;
    }
    
}

public class Ejercicio6 {

    public static void main(String[] args) {
        
        // Instancio un Saca Corcho
        Sacacorcho miSacacorcho = new Sacacorcho();
        
        // Instancio un corcho
        Corcho miCorcho = new Corcho("Balbo", true); // Corcho puesto en botella
        
        // Instancio una botella
        Botella miBotella = new Botella(miCorcho);
        
        // Verifico si la botella tiene corcho
        System.out.println("Tiene corcho?: " + miBotella.getCorcho().isEnBotella() + "\n");
        
        // Sacamos el corcho
        miSacacorcho.destapar(miBotella);
        
        // Verifico nuevamente si la botella tiene corcho
        System.out.println("Tiene corcho?: " + miBotella.getCorcho().isEnBotella() + "\n");
        
        // Prueba de los distintos errores
        
        // Sacacorcho sin limpiar
        // Intento sacar el corcho a una botella sin corcho
        miSacacorcho.destapar(miBotella);
        
        // Limpio el Sacacorcho
        miSacacorcho.limpiar();
        
        // Sacacorcho limpiado
        // Intento sacar el corcho a una botella sin corcho
        miSacacorcho.destapar(miBotella);
        
        // Intento limpiar un corcho que ya esta limpio
        miSacacorcho.limpiar();
        
    }
    
}
