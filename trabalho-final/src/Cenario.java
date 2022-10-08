import java.util.Scanner;

    public class Cenario{

        private String nomeMestre;
        private int idadeMestre;

        private String nomeJogador;

        private int idadeJogador;
        private Mestre mestre = new Mestre();
        private String nome;
        private String raca;
        private String classe;
        private double forca;
        private double defesa;
        private double constituicao;
        private double inteligencia;
        private double pontosVida;
        private double pontosMana;



        PersonagemManipulacao listaMestre = new PersonagemManipulacao();

        JogadorManipulacao listaJogadres = new JogadorManipulacao();

        Scanner menu = new Scanner(System.in);

        public void inicarJogo() {
            System.out.println("Bem vindo aventureiro");
            System.out.println("Digite o nome do seu Mestre");
            nomeMestre = menu.nextLine();
            mestre.setNomeMestre(nomeMestre);
            idadeMestre = menu.nextInt();
            mestre.setIdadeMestre(idadeMestre);
        }


        public void criarPersonagensDoMestre() {
        System.out.println("Cadastre os personagens do mestre \n -----------------------");
        int opcao = 0;
            while (opcao != 4) {
                System.out.println("Digite 1 para criar um monstro");
                System.out.println("Digite 2 para criar um NPC");
                System.out.println("Digite 2 para criar um Jogador");
                System.out.println("Digite 3 para sair");
                opcao = menu.nextInt();
                menu.nextLine();

                if( opcao != 4) {
                    System.out.print("Nome do personagem: ");
                    nome = menu.nextLine();
                    System.out.print("Raca: ");
                    raca = menu.nextLine();
                    System.out.print("Classe: ");
                    classe = menu.nextLine();
                    System.out.print("Forca: ");
                    forca = menu.nextDouble();
                    System.out.print("Defesa: ");
                    defesa = menu.nextDouble();
                    System.out.print("Constituicao: ");
                    constituicao = menu.nextDouble();
                    System.out.print("Inteligencia: ");
                    inteligencia = menu.nextDouble();
                    System.out.print("Pontos vida: ");
                    pontosVida = menu.nextDouble();
                    System.out.print("Pontos mana: ");
                    pontosMana = menu.nextDouble();
                }
                switch (opcao) {

                    case 1 -> {
                        TipoPersoangem tipoPersonagem = TipoPersoangem.MONSTRO;
                        listaMestre.adicionarPersonagem(new Personagem(nome, RacaDoPersonagem.valueOf(raca), ClasseDoPersonagem.valueOf(classe), forca, defesa, constituicao, inteligencia, tipoPersonagem , pontosVida, pontosMana));
                        listaMestre.listarPersonagem();
                    }
                    case 2 -> {
                        TipoPersoangem tipoPersonagem = TipoPersoangem.NPC;
                        listaMestre.adicionarPersonagem(new Personagem(nome, RacaDoPersonagem.valueOf(raca), ClasseDoPersonagem.valueOf(classe), forca, defesa, constituicao, inteligencia, tipoPersonagem , pontosVida, pontosMana));
                        listaMestre.listarPersonagem();
                    }

                    case 3 -> {
                        System.out.print("Digete o nome do Jogador: ");
                        nomeJogador = menu.nextLine();
                        System.out.print("Digete a idade do Jogador: ");
                        idadeJogador = menu.nextInt();
                        TipoPersoangem tipoPersonagem = TipoPersoangem.PERSONAGEM_DO_JOGADOR;
                        Personagem personagemJogador= new Personagem(nome, RacaDoPersonagem.valueOf(raca), ClasseDoPersonagem.valueOf(classe), forca, defesa, constituicao, inteligencia, tipoPersonagem , pontosVida, pontosMana);
                        listaJogadres.adicionarJogador(new Jogador(nomeJogador, idadeJogador, personagemJogador));
                        listaJogadres.listarJogador();
                    }
                }

            }

        }

    }



