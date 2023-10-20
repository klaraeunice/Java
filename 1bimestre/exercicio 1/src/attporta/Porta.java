package attporta;

public class Porta {

    // atributos
    private String cor;
    private float altura, largura;
    private boolean estaAberta;

    // construtores
    public Porta(String cor, float altura, float largura, boolean estaAberta) {
        this.cor = cor;
        this.altura = altura;
        this.largura = largura;
        this.estaAberta = estaAberta;
    }

    // metodos
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public boolean getEstaAberta() {
        return estaAberta;
    }

    public void setEstaAberta(boolean estaAberta) {
        this.estaAberta = estaAberta;
    }

    public String toString() {

        String aberta = "não";
        if (estaAberta = true) {
            aberta = "sim";
        }
        return " Qual a cor da porta? " + cor + ", qual a altura estimada? " + altura
                + ", e a largura? " + largura + ", e por fim, a porta está aberta? " + aberta;
    }
}
