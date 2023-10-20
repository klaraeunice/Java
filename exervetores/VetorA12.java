package exervetores;
import java.util.Scanner;
/*
*12.Criar um vetor A com 10 elementos inteiros. 
*Implementar um programa que defina e escreva a soma de todos os elementos armazenados neste vetor. 
*/
public class VetorA12 {
    public  static void main (String [] args){
        int [] A = new int[10];
        int soma = 0;

        Scanner teclado = new Scanner (System.in);

        for (int i = 0; i < A.length; i++){
            System.out.print("Elemento " +( i + 1) + ": ");
            A[i] = teclado.nextInt();
        }
        
        for ( int i = 0; i < A.length; i++){
            soma += A[i];
        }
        System.out.println("soma: " + soma);

        teclado.close();
    }
}
