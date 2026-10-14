import java.util.Scanner;

// Exercício 34 de 100;

public class DiasDoMes {
    public static void main(String[] args) {
        //REGRA:
        //Meses 1,3,5,7,8,10 e 12 possuem 31 dias;
        //Meses 4,6,9 e 11 possuem 30 dias;
        //Fevereiro possui 28 dias, ou 29 em ano bissexto.

        //REQUISITO:
        //Se o mês estiver fora de 1 a 12, mostre *MÊS INVÁLIDO*

        Scanner entrada = new Scanner(System.in);
        String quantidadeDias = "";

        System.out.println("--- Quantidade de dias do mês ---");
        System.out.print("Digite o número do mês: ");
        int mes = entrada.nextInt();
        System.out.print("Digite o ano (XXXX): ");
        int ano = entrada.nextInt();

        switch (mes) {
            case 1:
                quantidadeDias = "31 dias\n";
                break;
            case 2:
                if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
                    quantidadeDias = "29 dias\n";
                }else{
                    quantidadeDias = "28 dias\n";
                }
                break;
            case 3:
                quantidadeDias = "31 dias\n";
                break;
            case 4:
                quantidadeDias = "30 dias\n";
                break;
            case 5:
                quantidadeDias = "31 dias\n";
                break;
            case 6:
                quantidadeDias = "30 dias\n";
                break;
            case 7:
                quantidadeDias = "31 dias\n";
                break;
            case 8:
                quantidadeDias = "31 dias\n";
                break;
            case 9:
                quantidadeDias = "30 dias\n";
                break;
            case 10:
                quantidadeDias = "31 dias\n";
                break;
            case 11:
                quantidadeDias = "30 dias\n";
                break;
            case 12:
                quantidadeDias = "31 dias\n";
                break;
        
            default:
                quantidadeDias = "MÊS INVÁLIDO\n";
                break;
        }

        System.out.println("\nMês: "+mes);
        System.out.println("Ano: "+ano);
        System.out.println("Quantidade de dias do mês escolhido: "+quantidadeDias);

        entrada.close();
    }
}
