package AttTV;

public class Tv {

    // atributos
    private double canal;
    private float volume;
    private boolean ligado;

    // construtores
    public Tv(double canal, float volume, boolean ligado) {

        this.canal = canal;
        this.volume = volume;
        this.ligado = ligado;
    }

    // metodos
    public void ligar() {
        ligado = true;
    }

    public void desligar() {
        ligado = false;
    }

    public void aumentarVolume() {
        if (volume < 100) {
            volume = volume + 1;
        }
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }

    public void trocarCanal(double canal) {
        if (canal < 0) {
            this.canal = canal;
        }

    }

    public String toString() {
        String ligada = "Não";
        if (ligado == true) {
            ligada = "Sim";
        }

        return " canal: " + canal + " volume: " + volume + " ligada: " + ligada;

    }

}
