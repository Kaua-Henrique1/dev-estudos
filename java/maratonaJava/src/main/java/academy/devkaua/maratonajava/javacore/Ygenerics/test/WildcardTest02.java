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
        // Não é permitido adicionar (exceto null), pois 'animals' pode ser uma lista
        // de um subtipo específico que não aceita Cachorro.
        // Ex: Se a lista passada for List<Gato>, adicionar um Cachorro quebraria o código.
        // animals.add(new Cachorro()); // Erro de compilação: capture of ? extends Animal
    }

    // Assim o java sabe quais tipos as classes filhas vao ser... Para poder adicionar elas na list.
    private static void addAnimal(List<? super Animal> animals) {
        animals.add(new Cachorro());
        animals.add(new Gato());
    }
}
