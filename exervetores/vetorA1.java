
package exervetores;
import java.util.Scanner;
public class vetorA1 {
    /*
     * Criar um vetor A com 5 elementos inteiros. 
     * Construir um vetor B de mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou seja, B[i] = A[i]. 
     */

  public static void main(String [] args){

    //abre scanner
    Scanner teclado = new Scanner (System.in);

    //cria vetor A
    int [] A = new int [5];
    //cria vetor B
    int [] B = new int [A.length];


    //entrada dos elementos do vetor A
      System.out.println("Digite os elementos de A\n ");

    for (int i = 0; i < A.length; i++){
      System.out.print("elemento " + (i + 1) + ": ");
      A[i] = teclado.nextInt();
    }
    //copia os elementos de A para B.
    for (int i=0; i < A.length; i++){
      B[i] = A[i];
    };

    //saida dos elementos do vetor b
    System.out.println("\nELementos de B\n");
    
    for(int i = 0; i < A.length; i++){
      System.out.println("elemento "+ (i + 1) +": " + B[i]);
    }

   //fecha scanner
   teclado.close(); 
}         

}

/*
 * vrgd
 *? 
 */