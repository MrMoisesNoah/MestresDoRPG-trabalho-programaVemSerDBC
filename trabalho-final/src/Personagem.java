import java.util.List;

public class Personagem extends PersonagemManipulacao{
    private String nome;
    private RacaDoPersonagem raca;
    private ClasseDoPersonagem classe;
//    private List<Equipamentos> equipamentos;
    private int forca;
    private int defesa;
    private int constituicao;
    private int inteligencia;
    private double pontosVida;

    private TipoPersoangem tipoPersoangem;

    public Personagem(){

    }
    public Personagem(String nome, RacaDoPersonagem raca, ClasseDoPersonagem classe, int forca, int defesa, int constituicao, int inteligencia, TipoPersoangem tipoPersoangem, double pontosDeVida) {
        this.nome = nome;
        this.raca = raca;
        this.classe = classe;
//        this.equipamentos = equipamentos;
        this.forca = forca;
        this.defesa = defesa;
        this.constituicao = constituicao;
        this.inteligencia = inteligencia;
        this.tipoPersoangem = tipoPersoangem;
        this.pontosVida = pontosDeVida;

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

    public double getPontosVida() {
        return pontosVida;
    }

    public void setPontosVida(double pontosVida) {
        this.pontosVida = pontosVida;
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
                ", PontosDeVida=" + pontosVida +
                '}';
    }

    @Override
    public boolean atacar(Personagem personagem1, Personagem personagem2) {
         double resultadoDados = Dados.dadosValidarAtaque()+personagem1.getForca();
         double resuldadoDano = Dados.dadosCalcularDano();
         double defesa = personagem2.getDefesa();
         double pontosVida = personagem1.getPontosVida();

        if (this.classe.equals(ClasseDoPersonagem.ARQUEIRO) && (resultadoDados>=defesa)){

            System.out.println("O Arqueiro " + personagem1.getNome() + " atira uma flecha certeira no " + personagem2.getNome());
            personagem2.setPontosVida(getPontosVida()- resuldadoDano);
            System.out.println(personagem2.getNome() + " = " + personagem2.getPontosVida() + " PONTOS DE VIDA");

        } else if (this.classe.equals(ClasseDoPersonagem.GUERREIRO)&& (resultadoDados>=defesa)){

            System.out.println("O Guerreiro " + personagem1.getNome() + " acerta um golpe de Espada em " + personagem2.getNome());
            personagem2.setPontosVida(getPontosVida()- resuldadoDano);
            //System.out.println("O personagem " + personagem2.getNome() + " perdeu " + personagem2.getPontosVida() + "Pontos de Vida");
            System.out.println(personagem2.getNome() + " = " + personagem2.getPontosVida() + " PONTOS DE VIDA");

        } else if (this.classe.equals(ClasseDoPersonagem.MAGO) && (resultadoDados>=defesa)) {
            System.out.println("O Mago " + personagem1.getNome() + " lança uma poderosa bola de fogo no " + personagem2.getNome());
            personagem2.setPontosVida(getPontosVida()- resuldadoDano);
            System.out.println(personagem2.getNome() + " = " + personagem2.getPontosVida() + " PONTOS DE VIDA");
        }
        return false;
    }

    @Override
    public boolean defender(Personagem personagem1, Personagem personagem2) {
//        double resultadoDados = Dados.dadosValidarAtaque()+ personagem1.getDefesa();
//        if (){
//
//        }
        return false;
    }

    @Override
    public boolean equiparItem(Equipamentos equipamentos) {
        return false;
    }
}
