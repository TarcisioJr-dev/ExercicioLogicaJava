import java.util.Scanner;

// Exercício 32 de 100;

public class intervaloNumerico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String resultadoIntervalo = "";

        System.out.println("--- Número dentro do intervalo ---");
        System.out.print("Digite o número: ");
        float numeroIntervalo = entrada.nextFloat();

        if (numeroIntervalo >= 10 && numeroIntervalo <= 20) {
            resultadoIntervalo = "DENTRO";
        }else{
            resultadoIntervalo = "FORA";
        }

        System.out.println("\n\nNúmero: "+numeroIntervalo);
        System.out.println("Resultado: "+ resultadoIntervalo);

        entrada.close();
    }
}