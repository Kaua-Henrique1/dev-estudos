package academy.devkaua.maratonajava.javacore.ZZDstreams.test;

import academy.devkaua.maratonajava.javacore.ZZDstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest01Introduction {
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
        List<String> titles = lightNovels.stream()

                .sorted(Comparator.comparing(LightNovel::getName))
                .filter(ln -> ln.getPrice() <= 9)
                .limit(4)

                // aqui ele transforma o objeto LightNovel em String.
                .map(LightNovel::getName)

                // e um metodo TERMINAL, onde coleta os dados e retorna
                .collect(Collectors.toList());

        System.out.println(titles);
    }
}
