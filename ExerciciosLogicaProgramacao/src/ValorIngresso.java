import java.util.Scanner;

// Exercício 35 de 100; pag 43

public class ValorIngresso {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float valorIngres = 30.00f;

        System.out.println("--- Valor do ingresso ---");
        System.out.print("Idade: ");
        int idadeIngres = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Estudante (Sim / Nao): ");
        String estudante = entrada.nextLine();
        String respEstud = estudante.toUpperCase();

        if (idadeIngres < 12 || idadeIngres > 60 || respEstud.equals("SIM")) {
            valorIngres -= 15;
        }

        System.out.println("Valor do ingresso: R$ "+valorIngres);

        entrada.close();
    }
}
