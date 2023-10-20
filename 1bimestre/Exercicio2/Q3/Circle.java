package Q3;

public class Circle {
    // este é o círculo
    private double raio;

    public Circle(double raio) {
        this.raio = raio;
    }

    // this is circle methods
    public double calcularArea() {
        return 3.141516 * raio * raio;
    }

    public double calcularPerimetro() {
        return 2 * 3.141516 * raio;
    }

    public void imprimir() {
        System.out.println(calcularArea());
        System.out.println(calcularPerimetro());
    }
}