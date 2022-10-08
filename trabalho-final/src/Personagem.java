import java.util.List;

public class Personagem extends PersonagemManipulacao implements AcoesPersonagens{

    //INFORMAÇÕES

    private String nome;
    private RacaDoPersonagem raca;
    private ClasseDoPersonagem classe;

    //ATRIBUTOS

    private double forca;
    private double defesa;
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
    public boolean atacar(Personagem personagem2) {


        if(personagem2 != null){
            while (personagem2.getPontosVida() > 0) {

                //VALIDAÇÃO DE DADOS E SOMA COM ATRIBUTOS

                double resultadoDadosGerais = Dados.dadosValidarAtaque() + this.getForca();
                double resuldadoDanoGerais = Dados.dadosCalcularDano() + this.getBonusDano();
                double ataqueMago = Dados.dadosValidarAtaque() + this.getInteligencia();
                double danoMago = Dados.dadosCalcularDano() + this.getInteligencia();
                double defesa = personagem2.getDefesa();
                double pontosVida = personagem2.getPontosVida();

                //VALIDAÇÃO TIPO DE ATAQUE/CLASSE

                //ARQUEIRO
                if (this.classe.equals(ClasseDoPersonagem.ARQUEIRO) && (resultadoDadosGerais >= defesa)) {

                    System.out.println("O Arqueiro " + personagem2.getNome() + " atira uma flecha certeira no " + personagem2.getNome());
                    personagem2.setPontosVida(getPontosVida() - resuldadoDanoGerais);
                    System.out.println(personagem2.getNome() + " = " + personagem2.getPontosVida() + " PONTOS DE VIDA");
                //GUERREIRO
                } else if (this.classe.equals(ClasseDoPersonagem.GUERREIRO) && (resultadoDadosGerais >= defesa)) {

                    System.out.println("O Guerreiro " + personagem2.getNome() + " acerta um golpe de Espada em " + personagem2.getNome());
                    personagem2.setPontosVida(getPontosVida() - resuldadoDanoGerais);
                    //System.out.println("O personagem " + personagem2.getNome() + " perdeu " + personagem2.getPontosVida() + "Pontos de Vida");
                    System.out.println(personagem2.getNome() + " = " + personagem2.getPontosVida() + " PONTOS DE VIDA");
                //MAGO
                } else if (this.classe.equals(ClasseDoPersonagem.MAGO) && (ataqueMago >= defesa)) {
                    System.out.println("O Mago " + personagem2.getNome() + " lança uma poderosa bola de fogo no " + personagem2.getNome());
                    personagem2.setPontosVida(getPontosVida() - danoMago);
                    System.out.println(personagem2.getNome() + " = " + personagem2.getPontosVida() + " PONTOS DE VIDA");
                }
                //CASO DE FALHA!
                else {
                    System.out.println("Você errou seu Ataque!");
                    return false;
                }
                //MORTE DO PERSONAGEM
                System.out.println("O SEU INIMIGO MORREU");
            }
        }

        return false;
    }
//USAR CAJADO

    public boolean usarCajado(Personagem personagem2){

    //VALIDAÇÃO PARA USO DE CAJADO SOMENTE PARA MAGOS!

        if(personagem2 != null){
            if (this.getClasse().equals(ClasseDoPersonagem.MAGO)) {
                this.atacar(personagem2);
                this.setPontosMana(getPontosMana() - 5);
            }
        }

     return false;
    }

//EQUIPAR ITEM

    @Override
    public boolean equiparItem(Equipamentos equipamentos) {

        if(equipamentos != null){
            //ARMADURA
            if (equipamentos.getTipo() == TiposItens.ARMADURA) {
                this.setDefesa(this.getDefesa() + equipamentos.getDefesa());
                System.out.println("O SEU PERSONAGEM EQUIPOU O ITEM = " + equipamentos.getNomeEquipamento());
            }
            //ESPADA
            else if (equipamentos.getTipo() == TiposItens.ESPADA && this.getClasse() == ClasseDoPersonagem.GUERREIRO) {
                this.setBonusDano(this.getBonusDano() + equipamentos.getDano());
                System.out.println("O SEU PERSONAGEM EQUIPOU O ITEM = " + equipamentos.getNomeEquipamento());
            }
            //ARCO
            else if (equipamentos.getTipo() == TiposItens.ARCO && this.getClasse() == ClasseDoPersonagem.ARQUEIRO) {
                this.setBonusDano(this.getBonusDano() + equipamentos.getDano());
                System.out.println("O SEU PERSONAGEM EQUIPOU O ITEM = " + equipamentos.getNomeEquipamento());
            }
            //ESCUDO
            else if (equipamentos.getTipo() == TiposItens.ESCUDO && !(this.getClasse() == ClasseDoPersonagem.MAGO)) {
                this.setDefesa(this.getDefesa() + equipamentos.getDefesa());
                System.out.println("O SEU PERSONAGEM EQUIPOU O ITEM = " + equipamentos.getNomeEquipamento());
            }
            //CAJADO
            else if (equipamentos.getTipo() == TiposItens.CAJADO && this.getClasse() == ClasseDoPersonagem.MAGO) {
                this.setBonusDano(this.getBonusDano() + equipamentos.getDano());
                System.out.println("O SEU PERSONAGEM EQUIPOU O ITEM = " + equipamentos.getNomeEquipamento());
            }
            //NÃO PODE EQUIPAR
            else {
                System.out.println("Seu Personagem não pode Equipar este item.");
                return false;
            }
        }
        return false;

    }
//USAR POÇÃO
    public void usarPocao(Equipamentos equipamentos){
        if(equipamentos != null){

            //POÇÃO DE CURA
            if (equipamentos.getTipo().equals(TiposItens.POCAO_VIDA)) {
                this.setPontosVida(this.getPontosVida() + equipamentos.getCuraVida());
                System.out.println("O personagem " + this.getNome() + " usou poção de cura.");
                System.out.println("Seus pontos de vida atuais são: " + this.getPontosVida());
            }

            //POÇÃO DE MANA
            else if (equipamentos.getTipo().equals(TiposItens.POCAO_MANA)) {
                this.setPontosMana(this.getPontosMana() + equipamentos.getRestauraMana());
                System.out.println("O personagem " + this.getNome() + " usou poção de cura.");
                System.out.println("Seus pontos de vida atuais são: " + this.getPontosVida());

            }
        }
    }



    // GETS SETTERS, CONSTRUTORES E TO STRING
    public Personagem(){

    }
    public Personagem(String nome, RacaDoPersonagem raca, ClasseDoPersonagem classe, double forca, double defesa, double constituicao,
                      double inteligencia, TipoPersoangem tipoPersoangem, double pontosDeVida, double pontosMana) {
        this.nome = nome;
        this.raca = raca;
        this.classe = classe;
        this.forca = forca;
        this.defesa = defesa;
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
                ", forca=" + forca +
                ", defesa=" + defesa +
                ", inteligencia=" + inteligencia +
                ", pontosVida=" + pontosVida +
                ", pontosMana=" + pontosMana +
                ", bonusDano=" + bonusDano +
                ", bonusDefesa=" + bonusDefesa +
                ", tipoPersoangem=" + tipoPersoangem +
                '}';
    }
}
