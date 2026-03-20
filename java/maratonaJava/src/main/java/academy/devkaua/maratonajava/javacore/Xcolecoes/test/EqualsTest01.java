package academy.devkaua.maratonajava.javacore.Xcolecoes.test;

import academy.devkaua.maratonajava.javacore.Xcolecoes.domain.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("Aipone", "1BFED2");
        Smartphone smartphone2 = new Smartphone("Aipone", "1BFED2");
        System.out.println(smartphone.equals(smartphone2));     
    }
}
