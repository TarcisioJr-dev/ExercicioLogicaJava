import java.util.Scanner;

// Exercício 08 de 100;

public class DescontoProduto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("--- Desconto no produto ---");

        System.out.println("Informe o preço: ");
        float preco = entrada.nextFloat();

        float desconto = preco * 10 / 100;
        float precoFinal = preco - desconto;

        System.out.println("\nPreço:     R$" + preco);
        System.out.println("\nDesconto:  R$" + desconto);
        System.out.println("Preço final: R$" + precoFinal);

        entrada.close();
    }
}
