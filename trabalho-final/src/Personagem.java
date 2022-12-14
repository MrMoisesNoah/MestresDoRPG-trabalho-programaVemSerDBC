public class Personagem implements AcoesPersonagens {

    //INFORMAÇÕES

    private String nome;
    private RacaDoPersonagem raca;
    private ClasseDoPersonagem classe;


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

        double resultadoDados = Dados.dadosValidarAtaque()+personagem1.getForca();
        double resuldadoDano = Dados.dadosCalcularDano()+personagem1.getBonusDano();
        double ataqueMago = Dados.dadosValidarAtaque()+personagem1.getInteligencia();
        double danoMago = Dados.dadosCalcularDano()+ personagem1.getInteligencia();
        double defesa = personagem2.getDefesa();
        if (this.classe.equals(ClasseDoPersonagem.ARQUEIRO) && (resultadoDados >= defesa)) {

            System.out.println("O Arqueiro " + personagem1.getNome() + " atira uma flecha certeira no " + personagem2.getNome());
            personagem2.setPontosVida(personagem2.getPontosVida() - resuldadoDano);
            System.out.println("O seu inimigo : " + personagem2.getNome() + " está com = " + personagem2.getPontosVida() + " PONTOS DE VIDA");

        } else if (this.classe.equals(ClasseDoPersonagem.GUERREIRO) && (resultadoDados >= defesa)) {

            System.out.println("O Guerreiro " + personagem1.getNome() + " acerta um golpe de Espada em " + personagem2.getNome());
            personagem2.setPontosVida(personagem2.getPontosVida() - resuldadoDano);
            System.out.println("O seu inimigo : " + personagem2.getNome() + " está com = " + personagem2.getPontosVida() + " PONTOS DE VIDA");

        } else if (this.classe.equals(ClasseDoPersonagem.MAGO) && (ataqueMago >= defesa) && personagem2.getPontosVida() > 0) {
            System.out.println("O Mago " + personagem1.getNome() + " lança uma poderosa bola de fogo no " + personagem2.getNome());
            personagem2.setPontosVida(personagem2.getPontosVida() - danoMago);
            personagem1.setPontosMana(personagem1.getPontosMana() - 5);
            System.out.println("O seu inimigo  " + personagem2.getNome() + " está com = " + personagem2.getPontosVida() + " PONTOS DE VIDA");
            System.out.println("O seu poderoso MAGO gastou Pontos de Mana. "+personagem1.getNome() + " agora está com = " + personagem1.getPontosMana() + " PONTOS DE MANA");
        } else {
            System.out.println("Você errou seu Ataque!");
            return false;
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
        } else if (equipamentos.getTipo() == TiposItens.CAJADO && this.getClasse()== ClasseDoPersonagem.MAGO) {
            this.setBonusDano(this.getBonusDano() + equipamentos.getDano());
            System.out.println("O SEU PERSONAGEM EQUIPOU O ITEM = " + equipamentos.getNomeEquipamento());
        } else if(equipamentos.getTipo().equals(TiposItens.POCAO_VIDA)) {
            this.setPontosVida(this.getPontosVida() + equipamentos.getCuraVida());
            System.out.println("O personagem " + this.getNome() + " usou poção de cura.");
            System.out.println("Seus pontos de vida atuais são: " + this.getPontosVida());
        } else if (equipamentos.getTipo().equals(TiposItens.POCAO_MANA)) {
            this.setPontosMana(this.getPontosMana() + equipamentos.getRestauraMana());
            System.out.println("O personagem " + this.getNome() + " usou poção de cura.");
            System.out.println("Seus pontos de vida atuais são: " + this.getPontosVida());
        }
        else {
            System.out.println("Seu Personagem não pode Equipar este item.");
            return false;
        }
        return false;

    }
//USAR POÇÃO
    public void usarPocao(Equipamentos equipamentos){

    }


    // GETS SETTERS CONSTRUTORES E TO STRING
    public Personagem(){

    }
    public Personagem(String nome, RacaDoPersonagem raca, ClasseDoPersonagem classe, double forca, double defesa, double constituicao,
                      double inteligencia, TipoPersoangem tipoPersoangem, double pontosDeVida, double pontosMana) {
        this.nome = nome;
        this.raca = raca;
        this.classe = classe;
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
        return "Personagem: " + nome + '\'' +
                ", raca=" + raca +
                ", classe=" + classe +
                ", forca=" + forca +
                ", defesa=" + defesa +
                ", constituicao=" + constituicao +
                ", inteligencia=" + inteligencia +
                ", pontosVida=" + pontosVida +
                ", pontosMana=" + pontosMana +
                ", bonusDano=" + bonusDano +
                ", bonusDefesa=" + bonusDefesa +
                ", tipoPersoangem=" + tipoPersoangem;
    }
}
