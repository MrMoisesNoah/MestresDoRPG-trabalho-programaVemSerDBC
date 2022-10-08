

import java.util.List;

public class CampanhaDoMestre {
    private String titulo;
    private String historia;
    private String nomeDoMestre;
    private int idadeMestre;
    private List<Personagem> personagensMestre;


    //METODOS DA CLASSE


    //GET SETTERS CONSTRUTORES E TO LIST

    public CampanhaDoMestre(){

    }

    public CampanhaDoMestre(String titulo, String historia, String nomeDoMestre, int idadeMestre, List<Personagem> personagensMestre) {
        this.titulo = titulo;
        this.historia = historia;
        this.nomeDoMestre = nomeDoMestre;
        this.idadeMestre = idadeMestre;
        this.personagensMestre = personagensMestre;
    }

    public String getTitulo() {return titulo;}

    public void setTitulo(String titulo) {this.titulo = titulo;}

    public String getHistoria() {return historia;}

    public void setHistoria(String historia) {this.historia = historia;}

    public String getNomeDoMestre() {return nomeDoMestre;}

    public void setNomeDoMestre(String nomeDoMestre) {this.nomeDoMestre = nomeDoMestre;}

    public int getIdadeMestre() {return idadeMestre;}

    public void setIdadeMestre(int idadeMestre) {this.idadeMestre = idadeMestre;}

    public List<Personagem> getPersonagensMestre() {return personagensMestre;}

    public void setPersonagensMestre(List<Personagem> personagensMestre) {this.personagensMestre = personagensMestre;}

    @Override
    public String toString() {
        return "CampanhaDoMestre{" +
                "titulo='" + titulo + '\'' +
                ", historia='" + historia + '\'' +
                ", nomeDoMestre='" + nomeDoMestre + '\'' +
                ", idadeMestre=" + idadeMestre +
                ", personagensMestre=" + personagensMestre +
                '}';
    }
}


