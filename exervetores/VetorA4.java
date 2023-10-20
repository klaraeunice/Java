package exervetores;
import java.util.Scanner;
public class VetorA4 {
/*
*4. Criar um vetor A com 15 elementos inteiros. 
*Construir um vetor B de mesmo tamanho, sendo que cada elemento do vetor B deverá ser a raiz quadrada do respectivo elemento de A, ou seja: B[i] = sqrt(A[i]). 
 */
//criar um vetor A com 5 elementos inteiros
  public static void main(String [] args) {

  //cria scanner
  Scanner teclado = new Scanner(System.in);

  int [] A = new int [15];
  int [] B = new int [A.length];

  System.out.println("Digite os 15 elementos de A: ");

  //entrada de usuario
  for (int i = 0; i < A.length; i++){
    System.out.print("Elemento " +( i + 1) + ": ");
    A[i] = teclado.nextInt();
  }

  //copia elementos de B para A
  for (int i = 0; i < A.length; i++){
    B[i] = ( int) Math.sqrt (A[i]);
  }


  //saida dos elementos de B
  System.out.println ("\nElementos do vetor B\n ");

    for (int i = 0; i < A.length; i++ ){
      System.out.println("Elemento " +(i+1) + ": " + B[i]);
  }
  teclado.close();
}
}         