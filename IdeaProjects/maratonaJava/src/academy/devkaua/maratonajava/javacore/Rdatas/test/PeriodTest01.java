package academy.devkaua.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
        // Calcula dias de diferencias entre duas datas
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(5);

        Period tempoEntre = Period.between(now,nowAfterTwoYears);
        Period p1 = Period.ofDays(10);

        System.out.println(tempoEntre);
        System.out.println(now.until(now.plusDays(p1.getDays()), ChronoUnit.DAYS));
    }
}
