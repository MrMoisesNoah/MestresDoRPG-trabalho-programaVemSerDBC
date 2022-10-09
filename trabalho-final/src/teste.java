import java.util.Scanner;

public class teste {
    public static void main(String[] args) {

        PersonagemManipulacao criadorDePersonagem = new Personagem();
        EquipamentosManipulacao criadroDeEquipamentos = new EquipamentosManipulacao();

        Cenario oi = new Cenario();






        Equipamentos cajado = new Equipamentos("Cajado",TiposItens.CAJADO,20,0,0,0);
        Equipamentos escudo = new Equipamentos("Escudo",TiposItens.ESCUDO,0,5,0,0);
        Equipamentos pocao =  new Equipamentos("Pocao",TiposItens.POCAO_VIDA,0,0,10,0);
        Equipamentos pocaoMana = new Equipamentos("PocaoMana",TiposItens.POCAO_MANA,0,0,0,10);
        criadorDePersonagem.adicionarPersonagem(rawad);
        criadorDePersonagem.adicionarPersonagem(orcfeio);

        criadorDePersonagem.listarPersonagem();

        oi.criarPersonagens();


        oi.getJogadorManipulacao().getJogador(0);
        oi.getPersonagemManipulacao().getPersonagem(0);


        oi.iniciarBatalha(oi.getJogadorManipulacao().getJogador(0), oi.getPersonagemManipulacao().getPersonagem(0));




        rawad.atacar(orcfeio);
        rawad.atacar(orcfeio);
        rawad.atacar(orcfeio);


        criadorDePersonagem.removerPersonagemPorIndice(orcfeio);
        criadorDePersonagem.listarPersonagem();


        //        Personagem rawad = new Personagem("Rawad", RacaDoPersonagem.ORC, ClasseDoPersonagem.MAGO, 10,9,8,7, TipoPersoangem.PERSONAGEM_DO_JOGADOR, 20, 30);
//        Personagem orcfeio = new Personagem("Mondrongo", RacaDoPersonagem.ORC, ClasseDoPersonagem.GUERREIRO, 10,10,10,10,TipoPersoangem.MONSTRO, 20,0);
//
//        Equipamentos cajado = new Equipamentos("Cajado",TiposItens.CAJADO,20,0,0,0);
//        Equipamentos escudo = new Equipamentos("Escudo",TiposItens.ESCUDO,0,5,0,0);
//        Equipamentos pocao =  new Equipamentos("Pocao",TiposItens.POCAO_VIDA,0,0,10,0);
//        Equipamentos pocaoMana = new Equipamentos("PocaoMana",TiposItens.POCAO_MANA,0,0,0,10);



//        rawad.adicionarPersonagem(rawad);
//        orcfeio.adicionarPersonagem(orcfeio);
//
//        rawad.listarPersonagem();
//
//        rawad.equiparItem(cajado);
//        orcfeio.equiparItem(escudo);
//
//        rawad.atacar(rawad,orcfeio);
//        rawad.atacar(rawad,orcfeio);
//        rawad.atacar(rawad,orcfeio);
//
//        System.out.println(rawad.getBonusDano());
//
//        rawad.usarCajado(rawad, orcfeio);
//        System.out.println(rawad.getPontosMana());
//        orcfeio.usarPocao(pocao);
//        rawad.usarPocao(pocaoMana);
//        System.out.println(rawad.getPontosMana());

    }
}
