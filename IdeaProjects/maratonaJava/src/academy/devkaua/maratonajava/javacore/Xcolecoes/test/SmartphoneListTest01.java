package academy.devkaua.maratonajava.javacore.Xcolecoes.test;

import academy.devkaua.maratonajava.javacore.Xcolecoes.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("FG3J3", "IAPONE");
        Smartphone s2 = new Smartphone("43GH4G", "MIAU");
        Smartphone s3 = new Smartphone("14XEW32", "MIAU2");
        List<Smartphone> listaTelefone = new ArrayList<>(6);
        listaTelefone.add(s1);
        listaTelefone.add(s2);
        listaTelefone.add(0,s3); // Muda para a posicao 0.

        for (Smartphone smartphone: listaTelefone) {
            System.out.println(smartphone);
        }
        Smartphone s4 = new Smartphone("14XEW32", "MIAU2");
        System.out.println(listaTelefone.contains(s4)); // Verifica se esse objeto ja existe
        System.out.println(s4.equals(s3)); // mesma coisa que o contains

        int indexTelefone4 = listaTelefone.indexOf(s4);
        System.out.println(indexTelefone4); // Retorna -1 (se ele nao existir na list)

        System.out.println(listaTelefone.get(indexTelefone4)); // Ele acha o objeto que esta dentro da lista. E nao do objeto s4.
    }
}
