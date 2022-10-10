
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class EquipamentosTest {
    private Equipamentos teste;
    private Equipamentos teste1;
    private Equipamentos teste2;

    List<Equipamentos> equipamentos = new ArrayList<>();


    @BeforeEach
    public void init() {
        teste = new Equipamentos("Teste", TiposItens.ARMADURA, 9, 9, 10, 10);
        teste1 = new Equipamentos("Teste1", TiposItens.ARMADURA, 10, 10, 10, 10);
        teste2 = new Equipamentos("Teste2", TiposItens.ARMADURA, 10, 10, 10, 10);

    }

    @Test
    public void deveTestarMudarNomeDanoDefesa() {

        teste1.setNomeEquipamento("Teste");
        teste1.setDano(9);
        teste1.setDefesa(9);



        assertEquals(teste.getNomeEquipamento(), teste1.getNomeEquipamento());
        assertEquals(teste.getDefesa(), teste1.getDefesa());
        assertEquals(teste.getDefesa(), teste1.getDefesa());

    }

    @Test
    public void deveAdicionarRemoverPersonagem() {

        boolean vazio = equipamentos.isEmpty();

        equipamentos.add(teste2);

        boolean adicionado = equipamentos.contains(teste2);

        equipamentos.remove(teste2);

        boolean retorno = equipamentos.contains(teste2);

        assertTrue(vazio);
        assertTrue(adicionado);
        assertFalse(retorno);

    }
}
