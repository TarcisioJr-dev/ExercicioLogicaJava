import java.util.Scanner;

// Exercício 25 de 100;

public class FormaPagamento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float valorFinal = 0;
        System.out.println("-- Preço conforme a forma de Pagamento --");
        System.out.print("Informe o valor do produto: R$ ");
        float valorProd = entrada.nextFloat();
        System.out.println("\n1. Dinheiro ou Pix - 10% de desconto");
        System.out.println("2. Débito - 5% de desconto");
        System.out.println("3. Crédito à vista - Sem alteração");
        System.out.println("4. Crédito parcelado - 8% de acréscimo");
        System.out.print("\nEscolha a forma de pagamento: ");
        int formaPag = entrada.nextInt();

        switch (formaPag) {
            case 1: // Dinheiro ou Pix
                valorFinal = valorProd - ( valorProd * 10 / 100);
                break;
            case 2: // Débito
                valorFinal = valorProd - ( valorProd * 5 / 100);
                break;
            case 3:
                valorFinal = valorProd;
                break;
            case 4:
                valorFinal = valorProd + (valorProd * 8 / 100);
                break;
        
            default:
                System.out.println("[ERRO] Opção inválida.");
                break;
        }

        System.out.println("\nValor final: R$ "+valorFinal);

        entrada.close();

    }
}
