package academy.devkaua.maratonajava.javacore.Rdatas.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime nascimento = LocalDateTime.of(2006, Month.SEPTEMBER,20,9,46);
        LocalDateTime now = LocalDateTime.now();

        // Mostra intervalos de Datas.
        System.out.println(ChronoUnit.DAYS.between(nascimento,now));
        System.out.println(ChronoUnit.WEEKS.between(nascimento,now));
        System.out.println(ChronoUnit.MONTHS.between(nascimento,now));
        System.out.println(ChronoUnit.YEARS.between(nascimento,now));
    }
}


