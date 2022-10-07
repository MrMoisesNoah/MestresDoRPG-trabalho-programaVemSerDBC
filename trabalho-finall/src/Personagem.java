import java.util.List;

public class Personagem {
    private String nome;
    private RacaDoPersonagem raca;
    private ClasseDoPersonagem classe;
//    private List<Equipamentos> equipamentos;
    private int forca;
    private int defesa;
    private int constituicao;
    private int inteligencia;

    private TipoPersoangem tipoPersoangem;

    public Personagem(String nome, RacaDoPersonagem raca, ClasseDoPersonagem classe, int forca, int defesa, int constituicao, int inteligencia, TipoPersoangem tipoPersoangem) {
        this.nome = nome;
        this.raca = raca;
        this.classe = classe;
//        this.equipamentos = equipamentos;
        this.forca = forca;
        this.defesa = defesa;
        this.constituicao = constituicao;
        this.inteligencia = inteligencia;
        this.tipoPersoangem = tipoPersoangem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public RacaDoPersonagem getRaca() {
        return raca;
    }

    public void setRaca(RacaDoPersonagem raca) {
        this.raca = raca;
    }

    public ClasseDoPersonagem getClasse() {
        return classe;
    }

    public void setClasse(ClasseDoPersonagem classe) {
        this.classe = classe;
    }

//    public List<Equipamentos> getEquipamentos() {
//        return equipamentos;
//    }
//
//    public void setEquipamentos(List<Equipamentos> equipamentos) {
//        this.equipamentos = equipamentos;
//    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getConstituicao() {
        return constituicao;
    }

    public void setConstituicao(int constituicao) {
        this.constituicao = constituicao;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public TipoPersoangem getTipoPersoangem() {return tipoPersoangem;}
    public void setTipoPersoangem(TipoPersoangem tipoPersoangem){ this.tipoPersoangem = tipoPersoangem;}

    @Override
    public String toString() {
        return "Personagem{" +
                "Nome='" + nome + '\'' +
                ", Raca=" + raca.getNome() +
                ", Classe=" + classe.getNome() +
                ", Forca=" + forca +
                ", Defesa=" + defesa +
                ", Constituicao=" + constituicao +
                ", Inteligencia=" + inteligencia +
                ", TipoPersoangem=" + tipoPersoangem.getDescricao() +
                '}';
    }
}
