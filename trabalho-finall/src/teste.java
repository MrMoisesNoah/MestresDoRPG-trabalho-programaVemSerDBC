public class teste {
    public static void main(String[] args) {
        PersonagemManipulacao criadorDePersonagem = new PersonagemManipulacao();

        Personagem rawad = new Personagem("Rawad", RacaDoPersonagem.ORC, ClasseDoPersonagem.ARQUEIRO, 10,9,8,7, TipoPersoangem.PERSONAGEM_DO_JOGADOR);

        criadorDePersonagem.adicionarPersonagem(rawad);

        criadorDePersonagem.listarPersonagem();
    }
}
