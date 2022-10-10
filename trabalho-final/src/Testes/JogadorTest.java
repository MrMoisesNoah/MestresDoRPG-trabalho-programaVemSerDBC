package Testes;

import ClassesUteis.Jogador;
import ClassesUteis.Personagem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class JogadorTest {
    private Jogador teste;
    private Jogador teste1;

    Personagem pj1 = new Personagem();
    private List<Jogador> listaJogadores;

    @BeforeEach
    public void init() {
        teste = new Jogador("teste", 15, pj1);
        teste1 = new Jogador("teste1", 16, pj1);

    }

    @Test
    public void deveTestarMudarNome() {

        teste.setNomeJogador("teste1");



        assertEquals(teste.getNomeJogador(), teste1.getNomeJogador());


    }

    @Test
    public void deveAdicionarRemoverPersonagem() {

        boolean vazio = listaJogadores.isEmpty();

        listaJogadores.add(teste);

        boolean adicionado = listaJogadores.contains(teste);

        listaJogadores.remove(teste);

        boolean retorno = listaJogadores.contains(teste);

        assertTrue(vazio);
        assertTrue(adicionado);
        assertFalse(retorno);

    }
}
