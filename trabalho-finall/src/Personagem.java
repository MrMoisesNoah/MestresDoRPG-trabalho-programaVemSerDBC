public class Personagem {
    private String nome;
    private String raca;
    private String classe;
    private List<Equipamentos> equipamentos;
    private int forca;
    private int defesa;
    private int constituicao;
    private int inteligencia;

    public Personagem(String nome, String raca, String classe, List<Equipamentos> equipamentos, int forca, int defesa, int constituicao, int inteligencia) {
        this.nome = nome;
        this.raca = raca;
        this.classe = classe;
        this.equipamentos = equipamentos;
        this.forca = forca;
        this.defesa = defesa;
        this.constituicao = constituicao;
        this.inteligencia = inteligencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public List<Equipamentos> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<Equipamentos> equipamentos) {
        this.equipamentos = equipamentos;
    }

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
}
