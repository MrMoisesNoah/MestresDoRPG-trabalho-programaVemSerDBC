public class Dados {

    static public double dadosValidarAtaque() {
        double resultado = Math.floor(Math.random() * 20)+1;
        System.out.println("Resultado do Dado: " + (int)resultado);
        return resultado;
    }

    static public double dadosCalcularDano() {
        double resultado = Math.floor(Math.random() * 10)+1;
        System.out.println("Adicionando " + (int)resultado + " ao seu dano.");
        return resultado;
    }

}
