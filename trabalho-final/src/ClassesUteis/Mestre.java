package ClassesUteis;

import java.util.List;

public class Mestre {
    private String nomeMestre;
    private int idadeMestre;
    private List<Personagem> personagensMestre;




    //METODOS DA CLASSE
    public void imprimirMestre(){
        System.out.println("NOME DO JOGADOR: " + nomeMestre);
        System.out.println("IDADE DO JOGADOR: " + idadeMestre);

    }


    //GET SETTERS CONSTRUTORES E TO LIST

    public Mestre(){

    }
    public Mestre(String nome, int idadeMestre, List<Personagem> personagensMestre){
        this.nomeMestre = nome;
        this.idadeMestre = idadeMestre;
        this.personagensMestre = personagensMestre.stream().toList();
    }

    public String getNomeMestre() {return nomeMestre;}

    public void setNomeMestre(String nomeMestre) {this.nomeMestre = nomeMestre;}

    public int getIdadeMestre() {return idadeMestre;}

    public void setIdadeMestre(int idadeMestre) {this.idadeMestre = idadeMestre;}

    public List<Personagem> getPersonagensMestre() {return personagensMestre;}

    public void setPersonagensMestre(List<Personagem> personagensMestre) {this.personagensMestre = personagensMestre;}

    @Override
    public String toString() {
        return "ClassesUteis.Mestre{" +
                "nomeMestre='" + nomeMestre + '\'' +
                ", idadeMestre=" + idadeMestre +
                ", personagensMestre=" + personagensMestre +
                '}';
    }
}


