package exervetores;
import java.util.Scanner;

public class VetorA11 {
/*
*11.Criar um vetor A com 10 elementos inteiros. 
*Implementar um programa que defina e escreva a quantidade de elementos armazenados neste vetor que são pares. 
*/
    public static void main (String [] args){

        Scanner teclado = new Scanner(System.in);

        int [] A = new int [10];
        int contador = 0;

        System.out.println("Digite os 10 elementos de A: ");

        //entrada de usuario
        for (int i = 0; i < A.length; i++){
            System.out.print("Elemento " +( i + 1) + ": ");
            A[i] = teclado.nextInt();
        }
        
        
        for (int i = 0; i <A.length; i++){ 
        if (A[i] % 2 == 0 ){
            contador++;
        }
        }
        System.out.println("pares: " + contador);
        teclado.close();
    } 
}
