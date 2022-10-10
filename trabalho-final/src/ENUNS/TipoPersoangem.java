package ENUNS;

public enum TipoPersoangem {
    PERSONAGEM_DO_JOGADOR("ClassesUteis.Personagem do jogador.", 1),
    NPC("ClassesUteis.Personagem do ClassesUteis.Mestre", 2),
    MONSTRO("Monstro do ClassesUteis.Mestre", 3);

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
