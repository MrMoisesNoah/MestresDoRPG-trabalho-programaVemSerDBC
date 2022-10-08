import javax.swing.*;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        TipoPersoangem tipoPersoangem;

        System.out.println("Bem vindo aventureiro");
        System.out.println("Digite o nome do seu Mestre");
        Mestre mestre = new Mestre();
        String nomeMestre = menu.nextLine();
        mestre.setNomeMestre(nomeMestre);

        System.out.println("Cadastre o cenario do jogo");

        System.out.println("Cadastre os personagens");
        int opcao = 0;
        while (opcao != 3) {
            System.out.println("Digite 1 para criar um monstro");
            System.out.println("Digite 2 para criar um NPC");
            System.out.println("Digite 3 para sair");
            opcao = menu.nextInt();
            Personagem personagem = extracted(opcao);
            String addMonstro = menu.nextLine();
            mestre.setNomeMestre(addMonstro);

        }
    }

    private static Personagem extracted(int opcao) {
        Scanner menu = new Scanner(System.in);
        Personagem personagem = new Personagem();
        System.out.println("Nome");
        String nome = menu.nextLine();
        System.out.println("Raca");
        String raca = menu.nextLine();
        System.out.println("Classe");
        String classe = menu.nextLine();
        System.out.println("Forca");
        double forca = menu.nextDouble();
        System.out.println("Defesa");
        double defesa = menu.nextDouble();
        System.out.println("Constituicao");
        double constituicao = menu.nextDouble();
        System.out.println("Inteligencia");
        double inteligencia = menu.nextDouble();
        System.out.println("Pontos vida");
        double pontosVida = menu.nextDouble();
        System.out.println("Pontos mana");
        double pontosMana = menu.nextDouble();
        TipoPersoangem tipoPersonagem;
        if (opcao == 1) {
            tipoPersonagem = TipoPersoangem.MONSTRO;
        } else if (opcao == 2) {
            tipoPersonagem = TipoPersoangem.NPC;
        }

    }

}


