//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Screenmatch.modelos.Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        //concatenação
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;


        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Screenmatch.modelos.Filme Top Gun
                Screenmatch.modelos.Filme de aventura com galã dos anos 80
                Muito bom 
                Ano de lançamento 
                """ + anoDeLancamento;  //Text Block
        System.out.println(sinopse);

        int classificacao = (int) (media /2);
        System.out.println(classificacao);//casting

    }
}
// Esta é uma linha de comentário que será ignorada pelo compilador

/* Este é um exemplo de comentário
de várias linhas em Java
que será ignorado pelo compilador */