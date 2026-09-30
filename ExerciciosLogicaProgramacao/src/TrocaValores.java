import java.util.Scanner;

// Exercício 14 de 100;

public class TrocaValores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int aux;

        System.out.println("--- Troca de Valores ---");
        System.out.println("Digite o primeiro valor: ");
        int A = entrada.nextInt();
        System.out.println("Digite o segundo valor: ");
        int B = entrada.nextInt();

        System.out.println("\nA: "+A);
        System.out.println("B: "+B);
        
        aux = A;
        A = B;
        B = aux;
        
        System.out.println("\nDepois da troca:");
        System.out.println("A: "+A);
        System.out.println("B: "+B);

        entrada.close();
    }

    
}
