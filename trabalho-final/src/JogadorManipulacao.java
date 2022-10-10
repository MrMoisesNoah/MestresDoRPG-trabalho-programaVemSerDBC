import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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


    public boolean testarJogador(JogadorManipulacao teste) throws VerificarJogadorException {
        Optional<Jogador> testando = listaJogadores.stream()
                .filter(jogador -> listaJogadores.contains(jogador))
                .findFirst();
        if (testando.isPresent()) {
            return true;
        } else {
            throw new VerificarJogadorException("Jogador inexistente, construir jogador novo");
        }
    }
}
