public enum ClasseDoPersonagem {

    GUERREIRO("Especialista Curta distancia, bonus com espadas", 5),
    ARQUEIRO("Especialista Longa Distancia, bonus com arcos", 5),
    MAGO("Classe Magica, bonus com cajado", 5);

    private String descricao;
    private int bonus;

    ClasseDoPersonagem(){

    };

     ClasseDoPersonagem(String descricao, int bonus){
        this.descricao = descricao;
        this.bonus = bonus;
    }



}
