public class Equipamentos {
    private String nomeEquipamento;
    private TiposItens tipo;
    private double dano;
    private double defesa;
    private double curaVida;
    private double restauraMana;



    //GETS SETTERS CONTRUTORES E TO STRING
    public Equipamentos(){

    }
    public Equipamentos(String nome, TiposItens tipo, double dano, double defesa, double curaVida, double restauraMana){
    this.nomeEquipamento = nome;
    this.tipo = tipo;
    this.dano = dano;
    this.defesa = defesa;
    this.curaVida = curaVida;
    this.restauraMana = restauraMana;

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
        return curaVida;
    }

    public void setPocao(double pocao) {
        this.curaVida = pocao;
    }

    public TiposItens getTipo() {return tipo;}

    public void setTipo(TiposItens tipo) {this.tipo = tipo;}

    public double getCuraVida() {return curaVida;}

    public void setCuraVida(double curaVida) {this.curaVida = curaVida;}

    public double getRestauraMana() {return restauraMana;}

    public void setRestauraMana(double restauraMana) {this.restauraMana = restauraMana;}

    @Override
    public String toString() {
        return "Equipamentos{" +
                "nomeEquipamento='" + nomeEquipamento + '\'' +
                ", tipo=" + tipo +
                ", dano=" + dano +
                ", defesa=" + defesa +
                ", curaVida=" + curaVida +
                ", restauraMana=" + restauraMana +
                '}';
    }
}
