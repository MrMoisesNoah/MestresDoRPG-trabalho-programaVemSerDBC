package PersonagensJogo;

public enum Raca {
    HOMEM("Homem"),
    ELFO("Elfo"),
    ORC("Orc");

    public String getNome() {
        return nome;
    }

    String nome;

    Raca(String nome) {
        this.nome = nome;
    }
}
