package academy.devkaua.maratonajava.javacore.Xcolecoes.test;

import academy.devkaua.maratonajava.javacore.Xcolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(3L,"Berserk", 19.9, 0));
        mangas.add(new Manga(4L,"Demon Slayer", 25D, 7));
        mangas.add(new Manga(2L,"Jojo Bizarre Adventure", 37.5, 3));
        mangas.add(new Manga(1L,"Vinland Saga", 17.49, 0));

        /* Iterator<Manga> mangaIterator = mangas.iterator();
        while (mangaIterator.hasNext()) {
            Manga manga = mangaIterator.next();
            if (manga.getQuantidade() == 0) {
                mangaIterator.remove();
            }
        }
         */
        // Dessa forma pode remover de forma segura.
        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);


    }
}
