public class teste {
    public static void main(String[] args) {
        PersonagemManipulacao criadorDePersonagem = new Personagem();
        EquipamentosManipulacao criadroDeEquipamentos = new EquipamentosManipulacao();

        Personagem rawad = new Personagem("Rawad", RacaDoPersonagem.ORC, ClasseDoPersonagem.MAGO, 10,9,8,7, TipoPersoangem.PERSONAGEM_DO_JOGADOR, 20);
        Personagem orcfeio = new Personagem("Mondrongo", RacaDoPersonagem.ORC, ClasseDoPersonagem.GUERREIRO, 10,10,10,10,TipoPersoangem.MONSTRO, 20);

        Equipamentos espada = new Equipamentos("Espada",1,10,0,0,0);
        Equipamentos escudo = new Equipamentos("Escudo",3,0,50,0,0);
        Equipamentos pocao =  new Equipamentos("Pocao",4,0,0,10,0);

        criadorDePersonagem.adicionarPersonagem(rawad);
        criadorDePersonagem.adicionarPersonagem(orcfeio);

        criadorDePersonagem.listarPersonagem();

        rawad.equiparItem(espada);
        orcfeio.equiparItem(escudo);

        System.out.println(rawad.getBonusDano());

        rawad.atacar(rawad, orcfeio);
        orcfeio.usarPocao(pocao);

    }
}
