package Q5;

//float calculaSalarioLiquido(). O cálculo é o salário bruto descontado 11% do INSS.

//Na classe principal, crie um funcionário e logo em seguida, mostre seus dados iniciais. Após alterar seu salário por um valor digitado pelo usuário, calcule seu salário líquido, mostrando novamente suas informações, inclusive este último dado.

public class Funcionario {
    private int codigo;
    private String nome;
    private long CPF;
    private String endereco;
    private int telefone;
    private int idade;
    private float salario;

    // construtor
    public Funcionario(int codigo, String nome, long CPF, String endereco, int telefone, int idade, float salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
        this.telefone = telefone;
        this.idade = idade;
        this.salario = salario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;

    }

    public String getNome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;

    }

    public long getCPF() {
        return CPF;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;

    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;

    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;

    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;

    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;

    }

    public void estado() {

        System.out.println("Dados do funcionário:");
        System.out.println(" Código: " + getCodigo());

        System.out.println(" Nome: " + getNome());

        System.out.println(" CPF: " + getCPF());

        System.out.println(" Endereço: " + getEndereco());

        System.out.println(" Telefone: " + getTelefone());

        System.out.println(" Idade: " + getIdade());

        System.out.println(" Salário: " + getSalario());
        System.out.println(" Salário líquido: " + calculaSalarioLiquido());
    }

    public float calculaSalarioLiquido() {
        return salario - (salario * 11 / 100);
    }
}
