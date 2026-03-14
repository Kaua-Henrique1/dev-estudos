package academy.devkaua.maratonajava.javacore.ZZEpatternproject.singleton.domain;

import java.util.HashSet;
import java.util.Set;

public final class Aircraft {
    private final String name;

    public Aircraft(String name) {
        this.name = name;
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
