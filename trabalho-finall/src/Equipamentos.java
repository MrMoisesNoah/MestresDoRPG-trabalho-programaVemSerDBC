public class Equipamentos {
    private String nomeEquipamento;
    private double dano;
    private double defesa;
    private double pocao;

    public Equipamentos(){

    }
        public Equipamentos(String nome, double dano, double defesa, double pocao){
        this.nomeEquipamento = nome;
        this.dano = dano;
        this.defesa = defesa;
        this.pocao = pocao;

    }

    public String getNomeEquipamento() {
        return nomeEquipamento;
    }

    public void setNomeEquipamento(String nomeEquipamento) {
        this.nomeEquipamento = nomeEquipamento;
    }

    public double getDano() {
        return dano;
    }

    public void setDano(double dano) {
        this.dano = dano;
    }

    public double getDefesa() {
        return defesa;
    }

    public void setDefesa(double defesa) {
        this.defesa = defesa;
    }

    public double getPocao() {
        return pocao;
    }

    public void setPocao(double pocao) {
        this.pocao = pocao;
    }
}
