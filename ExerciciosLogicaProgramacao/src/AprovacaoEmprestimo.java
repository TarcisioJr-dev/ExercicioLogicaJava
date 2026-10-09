import java.util.Scanner;

// Exercício 30 de 100;

public class AprovacaoEmprestimo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String resultado = "";

        System.out.println("--- Aprovação de Empréstimo ---");
        System.out.print("Qual o valor do imóvel: R$ ");
        float valorImovel = entrada.nextFloat();
        System.out.print("Informe seu salário: R$ ");
        float salarioImovel = entrada.nextFloat();
        System.out.print("Qual prazo para pagamento: ");
        int anos = entrada.nextInt();

        float prestacao = valorImovel / (anos * 12);
        
        float TrintaCentoSalario = salarioImovel * 30 / 100;

        if (TrintaCentoSalario >= prestacao) {
            resultado = "APROVADO\n";
        }else{
            resultado = "NEGADO\n";
        }

        System.out.println("\n\nValor do imóvel: R$ "+valorImovel);
        System.out.println("Salário: R$ "+salarioImovel);
        System.out.println("Prazo: "+anos+" anos");

        System.out.println("\nPrestação: R$ "+prestacao);
        System.out.println("Limite: R$ "+TrintaCentoSalario);
        System.out.println("Resultado: "+ resultado);

        entrada.close();
    }
}
