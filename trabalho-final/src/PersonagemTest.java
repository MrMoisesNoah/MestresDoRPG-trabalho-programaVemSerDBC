import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class PersonagemTest {
    private Personagem teste;
    private Personagem teste1;
    private Personagem teste2;

    List<Personagem> personagens = new ArrayList<>();


    @BeforeEach
    public void init() {
        teste = new Personagem("Teste", RacaDoPersonagem.ORC, ClasseDoPersonagem.MAGO, 10,9,8,7, TipoPersoangem.PERSONAGEM_DO_JOGADOR, 20);
        teste1 = new Personagem("Teste2", RacaDoPersonagem.ORC, ClasseDoPersonagem.MAGO, 10,9,8,7, TipoPersoangem.PERSONAGEM_DO_JOGADOR, 20);
        teste2 = new Personagem("Teste3", RacaDoPersonagem.ORC, ClasseDoPersonagem.MAGO, 10,9,8,7, TipoPersoangem.PERSONAGEM_DO_JOGADOR, 20);

    }

    @Test
    public void deveTestarEditarForcaDefesaConstituiciaoInteligencia() {


        teste1.setForca(10);
        teste1.setDefesa(9);
        teste1.setInteligencia(7);
        teste1.setConstituicao(8);


        assertEquals(teste.getForca(), teste1.getForca());
        assertEquals(teste.getDefesa(), teste1.getDefesa());
        assertEquals(teste.getInteligencia(), teste1.getInteligencia());
        assertEquals(teste.getConstituicao(), teste1.getConstituicao());

    }

    @Test
    public void deveAdicionarRemoverPersonagem() {

        boolean vazio = personagens.isEmpty();

        personagens.add(teste2);

        boolean adicionado = personagens.contains(teste2);

        personagens.remove(teste2);

        boolean retorno = personagens.contains(teste2);

        assertTrue(vazio);
        assertTrue(adicionado);
        assertFalse(retorno);

    }
}
