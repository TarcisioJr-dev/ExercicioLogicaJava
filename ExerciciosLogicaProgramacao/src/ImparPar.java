import java.util.Scanner;

// Exercício 17 de 100;

public class ImparPar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String resultado;

        System.out.println("----- Par ou ímpar -----");
        System.out.println("Digite um número: ");
        int numero = entrada.nextInt();

        if (numero % 2 == 0) {
            resultado = "PAR";
        }else{
            resultado = "ÍMPAR";
        }

        System.out.println("\nResultado: " + resultado);

        entrada.close();
    }
}
