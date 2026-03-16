package academy.devkaua.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        // Retorna Data e Tempo
        LocalDateTime dataTime = LocalDateTime.now();
        LocalDateTime dataTimePersonalizado = LocalDateTime.of(2026,Month.JANUARY,2,5,34);
        LocalDate data = LocalDate.parse("2027-09-01");

        System.out.println(data);
        System.out.println(dataTime);
        System.out.println(dataTimePersonalizado);
    }
}
