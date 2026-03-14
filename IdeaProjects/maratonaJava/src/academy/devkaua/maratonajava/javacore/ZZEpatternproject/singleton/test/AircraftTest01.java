package academy.devkaua.maratonajava.javacore.ZZEpatternproject.singleton.test;

import academy.devkaua.maratonajava.javacore.ZZEpatternproject.singleton.domain.Aircraft;

public class AircraftTest01 {
    public static void main(String[] args) {

        bookSeat("A1");
        bookSeat("A1");
    }

    private static void bookSeat(String seat) {
        Aircraft aircraft = new Aircraft("999");
        System.out.println(aircraft.bookSeat(seat));
    }
}
