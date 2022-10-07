public class teste {
    public static void main(String[] args) {
        PersonagemManipulacao criadorDePersonagem = new Personagem();

        Personagem rawad = new Personagem("Rawad", RacaDoPersonagem.ORC, ClasseDoPersonagem.MAGO, 10,9,8,7, TipoPersoangem.PERSONAGEM_DO_JOGADOR, 20);
        Personagem orcfeio = new Personagem("Mondrongo", RacaDoPersonagem.ORC, ClasseDoPersonagem.GUERREIRO, 10,10,10,10,TipoPersoangem.MONSTRO, 20);
        criadorDePersonagem.adicionarPersonagem(rawad);
        criadorDePersonagem.adicionarPersonagem(orcfeio);

        criadorDePersonagem.listarPersonagem();

        rawad.atacar(rawad, orcfeio);
    }
}
