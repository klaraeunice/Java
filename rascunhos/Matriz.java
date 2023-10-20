package rascunhos;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // //int matriz = teclado.nextInt(); teclado.nextLine();

        int[][] matriz = new int[5][5];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                System.out.printf("Digite o %d° número da %d° linha: ", coluna + 1, linha + 1);
                matriz[linha][coluna] = teclado.nextInt();

            }
        }

        for (int linha = 0; linha < matriz.length; linha++) {
            System.out.println();

            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {

                System.out.printf("%2d ", matriz[linha][coluna]);
                teclado.close();

            }

        }
    }
}