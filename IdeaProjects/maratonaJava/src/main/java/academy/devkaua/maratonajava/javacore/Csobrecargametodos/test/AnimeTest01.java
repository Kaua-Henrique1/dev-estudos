package academy.devkaua.maratonajava.javacore.Csobrecargametodos.test;

import academy.devkaua.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Goku","TV",12,"Acao");

        anime.imprimir();
    }
}
