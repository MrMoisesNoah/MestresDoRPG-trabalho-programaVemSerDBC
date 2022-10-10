import java.util.Scanner;

     public class Cenario implements AcoesCenario {

        private String nomeMestre;
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


        private PersonagemManipulacao personagemManipulacao = new PersonagemManipulacao();

        private JogadorManipulacao jogadorManipulacao = new JogadorManipulacao();

        private EquipamentosManipulacao listaEquipamentos = new EquipamentosManipulacao();

         public String getNomeMestre() {
             return nomeMestre;
         }

         public void setNomeMestre(String nomeMestre) {
             this.nomeMestre = nomeMestre;
         }

         public PersonagemManipulacao getPersonagemManipulacao() {
             return personagemManipulacao;
         }

         public void setPersonagemManipulacao(PersonagemManipulacao personagemManipulacao) {
             this.personagemManipulacao = personagemManipulacao;
         }

         public JogadorManipulacao getJogadorManipulacao() {
             return jogadorManipulacao;
         }

         public void setJogadorManipulacao(JogadorManipulacao jogadorManipulacao) {
             this.jogadorManipulacao = jogadorManipulacao;
         }

         public EquipamentosManipulacao getListaEquipamentos() {
             return listaEquipamentos;
         }

         public void setListaEquipamentos(EquipamentosManipulacao listaEquipamentos) {
             this.listaEquipamentos = listaEquipamentos;
         }

         private Scanner menu = new Scanner(System.in);

         public Personagem getPersonagemJogador(int index){
             return jogadorManipulacao.selecionarJogador(index).getPersonagemDoJogador();
         }

         public Personagem getMonstro(int index) {
             return personagemManipulacao.selecionarPersonagem(index);
         }

        public void iniciarJogo() {
            System.out.println("Bem vindo aventureiro");
            System.out.println("Digite o nome do Mestre");
            nomeMestre = menu.nextLine();
            mestre.setNomeMestre(nomeMestre);
            System.out.println("Digite a idade do Mestre");
            int idadeMestre = menu.nextInt();
            mestre.setIdadeMestre(idadeMestre);
        }


        public void criarPersonagens() {
            System.out.println("Cadastre os personagens. \n -----------------------");
            int opcao = 0;
            while (opcao != 3) {
                System.out.println("Digite 1 para criar um monstro");
                System.out.println("Digite 2 para criar um Jogador");
                System.out.println("Digite 3 para iniciar Historia.");
                opcao = menu.nextInt();
                menu.nextLine();

                if (opcao != 3) {
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
                        personagemManipulacao.adicionarPersonagem(new Personagem(nome, RacaDoPersonagem.valueOf(raca), ClasseDoPersonagem.valueOf(classe), forca, defesa, constituicao, inteligencia, tipoPersonagem, pontosVida, pontosMana));
                    }

                    case 2 -> {
                        menu.nextLine();
                        System.out.print("Digete o nome do Jogador: ");
                        String nomeJogador = menu.nextLine();
                        System.out.print("Digete a idade do Jogador: ");
                        int idadeJogador = menu.nextInt();
                        TipoPersoangem tipoPersonagem = TipoPersoangem.PERSONAGEM_DO_JOGADOR;
                        Personagem personagemJogador = new Personagem(nome, RacaDoPersonagem.valueOf(raca), ClasseDoPersonagem.valueOf(classe), forca, defesa, constituicao, inteligencia, tipoPersonagem, pontosVida, pontosMana);
                        jogadorManipulacao.adicionarJogador(new Jogador(nomeJogador, idadeJogador, personagemJogador));
                    }
                }

            }

        }

        public void criarEquipamentos() {
            System.out.println("Criar equipamentos. \n -----------------------");
            int opcao = 0;
            while (opcao != 7) {
                System.out.println("Digite 1 para criar uma espada");
                System.out.println("Digite 2 para criar um arco");
                System.out.println("Digite 3 para criar um escudo");
                System.out.println("Digite 4 para criar um cajado");
                System.out.println("Digite 5 para criar um poção de vida");
                System.out.println("Digite 6 para criar um poção de mana");
                System.out.println("Digite 7 para sair");
                opcao = menu.nextInt();
                menu.nextLine();

                if (opcao <= 4) {
                    System.out.print("Nome do equipamento: ");
                    nome = menu.nextLine();
                    System.out.print("Dano: ");
                    forca = menu.nextDouble();
                    System.out.print("Defesa: ");
                    defesa = menu.nextDouble();

                } else if(opcao == 5) {
                    System.out.print("Nome do equipamento: ");
                    nome = menu.nextLine();
                    System.out.print("Poçao restaura quanto de vida: ");
                    pontosVida = menu.nextDouble();
                } else if(opcao == 6) {
                    System.out.print("Nome do equipamento: ");
                    nome = menu.nextLine();
                    System.out.print("Poçao restaura quanto de mana: ");
                    pontosMana = menu.nextDouble();
                }

                switch (opcao) {
                    case 1 -> {
                        TiposItens tipo = TiposItens.ESPADA;
                        Equipamentos novoEquipamento = new Equipamentos(nome, tipo, forca, defesa, 0, 0);
                        listaEquipamentos.adicionarEquipamentos(novoEquipamento);

                    }

                    case 2 -> {
                        TiposItens tipo = TiposItens.ARCO;
                        Equipamentos novoEquipamento = new Equipamentos(nome, tipo, forca, defesa, 0, 0);
                        listaEquipamentos.adicionarEquipamentos(novoEquipamento);

                    }

                    case 3 -> {
                        TiposItens tipo = TiposItens.ESCUDO;
                        Equipamentos novoEquipamento = new Equipamentos(nome, tipo, forca, defesa, 0, 0);
                        listaEquipamentos.adicionarEquipamentos(novoEquipamento);

                    }

                    case 4 -> {
                        TiposItens tipo = TiposItens.CAJADO;
                        Equipamentos novoEquipamento = new Equipamentos(nome, tipo, forca, defesa, 0, 0);
                        listaEquipamentos.adicionarEquipamentos(novoEquipamento);

                    }

                    case 5 -> {
                        TiposItens tipo = TiposItens.POCAO_VIDA;
                        Equipamentos novoEquipamento = new Equipamentos(nome, tipo, 0, 0, pontosVida, 0);
                        listaEquipamentos.adicionarEquipamentos(novoEquipamento);

                    }

                    case 6 -> {
                        TiposItens tipo = TiposItens.POCAO_MANA;
                        Equipamentos novoEquipamento = new Equipamentos(nome, tipo, 0, 0, 0, pontosMana);
                        listaEquipamentos.adicionarEquipamentos(novoEquipamento);

                    }
                }

            }

        }

        public void iniciarBatalha(Jogador jogador, Personagem monstro) {
            int i = 0;
            while (monstro.getPontosVida() > 0 && jogador.getPersonagemDoJogador().getPontosVida() > 0) {
                System.out.println("Turno :" + ++i);
                jogador.getPersonagemDoJogador().atacar(jogador.getPersonagemDoJogador(), monstro);
                if(monstro.getPontosVida() > 0) {
                    System.out.println("Turno :" + ++i);
                    monstro.atacar(monstro, jogador.getPersonagemDoJogador());
                }
            }
            if(jogador.getPersonagemDoJogador().getPontosVida() <= 0) {
                System.out.println("Venceu: " + monstro);
                jogadorManipulacao.removerJogador(jogador);
            } else if (monstro.getPontosVida() <= 0) {
                System.out.println("Venceu: " + jogador);
                personagemManipulacao.removerPersonagem(monstro);
            }
        }

        public void escolherQualItenParaEquipar() {
                int selecao = 0;

                do  {
                    System.out.println("Digite 1 para Equipar Itens.");
                    System.out.println("Digite 2 para Continuar o Jogo.");
                    selecao = menu.nextInt();
                    menu.nextLine();

                    if(selecao == 1) {
                        System.out.println("Esta é a lista de todos os equipamentos");
                        listaEquipamentos.listarEquipamentos();
                        System.out.print("Digite o numero do id do item que deseja equipar: ");
                        int indiceDoItem = menu.nextInt();
                        menu.nextLine();
                        System.out.println("Esta é a lista de Jogadores: ");
                        jogadorManipulacao.listarJogador();
                        System.out.print("Digite o numero do id para qual jogador deseja equipar o item: ");
                        int indiceDoJogadr = menu.nextInt();
                        menu.nextLine();
                        Equipamentos testeEquipamento = listaEquipamentos.selecionarEquipamentoPorIndice(indiceDoItem);
                        jogadorManipulacao.selecionarJogador(indiceDoJogadr).getPersonagemDoJogador().equiparItem(testeEquipamento);
                        jogadorManipulacao.selecionarJogador(indiceDoJogadr).getPersonagemDoJogador().setBonusDano
                                (getPersonagemJogador(indiceDoJogadr).getBonusDano() + testeEquipamento.getDano());
                        jogadorManipulacao.selecionarJogador(indiceDoJogadr).getPersonagemDoJogador().setBonusDefesa
                                (getPersonagemJogador(indiceDoJogadr).getBonusDefesa() + testeEquipamento.getDefesa());
                        listaEquipamentos.removerEquipamentos(indiceDoItem);
                    }
                } while (selecao == 1);

        }

        int cena = 1;

        public void iniciarHistoria() {

            String sairCenario;
            System.out.print("Cena " + cena + "  ---- Termine sua historia com  ! " + " \n \n");
            ++cena;
            do {
                sairCenario = menu.nextLine();

            } while (!sairCenario.contains("!"));
        }

    }

