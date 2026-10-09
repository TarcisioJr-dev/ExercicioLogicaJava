import java.util.Scanner;

// Exercício 26 de 100;

public class ReajusteSalario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("--- Reajuste por faixa salarial ---");
        System.out.print("Informe seu salário: R$ ");
        float salario = entrada.nextFloat();

        float novosalario;
        String taxaAumento = "";

        if (salario <= 1500) {
            novosalario = salario +(salario * 15 / 100);
            taxaAumento = "15%";
        }else if (salario <= 3000) {
            novosalario = salario +(salario * 10 / 100);
            taxaAumento = "10%";
        }else{
            novosalario = salario +(salario * 5 / 100);
            taxaAumento = "5%";
        }

        System.out.println("\nNovo Salário: R$ "+ novosalario);
        System.out.println("Taxa de aumento: "+ taxaAumento);

        entrada.close();
    }
}
