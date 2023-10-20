package attporta;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    String cor = teclado.nextLine();
    Float altura = teclado.nextFloat();
    teclado.nextLine();
    Float largura = teclado.nextFloat();
    teclado.nextLine();
    Boolean estaAberta = teclado.nextBoolean();
    teclado.nextLine();

    Porta p = new Porta(cor, altura, largura, estaAberta);

    System.out.println(p.toString());

      teclado.close();
  }

}
