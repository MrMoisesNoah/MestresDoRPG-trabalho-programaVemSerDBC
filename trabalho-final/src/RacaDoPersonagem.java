public enum RacaDoPersonagem {

    HOMEM("Homem","Bonus de Defesa", 5),
    ELFO("Elfo","Bonus de Inteligencia", 5),
    ORC("Orc","Bonus de Ataque", 5);

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

    RacaDoPersonagem(String nome, String descricao, int bonus){
        this.nome=nome;
        this.bonus=bonus;
        this.descricao = descricao;
    }

}
