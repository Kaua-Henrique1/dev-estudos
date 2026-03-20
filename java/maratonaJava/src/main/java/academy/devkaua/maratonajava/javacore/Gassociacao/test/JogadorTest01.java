package academy.devkaua.maratonajava.javacore.Gassociacao.test;

import academy.devkaua.maratonajava.javacore.Gassociacao.domain.Jogador;
import academy.devkaua.maratonajava.javacore.Gassociacao.domain.Time;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        Jogador jogador2 = new Jogador("Adriano Imperador");

        Time time = new Time("Selecao Brasileira");

        jogador1.setTime(time);

        jogador1.imprimi();

    }
}
