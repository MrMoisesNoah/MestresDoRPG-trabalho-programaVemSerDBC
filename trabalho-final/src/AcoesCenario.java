
public interface AcoesCenario {
        void iniciarJogo();

        void criarPersonagens();

        void criarEquipamentos();

        void iniciarBatalha(Jogador jogador, Personagem monstro);

        void escolherQualItenParaEquipar();

        void iniciarHistoria();

    }
