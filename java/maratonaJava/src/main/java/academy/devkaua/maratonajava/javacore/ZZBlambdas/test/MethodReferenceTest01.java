package academy.devkaua.maratonajava.javacore.ZZBlambdas.test;

import academy.devkaua.maratonajava.javacore.ZZAcomportamento.domain.Car;
import academy.devkaua.maratonajava.javacore.ZZBlambdas.service.CarComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Passado por meio de static
public class MethodReferenceTest01 {
    // Method Reference: É uma sintaxe para deixar mais limpo
    //                   Ela so pode ser usada quanto a interface funcional so usa um parametro.
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>(List.of(new Car("red", 1999), new Car("Black", 2020))) ;
        Collections.sort(carList, (c1, c2) -> c1.getName().compareTo(c2.getName()));
        //                        Nome da class :: Nome do metodo dentro da class
        Collections.sort(carList, CarComparators::compareByColor);
        // Criando um method static, ele pode receber 2 parametros, e quando for chamar usando Lambdas, pode ser usado a sintaxe 'Method Reference'
    }
}
