package academy.devkaua.maratonajava.javacore.ZZBlambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdasTest02 {
    public static void main(String[] args) {
        List<String> strings = List.of("Kaua", "Henrique", "Almeida", "Salvador");
        System.out.println(map(strings, s -> s.length()));

        // Method Reference: É uma sintaxe para deixar mais limpo
        //                   Ela so pode ser usada quanto a interface funcional so usa um parametro.
        List<String> map2 = map(strings, String::toUpperCase);
        System.out.println(map2);
    }

    private static <T, R> List<R> map(List<T> list, Function<T,R> function) {
        List<R> result = new ArrayList<>();
        for (T e : list) {
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }
}
