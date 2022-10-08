import java.util.ArrayList;
import java.util.List;

public class EquipamentosManipulacao {
    private List<Equipamentos> listaEquipamentos;


    public EquipamentosManipulacao(){
        this.listaEquipamentos = new ArrayList<>();
    }

    public void adicionarEquipamentos(Equipamentos equipamentos){
        this.listaEquipamentos.add(equipamentos);
    }

    public void removerEquipamentos(Integer index){

        this.listaEquipamentos.remove(index.intValue());
    }

    public void editarEquipamentos(Integer index, Equipamentos equipamentos){
        Equipamentos procuraEquipamentos = listaEquipamentos.get(index);
        procuraEquipamentos.setNomeEquipamento(equipamentos.getNomeEquipamento());
        procuraEquipamentos.setDano(equipamentos.getDano());
        procuraEquipamentos.setDefesa(equipamentos.getDefesa());
        procuraEquipamentos.setCuraVida(equipamentos.getCuraVida());
        procuraEquipamentos.setRestauraMana(equipamentos.getRestauraMana());
        procuraEquipamentos.setTipo(equipamentos.getTipo());

    }

    public void listarEquipamentos(){
        for(int i = 0; i<listaEquipamentos.size(); i++){
            System.out.println("Id Itens = " + i +"|" + listaEquipamentos.get(i));
        }
    }
}
