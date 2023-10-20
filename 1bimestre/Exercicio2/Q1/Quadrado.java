package Q1;
public class Quadrado{
    // Atributo
    private float lado;
    

// Construtor
public Quadrado(float lado) {
    this.lado = lado;
}

// Métodos
public float calcularArea() {
    return lado*lado;
    
}

public float calcularPerimetro(){
    return lado*4;
   
}

public void imprimir() {
    System.out.println("Area = " + calcularArea());
    System.out.println("Perímetro = " + calcularPerimetro());
}
}



//Escreva um código em Java que apresente a classe Quadrado, 
//com o atributo lado e os métodos calcularArea, calcularPerimetro e imprimir.
//O método imprimir deve mostrar na tela os valores do lado, e da área e do perímetro calculados. 
//Salienta-se que a área de um quadrado é obtida pela fórmula (lado * lado) e o perímetro por (4 * lado).
//Crie uma classe principal para testar a classe Quadrado.
