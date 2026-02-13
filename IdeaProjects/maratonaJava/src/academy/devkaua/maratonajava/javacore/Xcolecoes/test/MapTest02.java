package academy.devkaua.maratonajava.javacore.Xcolecoes.test;

import academy.devkaua.maratonajava.javacore.Xcolecoes.domain.Consumidor;
import academy.devkaua.maratonajava.javacore.Xcolecoes.domain.Manga;

import java.awt.font.FontRenderContext;
import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor("Kaua");
        Consumidor consumidor2 = new Consumidor("Lucas");
        System.out.println(consumidor);

        Manga Manga1 = new Manga(3L, "Berserk", 19.9);
        Manga Manga2 = new Manga(4L, "Demon Slayer", 25D);
        Manga Manga3 = new Manga(2L, "Jojo Bizarre Adventure", 37.5);
        Manga Manga4 = new Manga(1L, "Vinland Saga", 17.49);

        Map<Consumidor, Manga> mapConsumidor = new HashMap<>();
        mapConsumidor.put(consumidor, Manga1);
        mapConsumidor.put(consumidor2, Manga2);

        for (Map.Entry<Consumidor, Manga> entry : mapConsumidor.entrySet()) {
            System.out.println(entry.getKey().getNome() + "-" + entry.getValue().getNome());
        }
    }
}
