import java.util.Scanner;

// Exercício 27 de 100;

public class ClassificacaoIMC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String classificacao = "";

        System.out.println("--- Classificação de IMC ---");
        System.out.println("Digite seu peso: ");
        float peso = entrada.nextFloat();
        System.out.println("Digite sua altura em metros: ");
        float altura = entrada.nextFloat();

        float IMC = peso / ( altura * altura);

        if (IMC < 18.5) {
            classificacao = "ABAIXO DA FAIXA";
        }else if (IMC < 25) {
            classificacao = "FAIXA NORMAL";
        }else if (IMC < 30) {
            classificacao = "ACIMA DA FAIXA";
        }else{
            classificacao = "FAIXA ELEVADA";
        }

        System.out.println("\n\nPeso: "+peso+" kg");
        System.out.println("Altura: "+altura+" m");
        System.out.println("\nIMC: "+IMC);
        System.out.println("Classificação: "+classificacao+"\n");

        entrada.close();
    }
}
