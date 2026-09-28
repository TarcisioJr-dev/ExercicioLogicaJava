import java.util.Scanner;

// Exercício 05 de 100;

public class conversaoMedidas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("--- Conversão de medidas ---");
        System.out.println("Informe o valor em metros: ");
        float metro = entrada.nextFloat();

        float centimetros = metro * 100;
        float milimetros = metro * 1000;

        System.out.println("Metros: "+metro);
        System.out.println("Centímetros: "+ centimetros);
        System.out.println("Milímetros: "+ milimetros);

        entrada.close();
    }
}
