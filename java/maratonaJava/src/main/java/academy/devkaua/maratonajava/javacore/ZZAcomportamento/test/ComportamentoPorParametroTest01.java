package academy.devkaua.maratonajava.javacore.ZZAcomportamento.test;

import academy.devkaua.maratonajava.javacore.ZZAcomportamento.domain.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest01 {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>(List.of(new Car("red", 1999), new Car("Black", 2020))) ;

        filter(cars, car -> car.getYear() <= 2019);

        // Antes das Lambdas,era usadas as class anonimas, mas era mais poluido.
        // Qualquer interface Funcional, pode usar Lambdas
        // Para usar Lambdas precisam usar Interfaces Funcional, como a Lambdas recebesse um contrato do que elas devem retornar.

        // sintaxe da lambdas: car -> car.getColor().equals("Green")
        // precisa retornar um boolean. Funciona igual um IF, mas de forma mais enxuta.
        System.out.println(filter(cars, car -> car.getColor().equals("Green")));
        System.out.println(filter(cars, car -> car.getYear() <= 2019));
    }

    // Esse metodo recebe todo tipo Obj, e retorna uma List que atende o criterio generico passado, por meio da Interface Predicate
    private static <T> List<T> filter(List<T> lista, Predicate<T> predicate) {
        List<T> listaReturn = new ArrayList<>();
        for (T e : lista) {
            if (predicate.test(e)) {
                listaReturn.add(e);
            }
        }
        return listaReturn;
    }
}
