import java.util.List;

public class Jogador {

    private String nomeJogador;
    private String idade;
 ]


    @Override
    public String toString() {
        return "Jogador{" +
                "nomeJogador='" + nomeJogador + '\'' +
                ", idade='" + idade + '\'' +
                '}';
    }

    public void imprimirJogador(){
        System.out.println("NOME DO JOGADOR: " + nomeJogador);
        System.out.println("IDADE DO JOGADOR: " + idade);

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
