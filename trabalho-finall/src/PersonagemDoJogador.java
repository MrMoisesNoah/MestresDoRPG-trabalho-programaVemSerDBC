public enum PersonagemDoJogador {
    PERSONAGEM_DO_JOGADOR("Personagem jogado somente pelo Jogador", 1);

    private String descricao;
    private int tipo;

    PersonagemDoJogador(String descricao, int tipo){
        this.descricao = descricao;
        this.tipo = tipo;

    }
}
