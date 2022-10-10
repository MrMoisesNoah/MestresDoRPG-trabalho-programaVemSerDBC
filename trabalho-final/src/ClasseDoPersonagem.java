public enum ClasseDoPersonagem {

    GUERREIRO("Guerreiro","Especialista Curta distancia, bonus com espadas", 5),
    ARQUEIRO("Arqueiro", "Especialista Longa Distancia, bonus com arcos", 5),
    MAGO("Mago","Classe Magica, bonus com cajado", 5);

    private String descricao;
    private int bonus;
    
    private String nome;


    public String getDescricao() {
        return descricao;
    }

    public int getBonus() {
        return bonus;
    }

    public String getNome() {
        return nome;
    }

    ClasseDoPersonagem(String nome, String descricao, int bonus){
        this.nome = nome;
        this.descricao = descricao;
        this.bonus = bonus;
    }



}
