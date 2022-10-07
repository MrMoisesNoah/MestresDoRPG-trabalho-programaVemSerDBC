

import java.util.List;

public class Mestre {
    private String nomeMestre;
    private List<Personagem> npc;
    private List<Personagem> monstros;


    public void imprimirMestre(String nomeMestre){
        System.out.println("NOME DO MESTRE: " + nomeMestre);

    }

    public void imprimirMonstro(){

    }
    public void imprimirNPC(){

    }

    public Mestre(){

    }
    public Mestre(String nomeMestre, Personagem npc, Personagem monstros) {
        this.nomeMestre = nomeMestre;
        this.npc.add(npc);
        this.monstros.add(monstros);
    }

    public String getNomeMestre() {
        return nomeMestre;
    }

    public void setNomeMestre(String nomeMestre) {
        this.nomeMestre = nomeMestre;
    }
}
