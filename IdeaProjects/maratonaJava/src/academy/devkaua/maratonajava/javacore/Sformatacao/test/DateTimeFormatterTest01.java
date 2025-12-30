package academy.devkaua.maratonajava.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println("------------------------");
        LocalDate parse1 = LocalDate.parse("20251230", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2025-12-30", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2025-12-30", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        System.out.println("-----------------------");
        DateTimeFormatter formatterBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBr = LocalDate.now().format(formatterBr);
        System.out.println(formatBr);
        LocalDate parseBR = LocalDate.parse("30/12/2025", formatterBr);
        System.out.println(parseBR);

        System.out.println("--------------------------");
        DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        String formatGR = LocalDate.now().format(formatterGR);
        System.out.println(formatGR);
        LocalDate parseGR = LocalDate.parse("30.Dezember.2025", formatterGR);
        System.out.println(parseGR);
    }
}
