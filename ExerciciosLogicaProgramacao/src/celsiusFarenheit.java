import java.util.Scanner;

// Exercício 07 de 100;

public class celsiusFarenheit {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("--- Conversão Celsius para Fahrenheit ---");
        System.out.println("Digite a temperatura em Celsius: ");
        float celsius = entrada.nextFloat();

        float farenheit = celsius * 9 / 5 + 32;

        System.out.println("Temperatura em ºC: " + celsius);
        System.out.println("Temperatura em ºF: " + farenheit);

        entrada.close();
    }
}
