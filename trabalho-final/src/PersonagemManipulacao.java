import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonagemManipulacao {
    public List<Personagem> getListaDePersonagens() {
        return listaDePersonagens;
    }

    private List<Personagem> listaDePersonagens;

    public PersonagemManipulacao() {
        this.listaDePersonagens = new ArrayList<>();
    }

    public void adicionarPersonagem(Personagem personagem) {
        this.listaDePersonagens.add(personagem);
    }

    public void removerPersonagemPorIndice(Personagem personagem) {
        this.listaDePersonagens.remove(personagem);
    }

    public void editarPersonagem(Integer index, Personagem personagem) {
        Personagem personagemProcurado = listaDePersonagens.get(index);
        personagemProcurado.setNome(personagem.getNome());
        personagemProcurado.setRaca(personagem.getRaca());
        personagemProcurado.setClasse(personagem.getClasse());
        personagemProcurado.setForca(personagem.getForca());
        personagemProcurado.setDefesa(personagem.getDefesa());
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


    public boolean verificarMonstrosVivos() {
        Optional<Personagem> listaMonstrosVivos = listaDePersonagens.stream()
                .filter(monstro -> monstro.getPontosVida() > 0)
                .findAny();
        if (listaMonstrosVivos.isPresent()) {
            System.out.println("TRUE");
            return true;
        } else {
            return false;
        }
    }

}
