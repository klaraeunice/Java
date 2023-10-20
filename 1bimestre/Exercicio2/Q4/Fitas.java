package Q4;

// Deve haver um método
// para que um programa "fora" da classe descubra o título da fita e o preço do aluguel por dia. 
//Além do mais, deve haver um método público getValorAluguel(int numeroDeDiasAlugada) que retorne o valor
//do aluguel desta fita se ela for alugada em um certo número de dias (este número de dias é passado como parâmetro). 
//Faça também o método toString(), para retornar a versão textual do objeto.
//Escreva uma classe principal, onde você deve criar algumas fitas e mostrar os dados de cada uma.

public class Fitas {
    private String titulo;
    private float aluguel;

    public Fitas(String titulo, float aluguel) {
        this.titulo = titulo;
        this.aluguel = aluguel;
    }

    public void getValorAluguel(int numeroDeDiasAlugada) {

        float valor = aluguel * numeroDeDiasAlugada;
        System.out.println("o valor do aluguel: " + valor);
    }

    // public void dados() {
    // System.out.println(getTitulo());
    // System.out.println(getAluguel());

    // }

    public String toString() {
        return "Filme: " + titulo + "\nPreço do Aluguel: " + aluguel;
    }

}
