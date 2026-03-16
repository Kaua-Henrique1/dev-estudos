package academy.devkaua.maratonajava.javacore.ZZBlambdas.test;

import academy.devkaua.maratonajava.javacore.ZZAcomportamento.domain.Car;
import academy.devkaua.maratonajava.javacore.ZZBlambdas.service.CarComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

// Reference to a constructor
public class MethodReferenceTest03 {
    public static void main(String[] args) {
        Supplier<CarComparators> carComparatorsSupplier = CarComparators::new;
         CarComparators car = carComparatorsSupplier.get();
        List<Car> carList = new ArrayList<>(List.of(new Car("red", 1999), new Car("Black", 2020))) ;


        Collections.sort(carList, car::compareByColorNonStatic);
        Collections.sort(carList, (a1, a2) -> car.compareByColorNonStatic(a1, a2));

        carList.sort(car::compareByColorNonStatic);

        System.out.println(carList);
    }
}
