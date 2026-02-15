package academy.devkaua.maratonajava.javacore.Ygenerics.test;

import javax.security.auth.callback.CallbackHandler;

abstract class Animal {
    public abstract void consulta();
}
class Cachorro extends Animal {

    @Override
    public void consulta() {
        System.out.println("Consultadando Cachorro");
    }
}

class Gato extends Animal {
    @Override
    public void consulta() {
        System.out.println("Consultadando Gato");
    }
}

public class WildcardTest01 {
    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};
        ConsultaAnimal(cachorros);
        ConsultaAnimal(gatos);
        Animal[] animals = {new Gato(), new Cachorro()};
        ConsultaAnimal(animals);
    }
    public static void ConsultaAnimal(Animal[] animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
        // animals[1] = new Gato();  Da erro porque o Java sabe que na posicao 1 se tem um Cachorro e nao um gato.
    }

}
