package Q2;

import java.util.Scanner;

public class MainRetangulo {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    float comprimento = teclado.nextInt();
    teclado.nextLine();
    float largura = teclado.nextInt();
    teclado.nextLine();

    Retangulo R1 = new Retangulo(comprimento, largura);
    R1.imprimir();
    teclado.close();;
  }
}
