package PrimeiraAplicação.Desafio2;

public class Precos {
    public static void  main (String[] args){
        double precoOriginal = 120.0;
        double percentualDesconto = 10.0;

        double valorDesconto = precoOriginal * (percentualDesconto / 100.0);
        double precoComDesconto = precoOriginal - valorDesconto;
        System.out.println(valorDesconto);
    }
}
