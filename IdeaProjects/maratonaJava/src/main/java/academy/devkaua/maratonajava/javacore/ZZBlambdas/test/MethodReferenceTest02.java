package academy.devkaua.maratonajava.javacore.ZZBlambdas.test;

import academy.devkaua.maratonajava.javacore.ZZAcomportamento.domain.Car;
import academy.devkaua.maratonajava.javacore.ZZBlambdas.service.CarComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Passado por meio de object
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>(List.of(new Car("red", 1999), new Car("Black", 2020))) ;

        CarComparators carNonStatic = new CarComparators();

        Collections.sort(carList, carNonStatic::compareByColorNonStatic);
        Collections.sort(carList, (a1, a2) -> carNonStatic.compareByColorNonStatic(a1, a2));

        // usando o object
        carList.sort(carNonStatic::compareByColorNonStatic);
        carList.sort((a1, a2) -> carNonStatic.compareByColorNonStatic(a1, a2));

        System.out.println(carList);
        // Criando um method static, ele pode receber 2 parametros, e quando for chamar usando Lambdas, pode ser usado a sintaxe 'Method Reference'
    }
}
