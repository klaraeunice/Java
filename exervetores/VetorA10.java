package exervetores;
import java.util.Scanner;
public class VetorA10 {

/*
*10.Criar um vetor A com 10 elementos inteiros. 
*Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá ser o resto da divisão do respectivo elemento de A por 2 (dois), ou seja: B[i] := A[i] % 2. 
*/
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
        
        for (int i = 0; i < A.length; i++){
            B[i] = A[i] % 2;
          }


  //saida dos elementos de c
  System.out.println ("\nElementos do vetor B\n ");

    for (int i = 0; i < A.length; i++ ){
      System.out.println("Elemento " +(i+1) + ": " + B[i]);
  }

 teclado.close();
}
}         