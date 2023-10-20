package exervetores;
import java.util.Scanner;
public class VetorA7 {
/*
*7. Criar dois vetores A e B cada um com 10 elementos inteiros. 
*Construir um vetor C, onde cada elemento de C é a subtração dos respectivos elementos em A e B, ou seja: C[i] = A[i] – B[i]. 
*/
//criar um vetor A com 5 elementos inteiros
    public static void main(String [] args) {
    
            //cria scanner
        Scanner teclado = new Scanner(System.in);

        int [] A = new int [10];
        int [] B = new int [A.length];
        int [] C = new int [A.length];

        System.out.println("Digite os 10 elementos de A: ");

        //entrada de usuario
        for (int i = 0; i < A.length; i++){
            System.out.print("Elemento " +( i + 1) + ": ");
            A[i] = teclado.nextInt();
        }

        System.out.println("Digite os 10 elementos de B: ");
        //entrada de usuario
        for (int i = 0; i < A.length; i++){
            System.out.print("Elemento " +( i + 1) + ": ");
            B[i] = teclado.nextInt();
        }
        
        for (int i = 0; i < A.length; i++){
            C[i] = A[i] - B[i];
          }

  //saida dos elementos de c
  System.out.println ("\nElementos do vetor C\n ");

    for (int i = 0; i < A.length; i++ ){
      System.out.println("Elemento " +(i+1) + ": " + C[i]);
  }

        teclado.close();
    }
}         