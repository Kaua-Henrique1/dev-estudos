package academy.devkaua.maratonajava.javacore.ZclassesInternas.test;

import academy.devkaua.maratonajava.javacore.Ygenerics.domain.Barco;

import java.util.Comparator;
import java.util.List;

public class AnnonymousClassesTest02 {
    public static void main(String[] args) {
        List<Barco> barcos = List.of(new Barco("Canoa"), new Barco("Lancha"));

        barcos.sort(new Comparator<Barco>() {
            @Override
            public int compare(Barco o1, Barco o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });
    }
}
