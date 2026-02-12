package academy.devkaua.maratonajava.javacore.Xcolecoes.test;

import academy.devkaua.maratonajava.javacore.Xcolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(3L,"Berserk", 19.9));
        mangas.add(new Manga(4L,"Demon Slayer", 25D));
        mangas.add(new Manga(2L,"Jojo Bizarre Adventure", 37.5));
        mangas.add(new Manga(1L,"Vinland Saga", 17.49));

        // Collections.sort(mangas);
        mangas.sort(new MangaByIdComparator());

        for (Manga manga : mangas) {
            System.out.println(manga);
        }


        Manga mangaToSearch = new Manga(3L,"Berserk", 19.9);

        System.out.println(Collections.binarySearch(mangas, mangaToSearch));

    }
}
