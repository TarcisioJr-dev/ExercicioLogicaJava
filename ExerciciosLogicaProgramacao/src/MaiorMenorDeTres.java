import java.util.Scanner;

// Exercício 19 de 100;

public class MaiorMenorDeTres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int maior;
        int menor;

        System.out.println("--- Maior e Menor de Três números ---");
        System.out.print("Digite o primeiro número: ");
        int primNumero = entrada.nextInt();
        System.out.print("Digite o segundo número: ");
        int segNumero = entrada.nextInt();
        System.out.print("Digite o terceiro número: ");
        int tercNumero = entrada.nextInt();

        maior = primNumero;
        menor = primNumero;

        if (primNumero < segNumero) {
            maior = segNumero;
        }else if (primNumero < tercNumero) {
            maior = tercNumero;
        }

        if (primNumero > segNumero) {
            menor = segNumero;
        }else if (primNumero > tercNumero) {
            menor = tercNumero;
        }

        System.out.println("\nMaior: "+ maior);
        System.out.println("Menor: "+ menor);

        entrada.close();
    }
}
