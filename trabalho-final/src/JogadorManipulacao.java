import java.util.ArrayList;
import java.util.List;

public class JogadorManipulacao  {


    public List<Jogador> listaJogadores;


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

    public List<Jogador> selecionarJogadorPorIndice(Integer index){
        this.listaJogadores.contains(index.intValue());
        return null;
    }

    public Jogador getJogador(int index){
        return listaJogadores.get(index);
    }

}
