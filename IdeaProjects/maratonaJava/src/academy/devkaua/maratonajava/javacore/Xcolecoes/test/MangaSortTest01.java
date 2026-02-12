package academy.devkaua.maratonajava.javacore.Xcolecoes.test;

import academy.devkaua.maratonajava.javacore.Xcolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Classe que implementa Comparator para definir uma regra de ordenação EXTERNA (pelo ID).
// Ela sobrescreve o método compare() para decidir a ordem entre dois objetos Manga.
class MangaByIdComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

/*Comparable (implements Comparable na class Manga): É como o RG do Mangá. O Mangá nasce sabendo sua ordem
 natural (ex: por nome). É uma regra interna.

Comparator (class MangaByIdComparator): É como um Juiz Convidado. Ele não faz parte do Mangá. Você
 chama ele só quando quer uma regra específica (ex: "Hoje quero ordenar por ID", ou "Amanhã por Preço").*/

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(3L,"Berserk", 19.9));
        mangas.add(new Manga(4L,"Demon Slayer", 25D));
        mangas.add(new Manga(2L,"Jojo Bizarre Adventure", 37.5));
        mangas.add(new Manga(1L,"Vinland Saga", 17.49));


        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        Collections.sort(mangas);
        System.out.println("-------------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        // Collections.sort(mangas, new MangaByIdComparator());
        mangas.sort(new MangaByIdComparator());
        System.out.println("-------------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }


    }
}
