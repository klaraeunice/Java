package Q1;

import java.util.Scanner;

public class MainQuadrado {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        float lado = teclado.nextInt();
        teclado.nextLine();

        Quadrado Q1 = new Quadrado(lado);

        Q1.imprimir();
        teclado.close();
    }
}