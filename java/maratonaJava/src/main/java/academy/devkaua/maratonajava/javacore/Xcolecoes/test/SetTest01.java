package academy.devkaua.maratonajava.javacore.Xcolecoes.test;

import academy.devkaua.maratonajava.javacore.Xcolecoes.domain.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        // Essa e a melhor forma para se trabalhar
        // Ele nao mantem a ordem de insertion. Se quiser manter, use o LinkedHashSet().
        Set<Manga> mangaSet = new HashSet<>();
        mangaSet.add(new Manga(3L,"Berserk", 19.9));
        mangaSet.add(new Manga(4L,"Demon Slayer", 25D));
        mangaSet.add(new Manga(2L,"Jojo Bizarre Adventure", 37.5));
        mangaSet.add(new Manga(1L,"Vinland Saga", 17.49));

        // Nao vai ser imprimido, pois o equals nao deixa ter duplicadas.
        mangaSet.add(new Manga(1L,"Vinland Saga", 17.49));

        for (Manga manga : mangaSet) {
            System.out.println(manga);
        }

    }
}
