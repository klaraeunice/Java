package Q3;

import java.util.Scanner;

public class MainCircle {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        float raio = teclado.nextInt();
        teclado.nextLine();

        Circle c1 = new Circle(raio);
        c1.imprimir();
        teclado.close();
    }
}
