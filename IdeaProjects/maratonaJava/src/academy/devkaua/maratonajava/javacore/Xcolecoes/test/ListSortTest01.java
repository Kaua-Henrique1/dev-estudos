package academy.devkaua.maratonajava.javacore.Xcolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(22D);
        dinheiros.add(123.23);
        dinheiros.add(12D);
        dinheiros.add(43.34);

        Collections.sort(dinheiros);

        for (Double dinheiro : dinheiros) {
            System.out.println(dinheiro);
        }
    }
}
