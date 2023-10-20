package Q5;

import java.util.Scanner;

public class MainQ5 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    int codigo = teclado.nextInt();
    teclado.nextLine();
    String nome = teclado.nextLine();
    long CPF = teclado.nextLong();
    teclado.nextLine();
    String endereco = teclado.nextLine();
    int telefone = teclado.nextInt();
    teclado.nextLine();
    int idade = teclado.nextInt();
    teclado.nextLine();
    float salario = teclado.nextFloat();
    teclado.nextLine();

    Funcionario Peu = new Funcionario(codigo, nome, CPF, endereco, telefone, idade, salario);
    Peu.estado();
    teclado.close();

  }

  /*
   * private int codigo;
   * private String nome;
   * private long CPF;
   * private String endereco;
   * private int telefone;
   * private int idade;
   * private float salario;
   */
}
