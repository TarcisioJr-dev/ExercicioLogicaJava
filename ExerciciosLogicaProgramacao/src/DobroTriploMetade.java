import java.util.Scanner;

// Exercício 04 de 100;

public class DobroTriploMetade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("--- Dobro, triplo e metade ---");
        System.out.println("Digite um valor: ");
        float numero = entrada.nextFloat();

        float dobro = numero * 2;
        float triplo = numero * 3;
        float metade = numero / 2;

        System.out.println("Dobro: \t"+ dobro);
        System.out.println("Triplo:\t" + triplo);
        System.out.println("Metade:\t" + metade);

        entrada.close();
    }
}
