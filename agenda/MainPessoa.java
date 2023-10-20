
package agenda;

import java.util.Scanner;

public class MainPessoa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Agenda agenda = new Agenda(5);
        String nome;
        int telefone;
        int idade;

        for (int i = 0; i < 5; ++i) {
            System.out.print("telefone: ");
            telefone = in.nextInt();
            System.out.print("idade: ");
            idade = in.nextInt();
            in.nextLine();
            System.out.print("nome: ");
            nome = in.nextLine();

            agenda.add(new Pessoa(idade, nome, telefone));
        }

        System.out.println("Pessoa mais nova: " + (agenda.getNomeMaisNova()));
        in.close();
    }
}