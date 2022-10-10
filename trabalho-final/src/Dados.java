public class Dados {

    static public double dadosValidarAtaque() {
        double resultado = Math.floor(Math.random() * 20)+1;

        return resultado;
    }

    static public double dadosCalcularDano() {
        double resultado = Math.floor(Math.random() * 10)+1;

        return resultado;
    }

}
