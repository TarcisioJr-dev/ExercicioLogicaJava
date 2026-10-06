import java.util.Scanner;

// Exercício 24 de 100;

public class Bissexto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("--- Ano Bissexto ---");
        System.out.print("Ano: ");
        int ano = entrada.nextInt();

        if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
            System.out.println("\nResultado: ANO BISSEXTO");
        }else{
            System.out.println("\nResultado: NÃO BISSEXTO");
        }

        entrada.close();
    }
}
