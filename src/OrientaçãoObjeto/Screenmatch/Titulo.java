package OrientaçãoObjeto.Screenmatch;

public class Titulo {
    public String nome; // Nome do filme (acesso público)
    private int anoDeLancamento; // Ano de lançamento (acesso restrito)
    private boolean incluindoNoPlano; // Se está incluído no plano (acesso restrito)
    private double somaDasAvaliacoes; // Soma das avaliações (acesso restrito)
    private int totalDeAvaliacao; // Total de avaliações (acesso restrito)
    private int duracaoEmMinutos; // Duração em minutos (acesso restrito)

    // GETTERS (permitem acessar os atributos privados)
    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public int getTotalDeAvaliacao() {
        return totalDeAvaliacao;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    // SETTERS (permitem modificar os atributos privados)
    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    // Exibe informações básicas do filme
    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    // Avalia o filme
    public void avalia(double nota) {
        //somaDasAvaliacoes += nota;
        //totalDeAvaliacao++;
    }

    // Calcula a média das avaliações
    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacao;
    }
}
