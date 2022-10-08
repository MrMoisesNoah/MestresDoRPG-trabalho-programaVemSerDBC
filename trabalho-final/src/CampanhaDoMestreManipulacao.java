import java.util.ArrayList;
import java.util.List;

public class CampanhaDoMestreManipulacao {

    List<CampanhaDoMestre> listaDeCamapanhas;

    public CampanhaDoMestreManipulacao(){
        this.listaDeCamapanhas = new ArrayList<>();
    }

    public void adicionarCampanhaDoMestre(CampanhaDoMestre campanhaDoMestre){
        this.listaDeCamapanhas.add(campanhaDoMestre);
    }
    public void removerCamapanhaDoMestre(CampanhaDoMestre campanhaDoMestre){
        this.listaDeCamapanhas.remove(campanhaDoMestre);
    }
    public void editarCamapanhaDoMestre(Integer index, CampanhaDoMestre campanhaDoMestre){
        CampanhaDoMestre procuraCampanha = listaDeCamapanhas.get(index);
        procuraCampanha.setTitulo(procuraCampanha.getTitulo());
        procuraCampanha.setHistoria(procuraCampanha.getHistoria());
        procuraCampanha.setNomeDoMestre(procuraCampanha.getNomeDoMestre());
        procuraCampanha.setIdadeMestre(procuraCampanha.getIdadeMestre());
    }
    public void listarCampanhasDoMestre(){
        for(int i = 0; i<listaDeCamapanhas.size(); i++){
            System.out.println("id=" + i + " | " + listaDeCamapanhas.get(i));
        }
    }


}
