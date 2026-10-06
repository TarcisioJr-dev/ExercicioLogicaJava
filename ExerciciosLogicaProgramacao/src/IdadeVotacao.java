import java.util.Scanner;

// Exercício 23 de 100;

public class IdadeVotacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("--- Categoria de Votação ---");
        System.out.print("Idade: ");
        int idade = entrada.nextInt();

        if (idade < 16) {
            System.out.println("NÃO PODE VOTAR");
        }else if (idade < 18 || idade >= 70) {
            System.out.println("VOTO OPCIONAL");
        }else{
            System.out.println("VOTO OBRIGATÓRIO");
        }

        entrada.close();
    }
}
