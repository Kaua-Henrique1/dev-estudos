package academy.devkaua.maratonajava.leetCode.listaEncadeadas.test;

import academy.devkaua.maratonajava.leetCode.listaEncadeadas.domain.Ninjas;

import java.util.LinkedList;

public class ListaNinjas {
    public static void main(String[] args) {
        Ninjas ninjas1 = new Ninjas("Kaua", 19, "Zona louca");
        Ninjas ninjas2 = new Ninjas("Lucas", 14, "Zona calma");
        Ninjas ninjas3 = new Ninjas("Giovanna", 19, "Zona louca");
        Ninjas ninjas4 = new Ninjas("Fernanda", 20, "Zona negra");
        Ninjas ninjas5 = new Ninjas("Maria", 50, "Zona franco");
        Ninjas ninjas6 = new Ninjas("Marcos", 50, "Zona louca");
        Ninjas ninjas7 = new Ninjas("Lerce", 2, "Zona nato");

        LinkedList<Ninjas> list = new LinkedList<>();

        list.add(ninjas1);
        list.add(ninjas2);
        list.add(ninjas3);
        list.add(ninjas4);
        list.add(ninjas5);
        list.add(ninjas6);
        list.add(ninjas7);

        list.addFirst(new Ninjas("Nome", 21, "Vila"));

        for (Ninjas n : list) {
            System.out.println(n);
        }
        System.out.println("-------------------");
        list.removeFirst();

        for (Ninjas n : list) {
            System.out.println(n);
        }
        System.out.println("-------------------");
    }
}
