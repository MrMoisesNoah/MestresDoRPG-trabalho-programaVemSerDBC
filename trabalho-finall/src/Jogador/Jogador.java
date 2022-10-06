package Jogador;

import java.util.List;

public class Jogador {

    private String nomeJogador;
    private String idade;
    private List<Personagem> personagemJogador;



    Jogador(String nomeJogador, String idade, Personagem personagemJogador){
        this.nomeJogador = nomeJogador;
        this.idade = idade;
        this.personagemJogador.add(personagemJogador);

    }
    public void imprimirJogador(){
        System.out.println("NOME DO JOGADOR: " + nomeJogador);
        System.out.println("IDADE DO JOGADOR: " + idade);
        System.out.println("----PERSONAGEM-----");
        System.out.println(personagemJogador.get(i).imprimirPersonagem);

    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }


}
