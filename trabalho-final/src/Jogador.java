import java.util.List;

public class Jogador extends JogadorManipulacao{

    private String nomeJogador;
    private int idade;
    private  Personagem personagemDoJogador;


    public void imprimirJogador(){
        System.out.println("NOME DO JOGADOR: " + nomeJogador);
        System.out.println("IDADE DO JOGADOR: " + idade);

    }

    //GET SETTERS CONSTRUTORES E TO LIST
    public Jogador(){

    }
    public Jogador(String nome, int idade, Personagem personagemDoJogador){
        this.nomeJogador = nome;
        this.idade = idade;
        this.personagemDoJogador = personagemDoJogador;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Personagem getPersonagemDoJogador() {return personagemDoJogador;}

    public void setPersonagemDoJogador(Personagem personagemDoJogador) {this.personagemDoJogador = personagemDoJogador;}

    @Override
    public String toString() {
        return "Jogador{" +
                "nomeJogador='" + nomeJogador + '\'' +
                ", idade=" + idade +
                ", personagemDoJogador=" + personagemDoJogador +
                '}';
    }



}
