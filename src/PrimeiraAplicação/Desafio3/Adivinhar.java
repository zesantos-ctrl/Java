package Desafio3;

import java.util.Random;
import java.util.Scanner;

public class Adivinhar {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroAdvinha = new Random().nextInt(100);
        int tentativas = 0;
        int numeroDigitado = 0;

        while (tentativas < 5) {
            System.out.print("Digite um número entre 0 e 100: ");
            numeroDigitado = leitor.nextInt();
            tentativas++;

            if (numeroDigitado == numeroAdvinha) {
                System.out.println("Parabéns, você acertou o número em " + tentativas + " tentativas!");
                break;
            } else if (numeroDigitado < numeroAdvinha) {
                System.out.println("O número digitado é menor que o número gerado.");
            } else {
                System.out.println("O número digitado é maior que o número gerado.");
            }
        }

        if (tentativas == 5 && numeroDigitado != numeroAdvinha) {
            System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era: " + numeroAdvinha);
        }
    }
}
