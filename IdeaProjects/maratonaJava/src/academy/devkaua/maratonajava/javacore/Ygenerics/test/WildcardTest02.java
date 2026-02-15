package academy.devkaua.maratonajava.javacore.Ygenerics.test;

import java.util.List;

public class WildcardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
    }

    // Dessa forma voce pode passar qualquer class ou interface com essa sintaxe.
    // Ela te permite tratar objetos que sao criados por meio de List<>
    private static void ConsultaAnimal(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
        // agora nao pode adicionar, pois as
        //animals.add(new Cachorro());
    }

    // Assim o java sabe quais tipos as classes filhas vao ser... Para poder adicionar elas na list.
    private static void addAnimal(List<? super Animal> animals) {
        animals.add(new Cachorro());
        animals.add(new Gato());
    }
}
