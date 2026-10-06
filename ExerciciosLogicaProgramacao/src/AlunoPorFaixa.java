import java.util.Scanner;

// Exercício 22 de 100;

public class AlunoPorFaixa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("--- Situação do aluno por faixa ---");
        System.out.print("Nota 1: ");
        float not1 = entrada.nextFloat();
        System.out.print("Nota 2: ");
        float not2 = entrada.nextFloat();

        float media1 = (not1 + not2)/2;
        System.out.println("\nMédia: "+ media1);

        if (media1 < 5.0 && media1 >= 0) {
            System.out.println("Situação: REPROVADO");
        }else if (media1 >= 5.0 && media1 < 7.0) {
            System.out.println("Situação: RECUPERAÇÃO");
        }else if (media1 >= 7.0 && media1 <= 10) {
            System.out.println("Situação: APROVADO");
        }else{
            System.out.println("[ERRO] Valor inválido;");
        }

        entrada.close();
    }
}
