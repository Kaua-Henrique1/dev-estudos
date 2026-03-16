package academy.devkaua.maratonajava.javacore.ZZDstreams.test;

import academy.devkaua.maratonajava.javacore.ZZDstreams.domain.Category;
import academy.devkaua.maratonajava.javacore.ZZDstreams.domain.LightNovel;
import academy.devkaua.maratonajava.javacore.ZZDstreams.domain.Promotion;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest06Grouping {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("A123", 2.99, Category.FANTASY),
            new LightNovel("Z123", 10.59, Category.FANTASY),
            new LightNovel("F123", 1.99, Category.DRAMA),
            new LightNovel("H123", 7.99, Category.FANTASY),
            new LightNovel("W123", 9.59, Category.FANTASY),
            new LightNovel("B123", 5.50, Category.FANTASY),
            new LightNovel("O123", 6.00, Category.ROMANCE)
    ));

    public static void main(String[] args) {

        // Agrupa por Category e mostra o lightNovels mais caro de cada um, Optional::get extrai o objeto de
        // dentro do Optional (o que é seguro aqui, pois o groupingBy garante que nenhum grupo estará vazio).
        Map<Category, LightNovel> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));

        System.out.println(collect);
    }
}
