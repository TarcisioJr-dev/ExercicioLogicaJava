import java.util.Scanner;

// Exercício 20 de 100;

public class TresValoresOrdemCres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int menor, maior, medio;
        
        System.out.println("--- Três valores em ordem crescente ---");
        System.out.print("Insira o primeiro número: ");
        int PriNum = entrada.nextInt();
        System.out.print("Insira o segundo número: ");
        int SegNum = entrada.nextInt();
        System.out.print("Insira o terceiro número: ");
        int TerNum = entrada.nextInt();

        menor = PriNum;
        medio = PriNum;
        maior = PriNum;

        if (SegNum < PriNum && SegNum < TerNum) {
            menor = SegNum;
        }else if ((SegNum < PriNum && SegNum > TerNum) || (SegNum > PriNum && SegNum < TerNum)) {
            medio = SegNum;
        }else if (SegNum > PriNum && SegNum > TerNum) {
            maior = TerNum;
        }

        if (TerNum < PriNum && TerNum < SegNum) {
            menor = TerNum;
        }else if ((TerNum < PriNum && TerNum > SegNum) || (TerNum > PriNum && TerNum < SegNum)) {
            medio = TerNum;
        }else if (TerNum > PriNum && TerNum > SegNum) {
            maior = TerNum;
        }

        System.out.println("\nOrdem crescente: "+menor+", "+medio+", "+maior);

        entrada.close();
    }
}
