import java.util.Scanner;

// Exercício 03 de 100;

public class AntecessorSucessor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("--- Programa para mostrar Antecessor e Sucessor ---");
        System.out.println("Digite um Número: ");
        int numero = entrada.nextInt();

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("Antecessor: "+ antecessor);
        System.out.println("Número: "+ numero);
        System.out.println("Sucessor: "+ sucessor);

        entrada.close();
    }
}
