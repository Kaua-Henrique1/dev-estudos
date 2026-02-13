package academy.devkaua.maratonajava.javacore.Xcolecoes.test;

import academy.devkaua.maratonajava.javacore.Xcolecoes.domain.Manga;
import academy.devkaua.maratonajava.javacore.Xcolecoes.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphonrMarcaComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}
public class NavigableSetTest01 {
    public static void main(String[] args) {
        // TreeSet deve usar uma classe que implements um Comparator
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphonrMarcaComparator());
        Smartphone smartphone = new Smartphone("Aipone", "1d2f32");
        set.add(smartphone);
        System.out.println(set);

        NavigableSet< Manga> mangas = new TreeSet<>();
        mangas.add(new Manga(3L,"Berserk", 19.9));
        mangas.add(new Manga(4L,"Demon Slayer", 25D));
        mangas.add(new Manga(2L,"Jojo Bizarre Adventure", 37.5));
        mangas.add(new Manga(1L,"Vinland Saga", 17.49));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }


    }


}
