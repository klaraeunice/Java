
package agenda;

import java.util.Scanner;

public class MainPessoa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Agenda agenda = new Agenda(5);
        String nome;
        int telefone;
        int idade;
        String email;
        String sexo;

        for (int i = 0; i < 5; ++i) {
            System.out.print("telefone: ");
            telefone = in.nextInt();
            System.out.print("idade: ");
            idade = in.nextInt();
            in.nextLine();
            System.out.print("nome: ");
            nome = in.nextLine();
            System.out.print("email: ");
            email = in.nextLine();
            System.out.print("sexo: ");
            sexo = in.nextLine();

            agenda.add(new Pessoa(idade,nome, telefone, email, sexo ));
        }

        System.out.println("Pessoa mais nova: " + (agenda.getNomeMaisNova()));
        in.close();
    }
}