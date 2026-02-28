package academy.devkaua.maratonajava.javacore.ZZCoptional.test;
import academy.devkaua.maratonajava.javacore.ZZCoptional.domain.Manga;
import academy.devkaua.maratonajava.javacore.ZZCoptional.mangaRepository.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> manga = MangaRepository.findByName("Jujutsu Kaisen");
        manga.ifPresent(m -> m.setTitle("Jujutsu Kaisen 2"));
        System.out.println(manga);

        Optional<Manga> mangaById = MangaRepository.findById(2);
        mangaById.orElseThrow(IllegalArgumentException::new);

        Manga newManga = MangaRepository.findByName("Jojo").orElse(new Manga(3, "Jojo", 99));
        System.out.println(newManga);
    }
}
