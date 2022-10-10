


import java.util.ArrayList;
import java.util.List;

public class MestreManipulacao {

    public List<Mestre> listaMestre;


    public void JogadorManipulacao(){
        listaMestre = new ArrayList<>();
    }

    public void adicionarMestre(Mestre mestre){
        this.listaMestre.add(mestre);
    }



    public void removerMestre (Mestre mestre) {
        this.listaMestre.remove(mestre);
    }
    public void editarMestre(Jogador jogador, Integer index){
        Mestre procurarMestre = listaMestre.get(index);
        procurarMestre.setNomeMestre(procurarMestre.getNomeMestre());
        procurarMestre.setIdadeMestre(procurarMestre.getIdadeMestre());
        procurarMestre.setPersonagensMestre(procurarMestre.getPersonagensMestre());
    }

    public void listarMestre(){
        for(int i =0; i<listaMestre.size(); i++){
            System.out.println("Id Jogador = "+i+"|"+ listaMestre.get(i));
        }
    }


    public Mestre selecionarMestre(int index){
        return listaMestre.get(index);
    }
}