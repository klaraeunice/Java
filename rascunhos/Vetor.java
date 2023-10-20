package rascunhos;
import java.util.Scanner;

public class Vetor {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // //int vetorVariavel = teclado.nextInt(); teclado.nextLine();

        int[] vetorVariavel = new int[5];

        /*
         * quando usado print: Digite um numero: 4
         * quando usado println: Digite um numero:
         * 4
         */

         /*
          * for() = palavra que indica que é um laço de repetição ao compilador
          * int i = 0; = está declarando uma variável do tipo inteiro chamada i e atribuindo 0 a ela.
          * i < vv.length; = é a condição, como se fosse o if. enquanto = true, o laço continuará executando.
          * i++ = 
          */

        for (int i = 0; i < vetorVariavel.length; i++) {
            System.out.print("Digite um numero: ");
            vetorVariavel[i] = teclado.nextInt();
        }

        System.out.println();

        for (int i = vetorVariavel.length - 1; i >= 0; i--) {

            System.out.println(vetorVariavel[i]);
        }
        teclado.close();


    }
}

