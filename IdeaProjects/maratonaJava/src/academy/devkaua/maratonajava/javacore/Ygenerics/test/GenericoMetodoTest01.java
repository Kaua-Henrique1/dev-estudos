package academy.devkaua.maratonajava.javacore.Ygenerics.test;

import academy.devkaua.maratonajava.javacore.Ygenerics.domain.Barco;

import java.util.ArrayList;
import java.util.List;

public class GenericoMetodoTest01 {
    public static void main(String[] args) {
        List<Barco> canoa = metodoGenerico(new Barco("Canoa"));
        System.out.println(canoa);
    }
    // Dessa forma que se pode trabalhar com metodo genrericos (Que recebe qualquer Objeto)
    // OBS: NAO recebe tipos primitivos (int, double ...)
    private static <T> List<T> metodoGenerico(T t) {
        List<T> list = List.of(t);
        System.out.println(list);

        return list;
    }
    // Assim você recebe apenas objetos que seja do tipo Comparable:
    private static <T extends Comparable<T>> List<T> metodoGenericoTipoComparable(T t) {
        List<T> list = List.of(t);
        System.out.println(list);

        return list;
    }
}

class DoisAtributos<T, X, I> {
    private T t;
    private X x;
    private I i;

    public DoisAtributos(T t, X x, I i) {
        this.t = t;
        this.x = x;
        this.i = i;
    }
}

