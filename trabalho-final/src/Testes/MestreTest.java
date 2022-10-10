package Testes;

import ClassesUteis.Mestre;
import ClassesUteis.Personagem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MestreTest {

    Mestre testandoMestre3;
    int idade = 15;
    String nome = "nomeMestre";

    List<Personagem> personagensMestre = new ArrayList<>();


    @BeforeEach
    public void init() {


        testandoMestre3 = new Mestre(nome, idade, personagensMestre);


    }
    @Test
    public void deveTestarMudarNome() {
        testandoMestre3.setNomeMestre("teste1");

        assertEquals("teste1", testandoMestre3.getNomeMestre());

    }

    @Test
    public void deveAdicionarRemoverMestre() {
        Personagem personagemMestre1 = new Personagem();


        boolean vazio = personagensMestre.isEmpty();

        personagensMestre.add(personagemMestre1);

        boolean adicionado = personagensMestre.contains(personagemMestre1);

        personagensMestre.remove(personagemMestre1);

        boolean retorno = personagensMestre.contains(personagemMestre1);

        assertTrue(vazio);
        assertTrue(adicionado);
        assertFalse(retorno);

    }
}
