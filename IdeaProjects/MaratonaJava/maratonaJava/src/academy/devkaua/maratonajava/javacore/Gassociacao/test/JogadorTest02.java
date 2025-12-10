package academy.devkaua.maratonajava.javacore.Gassociacao.test;

import academy.devkaua.maratonajava.javacore.Gassociacao.domain.Jogador;
import academy.devkaua.maratonajava.javacore.Gassociacao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Pele");
        Jogador jogador2 = new Jogador("Romario");

        Time time = new Time("Brasil");

        Jogador[] jogadores = {jogador, jogador2};
        time.setJogadores(jogadores);

        jogador.setTime(time);
        jogador2.setTime(time);

        System.out.println("--- Jogador ---");
        jogador.imprimi();

        System.out.println("--- Time ---");
        time.imprimi();
    }
}