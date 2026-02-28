package academy.devkaua.maratonajava.javacore.ZZCoptional.mangaRepository;

import academy.devkaua.maratonajava.javacore.ZZCoptional.domain.Manga;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    static List<Manga> mangas = new ArrayList<>(List.of(new Manga(1,"Jujutsu Kaisen", 50), new Manga(2, "Naruto", 120)));

    public static Optional<Manga> findByName(String title) {
        return find(manga -> manga.getTitle().equals(title));
    }

    public static Optional<Manga> findById(Integer id) {
        return find(manga -> manga.getId().equals(id));
    }

    public static Optional<Manga> find(Predicate<Manga> predicate) {
        Manga found = null;

        for (Manga manga: mangas) {
            if (predicate.test(manga)) {
                found = manga;
            }
        }
        return Optional.ofNullable(found);
     }
}
