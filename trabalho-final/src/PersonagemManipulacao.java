import java.util.ArrayList;
import java.util.List;

public abstract class PersonagemManipulacao implements AcoesPersonagens {
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
    }

    public void listarPersonagem() {
        for (int i = 0; i < listaDePersonagens.size(); i++) {
            System.out.println("id=" + i + " | " + listaDePersonagens.get(i));
        }
    }

    @Override
    public boolean atacar( Personagem personagem1, Personagem personagem2) {
        return false;
    }

    @Override
    public boolean defender(Personagem personagem1, Personagem personagem2) {
        return false;
    }

    @Override
    public boolean equiparItem(Equipamentos equipamento) {
        return false;
    }
}
