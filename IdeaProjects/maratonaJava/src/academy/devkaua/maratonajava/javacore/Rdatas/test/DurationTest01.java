package academy.devkaua.maratonajava.javacore.Rdatas.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime twoHours = LocalTime.now().minusHours(2);

        // Pega a distancia entre datas (retorna apenas datas)
        Duration duracao = Duration.between(Instant.now(), Instant.now().plusSeconds(1000000));
        Duration duracao2 = Duration.between(now, twoHours );


        System.out.println(duracao);

        System.out.println(duracao2);
    }
}
