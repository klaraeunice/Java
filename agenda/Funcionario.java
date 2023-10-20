package agenda;

public class Funcionario extends Pessoa  {
    private float salario;

    public Funcionario (String nome, String email, String telefone, int idade, String sexo, float salario){
        super(idade, nome, idade, email, sexo);
        this.salario = salario;
    }
    public float getSalario(){
        return salario;
    }
    public void setSalario(float salario){
        this.salario = salario;
    }
}
