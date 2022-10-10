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



    public void removerJogador (Jogador jogador) {
        this.listaJogadores.remove(jogador);
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


    public Jogador selecionarJogador(int index){
        return listaJogadores.get(index);
    }



}
