package rascunhos.abstrato;

/* 
* Para resolver este exercício, primeiro vamos criar 
*uma classe abstrata (não pode ser instanciada) chamada Figura, que contém atributos e métodos em
*comum com todas as classes de Figura. Nós teremos um atributo cor do tipo String
* e dois métodos, um com retorno nulo setando a Cor e outro com retorno tipo String pegando a Cor. */

/*
 * highlighted
-- *! descontinuado
 --*? dúvida
  //TOD: REFAZER 
--// excluido
*/

public abstract class Figura {
    /*
     * atributos
     */
    private String cor;

    /*
     * métodos
     */

    public Figura() {

    }

    public Figura(String cor) {
        super();
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Figura [cor= " + cor + "]";
    }

    public abstract double area();
}