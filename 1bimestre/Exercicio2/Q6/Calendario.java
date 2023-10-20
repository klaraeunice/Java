package Q6;

public class Calendario {

    // atributos
    private int dia;
    private int mes;
    private int ano;
    // private String m;

    // construtor
    public Calendario(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // metodos
    public void nomeMes(int mes) {
        String m = "";
        switch (mes) {
            case 1:
                m = "janeiro";
                break;

            case 2:
                m = "fevereiro";

            case 3:
                m = "Março";

            case 4:
                m = "abril";
            case 5:
                m = "maio";
            case 6:
                m = "junho";
            case 7:
                m = "julho";
            case 8:
                m = "agosto";
            case 9:
                m = "setembro";
            case 10:
                m = "outubro";
            case 11:
                m = "novembro";
            case 12:
                m = "dezembro";
        }

        System.out.println("mês de " + m);
    }

    public void mostrarData() {
        System.out.println(dia + " do " + mes + " de " + ano);

    }

    // criar um mostrar data usando a int mes

    public void anoBissexto() {
        double divisivel = (ano % 4);
        if (divisivel == 0) {
            System.out.println(ano + " é bissexto ");
        } else {
            System.out.println(ano + " não é bissexto ");
        }

    }

}