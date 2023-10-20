
package exervetores;
import java.util.Scanner;

public class vetorA2 {
/* 
* 2. Criar um vetor A com 8 elementos inteiros. 
*Construir um vetor B de mesmo tipo e tamanho e com os elementos do vetor A multiplicados por 2, ou seja: B[i] = A[i] * 2. 
 */
public static void main(String [] args) {

  //cria scanner
  Scanner teclado = new Scanner(System.in);

  //cria os vetores
  int [] A = new int [8];
  int [] B = new int [A.length];

  //entrada dos elementos de A
  System.out.println("Digite os 8 elementos de A\n ");

  for (int i = 0; i < A.length; i++){
    System.out.print("elemento " +( i + 1) + ": ");
    A[i] = teclado.nextInt();
  }

  //copia elementos de B para A
  for (int i = 0; i < A.length; i++){
    B [i] = A [i] *2;
  }

  //saida dos elementos de B
  System.out.println ("\nElementos do vetor B\n ");

    for (int i = 0; i < A.length; i++ ){
      System.out.println("elemento " +(i+1) + ": " + B[i]);
  }

teclado.close();
  }
}         