package POO.Ejercicios;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        Papel papel = new Papel();
        
        Birome birome = new Birome("Bic", 10);
        Birome birome2 = new Birome("Faber Castell", 50);
        
        birome.escribir("Hola, ", papel);
        birome.escribir("Mundo!", papel);
        
        birome2.escribir("\nEscribo con otra birome", papel);
        
        System.out.println(papel);
        System.out.println("Tinta restante de la birome \"" + birome.getMarca() + "\": " + birome.getCantidadDeTinta());
        System.out.println("Tinta restante de la birome \"" + birome2.getMarca() + "\": " + birome2.getCantidadDeTinta());
        
    }
    
}

class Papel {

    private String texto;
    
    public Papel() {
        this.texto = "";
    }
    
    public void escribir(String texto){
        this.texto += texto; // Ira concatenando cada texto ingresado
    }
    
    @Override
    public String toString(){
        return this.texto;
    }
    
    
}

class Birome {
    
    private String marca;
    private int cantidadDeTinta;
    
    public Birome(String marca, int cantidadDeTinta){
        this.marca = marca;
        this.cantidadDeTinta = cantidadDeTinta;
    }
    
    public void escribir(String texto, Papel papel){
        
        if(cantidadDeTinta >= texto.length()){ // Si hay suficiente tinta para escribir todo el texto
            papel.escribir(texto); // Escribe el texto completo en el papel
            cantidadDeTinta -= texto.length(); // Y se reduce la cantidad de tinta segun la longitud del texto ingresado
        }else{ // Si la tinta no alcanza
            /*Solo escribe la parte que le ancanza, haciendo una subcadena
            que empieza al principio del texto ingresado hasta la cantidad de tinta que tenes disponible*/
            papel.escribir(texto.substring(0, cantidadDeTinta)); 
            cantidadDeTinta = 0; // la tinta lo ponemos en cero
            System.out.println("Error: La birome \"" + marca + "\" se quedo sin tinta");
        }
        
    }
    
    public String getMarca(){
        return marca;
    }
    
    public int getCantidadDeTinta(){
        return cantidadDeTinta;
    }
    
}
