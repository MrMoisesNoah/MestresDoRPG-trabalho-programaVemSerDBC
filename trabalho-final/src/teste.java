import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Cenario oi = new Cenario();

        oi.criarPersonagens();
        oi.criarEquipamentos();
        oi.escolherQualItenParaEquipar(oi.getJogadorManipulacao().getJogador(0));
//
//
//        oi.criarPersonagens();
//
//
//        Personagem rawadPersonagem = oi.getJogadorManipulacao().getJogador(0).getPersonagemDoJogador();
//        Personagem monstro = oi.getMonstro(0);
//
//
//
//        rawadPersonagem.atacar(rawadPersonagem, monstro);
//


//        Equipamentos cajado = new Equipamentos("Cajado",TiposItens.CAJADO,20,0,0,0);
//        Equipamentos escudo = new Equipamentos("Escudo",TiposItens.ESCUDO,0,5,0,0);
//        Equipamentos pocao =  new Equipamentos("Pocao",TiposItens.POCAO_VIDA,0,0,10,0);
//        Equipamentos pocaoMana = new Equipamentos("PocaoMana",TiposItens.POCAO_MANA,0,0,0,10);

//        EquipamentosManipulacao todosequipmanetos = new EquipamentosManipulacao();
//        todosequipmanetos.adicionarEquipamentos(cajado);
//        todosequipmanetos.adicionarEquipamentos(escudo);
//        todosequipmanetos.adicionarEquipamentos(pocao);
//        todosequipmanetos.adicionarEquipamentos(pocaoMana);





//                Personagem rawad = new Personagem("Rawad", RacaDoPersonagem.ORC, ClasseDoPersonagem.MAGO, 10,9,8,7, TipoPersoangem.PERSONAGEM_DO_JOGADOR, 20, 30);
//        Personagem orcfeio = new Personagem("Mondrongo", RacaDoPersonagem.ORC, ClasseDoPersonagem.GUERREIRO, 10,10,10,10,TipoPersoangem.MONSTRO, 20,0);
//

//
//
//Jogador rawad2 = new Jogador("oi", 22, rawad);
//        rawad.adicionarPersonagem(rawad);
//        orcfeio.adicionarPersonagem(orcfeio);
//
//
//        oi.iniciarBatalha(rawad2, orcfeio);

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
