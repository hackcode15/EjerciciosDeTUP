package POO.Ejercicios;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        Papel papel = new Papel();
        
        Birome birome = new Birome(20);
        
        String texto = "Hola mundo en Java";
        
        birome.escribir(texto, papel);
        
        System.out.println("Texto escrito en el papel");
        System.out.println(papel);
        
        System.out.println("Tinta disponible: " + birome.getTinta());
        
    }
    
}

class Papel {
    
    private String texto;
    
    public Papel(){
        this.texto = "";
    }
    
    public void escribir(String otro_texto){
        texto += otro_texto;
    }
    
    @Override
    public String toString(){
        return texto;
    }
    
}

class Birome {
    
    private int tinta;
    
    public Birome(int tinta){
        this.tinta = tinta;
    }
    
    public void escribir(String texto, Papel papel){
        
        if(tinta >= texto.length()){
            papel.escribir(texto);
            tinta -= texto.length();
        }else{
            String texto_alcanzado = texto.substring(0, tinta);
            papel.escribir(texto_alcanzado);
            System.out.println("Te quedaste sin tinta");
            System.out.println("Total de caracteres del texto: " + texto.length());
            tinta = 0;
        }
        
    }
    
    public int getTinta(){
        return tinta;
    }
    
}