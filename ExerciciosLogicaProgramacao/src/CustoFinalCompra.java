import java.util.Scanner;

// Exercício 15 de 100;

public class CustoFinalCompra {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("--- Custo final da compra ---");
        System.out.println("Preço unitário: ");
        float precoUnit = entrada.nextFloat();
        System.out.println("Quantidade: ");
        int quantidade = entrada.nextInt();
        System.out.println("Frete: ");
        float frete = entrada.nextFloat();

        float subTotal = precoUnit * quantidade;
        float total = subTotal + frete;

        System.out.println("\nPreço unitário: R$ "+precoUnit);
        System.out.println("Quantidade: "+quantidade);
        System.out.println("Frete: R$ "+ frete);
        System.out.println("\nSubtotal: R$ "+subTotal);
        System.out.println("Total: R$ "+total);

        entrada.close();
    }
}
