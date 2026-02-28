package academy.devkaua.maratonajava.javacore.ZZBlambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdasTest01 {
    public static void main(String[] args) {
        List<String> strings = List.of("Kaua", "Henrique", "Almeida", "Salvador");
        forEach(strings, s -> System.out.println(s));

        List<Integer> integers = List.of(1,2,3,4,5);
        forEach(integers, integer -> System.out.println(integer));
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }
    }
}
