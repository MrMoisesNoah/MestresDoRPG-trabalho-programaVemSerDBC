import java.util.List;

public class Jogador {

    private String nomeJogador;
    private int idade;

    private  List<Personagem> personagemDoJogador;





    public void imprimirJogador(){
        System.out.println("NOME DO JOGADOR: " + nomeJogador);
        System.out.println("IDADE DO JOGADOR: " + idade);

    }

    //GET SETTERS CONSTRUTORES E TO LIST
    public Jogador(){

    }
    public Jogador(String nome, int idade, List<Personagem> personagemDoJogador){
        this.nomeJogador = nome;
        this.idade = idade;
        this.personagemDoJogador = personagemDoJogador.stream().toList();
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
    @Override
    public String toString() {
        return "Jogador{" +
                "nomeJogador='" + nomeJogador + '\'' +
                ", idade='" + idade + '\'' +
                '}';
    }



}
