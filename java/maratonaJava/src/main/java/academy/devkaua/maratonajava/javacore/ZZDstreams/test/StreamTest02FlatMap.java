package academy.devkaua.maratonajava.javacore.ZZDstreams.test;

import academy.devkaua.maratonajava.javacore.ZZDstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest02FlatMap {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();

        List<String> graphicDesigners = List.of("Wildnei Suane", "Catarina Santos", "Sandy Carolina");
        List<String> developers = List.of("William", "David", "Harisson");
        List<String> students = List.of("Édipo", "Gustavo Lima", "Gustavo Mendes", "Guilherme");

        devdojo.add(graphicDesigners);
        devdojo.add(developers);
        devdojo.add(students);

        // usa o flatMap para quando se tem varias camandas dentro de uma lista.
        // assim jutando todas as list em uma so list mae.
        devdojo.stream()

                // O Collection::stream é a instrução: "Abra a caixa e coloque o conteúdo na esteira".
                //O flatMap é o gerente que garante que, no final, você tenha apenas uma esteira longa com todos os nomes em fila, e não caixas passando pela esteira.
                .flatMap(Collection::stream)
                .forEach(System.out::print);
    }
}
