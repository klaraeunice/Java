package agenda;

public class Aluno extends Pessoa{
    private String matricula;
    private int nota1;
    private int nota2;

    public Aluno (String nome, int telefone, int idade,String email, String sexo, String matricula, int nota1, int nota2 ){
        super(telefone, nome, idade, email, sexo);
        this.matricula = matricula;
        this.nota1 = 0;
        this.nota2 = 0;
    }
    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public int getNota1(){
        return nota1;
    }
    public void setNota1 (int nota1){
        this.nota1 = nota1;
    }
    public int getNota2(){
        return nota2;
    }
    public void setNota2(int nota2){
        this.nota2 = nota2;
    }
}
