import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class JogadorManipulacao {
    public List<Jogador> getListaJogadores() {
        return listaJogadores;
    }

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
        procuraJogador.setPersonagemDoJogador(procuraJogador.getPersonagemDoJogador());
    }

    public void listarJogador(){
        for(int i =0; i<listaJogadores.size(); i++){
            System.out.println("Id Jogador = "+i+"|"+ listaJogadores.get(i));
        }
    }

}
