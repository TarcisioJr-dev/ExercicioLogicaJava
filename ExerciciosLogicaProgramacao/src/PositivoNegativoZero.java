import java.util.Scanner;

// Exercício 16 de 100;

public class PositivoNegativoZero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String resultado;

        System.out.println("--- Positivo, negativo ou zero ---");
        System.out.println("Digite um número: ");
        float numero = entrada.nextFloat();

        if (numero < 0) {
            resultado = "NEGATIVO";
        }else if (numero == 0) {
            resultado = "ZERO";
        }else{
            resultado = "POSITIVO";
        }

        System.out.println("\nResultado: "+ resultado);

        entrada.close();
    }
}
