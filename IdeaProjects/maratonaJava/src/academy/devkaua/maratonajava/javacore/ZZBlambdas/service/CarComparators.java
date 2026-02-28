package academy.devkaua.maratonajava.javacore.ZZBlambdas.service;

import academy.devkaua.maratonajava.javacore.ZZAcomportamento.domain.Car;

public class CarComparators {
    public static int compareByColor(Car car1, Car car2) {
        return car1.getColor().compareTo(car2.getColor());
    }

    public int compareByColorNonStatic(Car car1, Car car2) {
        return car1.getColor().compareTo(car2.getColor());
    }
}
