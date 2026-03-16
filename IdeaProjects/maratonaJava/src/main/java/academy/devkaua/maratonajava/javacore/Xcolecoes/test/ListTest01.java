package academy.devkaua.maratonajava.javacore.Xcolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        // List = Class mais generica
        // ArrayList = Class mais especifica que usamos para ter melhor performaces (Big-O)
        List<String> listaNomes = new ArrayList<>();
        List<Integer> numeros = new ArrayList<>();
        listaNomes.add("Kaua");
        listaNomes.add("Henrique");

        for (String nome: listaNomes) {
            System.out.println(nome);
        }
        System.out.println("-------------------");
        listaNomes.add("Almeida");

        for (int i = 0; i < listaNomes.size(); i++) {
            System.out.println(listaNomes.get(i));
        }
    }
}
