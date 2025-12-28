package academy.devkaua.maratonajava.javacore.Rdatas.test;

import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(18,56,35);
        LocalTime timeNow = LocalTime.now();

        System.out.println(time);
        System.out.println(timeNow);

        System.out.println(time.getHour());
        System.out.println(LocalTime.MIN);
    }
}
