package academy.devkaua.maratonajava.javacore.ZZEpatternproject.singleton.domain;

import java.util.HashSet;
import java.util.Set;

public class AircraftSingletonEager {
    // Eager Initialization
    private static final AircraftSingletonEager INSTANCE = new AircraftSingletonEager("999");

    private final String name;

    private AircraftSingletonEager(String name) {
        this.name = name;
    }

    public static AircraftSingletonEager getINSTANCE() {
        return INSTANCE;
    }

    private final Set<String> availableSeats = new HashSet<>();

    {
        availableSeats.add("A1");
        availableSeats.add("A2");
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }
}
