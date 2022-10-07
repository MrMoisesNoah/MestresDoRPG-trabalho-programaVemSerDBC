public enum RacaDoPersonagem {

    HOMEM("Bonus de Defesa", 5),
    ELFO("Bonus de Inteligencia", 5),
    ORC("Bonus de Ataque", 5);

    private String descricao;
    private int bonus;


     RacaDoPersonagem(){

    }
     RacaDoPersonagem(String descricao, int bonus){
        this.bonus=bonus;
        this.descricao = descricao;
    }

}
