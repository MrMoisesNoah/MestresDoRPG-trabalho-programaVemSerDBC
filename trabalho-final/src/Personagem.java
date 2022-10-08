import java.util.List;

public class Personagem extends PersonagemManipulacao implements AcoesPersonagens{

    //INFORMAÇÕES

    private String nome;
    private RacaDoPersonagem raca;
    private ClasseDoPersonagem classe;

    //EQUIPAMENTOS
    private List<Equipamentos> equipamentos;

    //ATRIBUTOS

    private double forca;
    private double defesa;
    private double constituicao;
    private double inteligencia;
    private double pontosVida;
    private double pontosMana;
    private double bonusDano;
    private double bonusDefesa;

    //TIPOS DE PERSONAGEM
    private TipoPersoangem tipoPersoangem;



    //METODOS DA CLASSE
    //ATACAR
    @Override
    public boolean atacar(Personagem personagem1, Personagem personagem2) {


        while(personagem2.getPontosVida()>0) {
             double resultadoDados = Dados.dadosValidarAtaque()+personagem1.getForca();
             double resuldadoDano = Dados.dadosCalcularDano()+personagem1.getBonusDano();
             double defesa = personagem2.getDefesa();
             double pontosVida = personagem1.getPontosVida();
             if (this.classe.equals(ClasseDoPersonagem.ARQUEIRO) && (resultadoDados >= defesa)) {

                 System.out.println("O Arqueiro " + personagem1.getNome() + " atira uma flecha certeira no " + personagem2.getNome());
                 personagem2.setPontosVida(getPontosVida() - resuldadoDano);
                 System.out.println(personagem2.getNome() + " = " + personagem2.getPontosVida() + " PONTOS DE VIDA");

             } else if (this.classe.equals(ClasseDoPersonagem.GUERREIRO) && (resultadoDados >= defesa)) {

                 System.out.println("O Guerreiro " + personagem1.getNome() + " acerta um golpe de Espada em " + personagem2.getNome());
                 personagem2.setPontosVida(getPontosVida() - resuldadoDano);
                 //System.out.println("O personagem " + personagem2.getNome() + " perdeu " + personagem2.getPontosVida() + "Pontos de Vida");
                 System.out.println(personagem2.getNome() + " = " + personagem2.getPontosVida() + " PONTOS DE VIDA");

             } else if (this.classe.equals(ClasseDoPersonagem.MAGO) && (resultadoDados >= defesa)) {
                 System.out.println("O Mago " + personagem1.getNome() + " lança uma poderosa bola de fogo no " + personagem2.getNome());
                 personagem2.setPontosVida(getPontosVida() - resuldadoDano);
                 System.out.println(personagem2.getNome() + " = " + personagem2.getPontosVida() + " PONTOS DE VIDA");
             } else {
                 System.out.println("Você errou seu Ataque!");
                 return false;
             }
            System.out.println("O MONSTRO MORREU");
         }

        return false;
    }
//USAR CAJADO
    public boolean usarCajado(Personagem personagem1, Personagem personagem2){

        if(personagem1.getClasse().equals(ClasseDoPersonagem.MAGO)){
            this.atacar(personagem1,personagem2);
            this.setPontosMana(getPontosMana()-5);
        }

     return false;
    }

//EQUIPAR ITEM
    @Override
    public boolean equiparItem(Equipamentos equipamentos) {

        if(equipamentos.getTipo() == TiposItens.ARMADURA){
            this.setDefesa(this.getDefesa() + equipamentos.getDefesa());
            System.out.println("O SEU PERSONAGEM EQUIPOU O ITEM = " + equipamentos.getNomeEquipamento());
        }else if(equipamentos.getTipo() == TiposItens.ESPADA && this.getClasse()==ClasseDoPersonagem.GUERREIRO) {
            this.setBonusDano(this.getBonusDano() + equipamentos.getDano());
            System.out.println("O SEU PERSONAGEM EQUIPOU O ITEM = " + equipamentos.getNomeEquipamento());
        } else if (equipamentos.getTipo() == TiposItens.ARCO && this.getClasse()==ClasseDoPersonagem.ARQUEIRO){
            this.setBonusDano(this.getBonusDano() + equipamentos.getDano());
            System.out.println("O SEU PERSONAGEM EQUIPOU O ITEM = " + equipamentos.getNomeEquipamento());
        }else if (equipamentos.getTipo() == TiposItens.ESCUDO && !(this.getClasse()==ClasseDoPersonagem.MAGO)) {
            this.setDefesa(this.getDefesa() + equipamentos.getDefesa());
            System.out.println("O SEU PERSONAGEM EQUIPOU O ITEM = " + equipamentos.getNomeEquipamento());
        } else if (equipamentos.getTipo() == TiposItens.CAJADO && this.getClasse()==ClasseDoPersonagem.MAGO){
            this.setBonusDano(this.getBonusDano() + equipamentos.getDano());
            System.out.println("O SEU PERSONAGEM EQUIPOU O ITEM = " + equipamentos.getNomeEquipamento());}
        else {
            System.out.println("Seu Personagem não pode Equipar este item.");
            return false;
        }
        return false;

    }
//USAR POÇÃO
    public void usarPocao(Equipamentos equipamentos){
        if(equipamentos.getTipo().equals(TiposItens.POCAO_VIDA)) {
            this.setPontosVida(this.getPontosVida() + equipamentos.getCuraVida());
            System.out.println("O personagem " + this.getNome() + " usou poção de cura.");
            System.out.println("Seus pontos de vida atuais são: " + this.getPontosVida());
        } else if (equipamentos.getTipo().equals(TiposItens.POCAO_MANA)) {
            this.setPontosMana(this.getPontosMana() + equipamentos.getRestauraMana());
            System.out.println("O personagem " + this.getNome() + " usou poção de cura.");
            System.out.println("Seus pontos de vida atuais são: " + this.getPontosVida());

        }
    }


    // GETS SETTERS CONSTRUTORES E TO STRING
    public Personagem(){

    }
    public Personagem(String nome, RacaDoPersonagem raca, ClasseDoPersonagem classe, double forca, double defesa, double constituicao,
                      double inteligencia, TipoPersoangem tipoPersoangem, double pontosDeVida, double pontosMana) {
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
        this.pontosMana = pontosMana;

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

    public double getBonusDano() {return bonusDano;}

    public void setBonusDano(double bonusDano) {this.bonusDano = bonusDano;}

    public double getBonusDefesa() {return bonusDefesa;}

    public void setBonusDefesa(double bonusDefesa) {this.bonusDefesa = bonusDefesa;}

    public double getPontosMana() {return pontosMana;}

    public void setPontosMana(double pontosMana) {this.pontosMana = pontosMana;}

    public List<Equipamentos> getEquipamentos() {return equipamentos;}

    public void setEquipamentos(List<Equipamentos> equipamentos) {this.equipamentos = equipamentos;}

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
                "nome='" + nome + '\'' +
                ", raca=" + raca +
                ", classe=" + classe +
                ", equipamentos=" + equipamentos +
                ", forca=" + forca +
                ", defesa=" + defesa +
                ", constituicao=" + constituicao +
                ", inteligencia=" + inteligencia +
                ", pontosVida=" + pontosVida +
                ", pontosMana=" + pontosMana +
                ", bonusDano=" + bonusDano +
                ", bonusDefesa=" + bonusDefesa +
                ", tipoPersoangem=" + tipoPersoangem +
                '}';
    }
}
