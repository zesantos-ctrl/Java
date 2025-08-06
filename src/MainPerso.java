public class MainPerso {
    public static void main(String[] args) {
        Personagem guerreiro = new Personagem("Arthas", "Guerreiro");
        Personagem mago = new Personagem("Merlin", "Mago");

        guerreiro.exibirStatus();
        mago.exibirStatus();

        // Guerreiro ataca o mago
        guerreiro.atacar(mago);

        // Exibir status após ataque
        mago.exibirStatus();

        // Subir de nível
        mago.subirNivel();
        mago.exibirStatus();
    }
}
