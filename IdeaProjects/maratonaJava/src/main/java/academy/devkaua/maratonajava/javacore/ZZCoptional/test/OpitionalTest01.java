package academy.devkaua.maratonajava.javacore.ZZCoptional.test;

import java.util.List;
import java.util.Optional;

public class OpitionalTest01 {
    public static void main(String[] args) {
        Optional<String> nameOptional = findName("Kaua");
        String empty = nameOptional.orElse("EMPTY");
        System.out.println(empty);
        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));
    }

    // quando se ver um Optional, tem que pensar no return de se encontrar ou se nao encontrar.
    private static Optional<String> findName(String name) {
        List<String> nomes = List.of("Kaua", "Henrique");
        int i = nomes.indexOf(name);
        if (i != 1) {
            return Optional.of(nomes.get(i));
        }
        return Optional.empty();
    }
}
