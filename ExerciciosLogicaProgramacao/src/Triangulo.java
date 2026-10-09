import java.util.Scanner;

// Exercício 28 e 29 de 100;

public class Triangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String resultado = "";

        System.out.println("-- É possível formar um triângulo? --");
        System.out.print("Lado 1: ");
        int lado1 = entrada.nextInt();
        System.out.print("Lado 2: ");
        int lado2 = entrada.nextInt();
        System.out.print("Lado 3: ");
        int lado3 = entrada.nextInt();

        System.out.println("\n\nLados: "+lado1+", "+lado2+" e "+lado3);

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado3 + lado2 > lado1) {
            if (lado1 == lado2 && lado2 == lado3) {
                resultado = "EQUILÁTERO\n";
            }else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                resultado = "ISÓSCELES\n";
            }else {
                resultado = "ESCALENO\n";
            }
        }else{
            resultado = "NÃO FORMAM TRIANGULO\n";
        }

        System.out.println("Resultado: "+resultado);

        entrada.close();
    }
}
