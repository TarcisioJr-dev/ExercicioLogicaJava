import java.util.Scanner;

// Exercício 33 de 100; pag 41

public class DiaDaSemana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String diaSemana = "";

        System.out.println("--- Dia da Semana ---");
        System.out.print("Digite o numero do dia da semana 1-7: ");
        int numeroDia = entrada.nextInt();

        switch (numeroDia) {
            case 1:
                diaSemana = "SEGUNDA-FEIRA\n";
                break;
            case 2:
                diaSemana = "TERÇA-FEIRA\n";
                break;
            case 3:
                diaSemana = "QUARTA-FEIRA\n";
                break;
            case 4:
                diaSemana = "QUINTA-FEIRA\n";
                break;
            case 5:
                diaSemana = "SEXTA-FEIRA\n";
                break;
            case 6:
                diaSemana = "SÁBADO\n";
                break;
            case 7:
                diaSemana = "DOMINGO\n";
                break;
        
            default:
                diaSemana = "OPÇÃO INVÁLIDA\n";
                break;
        }

        System.out.println("\nDia escolhido: "+ diaSemana);

        entrada.close();
    }
}
