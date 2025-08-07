package OrientaçãoObjeto;

import OrientaçãoObjeto.Screenmatch.Filme;
import OrientaçãoObjeto.Screenmatch.Serie;

import java.io.Serial;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());
            //CTRL + CLIQUE = Navegação entre abas

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações " + meuFilme.getTotalDeAvaliacao());
        System.out.println(meuFilme.pegaMedia());

        /*
        meuFilme.somaDasAvaliacoes = 10;
        meuFilme.totalDeAvaliacao = 1;
        System.out.println(meuFilme.pegaMedia());//encapsulamento
        */

        Serie horaDeAventura = new Serie();
        horaDeAventura.setNome("Hora de aventura");
        horaDeAventura.setAnoDeLancamento(2010);
        horaDeAventura.exibeFichaTecnica();
        horaDeAventura.setTemporadas(10);
        horaDeAventura.setEpisodiosPorTemporadas(20);
        horaDeAventura.setDuracaoEmMinutos(120);
        System.out.println("Duração para maratona hora de aventura: " + horaDeAventura.getDuracaoEmMinutos());
    }
}
