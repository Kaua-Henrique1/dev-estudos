package academy.devkaua.maratonajava.javacore.ZZDstreams.test;

import academy.devkaua.maratonajava.javacore.ZZDstreams.domain.Category;
import academy.devkaua.maratonajava.javacore.ZZDstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest04Grouping {

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
        Map<Category, List<LightNovel>> categoryListMap = new HashMap<>();

        Map<Category, List<LightNovel>> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory));

        System.out.println(collect);
    }
}
