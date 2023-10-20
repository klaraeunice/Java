package Q4;

import java.util.Scanner;

public class MainFitas {
    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);

        String titulo =  teclado.nextLine(); 
        float aluguel = teclado.nextFloat(); teclado.nextLine();

        Fitas F1 = new Fitas (titulo,aluguel);

        F1.getValorAluguel(4);
        System.out.println(F1.toString());

        Fitas F2 = new Fitas("xman", 53);
        F2.getValorAluguel(23);
        System.out.println(F1.toString());

        Fitas F3 = new Fitas("laranja lima", 43);
        F3.getValorAluguel(355);
        System.out.println(F1.toString());
        teclado.close();


    }
}
