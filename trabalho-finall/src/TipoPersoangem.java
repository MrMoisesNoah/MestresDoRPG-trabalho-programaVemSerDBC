public enum TipoPersoangem {
    PERSONAGEM_DO_JOGADOR("Personagem jogado somente pelo Jogador", 1),
    NPC("Personagem do Mestre", 2),
    MONSTRO("Monstro do Mestre", 3);

    private String descricao;
    private int tipo;

    TipoPersoangem(String descricao, int tipo){
        this.descricao = descricao;
        this.tipo = tipo;

    }
}
