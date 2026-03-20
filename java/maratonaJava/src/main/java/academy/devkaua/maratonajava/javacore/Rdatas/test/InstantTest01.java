package academy.devkaua.maratonajava.javacore.Rdatas.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
        //  O 'Z' significa que e um horario padronizado.
        // OBS: O 'Z' significa que e um horario zulo.
        Instant now = Instant.now();

        // Pega Nano segundos
        System.out.println(now);
        System.out.println(LocalDateTime.now());
    }
}
