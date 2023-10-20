package AttTV;

public class ControleRemoto {
    private Tv tv1;

    public ControleRemoto(Tv tv1) {
        this.tv1 = tv1;
    }

    public void ligar() {
        tv1.ligar();
    }

    public void desligar() {
        tv1.desligar();
    }

    public void aumentarVolume() {
        tv1.aumentarVolume();
    }

    public void diminuirVolume() {
        tv1.diminuirVolume();
    }

    public void trocarCanal(double canal) {
        tv1.trocarCanal(canal);
    }

    public String toString() {
        return "t: " + tv1.toString();
    }

}