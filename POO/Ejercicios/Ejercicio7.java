package POO.Ejercicios;

public class Ejercicio7 {

    public static void main(String[] args) {
        
        Mate mate = new Mate(5);
        
        System.out.println(mate.isLleno());
        System.out.println("");
        
        mate.cebar();
        mate.beber();
        mate.cebar();
        mate.beber();
        mate.cebar();
        mate.beber();
        mate.cebar();
        mate.beber();
        
        mate.cebar();
        mate.beber();
        
        mate.cebar();
        mate.beber();
        
        mate.cebar();
        mate.cebar();
        
    }
    
}

class Mate {
    
    private int cantidadDeCebadas;
    private boolean lleno;
    
    public Mate(int cantidadDeCebadas){
        this.cantidadDeCebadas = cantidadDeCebadas;
        this.lleno = false;
    }
    
    public void cebar(){
        if(lleno){
            System.out.println("Cuidado te quemaste!");
        }else{
            lleno = true;
            System.out.println("Se ha cebado el mate");
        }
    }
    
    public void beber(){
        
        if(!lleno){
            System.out.println("El mate esta vacio");
            return;
        }
        
        if(cantidadDeCebadas > 0){
            cantidadDeCebadas--;
            System.out.println("Se ha bebido una cebada. Cebadas restantes: " + cantidadDeCebadas);
            if(cantidadDeCebadas == 0){
                System.out.println("Advertencia: el mate esta lavado");
            }
        }else{
            System.out.println("Advertencia: el mate esta lavado");
        }
        
        lleno = false;
        
    }

    public int getCantidadDeCebadas() {
        return cantidadDeCebadas;
    }

    public void setCantidadDeCebadas(int cantidadDeCebadas) {
        this.cantidadDeCebadas = cantidadDeCebadas;
    }

    public boolean isLleno() {
        return lleno;
    }

    public void setLleno(boolean lleno) {
        this.lleno = lleno;
    }
    
}
