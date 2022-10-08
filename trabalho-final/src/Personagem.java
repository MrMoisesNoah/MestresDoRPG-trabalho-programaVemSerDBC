import java.util.List;

public class Personagem extends PersonagemManipulacao implements AcoesPersonagens{
    private String nome;
    private RacaDoPersonagem raca;
    private ClasseDoPersonagem classe;
//    private List<Equipamentos> equipamentos;
    private double forca;
    private double defesa;
    private double constituicao;
    private double inteligencia;
    private double pontosVida;
    private double bonusDano;
    private double bonusDefesa;

    private TipoPersoangem tipoPersoangem;

    public Personagem(){

    }
    public Personagem(String nome, RacaDoPersonagem raca, ClasseDoPersonagem classe, double forca, double defesa, double constituicao,
                      double inteligencia, TipoPersoangem tipoPersoangem, double pontosDeVida) {
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

    public double getBonusDano() {
        return bonusDano;
    }

    public void setBonusDano(double bonusDano) {
        this.bonusDano = bonusDano;
    }

    public double getBonusDefesa() {
        return bonusDefesa;
    }

    public void setBonusDefesa(double bonusDefesa) {
        this.bonusDefesa = bonusDefesa;
    }

    //    public List<Equipamentos> getEquipamentos() {
//        return equipamentos;
//    }
//
//    public void setEquipamentos(List<Equipamentos> equipamentos) {
//        this.equipamentos = equipamentos;
//    }

    public double getForca() {
        return forca;
    }

    public void setForca(double forca) {
        this.forca = forca;
    }

    public double getDefesa() {
        return defesa;
    }

    public void setDefesa(double defesa) {
        this.defesa = defesa;
    }

    public double getConstituicao() {
        return constituicao;
    }

    public void setConstituicao(double constituicao) {
        this.constituicao = constituicao;
    }

    public double getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(double inteligencia) {
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
         double resuldadoDano = Dados.dadosCalcularDano()+personagem1.getBonusDano();
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
        } else {
            System.out.println("Você errou seu Ataque!");
            return false;
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
    public void equiparItem(Equipamentos equipamentos) {

        if(equipamentos.getTipo() == 1) {
            this.setBonusDano(this.getBonusDano() + equipamentos.getDano());
        } else if (equipamentos.getTipo() == 2){
            this.setBonusDano(this.getBonusDano() + equipamentos.getDano());
        }else if (equipamentos.getTipo() == 3){
            this.setDefesa(this.getDefesa() + equipamentos.getDefesa());
        }

    }
    public void usarPocao(Equipamentos equipamentos){

        this.setPontosVida(this.getPontosVida()+equipamentos.getCuraVida());
        System.out.println("O personagem " + this.getNome() + " usou poção de cura." );
        System.out.println("Seus pontos de vida atuais são: " + this.getPontosVida());

    }
}
