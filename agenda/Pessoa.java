package agenda;

public class Pessoa {

    private String nome;
    private int telefone;
    private int idade;
    private String email;
    private String sexo;

    public Pessoa(int idade, String nome, int telefone, String email, String sexo) {
        this.idade = idade;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone (int telefone) {
        this.telefone = telefone;
    }
        public String getEmail() {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }
    public String getSexo() {
        return sexo;
    }

    public void setSexo (String sexo) {
        this.sexo = sexo;
    }


    public String imprimir(){
        return String.format("%s %d %s", nome, idade, telefone);
    }
}
