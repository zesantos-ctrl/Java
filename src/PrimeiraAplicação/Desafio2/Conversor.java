package PrimeiraAplicação.Desafio2;

public class Conversor {
    public static void main (String[] args) {
        double valorEmDolares = 40.4;
        double valorEmReais = 4.94;

        double converter = valorEmDolares * valorEmReais;

        System.out.printf("O valor em reais R$%.2f%n ",  converter);

    }
}
