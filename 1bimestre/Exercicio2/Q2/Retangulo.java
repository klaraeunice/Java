package Q2;

//Escreva um código em Java que apresente a classe Retangulo, com atributos comprimento, largura e os métodos calcularArea, calcularPerimetro e imprimir. O método imprimir deve mostrar na tela os valores de todos os atributos, e da área e perímetro calculados. Salienta-se que a área de um retângulo é obtida pela fórmula (comprimento * largura) e o perímetro por (2 * comprimento) + (2 * largura). 
//Crie uma classe principal para testar a classe Quadrado.


public class Retangulo {

    //atributos
    private float comprimento;
    private float largura;

    //construtor
    public Retangulo(float comprimento, float largura){
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public float calcularArea(){
        return comprimento * largura;
    }

    public float calcularPerimetro(){
        return comprimento * 2 + largura * 2;
    }

    public void imprimir(){
        System.out.println(calcularArea());
        System.out.println(calcularPerimetro());
    }
}
