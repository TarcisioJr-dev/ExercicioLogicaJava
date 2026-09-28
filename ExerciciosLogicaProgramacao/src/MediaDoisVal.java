import java.util.Scanner;
// Exercício 02 de 100
public class MediaDoisVal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Média de duas notas");
        System.out.println("Digite a 1ª nota: ");
        float nota1 = entrada.nextFloat();
        System.out.println("Digite a 2ª nota: ");
        float nota2 = entrada.nextFloat();

        float media = (nota1 + nota2) / 2;
        System.out.println("A Média: "+media);

        entrada.close();
    }
}
