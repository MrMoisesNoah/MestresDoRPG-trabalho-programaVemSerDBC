import CRUDS.VerificarJogadorException;
import ClassesUteis.Cenario;

import java.util.Scanner;

public class RpgMaster {
    public static void main(String[] args) throws VerificarJogadorException {
        Scanner scanner = new Scanner(System.in);
        Cenario jogoRpg = new Cenario();
        String sair;
        boolean teste = true;


        jogoRpg.iniciarJogo();


        int opcaoEscolhida = 0;
        do {
            do {
                verificarJogador(scanner, jogoRpg, teste);
                jogoRpg.iniciarHistoria();
                System.out.println("Iniciando Batalha: ");
                jogoRpg.getJogadorManipulacao().listarJogador();
                System.out.println("Escolha o ID do jogador que ira atacar: ");
                int indiceJogador = scanner.nextInt();
                jogoRpg.getPersonagemManipulacao().listarPersonagem();
                System.out.println("Escolha o ID do monstro que sera atacado: ");
                int inidiceMonstro = scanner.nextInt();
                jogoRpg.iniciarBatalha(jogoRpg.getJogadorManipulacao().selecionarJogador(indiceJogador),
                        jogoRpg.getMonstro(inidiceMonstro));

                System.out.println("Deseja Continuar Batalhando ??");
                System.out.println("1 - Sim \n2 - Nao");
                opcaoEscolhida = scanner.nextInt();
                scanner.nextLine();
                if (jogoRpg.getJogadorManipulacao().listaJogadores.size() == 0 ||
                        jogoRpg.getPersonagemManipulacao().listaDePersonagens.size() == 0) {
                    opcaoEscolhida = 2;
                }
            } while (opcaoEscolhida == 1);

            System.out.println("Digite SAIR para encerrar o jogo, ou qualquer sequencia de caracteres para continuar.");
            sair = scanner.nextLine();

            if (!sair.equalsIgnoreCase("sair")) {
                jogoRpg.criarEquipamentos();
                jogoRpg.escolherQualItenParaEquipar();
            }
        } while (!sair.equalsIgnoreCase("sair"));

    }

    public static void verificarJogador(Scanner scanner, Cenario cenario, boolean vdd) {
        try {
            cenario.criarPersonagens();
            if (cenario.getJogadorManipulacao().testarJogador(cenario.getJogadorManipulacao())) {
                vdd = false;
            }
        } catch (VerificarJogadorException exception) {
            System.out.println("ClassesUteis.Jogador inexistente, crie um jogador.");
            verificarJogador(scanner, cenario, vdd);
        }

    }
}