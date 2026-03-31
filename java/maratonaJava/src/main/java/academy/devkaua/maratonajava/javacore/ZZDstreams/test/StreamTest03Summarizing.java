package academy.devkaua.maratonajava.javacore.ZZDstreams.test;

import academy.devkaua.maratonajava.javacore.ZZDstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest03Summarizing {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("A123", 2.99),
            new LightNovel("Z123", 10.59),
            new LightNovel("F123", 1.99),
            new LightNovel("H123", 7.99),
            new LightNovel("W123", 9.59),
            new LightNovel("B123", 5.50),
            new LightNovel("O123", 6.00)
    ));

    public static void main(String[] args) {
        // Ele retorna várias retornos, métodos que pode ser util.
        // count=7, sum=44.650000, min=1.990000, average=6.378571, max=10.590000
        DoubleSummaryStatistics collect = lightNovels.stream()
                .collect(Collectors.summarizingDouble(LightNovel::getPrice));

        System.out.println(collect);
    }
}
