import java.util.Scanner;

// Exercício 18 de 100;

public class MaiorDeDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Maior de Dois Números ---");
        System.out.print("Digite o primeiro Valor: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber == secondNumber) {
            System.out.println("\nMaior valor: VALORES IGUAIS");
        }else if (firstNumber > secondNumber) {
            System.out.println("\nMaior valor: "+ firstNumber);
        }else{
            System.out.println("\nMaior valor: "+ secondNumber);
        }

        scanner.close();
    }
}
