package academy.devkaua.maratonajava.javacore.Rdatas.test;

import java.time.*;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> ShortIds = ZoneId.SHORT_IDS;
        System.out.println(ZoneId.systemDefault());
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");

        LocalDateTime localDateTime = LocalDateTime.now();

        ZonedDateTime localAlterado = localDateTime.atZone(tokyoZone);

        System.out.println("localAlterado: "+localAlterado);

        Instant nowInstant = Instant.now();
        System.out.println("Local atual alterado: "+nowInstant);

        ZonedDateTime ZonedDateTime2 = nowInstant.atZone(tokyoZone);
        System.out.println("Local tokyoZone: "+ZonedDateTime2);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);
    }
}
