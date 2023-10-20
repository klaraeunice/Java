package agenda;

public class Professor extends Funcionario{
    private String disciplina;
    
    public Professor (String nome, String email, String telefone, int idade, String sexo, float salario, String disciplina){
        super(nome, email, telefone, idade, sexo, salario);
        this.disciplina = disciplina;
    }

    public String getDisciplina(){
        return disciplina;
    }
    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }
}
