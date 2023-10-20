package Q6;

import java.util.Scanner;

public class Q6Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int dia = teclado.nextInt();
        teclado.nextLine();
        int mes = teclado.nextInt();
        teclado.nextLine();
        int ano = teclado.nextInt();
        teclado.nextLine();

        Calendario c1 = new Calendario(dia, mes, ano);
        Calendario c2 = new Calendario(dia, mes, ano);

        c1.nomeMes(3);
        c1.anoBissexto();
        c1.mostrarData();

        c2.anoBissexto();
        c2.nomeMes(4);
        c2.mostrarData();
        teclado.close();


    }
}
