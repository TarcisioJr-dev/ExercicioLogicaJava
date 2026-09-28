import java.util.Scanner;

// Exercício 09 de 100;

public class reajusteSalarial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("--- Reajuste Salarial ---");
        System.out.println("Informe o salario atual: ");
        float salarioAtual = entrada.nextFloat();

        float aumento = salarioAtual * 15 / 100;
        float novoSalario = salarioAtual + aumento;

        System.out.println("\nSalário atual: R$"+ salarioAtual);
        System.out.println("\nAumento: R$" + aumento);
        System.out.println("Novo salário: R$"+ novoSalario + "\n\n");

        entrada.close();
    }
}