import java.util.ArrayList;
import java.util.List;

public class PersonagemManipulacao {
    private List<Personagem> listaDePersonagens;

    public PersonagemManipulacao() {
        this.listaDePersonagens = new ArrayList<>();
    }

    public void adicionarPersonagem(Personagem personagem) {
        this.listaDePersonagens.add(personagem);
    }

    public void removerPersonagemPorIndice(Integer index) {
        this.listaDePersonagens.remove(index.intValue());
    }

    public void editarPersonagem(Integer index, Personagem personagem) {
        Personagem personagemProcurado = listaDePersonagens.get(index);
        personagemProcurado.setNome(personagem.getNome());
        personagemProcurado.setRaca(personagem.getRaca());
        personagemProcurado.setClasse(personagem.getClasse());
//        personagemProcurado.setEquipamentos(personagem.getEquipamentos());
        personagemProcurado.setForca(personagem.getForca());
        personagemProcurado.setDefesa(personagem.getDefesa());
        personagemProcurado.setConstituicao(personagem.getConstituicao());
        personagemProcurado.setInteligencia(personagem.getInteligencia());
        personagemProcurado.setTipoPersoangem(personagem.getTipoPersoangem());
        personagemProcurado.setPontosVida(personagem.getPontosVida());
        personagemProcurado.setPontosMana(personagem.getPontosMana());
    }

    public void listarPersonagem() {
        for (int i = 0; i < listaDePersonagens.size(); i++) {
            System.out.println("id=" + i + " | " + listaDePersonagens.get(i));
        }
    }
}
