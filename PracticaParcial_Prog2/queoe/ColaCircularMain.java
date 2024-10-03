package practicaparcial.queoe;

public class ColaCircularMain {

    public static void main(String[] args) {

        ColaCircular miColaCircular = new ColaCircular(8);

        miColaCircular.agregarACola(15);
        miColaCircular.agregarACola(150);
        miColaCircular.agregarACola(5);
        miColaCircular.agregarACola(22);
        miColaCircular.agregarACola(92);
        miColaCircular.agregarACola(21);
        miColaCircular.agregarACola(23);
        miColaCircular.agregarACola(55);
        
        miColaCircular.sacarDeLaCola();
        miColaCircular.sacarDeLaCola();
        
        miColaCircular.agregarACola(1500);
        miColaCircular.agregarACola(2500);

        miColaCircular.imprimir();

    }

}

class ColaCircular {

    private int punteroInicial;
    private int punteroFinal;
    private int numeroDigitosAgregados;
    private int tamano;
    private int misElementos[];

    public ColaCircular(int tamano) {
        this.tamano = tamano;
        this.misElementos = new int[this.tamano];
        this.punteroInicial = 0;
        this.punteroFinal = 0;
        this.numeroDigitosAgregados = 0;
    }

    public void agregarACola(int numeroNuevo) {

        if (!estaLLeno()) {

            this.misElementos[calculaPosicionDeNuevoElemento()] = numeroNuevo;
            this.numeroDigitosAgregados++;

            if (this.punteroFinal < this.tamano) {
                this.punteroFinal++;
            } else {
                this.punteroFinal = 0;
            }

        } else {
            System.out.println("La cola esta llena");
        }

    }

    public int sacarDeLaCola() {

        if (!estaVacio()) {

            int numeroSacado = this.misElementos[this.punteroInicial];
            this.nuevaPosicionInicial();
            this.numeroDigitosAgregados--;
            return numeroSacado;

        } else {
            System.out.println("La cola esta vacia");
            return -1;
        }

    }

    public void imprimir() {

        if (!estaVacio()) {
            for (int i = this.punteroInicial; i < this.tamano; i++) {
                System.out.println(this.sacarDeLaCola());
            }
            for (int j = 0; j < this.punteroFinal+1 && this.estaVacio() == false; j++) {
                System.out.println(this.sacarDeLaCola());
            }
        }

    }

    private void nuevaPosicionInicial() {
        this.punteroInicial = (this.punteroInicial + 1) % this.tamano;
    }

    // Calculamos en que posicion debe ir el nuevo elemento que queremos agregar
    private int calculaPosicionDeNuevoElemento() {
        return (this.punteroInicial + this.numeroDigitosAgregados) % this.tamano;
    }

    private boolean estaVacio() {
        return this.numeroDigitosAgregados == 0;
    }

    private boolean estaLLeno() {
        return this.numeroDigitosAgregados == this.tamano;
    }

}
