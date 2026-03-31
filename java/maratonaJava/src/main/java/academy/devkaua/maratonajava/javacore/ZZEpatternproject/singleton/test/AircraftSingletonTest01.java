package academy.devkaua.maratonajava.javacore.ZZEpatternproject.singleton.test;

import academy.devkaua.maratonajava.javacore.ZZEpatternproject.singleton.domain.AircraftSingletonEager;

public class AircraftSingletonTest01 {
    public static void main(String[] args) {
        bookSeat("A1");
        bookSeat("A1");
    }

    private static void bookSeat(String seat) {
        AircraftSingletonEager aircraftSingletonEager = AircraftSingletonEager.getINSTANCE();
        System.out.println(aircraftSingletonEager.bookSeat(seat));
    }
}
