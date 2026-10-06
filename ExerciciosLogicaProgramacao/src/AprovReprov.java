import java.util.Scanner;

// Exercício 21 de 100;

public class AprovReprov {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("--- Aprovado ou Reprovado ---");
        System.out.print("Nota 1: ");
        float nota1 = entrada.nextFloat();
        System.out.print("Nota 2: ");
        float nota2 = entrada.nextFloat();

        float media = (nota1 + nota2) / 2;

        System.out.println("\nMédia: " + media);

        if (media >= 7.0) {
            System.out.println("Situação: APROVADO");
        }else{
            System.out.println("Situação: REPROVADO");
        }

        entrada.close();
    }
}
