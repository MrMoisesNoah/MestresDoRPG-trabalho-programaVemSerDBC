import java.util.ArrayList;
import java.util.List;

public class CenarioManipulacao {
    public List<Cenario> listarCenarioManipulacao;


    public CenarioManipulacao(){
        listarCenarioManipulacao = new ArrayList<>();
    }

    public void adicionarCenario(Cenario cenario){
        this.listarCenarioManipulacao.add(cenario);
    }



    public void removerCenario (Cenario cenario) {
        this.listarCenarioManipulacao.remove(cenario);
    }
    public void editarCenario(Cenario cenario, Integer index){
        Cenario procurarCenario = listarCenarioManipulacao.get(index);
        procurarCenario.setJogadorManipulacao(procurarCenario.getJogadorManipulacao());
        procurarCenario.setPersonagemManipulacao(procurarCenario.getPersonagemManipulacao());
        procurarCenario.setListaEquipamentos(procurarCenario.getListaEquipamentos());
        procurarCenario.setNomeMestre(procurarCenario.getNomeMestre());
    }

    public void listarCenario(){
        for(int i = 0; i< listarCenarioManipulacao.size(); i++){
            System.out.println("Id Jogador = "+i+"|"+ listarCenarioManipulacao.get(i));
        }
    }


    public Cenario selecionarCenario(int index){
        return listarCenarioManipulacao.get(index);
    }

}