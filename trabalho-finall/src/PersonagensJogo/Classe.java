package PersonagensJogo;

public enum Classe {
    GUERREIRO("Guerreiro"),
    ARQUEIRO("Arqueiro"),
    MAGO("Mago");

    public String getNome() {
        return nome;
    }

    String nome;
    Classe(String nome) {
        this.nome = nome;
    }
}
