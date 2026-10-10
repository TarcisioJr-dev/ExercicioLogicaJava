import java.util.Scanner;

// Exercício 31 de 100;

public class DivisivelTresECinco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String resultado = "";

        System.out.println("--- Divisível por 3 e por 5 ---");
        System.out.print("Informe um número: ");
        int number = entrada.nextInt();

        if (number % 3 == 0 && number % 5 == 0) {
            resultado = "DIVISÍVEL POR 3 E 5\n";
        }else if (number % 3 == 0) {
            resultado = "DIVISÍVEL APENAS POR 3\n";
        }else if (number % 5 == 0) {
            resultado = "DIVISÍVEL APENAS POR 5\n";
        }else {
            resultado = "NÃO DIVISÍVEL POR 3 NEM 5\n";
        }

        System.out.println("\nNúmero: "+number);
        System.out.println("Resultado: "+resultado);

        entrada.close();
    }
}
