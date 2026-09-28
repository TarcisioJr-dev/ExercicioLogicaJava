import java.util.Scanner;

// Exercício 10 de 100;

public class SalarioComissao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o salario fixo: ");
        float salarioFixo = entrada.nextFloat();
        System.out.println("Informe as vendas: ");
        float vendas = entrada.nextFloat();

        float comissao = vendas * 4 / 100;
        float salarioTotal = salarioFixo + comissao;

        System.out.println("\nSalário fixo:  R$ " + salarioFixo);
        System.out.println("Total Vendido: R$ " + vendas);
        System.out.println("\nComissão:      R$ " + comissao);
        System.out.println("Salário total: R$ " + salarioTotal +"\n\n");

        entrada.close();
    }
}
