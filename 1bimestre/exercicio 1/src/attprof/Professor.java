package attprof;

public class Professor {

    // atributos
    private int matricula;
    private String nome;
    private String departamento;

    // construtores
    public Professor(int matricula, String nome, String departamento) {
        this.matricula = matricula;
        this.nome = nome;
        this.departamento = departamento;
    }

    // metodos
    public int getMatricula() {
        return matricula;
    }

    public void SetMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setMatricula(int i) {
    }

    public String toString() {
        return "Nome: " + nome + " Matrícula: " + matricula + " Departamento: " + departamento;
    }
}
