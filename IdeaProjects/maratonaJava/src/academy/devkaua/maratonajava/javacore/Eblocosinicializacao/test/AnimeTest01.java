package academy.devkaua.maratonajava.javacore.Eblocosinicializacao.test;

import academy.devkaua.maratonajava.javacore.Eblocosinicializacao.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("one piece");
        System.out.println(anime.getEpsodios());

        for (int epsodio : anime.getEpsodios()) {
            System.out.print(epsodio + " ");
        }

    }
}
