import java.util.Scanner;

// Exercício 06 de 100;

public class AreaPerimetroRetangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("--- Área e perímetro do retângulo ---");
        System.out.println("Informe a Largura: ");
        float largura = entrada.nextFloat();
        System.out.println("Informe a Altura: ");
        float altura = entrada.nextFloat();

        float area = largura * altura;
        float perimetro = 2 * (largura + altura);

        System.out.println("\nLargura: " + largura);
        System.out.println("Altura: " + altura);

        System.out.println("\nÁrea: "+ area);
        System.out.println("Perímetro: "+ perimetro +"\n");

        entrada.close();
    }
}
