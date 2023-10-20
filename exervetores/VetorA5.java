
package exervetores;
import java.util.Scanner;

public class VetorA5 {
/*
*5. Criar um vetor A com 10 elementos inteiros.
* Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá ser o respectivo elemento de A multiplicado por sua posição (ou índice), ou seja: B[i] = A[i] * i. 
*/
//criar um vetor A com 5 elementos inteiros
    public static void main(String [] args) {

            //cria scanner
          Scanner teclado = new Scanner(System.in);

        int [] A = new int [10];
        int [] B = new int [A.length];

        System.out.println("Digite os 10 elementos de A: ");

        //entrada de usuario
        for (int i = 0; i < A.length; i++){
            System.out.print("Elemento " +( i + 1) + ": ");
            A[i] = teclado.nextInt();
        }

        //copia elementos de B para A
        for (int i = 0; i < A.length; i++){
            B [i] = A [i] * i;
          }


  //saida dos elementos de B
  System.out.println ("\nElementos do vetor B\n ");

    for (int i = 0; i < A.length; i++ ){
      System.out.println("Elemento " +(i+1) + ": " + B[i]);
  }
        teclado.close();
    }
}         
