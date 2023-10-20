package AttTV;

//import AttTV.Tv;

public class MainTv {
    public static void main(String[] args) {
        Tv tv1 = new Tv(22, 44, true);
        ControleRemoto control = new ControleRemoto(tv1);

        tv1.ligar();
        control.ligar();
        tv1.aumentarVolume();

        System.out.println(tv1.toString());

        tv1.trocarCanal(5);
        tv1.diminuirVolume();
        tv1.diminuirVolume();
        tv1.diminuirVolume();
        tv1.diminuirVolume();

        System.out.println(tv1.toString());

        tv1.desligar();

        System.out.println(tv1.toString());

    }
}
