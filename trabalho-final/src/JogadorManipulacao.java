import java.util.ArrayList;
import java.util.List;

public class JogadorManipulacao {
    private List<Jogador> listaJogadores;


    public JogadorManipulacao(){
        listaJogadores = new ArrayList<>();
    }

    public void adicionarJogador(Jogador jogador){
        this.listaJogadores.add(jogador);
    }

    public void removerJogador (Integer index){
        this.listaJogadores.get(index.intValue());
    }
    public void editarJogador(Jogador jogador, Integer index){
        Jogador procuraJogador = listaJogadores.get(index);
        procuraJogador.setNomeJogador(procuraJogador.getNomeJogador());
        procuraJogador.setIdade(procuraJogador.getIdade());
    }

    public void listarJogador(){
        for(int i =0; i<listaJogadores.size(); i++){
            System.out.println("Id Jogador = "+i+"|"+"JOGADOR = " + listaJogadores.get(i));
        }
    }
}
