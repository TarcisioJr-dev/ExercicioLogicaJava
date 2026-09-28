import java.util.Scanner;
// Exercício 01 de 100
public class somaDoisNum {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("+++++ Soma Dois Números +++++");
        System.out.println("Digite o primeiro número: ");
        int num1 = entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = entrada.nextInt();

        int soma = num1 + num2;

        System.out.println("A soma é: "+soma);

        entrada.close();
    }
}
