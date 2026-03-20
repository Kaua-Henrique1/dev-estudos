package academy.devkaua.maratonajava.javacore.Xcolecoes.test;

import academy.devkaua.maratonajava.javacore.Xcolecoes.domain.Consumidor;
import academy.devkaua.maratonajava.javacore.Xcolecoes.domain.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor("Kaua");
        Consumidor consumidor2 = new Consumidor("Lucas");
        System.out.println(consumidor);

        Manga Manga1 = new Manga(3L, "Berserk", 19.9);
        Manga Manga2 = new Manga(4L, "Demon Slayer", 25D);
        Manga Manga3 = new Manga(2L, "Jojo Bizarre Adventure", 37.5);
        Manga Manga4 = new Manga(1L, "Vinland Saga", 17.49);

        List<Manga> listConsumidor1 = List.of(Manga1, Manga2);
        List<Manga> listConsumidor2 = List.of(Manga3, Manga4);
        Map<Consumidor, List<Manga>> mapConsumidor = new HashMap<>();
        mapConsumidor.put(consumidor, listConsumidor1);
        mapConsumidor.put(consumidor2, listConsumidor2);

        for (Map.Entry<Consumidor, List<Manga>> entrey : mapConsumidor.entrySet()) {
            System.out.println(entrey.getKey().getNome());
            for (Manga manga : entrey.getValue()) {
                System.out.println(manga.getNome());
            }
            System.out.println("------------------");
        }
    }
}
