package agenda;


public class Agenda {
    private Pessoa [] pessoas;
    private int capacidade;

    public Agenda(int capacidade) {
        this.capacidade = 0;
        this.pessoas = new Pessoa[capacidade];
    }

    public boolean add(Pessoa p) {
        if (capacidade == this.pessoas.length)
            return false;
        this.pessoas[this.capacidade++] = p;
        return true;
    }

    public String getNomeMaisNova() {
        if (this.capacidade == 0)
            return null;
        Pessoa menor = this.pessoas[0];
        for (Pessoa p : this.pessoas) {
            if (p.getIdade() < menor.getIdade())
                menor = p;
        }
        return menor.getNome();
    
    }

}
