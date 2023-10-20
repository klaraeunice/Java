package exervetores;
import java.util.Scanner;

public class VetorA3 {
/* 
*3. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho,
*sendo que cada elemento do vetor B deverá ser o quadrado do respectivo elemento de A, ou seja: B[i] = A[i] * A[I] 
 */
public static void main(String [] args) {

  //cria scanner
  Scanner teclado = new Scanner(System.in);

  //cria os vetores
  int [] A = new int [15];
  int [] B = new int [A.length];

  //entrada dos elementos de A
  System.out.println("Digite os 15 elementos de A\n ");

  for (int i = 0; i < A.length; i++){
    System.out.print("Elemento " +( i + 1) + ": ");
    A[i] = teclado.nextInt();
  }

  //copia elementos de B para A
  for (int i = 0; i < A.length; i++){
      B [i] = A [i] * A[i];
  }

  //saida dos elementos de B
  System.out.println ("\nElementos do vetor B\n ");

    for (int i = 0; i < A.length; i++ ){
      System.out.println("Elemento " +(i+1) + ": " + B[i]);
  }

teclado.close();
  }
}         