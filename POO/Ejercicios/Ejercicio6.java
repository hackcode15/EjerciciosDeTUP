package POO.Ejercicios;

public class Ejercicio6 {

    public static void main(String[] args) {
        
        Corcho corcho = new Corcho("Bodega 1", true);
        Botella botella = new Botella(corcho);
        
        SacaCorchos sacacorcho = new SacaCorchos();
        
        sacacorcho.destapar(botella);
        //sacacorcho.destapar(botella);
        
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

    public boolean getEnBotella() {
        return enBotella;
    }

    public void setEnBotella(boolean enBotella) {
        this.enBotella = enBotella;
    }
    
}

class Botella {
    
    private Corcho corcho;
    
    public Botella(Corcho corcho){
        this.corcho = corcho;
    }

    public Corcho getCorcho() {
        return corcho;
    }

    public void setCorcho(Corcho corcho) {
        this.corcho = corcho;
    }
    
    
    
}

class SacaCorchos {
    
    private boolean tieneCorcho;
    
    public SacaCorchos(){
        this.tieneCorcho = false;
    }
    
    public boolean getTieneCorcho(){
        return tieneCorcho;
    }
    
    public void destapar(Botella botella){
        if(botella.getCorcho().getEnBotella()){
            System.out.println("Error: La botella no tiene corcho para sacar");
            return;
        }
        
        if(!tieneCorcho){
            botella.getCorcho().setEnBotella(false);
            System.out.println("Se ha destapado la botella");
            tieneCorcho = true;
        }else{
            System.out.println("Error: El SacaCorcho esta ocupado");
        }
    }
    
    public void limpiar(){
        if(tieneCorcho){
            tieneCorcho = false;
            System.out.println("SacaCorcho limpiado correctamente");
        }else{
            System.out.println("Error: El SacaCorcho no tiene ningun corcho para limpiar");
        }
    }
    
}
