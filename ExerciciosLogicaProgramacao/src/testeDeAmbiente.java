import java.util.Scanner;
public class testeDeAmbiente {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = entrada.nextLine();

        System.out.println("\nOlá, "+nome+"! Seu ambiente está funcionando.");

        entrada.close();
    }
}
