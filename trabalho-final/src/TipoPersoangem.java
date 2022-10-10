public enum TipoPersoangem {
    PERSONAGEM_DO_JOGADOR("Personagem do jogador.", 1),
    NPC("Personagem do Mestre", 2),
    MONSTRO("Monstro do Mestre", 3);

    public String getDescricao() {
        return descricao;
    }

    public int getTipo() {
        return tipo;
    }

    private String descricao;
    private int tipo;

    TipoPersoangem(String descricao, int tipo){
        this.descricao = descricao;
        this.tipo = tipo;

    }
}
